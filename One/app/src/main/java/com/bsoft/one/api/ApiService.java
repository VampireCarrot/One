package com.bsoft.one.api;

import com.bsoft.one.model.IdBean;
import com.bsoft.one.model.OneListBean;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by 泅渡者
 * Created on 2017/3/22.
 * Api 网络层接口
 */

public interface ApiService {

    @GET("onelist/idlist")
    Observable<IdBean> doIdList(@Query("channel") String channel, @Query("version") String version, @Query("uuid") String uuid, @Query("platform") String platform);

    @GET("onelist/{idList}/0?channel=wdj&version=4.0.2&uuid=ffffffff-a90e-706a-63f7-ccf973aae5ee&platform=android")
    Observable<OneListBean> doOneList(@Path("idList") String idList);
}
