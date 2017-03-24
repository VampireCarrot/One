package com.bsoft.one.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.bsoft.one.R;
import com.bsoft.one.databinding.HomeRelycleItemBinding;
import com.bsoft.one.model.OneListBean.DataBean.ContentListBean;

import java.util.List;

/**
 * Created by 泅渡者
 * Created on 2017/3/20.
 */


public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {
    private Context context;
    private List<ContentListBean> homeBeanList;

    public HomeAdapter(Context context, List<ContentListBean> homeBeanList) {
        this.context = context;
        this.homeBeanList = homeBeanList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return ViewHolder.create(LayoutInflater.from(context), parent);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
            holder.bindTo(homeBeanList.get(position));
    }

    @Override
    public int getItemCount() {
        return homeBeanList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private HomeRelycleItemBinding mBinding;
        static ViewHolder create(LayoutInflater inflater, ViewGroup parent) {
            HomeRelycleItemBinding binding = DataBindingUtil.inflate(inflater, R.layout.home_relycle_item, parent, false);
            return new ViewHolder(binding);
        }
        private ViewHolder(HomeRelycleItemBinding binding) {
            super(binding.getRoot());
            mBinding = binding;
        }
        public void bindTo(ContentListBean user) {
            mBinding.setListBean(user);
            mBinding.executePendingBindings();
        }
    }
    public void notifyDat(List<ContentListBean> res){
        for(ContentListBean contentListBean:res){
            this.homeBeanList.add(contentListBean);
        }
        notifyDataSetChanged();
    }
}
