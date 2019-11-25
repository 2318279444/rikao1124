package com.bawei.View;

import android.app.Application;
import android.content.Context;

/*
 *@auther:邓先超
 *@Date: 2019/11/25
 *@Time:8:44
 *@Description:${DESCRIPTION}
 **/
public class MyApp extends Application {
    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context=this;
    }
}
