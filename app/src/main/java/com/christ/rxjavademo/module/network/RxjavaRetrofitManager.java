package com.christ.rxjavademo.module.network;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by admin on 2017/12/22.
 */

public class RxjavaRetrofitManager {
    private Retrofit mRetrofit; //Retrofit
    private IRetrofitAPI mIRetrofitAPI; //Retrofit请求的url接口
    private OkHttpClient.Builder mBuilder; //构建okhttpClient
    private static final int DEFAULT_TIMEOUT = 10; //设置超时连接
    /**
     * 获取RetrofitHelper对象的单例
     * */
    private static class Singleton {
        private static final RxjavaRetrofitManager INSTANCE = new RxjavaRetrofitManager();
    }

    public static RxjavaRetrofitManager getInstance() {
        return Singleton.INSTANCE;
    }

    public RxjavaRetrofitManager() {
        initData();
    }

    private void initData() {
        mBuilder = new OkHttpClient.Builder();
        //设置okhttpClient的日志拦截器，作用，打印请求和响应数据，设置拦截时间
        mBuilder.addInterceptor(
                new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                .connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS);

        mRetrofit = new Retrofit
                .Builder()
                .baseUrl(IRetrofitAPI.HOST_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(mBuilder.build())
                .build();
        mIRetrofitAPI = mRetrofit.create(IRetrofitAPI.class);
    }
}
