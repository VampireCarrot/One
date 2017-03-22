package com.bsoft.one.ui.homeFragment;

import android.databinding.ViewDataBinding;

import com.bsoft.one.R;
import com.bsoft.one.adapter.HomeAdapter;
import com.bsoft.one.base.BaseFragment;
import com.bsoft.one.databinding.FragmentHomeBinding;
import com.bsoft.one.model.OneListBean;

/**
 * Created by 泅渡者
 * Created on 2017/3/20.
 */

public class HomeFragment extends BaseFragment<HomeFragmentContract.Presenter> implements HomeFragmentContract.View{
    private FragmentHomeBinding binding;
    private HomeAdapter homeAdapter;
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_home;
    }
    @Override
    protected void initBinding(ViewDataBinding binding) {
        this.binding = (FragmentHomeBinding) binding;
        this.createPresenter(new HomeFragmentPresenter(this));
        presenter.loadOneList();
//        homeAdapter = new HomeAdapter();
//        this.binding.rclHome.setAdapter(homeAdapter);
    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void showMessage(OneListBean oneListBean) {
        binding.tvData.setText(oneListBean.toString());
    }

}
