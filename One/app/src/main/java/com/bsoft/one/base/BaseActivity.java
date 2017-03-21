package com.bsoft.one.base;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

import com.bsoft.one.api.Api;
import com.bsoft.one.api.ApiImple;
import com.bsoft.one.api.SimpleMyCallBack;
import com.bsoft.one.common.ActivityPageManager;
import com.bsoft.one.model.HttpExceptionBean;
import com.bsoft.one.utils.ToastUtils;
import com.bsoft.one.widget.DialogLoading;
import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.HttpException;
import rx.Subscriber;

/**
 * User: ZRJ
 * Date: 2016/12/1
 * Email: 471564517@qq.com
 * Description: Acticity基类
 */
public abstract class BaseActivity<T extends BasePresenter> extends AppCompatActivity {
    protected AppCompatActivity mContext;
    protected DialogLoading loading;
    protected View mContentView;
    protected ApiImple mApiImple;
    public T presenter;
    public static int option;
    public View decorView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;
        //Activity管理
        ActivityPageManager.getInstance().addActivity(this);

    }

    @Override
    protected void onResume() {
        super.onResume();
        if (Build.VERSION.SDK_INT >= 21) {
            decorView = getWindow().getDecorView();
            option =View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                    | View.SYSTEM_UI_FLAG_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
            decorView.setSystemUiVisibility(option);

            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }

    }

    @Override
    public void setContentView(int layoutResID) {
        View view = LayoutInflater.from(this).inflate(layoutResID, null);
        setContentView(view);
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        mContentView = view;
    }
    /**
     * 初始化 Api  更具需要初始化
     */
    public void initApi() {
        // 构建 ApiImple 对象
        mApiImple = new ApiImple();
    }

    public ApiImple getApiImple() {
        if (mApiImple == null) {
            mApiImple = new ApiImple();
        }
        return mApiImple;
    }


    /**
     * 创建相应的 presenter
     */
    public void createPresenter(T presenter) {
        if (presenter != null) {
            this.presenter = presenter;
        }
    }
    /**
     * 创建观察者  这里对观察着 过滤一次，过滤出我们想要的信息，错误的信息toast
     *
     * @param onNext
     * @param <T>
     * @return
     */
    protected <T> Subscriber newMySubscriber(final SimpleMyCallBack onNext) {
        return new Subscriber<T>() {
            @Override
            public void onCompleted() {
                hideLoadingDialog();
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
                hideLoadingDialog();
            }

            @Override
            public void onNext(T t) {
                    onNext.onNext(t);
            }

        };
    }

    public void showLoadingDialog() {
        if (loading == null) {
            loading = new DialogLoading(this);
        }
        loading.show();
    }

    public void hideLoadingDialog() {
        if (loading != null) {
            loading.dismiss();
        }

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //Acitvity 释放子view资源
        ActivityPageManager.unbindReferences(mContentView);
        ActivityPageManager.getInstance().removeActivity(this);
        mContentView = null;
        //解绑 presenter
        if (presenter != null) {
            presenter.unsubscribe();
        }
    }


}
