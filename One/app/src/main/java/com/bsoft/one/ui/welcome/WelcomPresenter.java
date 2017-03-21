package com.bsoft.one.ui.welcome;

import android.util.Log;

import com.bsoft.one.R;
import com.bsoft.one.api.SimpleMyCallBack;
import com.bsoft.one.base.BaseCommonPresenter;
import com.bsoft.one.model.HttpExceptionBean;
import com.bsoft.one.model.IdListBean;

import rx.Subscription;

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

        Subscription subscription = apiImple.getIdList().subscribe(newMySubscriber(new SimpleMyCallBack<IdListBean>() {
            @Override
            public void onError(HttpExceptionBean mHttpExceptionBean) {
                super.onError(mHttpExceptionBean);
                Log.e("respon",mHttpExceptionBean.toString());
            }

            @Override
            public void onNext(IdListBean idListBean) {
                Log.e("respon",idListBean.toString());
                view.saveIdlistInsp(idListBean);
            }
        }));
      mCompositeSubscription.add(subscription);
    }
}
