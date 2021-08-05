package com.example.myfirstproject.service;


import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;

import com.example.myfirstproject.R;

import androidx.core.app.NotificationCompat;

public class FirstService extends BaseService {

    @Override
    public void onCreate() {
        super.onCreate();

        NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        NotificationCompat.Builder builder;

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel("channelId", "channelName", NotificationManager.IMPORTANCE_MAX);
            manager.createNotificationChannel(channel);
            builder = new NotificationCompat.Builder(this, "channelId");
        } else {
            builder = new NotificationCompat.Builder(this);
        }

        builder.setSmallIcon(R.mipmap.ic_launcher);
        builder.setContentTitle("前台服务");
        builder.setContentText("服务正在运行...");

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            builder.setChannelId("channelId");
        }

        startForeground(1, builder.build());

    }
}
