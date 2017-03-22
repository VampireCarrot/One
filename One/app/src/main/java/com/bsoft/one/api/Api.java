package com.bsoft.one.api;

import android.util.Log;

import com.bsoft.one.common.MyApplication;
import com.bsoft.one.utils.LogUtil;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;
import retrofit2.RxJavaCallAdapterFactory;

/**
 * Created by 泅渡者
 * Created on 2017/3/22.
 */

public class Api {

    private static final  String BASE_URL="http://v3.wufazhuce.com:8000/api/";
    // 消息头
    private static final String HEADER_X_HB_Client_Type = "X-HB-Client-Type";
    private static final String FROM_ANDROID = "ayb-android";

    private static ApiService service;
    private static Retrofit retrofit;
    private static OkHttpClient okHttpClient;


    public static ApiService getService() {
        if (service == null) {
            service = getRetrofit().create(ApiService.class);
        }
        return service;
    }
    private static Retrofit getRetrofit() {
        if (retrofit==null){
            retrofit = new Retrofit.Builder()
                    .client(getOkHttpClient())
                    .baseUrl(BASE_URL)
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
    /**
     * 拦截器  给所有的请求添加消息头
     */
    private static Interceptor mInterceptor = new Interceptor() {
        @Override
        public okhttp3.Response intercept(Chain chain) throws IOException {
            Request request = chain.request()
                    .newBuilder()
                    .addHeader(HEADER_X_HB_Client_Type, FROM_ANDROID)
                    .build();
            LogUtil.e("LogUtils--> ", "request:" + request.body().toString());
            return chain.proceed(request);
        }
    };
    /**
     * 打印所有的日志
     * @return
     */
    public static HttpLoggingInterceptor instaceLogging(){
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
            @Override
            public void log(String message) {
                Log.e("HttpLog", message);
            }
        });
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        return interceptor;
    }
    public static Cache instanceCache(){
        //设置 请求的缓存
        File cacheFile = new File(MyApplication.getInstance().getCacheDir(), "cache");
        Cache cache = new Cache(cacheFile, 1024 * 1024 * 50); //50Mb
        return cache;
    }
    public static OkHttpClient getOkHttpClient(){
        if(okHttpClient==null){
            okHttpClient = new OkHttpClient.Builder()
                    .connectTimeout(15, TimeUnit.SECONDS)
                    .addInterceptor(instaceLogging())
                    .cache(instanceCache())
                    .build();
        }
        return okHttpClient;
    };
}
