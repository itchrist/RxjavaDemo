package com.christ.rxjavademo.view;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.christ.rxjavademo.module.network.IRetrofitAPI;
import com.christ.rxjavademo.R;
import com.christ.rxjavademo.module.bean.Location;
import com.christ.rxjavademo.commom.utils.LogUtil;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    private TextView mTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

//      setData("Hi，Weavey！");
    }

    /**
     * 数据再封装一层，做到数据和视图真正隔离
     * @param data
     */
    private void setData(final String data) {
        //创建一个发射器
        Observable<String> sender = Observable.create(new Observable.OnSubscribe<String>() {

            @Override
            public void call(Subscriber<? super String> subscriber) {
                subscriber.onNext(data);  //发送数据"Hi，Weavey！"
            }
        });

        Observer<String> receiver = new Observer<String>() {
            @Override
            public void onCompleted() {
                //数据接收完成时调用
            }

            @Override
            public void onError(Throwable e) {
                //发生错误的时候调用
            }

            @Override
            public void onNext(String s) {
                //正常接收数据调用
                s += "我要改变数据";
                LogUtil.d(s);
            }
        };
        sender.subscribe(receiver);
    }


    private void initView() {
        mTv = (TextView) findViewById(R.id.tv);
    }


    private Retrofit retrofit;

    public void click(View view) {
        // 创建Retrofit对象
        retrofit = new Retrofit.Builder()
                .baseUrl("http://apis.juhe.cn")
                // 使用gson解析json字符串
                .addConverterFactory(GsonConverterFactory.create())
                // 使用Rxjava调用
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();

        // 获取Retrofit接口
        IRetrofitAPI IRetrofitAPI = retrofit.create(IRetrofitAPI.class);


        //开始请求数据
        Observable<Location> observable = IRetrofitAPI.postLocation(
                "13612345678", "daf8fa858c330b22e342c882bcbac622");

        observable.subscribeOn(Schedulers.io())               // 子线程请求服务器数据
                .observeOn(AndroidSchedulers.mainThread())  // 主线程显示服务器数据
                .subscribe(new Observer<Location>() {
                    @Override
                    public void onCompleted() {
                    }

                    @Override
                    public void onError(Throwable e) {
                        showToast("请求失败：" + e.getMessage());
                    }

                    @Override
                    public void onNext(Location location) {
                        mTv.setText("Location: " + location.getResult().getCity());
                        //请求成功之后，还要解析回来的数据，最后rx返回数据给activity中
                        //我统一管理更加好
                    }
                });
    }

    private Toast mToast;

    public void showToast(String msg) {
        if (mToast == null) {
            mToast = Toast.makeText(this, "", Toast.LENGTH_SHORT);
        }
        mToast.setText(msg);
        mToast.show();
    }

}
