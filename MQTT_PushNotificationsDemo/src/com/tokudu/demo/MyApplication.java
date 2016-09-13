package com.tokudu.demo;

import android.app.Application;

import com.pgyersdk.crash.PgyCrashManager;

public class MyApplication extends Application
{
    public void onCreate()
    {
        super.onCreate();
        // 注册蒲公英（上传错误日志）
     	PgyCrashManager.register(this);
    }
}