package com.yu.baidumapdemo;

import android.app.Application;

import com.baidu.mapapi.SDKInitializer;

/**
 * Created by yu on 2016-03-09.
 */
public class BaiduMapDemoApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // 在使用 SDK 各组间之前初始化 context 信息，传入 ApplicationContext
        //这样就不用每个Activity都初始化一遍了
        SDKInitializer.initialize(this);
    }
}
