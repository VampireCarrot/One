package com.bsoft.one.api;


import com.bsoft.one.model.HttpExceptionBean;


/**
 * Created by 泅渡者
 * Created on 2017/3/22.
 * 回调
 */
interface MyCallBack<T>  {
   void onCompleted();
   void onError(HttpExceptionBean mHttpExceptionBean);
   void onNext(T t);
}
