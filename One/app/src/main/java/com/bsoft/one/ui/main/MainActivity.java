package com.bsoft.one.ui.main;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

import com.bsoft.one.R;
import com.bsoft.one.base.BaseActivity;
import com.bsoft.one.databinding.ActivityMianBinding;
import com.bsoft.one.ui.homeFragment.HomeFragment;


/**
 * Created by 泅渡者
 * Created on 2017/3/17.
 */

public class MainActivity extends BaseActivity<MainContract.Presenter> implements MainContract.View {
    private ActivityMianBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_mian);
        this.createPresenter(new MainPresenter(this));
        binding.ivHome.setSelected(true);
        binding.ivMovie.setSelected(false);
        binding.ivMusic.setSelected(false);
        binding.ivRead.setSelected(false);
        binding.tvTitle.setText("一个");
        ChageCurrentFM(new HomeFragment());
    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showLoading() {

    }

    /**
     * 左边抽屉菜单
     * @param view
     */
    public void menuLeft(View view) {
    }

    /**
     * 右边search
     * @param view
     */
    public void menuRight(View view) {
    }

    /**
     * 首页加载点击
     * @param view
     */
    public void onHome(View view) {
        binding.ivHome.setSelected(true);
        binding.ivMovie.setSelected(false);
        binding.ivMusic.setSelected(false);
        binding.ivRead.setSelected(false);
        binding.tvTitle.setText("一个");
        ChageCurrentFM(new HomeFragment());
    }

    public void onRead(View view) {
        binding.ivHome.setSelected(false);
        binding.ivMovie.setSelected(false);
        binding.ivMusic.setSelected(false);
        binding.ivRead.setSelected(true);
        binding.tvTitle.setText("一个阅读");
        ChageCurrentFM(new HomeFragment());
    }

    public void onMusic(View view) {
        binding.ivHome.setSelected(false);
        binding.ivMovie.setSelected(false);
        binding.ivMusic.setSelected(true);
        binding.ivRead.setSelected(false);
        binding.tvTitle.setText("一个音乐");
        ChageCurrentFM(new HomeFragment());
    }

    public void onMovie(View view) {
        binding.ivHome.setSelected(false);
        binding.ivMovie.setSelected(true);
        binding.ivMusic.setSelected(false);
        binding.ivRead.setSelected(false);
        binding.tvTitle.setText("一个电影");
        ChageCurrentFM(new HomeFragment());
    }

    void ChageCurrentFM(Fragment fm){
        FragmentTransaction transaction =getFragmentManager().beginTransaction();
        transaction.replace(R.id.fm_content,fm);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
