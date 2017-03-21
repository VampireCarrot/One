package com.bsoft.one.api;

import com.bsoft.one.model.IdListBean;

import rx.Observable;

/**
 * Created by 泅渡者
 * Created on 2017/3/15.
 */
public class ApiImple extends Api {
    public Observable<IdListBean> getIdList() {
     return applySchedulers(getService().doIdList("wdj", "4.0.2",Api.UUID,"android"));
    }
}
