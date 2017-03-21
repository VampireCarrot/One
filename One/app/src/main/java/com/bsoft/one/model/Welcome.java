package com.bsoft.one.model;

import android.databinding.BaseObservable;
import android.databinding.BindingAdapter;
import android.widget.ImageView;

/**
 * Created by 泅渡者
 * Created on 2017/3/15.
 */

public class Welcome  extends BaseObservable{
    private String username;
    private int userface;

    public Welcome() {
    }

    public Welcome(int userface, String username) {
        this.userface = userface;
        this.username = username;
    }

    @BindingAdapter("bind:userface")
    public static void getInternetImage(ImageView iv, int userface) {
//        Glide.with(iv.getContext()).load(userface).into(iv);
//        iv.setImageResource(R.drawable.opening_friday);
        iv.setImageResource(userface);
    }

    public int getUserface() {
        return userface;
    }

    public void setUserface(int userface) {
        this.userface = userface;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
