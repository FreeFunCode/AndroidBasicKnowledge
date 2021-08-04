package com.example.myfirstproject.service;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.myfirstproject.R;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity"+"-TEST_SERVICE";
    private Button btnStart,btnBind,btnStop,btnUnBind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        initView();

        initListener();
    }

    private void initView() {
        btnStart = findViewById(R.id.btn_start);
        btnBind = findViewById(R.id.btn_bind);
        btnStop = findViewById(R.id.btn_stop);
        btnUnBind = findViewById(R.id.btn_unbind);
    }


    private void initListener() {

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FirstService.class);
                startService(intent);
            }
        });

        btnBind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FirstService.class);
                bindService(intent,conn, BIND_AUTO_CREATE);
            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent service = new Intent(MainActivity.this, FirstService.class);
                stopService(service);
            }
        });

        btnUnBind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unbindService(conn);
            }
        });

    }


    private ServiceConnection conn = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder binder) {
            Log.d(TAG, "onServiceConnected "+name);
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            Log.d(TAG, "onServiceDisconnected "+name);
        }

        @Override
        public void onBindingDied(ComponentName name) {
            Log.d(TAG, "onBindingDied "+name);
        }

        @Override
        public void onNullBinding(ComponentName name) {
            Log.d(TAG, "onNullBinding "+name);
        }
    };
}