package com.bsoft.one.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.bsoft.one.R;
import com.bsoft.one.databinding.HomeRelycleItemBinding;
import com.bsoft.one.model.HomeBean;

import java.util.List;

/**
 * Created by 泅渡者
 * Created on 2017/3/20.
 */


public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {
    private Context context;
    private List<HomeBean> homeBeanList;

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        HomeRelycleItemBinding binding1 = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.home_relycle_item, parent, false);
        return new ViewHolder(binding1);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.getBinding().tvTitle.setText("");
        holder.getBinding().executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return homeBeanList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private HomeRelycleItemBinding binding;

        public ViewHolder(HomeRelycleItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public HomeRelycleItemBinding getBinding() {
            return binding;
        }
    }
}
