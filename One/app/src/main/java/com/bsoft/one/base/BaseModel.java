package com.bsoft.one.base;

import android.content.Context;

import com.bsoft.one.api.Api;
import com.bsoft.one.api.ApiImple;
import com.bsoft.one.api.SimpleMyCallBack;
import com.bsoft.one.model.HttpExceptionBean;
import com.bsoft.one.utils.ToastUtils;
import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.HttpException;
import rx.Subscriber;
import rx.subscriptions.CompositeSubscription;

/**
 * @desc:
 * @author: Jiangcy
 * @datetime: 2016/9/3
 */
public abstract class BaseModel<T> {
    /**
     * Api类的包装 对象
     */
    protected ApiImple apiImple;
    /**
     * 使用CompositeSubscription来持有所有的Subscriptions
     */
    protected CompositeSubscription mCompositeSubscription;
    protected Context mContext;
    protected T mPresenter;

    public BaseModel(T mPresenter) {
        this.mPresenter = mPresenter;
        //创建 CompositeSubscription 对象 使用CompositeSubscription来持有所有的Subscriptions，然后在onDestroy()或者onDestroyView()里取消所有的订阅。
        mCompositeSubscription = new CompositeSubscription();
        // 构建 ApiWrapper 对象
        apiImple = new ApiImple();
    }

    /**
     * 进入
     */
    public void onResume(Context mContext) {
        this.mContext = mContext;
    }

    /**
     * 创建观察者  这里对观察着 过滤一次，过滤出我们想要的信息，错误的信息toast
     *
     * @param onNext
     * @param <E>
     * @return
     */
    protected <E> Subscriber newMySubscriber(final SimpleMyCallBack onNext) {
        return new Subscriber<E>() {
            @Override
            public void onCompleted() {
                onNext.onCompleted();
            }

            @Override
            public void onError(Throwable e) {
                if (e instanceof Api.APIException) {
                    Api.APIException exception = (Api.APIException) e;
                    ToastUtils.showShort(exception.message);
                } else if (e instanceof HttpException) {
                    if (e instanceof HttpException) {
                        ResponseBody body = ((HttpException) e).response().errorBody();
                        try {
                            String json = body.string();
                            Gson gson = new Gson();
                            HttpExceptionBean mHttpExceptionBean = gson.fromJson(json, HttpExceptionBean.class);
                            if (mHttpExceptionBean != null && mHttpExceptionBean.toString() != null) {
                                ToastUtils.showShort(mHttpExceptionBean.toString());
                                onNext.onError(mHttpExceptionBean);
                            }
                        } catch (IOException IOe) {
                            IOe.printStackTrace();
                        }
                    }
                }
            }

            @Override
            public void onNext(E t) {
                if (!mCompositeSubscription.isUnsubscribed()) {
                    onNext.onNext(t);
                }
            }

        };
    }

    /**
     * 解除事件的注销，以保证不出现内存泄漏
     */
    public void onDestroy() {
        //一旦调用了 CompositeSubscription.unsubscribe()，这个CompositeSubscription对象就不可用了,
        // 如果还想使用CompositeSubscription，就必须在创建一个新的对象了。
        if (mCompositeSubscription != null) {
            mCompositeSubscription.unsubscribe();
        }
        mContext = null;
    }
}
