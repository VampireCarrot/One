package com.bsoft.one.ui.welcome;


import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.widget.Toast;

import com.bsoft.one.R;
import com.bsoft.one.base.BaseActivity;
import com.bsoft.one.databinding.ActivityWelcomeBinding;
import com.bsoft.one.model.IdBean;
import com.bsoft.one.model.Welcome;
import com.bsoft.one.ui.main.MainActivity;
import com.bsoft.one.utils.DateUtils;

import java.util.Date;

/**
 * Created by 泅渡者
 * Created on 2017/3/17.
 */

public class WelcomeActivity extends BaseActivity<WelcomeContract.Presenter> implements WelcomeContract.View {
    private ActivityWelcomeBinding welcomeBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        welcomeBinding = DataBindingUtil.setContentView(this, R.layout.activity_welcome);
        this.createPresenter(new WelcomPresenter(this));
        presenter.upDateLogo(DateUtils.getWeekOfDate(new Date()),DateUtils.getUpperDate(new Date()));
//        presenter.toNextActivity();
        presenter.loadIdlist();

    }
    @Override
    public void hideLoading() {

    }
    @Override
    public void showLoading() {

    }
    @Override
    public void showUpdate(int drawable,String currentDay) {
        welcomeBinding.setWelcome(new Welcome(drawable, currentDay));
    }
    @Override
    public void skiActivity() {
        startActivity(new Intent(this, MainActivity.class));
    }

    @Override
    public void saveIdlistInsp(IdBean s) {
        Toast.makeText(WelcomeActivity.this,s.toString(),Toast.LENGTH_LONG).show();
    }
}
