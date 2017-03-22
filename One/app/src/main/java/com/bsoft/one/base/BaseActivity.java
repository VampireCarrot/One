package com.bsoft.one.base;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

import com.bsoft.one.common.ActivityPageManager;
import com.bsoft.one.widget.DialogLoading;

public abstract class BaseActivity<T extends BasePresenter> extends AppCompatActivity {
    protected AppCompatActivity mContext;
    protected DialogLoading loading;
    protected View mContentView;
    public T presenter;
    public static int option;
    public View decorView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;
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
     * 创建相应的 presenter
     */
    public void createPresenter(T presenter) {
        if (presenter != null) {
            this.presenter = presenter;
        }
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
