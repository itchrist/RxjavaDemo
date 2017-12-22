package com.christ.rxjavademo.commom;

import android.app.Application;
import android.content.Context;

/**
 * Created by admin on 2017/12/22.
 */

public class MyApp extends Application {
    public static Context sContext;

    @Override
    public void onCreate() {
        super.onCreate();
        sContext = this;
    }
}
