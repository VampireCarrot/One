package com.bsoft.one.ui.homeFragment;

import com.bsoft.one.api.SimpleMyCallBack;
import com.bsoft.one.base.BaseCommonPresenter;
import com.bsoft.one.model.HttpExceptionBean;
import com.bsoft.one.model.IdBean;
import com.bsoft.one.model.OneListBean;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by 泅渡者
 * Created on 2017/3/20.
 */

public class HomeFragmentPresenter extends BaseCommonPresenter<HomeFragmentContract.View> implements HomeFragmentContract.Presenter{
    public HomeFragmentPresenter(HomeFragmentContract.View view) {
        super(view);
    }

    @Override
    public void loadIdList() {
        mCompositeSubscription.add(apiImple.getIdList()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<IdBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(IdBean idBean) {
                        view.saveIdArray(idBean.getData());
                    }
                }));
    }

    @Override
    public void loadOneList(String oneid) {

        mCompositeSubscription.add(apiImple.getOneList(oneid)
                .subscribe(newMySubscriber(new SimpleMyCallBack<OneListBean>() {
                    @Override
                    public void onError(HttpExceptionBean mHttpExceptionBean) {
                        super.onError(mHttpExceptionBean);
                    }

                    @Override
                    public void onNext(OneListBean oneListBean) {
                        view.showMessage(oneListBean.getData().getContent_list());
                    }
                })));

    }
}
