package com.bsoft.one.api;

import com.bsoft.one.model.IdListBean;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by 泅渡者
 * Created on 2017/3/15.
 */

public interface ApiService {
    /**
     * 登陆
     */
    @GET("onelist/idlist")
    Observable<IdListBean> doIdList(@Query("channel") String channel, @Query("version") String version, @Query("uuid") String uuid, @Query("platform") String platform);
}
