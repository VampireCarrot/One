package com.bsoft.one.ui.homeFragment;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.bsoft.one.R;
import com.bsoft.one.adapter.HomeAdapter;
import com.bsoft.one.base.BaseFragment;
import com.bsoft.one.databinding.FragmentHomeBinding;
import com.bsoft.one.model.OneListBean.DataBean.ContentListBean;
import com.bsoft.one.widget.RecycleViewDivider;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 泅渡者
 * Created on 2017/3/20.
 */

public class HomeFragment extends BaseFragment<HomeFragmentContract.Presenter> implements HomeFragmentContract.View{
    private FragmentHomeBinding binding;
    private List<String> idList;
    private HomeAdapter homeAdapter;
    private List<ContentListBean> res;
    private int Page = 1;
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_home;
    }
    @Override
    protected void initBinding(ViewDataBinding binding) {
        this.binding = (FragmentHomeBinding) binding;
        this.createPresenter(new HomeFragmentPresenter(this));
        idList = new ArrayList<>();
        res =  new ArrayList<>();
        homeAdapter = new HomeAdapter(getActivity(),res);
        ((FragmentHomeBinding) binding).rlOne.setAdapter(homeAdapter);
        ((FragmentHomeBinding) binding).rlOne.addItemDecoration(new RecycleViewDivider(
                mContext, LinearLayoutManager.VERTICAL ,R.drawable.divide_gray_color));
        ((FragmentHomeBinding) binding).rlOne.setLayoutManager(new LinearLayoutManager(getActivity()));//这里用线性显示 类似于listview
        //mRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));//这里用线性宫格显示 类似于grid view
        //mRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, OrientationHelper.VERTICAL));//这里用线性宫格显示 类似于瀑布流
        presenter.loadIdList();
    }

    @Override
    public void onResume() {
        super.onResume();

        binding.rlOne.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) binding.rlOne.getLayoutManager();
                if(newState == RecyclerView.SCROLL_STATE_IDLE){
                    int lastVisiblePosition = linearLayoutManager.findLastVisibleItemPosition();
                    if(lastVisiblePosition >= linearLayoutManager.getItemCount() - 1){
                        Page++;
                        if(Page < idList.size())
                        presenter.loadOneList(idList.get(Page));
                    }
                }
            }
        });
    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void saveIdArray(List<String> strings) {
        idList.clear();
        idList = strings;
        presenter.loadOneList(idList.get(Page));
    }

    @Override
    public void showMessage(List<ContentListBean> res) {
        homeAdapter.notifyDat(res);
    }

}
