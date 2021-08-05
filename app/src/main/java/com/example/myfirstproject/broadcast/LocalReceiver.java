package com.example.myfirstproject.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class LocalReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "本地广播：" + intent.getStringExtra("value"), Toast.LENGTH_LONG).show();
        Log.d(getClass().getSimpleName() + "-TEST", "本地广播");
    }
}
