package com.bsoft.one.ui.homeFragment;

import com.bsoft.one.api.SimpleMyCallBack;
import com.bsoft.one.base.BaseCommonPresenter;
import com.bsoft.one.model.HttpExceptionBean;
import com.bsoft.one.model.OneListBean;

import rx.Subscription;

/**
 * Created by 泅渡者
 * Created on 2017/3/20.
 */

public class HomeFragmentPresenter extends BaseCommonPresenter<HomeFragmentContract.View> implements HomeFragmentContract.Presenter{
    public HomeFragmentPresenter(HomeFragmentContract.View view) {
        super(view);
    }

    @Override
    public void loadOneList() {
        Subscription subscription = apiImple.getOneList()
                .subscribe(newMySubscriber(new SimpleMyCallBack<OneListBean>() {
                    @Override
                    public void onError(HttpExceptionBean mHttpExceptionBean) {
                        super.onError(mHttpExceptionBean);
                    }

                    @Override
                    public void onNext(OneListBean oneListBean) {
                        view.showMessage(oneListBean.getData().getContent_list());
                    }
                }));
        mCompositeSubscription.add(subscription);

    }
}
