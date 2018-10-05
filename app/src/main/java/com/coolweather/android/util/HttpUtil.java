package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.internal.tls.OkHostnameVerifier;

public class HttpUtil {
    public static void sendOKHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();//完成和服务器的交互，发起一跳http请求，通过调用sendOKHttpRequest方法，
        // 传入请求地址并注册一个回调来处理服务器响应
        Request request=new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
