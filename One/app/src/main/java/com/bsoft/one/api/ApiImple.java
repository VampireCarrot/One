package com.bsoft.one.api;


import com.bsoft.one.model.IdBean;
import com.bsoft.one.model.OneListBean;

import rx.Observable;

/**
 * Created by 泅渡者
 * Created on 2017/3/22.
 * Api 线程控制
 */

public class ApiImple extends Api {

    public Observable<IdBean> getIdList(){
        return applySchedulers(getService().doIdList("wdj", "4.0.2","ffffffff-a90e-706a-63f7-ccf973aae5ee","android"));
    };
    public Observable<OneListBean> getOneList(){
        return applySchedulers(getService().doOneList("3853"));
    }

}
