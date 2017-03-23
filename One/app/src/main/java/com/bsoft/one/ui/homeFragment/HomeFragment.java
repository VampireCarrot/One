package com.bsoft.one.ui.homeFragment;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.LinearLayoutManager;

import com.bsoft.one.R;
import com.bsoft.one.adapter.HomeAdapter;
import com.bsoft.one.base.BaseFragment;
import com.bsoft.one.databinding.FragmentHomeBinding;
import com.bsoft.one.model.OneListBean.DataBean.ContentListBean;
import com.bsoft.one.widget.RecycleViewDivider;

import java.util.List;

/**
 * Created by 泅渡者
 * Created on 2017/3/20.
 */

public class HomeFragment extends BaseFragment<HomeFragmentContract.Presenter> implements HomeFragmentContract.View{
    private FragmentHomeBinding binding;
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_home;
    }
    @Override
    protected void initBinding(ViewDataBinding binding) {
        this.binding = (FragmentHomeBinding) binding;
        this.createPresenter(new HomeFragmentPresenter(this));
        presenter.loadOneList();

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void showMessage(List<ContentListBean> res) {
        binding.rlOne.setAdapter(new HomeAdapter(getActivity(),res));
        binding.rlOne.addItemDecoration(new RecycleViewDivider(
                mContext, LinearLayoutManager.VERTICAL ,R.drawable.divide_gray_color));
        binding.rlOne.setLayoutManager(new LinearLayoutManager(getActivity()));//这里用线性显示 类似于listview
        //mRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));//这里用线性宫格显示 类似于grid view
        //mRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, OrientationHelper.VERTICAL));//这里用线性宫格显示 类似于瀑布流
    }

}
