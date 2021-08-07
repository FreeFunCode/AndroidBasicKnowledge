package com.example.myfirstproject.activity;

import android.os.Bundle;

import com.example.myfirstproject.BaseActivity;
import com.example.myfirstproject.R;

public class SecondActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
}