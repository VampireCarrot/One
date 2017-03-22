package com.bsoft.one.model;

import com.google.gson.Gson;

import java.util.List;

/**
 * Created by 泅渡者
 * Created on 2017/3/21.
 */

public class IdBean {

    /**
     * res : 0
     * data : ["3528","3520","3519","3517","3516","3515","3514","3513","3476","3505"]
     */

    private int res;
    private List<String> data;

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
