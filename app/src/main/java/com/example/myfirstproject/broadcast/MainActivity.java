package com.example.myfirstproject.broadcast;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myfirstproject.BaseActivity;
import com.example.myfirstproject.R;

import androidx.localbroadcastmanager.content.LocalBroadcastManager;

public class MainActivity extends BaseActivity {

    private Button btnDynamic, btnStatic, btnLocal;
    private LocalBroadcastManager localBroadcastManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        initView();
        initListener();

        IntentFilter filter = new IntentFilter();
        filter.addAction("com.example.dynamic");
        //注册广播接收
        filter.setPriority(-1000);
        registerReceiver(new DynamicReceiver(), filter);

        //注册广播接收
        filter.setPriority(1000);
        registerReceiver(new Dynamic2Receiver(), filter);

        //本地广播
        localBroadcastManager = LocalBroadcastManager.getInstance(this);
        filter.addAction("com.example.local");
        localBroadcastManager.registerReceiver(new LocalReceiver(), filter);
    }


    private void initView() {
        btnDynamic = findViewById(R.id.btn_dynamic);
        btnStatic = findViewById(R.id.btn_static);
        btnLocal = findViewById(R.id.btn_local);
    }


    private void initListener() {
        btnDynamic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //动态广播
                Intent intent = new Intent();
                intent.setAction("com.example.dynamic");
                intent.putExtra("value", "你好！");
//                sendBroadcast(intent);
                sendOrderedBroadcast(intent, null);
            }
        });

        btnStatic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //静态广播
                Intent intent = new Intent("com.example.static");
                intent.putExtra("value", "你好！");
                intent.setClassName(MainActivity.this, "com.example.myfirstproject.broadcast.StaticReceiver");
                sendBroadcast(intent);
            }
        });

        //本地广播
        btnLocal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction("com.example.local");
                intent.putExtra("value", "你好！");
                localBroadcastManager.sendBroadcast(intent);
            }
        });
    }


    @Override
    protected void onPause() {
        super.onPause();
        unregisterReceiver(new DynamicReceiver());
        unregisterReceiver(new Dynamic2Receiver());
        localBroadcastManager.unregisterReceiver(new LocalReceiver());
    }
}