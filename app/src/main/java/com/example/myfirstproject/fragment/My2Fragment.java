package com.example.myfirstproject.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.myfirstproject.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


public class My2Fragment extends BaseFragment {

    public static My2Fragment newInstance() {
        return new My2Fragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.my_fragment, container, false);
        TextView tv =  v.findViewById(R.id.message);
        tv.setText("Fragment 22222");
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


    }

}