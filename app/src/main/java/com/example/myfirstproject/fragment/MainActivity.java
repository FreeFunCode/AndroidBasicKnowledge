package com.example.myfirstproject.fragment;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import com.example.myfirstproject.BaseActivity;
import com.example.myfirstproject.R;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends BaseActivity implements SetData{
    private Button btnFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        if (savedInstanceState == null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.addToBackStack(null);   //添加进回退栈

            MyFragment fragment = new MyFragment().newInstance("hello");
            Bundle bundle = new Bundle();
            bundle.putString("key", "你好");
            fragment.setArguments(bundle);

            transaction.add(R.id.container,fragment);
            transaction.commit();
        }

//        btnFragment = findViewById(R.id.btn_fragment);
//        btnFragment.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FragmentManager fragmentManager = getSupportFragmentManager();
//                FragmentTransaction transaction = fragmentManager.beginTransaction();
//                transaction.addToBackStack(null);   //添加进回退栈
//                transaction.add(R.id.container, My2Fragment.newInstance());
//                transaction.commit();
//            }
//        });

    }

    @Override
    public void setKey(String key) {
        Log.d("MainActivity======",key);
    }
}