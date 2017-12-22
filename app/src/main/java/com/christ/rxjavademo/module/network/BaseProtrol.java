package com.christ.rxjavademo.module.network;

import android.os.Message;

import com.christ.rxjavademo.module.bean.LoginBean;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import org.json.JSONException;
import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by admin on 2017/12/22.
 */

public class BaseProtrol {
    /**
     * 1.提供获取RetrofitAPI的接口
     */
    public IRetrofitAPI getIRetrofitAPI() {
        return RetrofitManager.getRetrofitManager().getIRetrofitAPI();
    }

    /**
     * 2.提供异步请求的回调
     */
    public <T> void enqueue(Call<JsonObject> call, final HttpCallback callback, final Class<LoginBean> clazz, final int reqType) {
        call.enqueue(new Callback<JSONObject>() {
            /**
             * 请求成功回调
             * @param call
             * @param response
             */
            @Override
            public void onResponse(Call<JSONObject> call, Response<JSONObject> response) {
                try {
                    //得到服务器的json字符串，自己解析
                    String json = response.body().toString();
                    JSONObject object = new JSONObject(json);
                    //每个请求都会返回状态码，如果为0，表示请求成功
                    if (object.getString("msg").equals("Success") && object.getInt("status") == 200) {
                        try {
                            T bean = new Gson().fromJson(json, clazz);
                            if (callback != null) {
                                Message msg = new Message();
                                msg.obj = bean;
                                callback.onHttpSuccess(reqType, msg);
                            }
                        } catch (Exception e) {
                            onHttpCode(object, callback, reqType); //请求服务器成功，但是解析数据失败
                        }
                    } else {
                        onHttpCode(object, callback, reqType);//请求服务器成功，但是解析数据失败
                    }

                } catch (JSONException e) {
                    onHttpError(e, callback, reqType); //请求服务器失败
                }


            }

            @Override
            public void onFailure(Call<JSONObject> call, Throwable t) {

            }
        });
    }

    /***
     * 请求服务器成功，但是解析数据失败
     * @param e
     * @param callback
     * @param reqType
     */
    private void onHttpError(JSONException e, HttpCallback callback, int reqType) {
        if (callback != null) {
            callback.onHttpError(reqType, e.getMessage());
        }
    }

    /**
     * 请求服务器失败
     * @param object
     * @param callback
     * @param reqType
     * @throws JSONException
     */
    private void onHttpCode(JSONObject object, HttpCallback callback, int reqType) throws JSONException {
        int errorCode = object.getInt("status");
        String msg = object.getString("msg");
        if (callback != null) {
            callback.onHttpCode(reqType, errorCode, msg);
        }
    }


    /**
     * 4.对外提供接口回调的方法
     */
    public interface HttpCallback {
        /**
         * 请求服务器成功(数据获取成功)的时候回调
         *
         * @param reqType
         * @param msg
         */
        void onHttpSuccess(int reqType, Message msg);

        /**
         * 请求服务器失败的时候回调
         *
         * @param reqType
         * @param error
         */
        void onHttpError(int reqType, String error);

        /**
         * 请求服务器成功(数据获取失败的)的时候回调
         *
         * @param reqType
         * @param errorCode
         * @param message
         */
        void onHttpCode(int reqType, int errorCode, String message);


    }
}
