package com.bsoft.one.ui.homeDetailActivity;

import com.bsoft.one.base.BaseCommonPresenter;
import com.bsoft.one.model.OneReadInfo;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by 泅渡者
 * Created on 2017/3/27.
 */

public class HomeDetailPresenter extends  BaseCommonPresenter<HomeDetailContract.View> implements HomeDetailContract.Presenter {
    public HomeDetailPresenter(HomeDetailContract.View view) {
        super(view);
    }


    @Override
    public void loadContent(String item_id) {
        mCompositeSubscription.add(apiImple.getOneRead(item_id)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<OneReadInfo>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(OneReadInfo oneReadInfo) {
                        view.showWebView(oneReadInfo);
                    }
                }));
    }
}
