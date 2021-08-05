package com.example.myfirstproject.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class StaticReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "静态广播：" + intent.getStringExtra("value"), Toast.LENGTH_LONG).show();
        Log.d(getClass().getSimpleName(), "静态广播");
    }
}
