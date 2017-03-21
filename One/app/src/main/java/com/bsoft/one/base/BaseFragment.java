package com.bsoft.one.base;

import android.app.Fragment;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bsoft.one.api.ApiImple;
import com.bsoft.one.api.SimpleMyCallBack;

import rx.Subscriber;

public abstract class BaseFragment <T extends BasePresenter> extends Fragment{
    public BaseActivity mContext;
    /**
     * Api类的包装 对象
     */
    public ApiImple apiImple;

    public  T presenter;

    protected ViewDataBinding dataBinding;
    protected abstract  int getLayoutId();
    protected abstract void initBinding(ViewDataBinding binding);
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = getBaseActivity();
    }



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(getLayoutId(), container, false);
        dataBinding = DataBindingUtil.bind(view);
        initBinding(dataBinding);
        return view;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        //解绑 presenter
        if (presenter != null) {
            presenter.unsubscribe();
        }
    }

    /**
     * 创建相应的 presenter
     */
    public void createPresenter(T presenter) {
        if (presenter != null) {
            this.presenter = presenter;
        }
    }


    public BaseActivity getBaseActivity() {
        return (BaseActivity) this.getActivity();
    }

    /**
     * 初始化 Api  更具需要初始化
     */
    public void initApi() {
        apiImple = mContext.getApiImple();
    }

    public <T> Subscriber newMySubscriber(final SimpleMyCallBack onNext) {
        return mContext.newMySubscriber(onNext);
    }

    public void showLoadingDialog() {
        mContext.showLoadingDialog();
    }

    public void hideLoadingDialog() {
        mContext.hideLoadingDialog();
    }

}
