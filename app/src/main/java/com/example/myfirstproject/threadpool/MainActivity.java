package com.example.myfirstproject.threadpool;

import android.os.Bundle;

import com.example.myfirstproject.BaseActivity;
import com.example.myfirstproject.R;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        ThreadPoolUtil threadPoolUtil = new ThreadPoolUtil();

//        //FixedThreadPool
        ThreadPoolUtil.testFixedThreadPool();

//        //CachedThreadPool
//        ThreadPoolUtil.testCachedThreadPool();

//        //ScheduledThreadPool
//        ThreadPoolUtil.testScheduledThreadPool();

//        //SingleThreadExecutor
//        ThreadPoolUtil.testSingleThreadExecutor();

//        //SingleThreadScheduledExecutor
//        ThreadPoolUtil.testSingleThreadScheduledExecutor();


    }
}