package com.example.myfirstproject.fragment;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myfirstproject.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


public class MyFragment extends BaseFragment {
    private SetData listener;
    public static MyFragment newInstance(String  key) {
        Log.d("MyFragment======",key);
        return new MyFragment();
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        listener= (SetData)context;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.my_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Bundle bundle = this.getArguments();
        if (bundle != null)
        {
            Log.d("MyFragment======",bundle.getString("key"));
        }
        listener.setKey("你也好");
    }



}
