package com.bsoft.one.model;

import java.util.List;

/**
 * Created by 泅渡者
 * Created on 2017/3/17.
 */

public class IdListBean {

    /**
     * res : 0
     * data : ["3854","3826","3827","3825","3824","3822","3817","3814","3807","3801"]
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
        return "IdListBean{" +
                "res=" + res +
                ", data=" + data +
                '}';
    }
}
