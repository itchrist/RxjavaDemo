package com.christ.rxjavademo.module.network;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by admin on 2017/12/22.
 * RetrofitManager的管理类
 */

public class RetrofitManager {
    private Retrofit mRetrofit; //Retrofit
    private IRetrofitAPI mIRetrofitAPI; //Retrofit请求的url接口

    /**
     * 单例模式
     */
    private static RetrofitManager mRetrofitManager = new RetrofitManager();

    private RetrofitManager() {
        initRetrofit();
    }

    public static RetrofitManager getRetrofitManager() {
        return mRetrofitManager;
    }

    /**
     * 初始化retrofitmanager
     */
    private void initRetrofit() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        //创建拦截器对象
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();

        //设计拦截器对象的级别
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        //设置okhttpClient的日志拦截器，作用，打印请求和响应数据，设置拦截时间
        builder.addInterceptor(httpLoggingInterceptor).connectTimeout(5, TimeUnit.SECONDS);

        mRetrofit = new Retrofit
                .Builder()
                .baseUrl(IRetrofitAPI.HOST_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(builder.build())
                .build();
        mIRetrofitAPI = mRetrofit.create(IRetrofitAPI.class);
    }

    /**
     * 对外提供IRetrofitAPI接口
     */
    public IRetrofitAPI getIRetrofitAPI() {
        return mIRetrofitAPI;
    }


}
