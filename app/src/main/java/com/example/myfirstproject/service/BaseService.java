package com.example.myfirstproject.service;

import android.app.Service;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.res.Configuration;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

public class BaseService extends Service {
    public String TAG = "Service";

    @Override
    public void onCreate() {
        TAG = getClass().getSimpleName()+"-TEST_SERVICE";
        super.onCreate();
        Log.d(TAG,"onCreate");
    }

    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);
        Log.d(TAG,"onStart"+intent);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG,"onStartCommand "+intent);
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.d(TAG,"onConfigurationChanged "+newConfig);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.d(TAG,"onBind "+intent);
        return null;
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Log.d(TAG,"onUnbind "+intent);
        return super.onUnbind(intent);
    }

    @Override
    public void onRebind(Intent intent) {
        super.onRebind(intent);
        Log.d(TAG,"onDestroy "+intent);
    }

    @Override
    public boolean stopService(Intent name) {
        Log.d(TAG,"stopService "+name);
        return super.stopService(name);
    }

    @Override
    public void unbindService(ServiceConnection conn) {
        super.unbindService(conn);
        Log.d(TAG,"stopService "+conn);
    }
}
