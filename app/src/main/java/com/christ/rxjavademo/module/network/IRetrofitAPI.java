package com.christ.rxjavademo.module.network;

import com.christ.rxjavademo.module.bean.Location;
import com.google.gson.JsonObject;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * 定义Retrofit接口
 *
 * @author WJQ
 */
public interface IRetrofitAPI {

    // http://apis.juhe.cn/mobile/get?
    //  phone=13612345678&key=daf8fa858c330b22e342c882bcbac622
    String HOST_URL = "https://www.s2ham.com/index.php/";

    @GET("/mobile/get")
    Observable<Location> getLocation(@Query("phone") String phone22,
                                     @Query("key") String key22);

    @POST("/mobile/get")
    @FormUrlEncoded
    Observable<Location> postLocation(@Field("phone") String phone22,
                                      @Field("key") String key22);


    //1.账号密码登陆的请求
    String POST_LOGIN = "?ctl=Login&met=sellerServiceLogin&__random=0.24367575947752873&typ=json";
    int HTTP_POST_LOGON = 1;  //1.登录的数据的区分


    /**
     * 1.账号密码登陆的请求参数
     */
    @POST(POST_LOGIN)
    @FormUrlEncoded
    Call<JsonObject> getLogin(@FieldMap Map<String, Object> map);

}
