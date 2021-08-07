package com.example.myfirstproject.activity;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.myfirstproject.BaseActivity;
import com.example.myfirstproject.R;

import java.util.List;

public class LaunchModeActivity extends BaseActivity {
    private Button btnLaunchMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_mode);

        btnLaunchMode = findViewById(R.id.btn_launch_mode);
        btnLaunchMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LaunchModeActivity.this,LaunchModeActivity.class);
                startActivity(intent);
            }
        });

        showTask(LaunchModeActivity.this);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        showTask(LaunchModeActivity.this);
    }

    public void showTask(Activity activity) {
        ActivityManager activityManager = (ActivityManager) activity.getSystemService(Activity.ACTIVITY_SERVICE);
        List<ActivityManager.RunningTaskInfo> list = activityManager.getRunningTasks(100);
        int size = list.size();
        ActivityManager.RunningTaskInfo task;
        for (int i = 0; i < size; i++) {
            task = list.get(i);
            //过滤UI系统层的任务栈
            if (task.id !=1) {
                Log.d("栈信息", "===================================");
                Log.d("栈当前activity的hashCode", "" + LaunchModeActivity.this.hashCode());
                Log.d("栈id", "" + task.id);
                Log.d("栈底activity", task.baseActivity.getClassName());
                Log.d("栈顶activity", task.topActivity.getClassName());
                Log.d("栈内activity个数", task.numActivities + "");
                Log.d("栈结束", "===================================");
            }
        }
    }
}