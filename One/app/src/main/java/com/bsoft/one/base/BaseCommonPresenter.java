package com.bsoft.one.base;

import com.bsoft.one.api.Api;

import rx.subscriptions.CompositeSubscription;

/**
 * User: ZRJ
 * Date: 2016/12/1
 * Email: 471564517@qq.com
 * Description:
 */

public  class BaseCommonPresenter<T extends BaseView> {
    public Api api;
    /**
     * 使用CompositeSubscription来持有所有的Subscriptions
     */
    protected CompositeSubscription mCompositeSubscription;

    public T view;

    public BaseCommonPresenter(T view) {
        //创建 CompositeSubscription 对象 使用CompositeSubscription来持有所有的Subscriptions，然后在onDestroy()或者onDestroyView()里取消所有的订阅。
        mCompositeSubscription = new CompositeSubscription();
        api = new Api();
        this.view  = view;
    }

    /**
     * 解绑 CompositeSubscription
     */
    public void unsubscribe() {
        if(mCompositeSubscription != null){
            mCompositeSubscription.unsubscribe();
        }
    }

}
