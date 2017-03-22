package com.bsoft.one.ui.welcome;

import com.bsoft.one.R;
import com.bsoft.one.base.BaseCommonPresenter;
import com.bsoft.one.model.IdBean;

import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by 泅渡者
 * Created on 2017/3/17.
 */

public class WelcomPresenter extends BaseCommonPresenter<WelcomeContract.View> implements WelcomeContract.Presenter {
    public WelcomPresenter(WelcomeContract.View view) {
        super(view);
    }

    @Override
    public void upDateLogo(int currentWeek,String currentday) {
        switch (currentWeek){
            case 1:
                view.showUpdate(R.drawable.opening_monday,currentday);
                break;
            case 2:
                view.showUpdate(R.drawable.opening_tuesday,currentday);
                break;
            case 3:
                view.showUpdate(R.drawable.opening_wednesday,currentday);
                break;
            case 4:
                view.showUpdate(R.drawable.opening_thursday,currentday);
                break;
            case 5:
                view.showUpdate(R.drawable.opening_friday,currentday);
                break;
            case 6:
                view.showUpdate(R.drawable.opening_saturday,currentday);
                break;
            case 7:
                view.showUpdate(R.drawable.opening_sunday,currentday);
                break;
            default:
                break;
        }
    }

    @Override
    public void toNextActivity() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    view.skiActivity();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
    @Override
    public void loadIdlist() {
        Subscription subscription =apiImple.getIdList()
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
                        view.saveIdlistInsp(idBean);
                    }
                });
        mCompositeSubscription.add(subscription);
    }

    @Override
    public void unsubscribe() {
        super.unsubscribe();
        if (!mCompositeSubscription.isUnsubscribed())
            mCompositeSubscription.unsubscribe();
    }
}
