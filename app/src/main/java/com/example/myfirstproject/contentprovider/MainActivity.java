package com.example.myfirstproject.contentprovider;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.myfirstproject.BaseActivity;
import com.example.myfirstproject.R;

public class MainActivity extends BaseActivity {
    public static final String TAG = "MainActivity_ContentProvider";

    private Button btnQuery;
    private MyObserver myObserver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        btnQuery = findViewById(R.id.btn_query);
        btnQuery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //点击事件 查询数据
                queryDataByContentProvider();
            }
        });

        //注册
        myObserver = new MyObserver(new Handler());
        getContentResolver().registerContentObserver(Uri.parse("content://com.example.myprovider/user"), false, myObserver);
    }

    private void queryDataByContentProvider() {
        /**
         * 对user表进行操作
         */

        // 设置URI
        Uri uri_user = Uri.parse("content://com.example.myprovider/user");

        // 插入表中数据
        ContentValues values = new ContentValues();
        values.put("_id", 3);
        values.put("name", "王五");

        // 获取ContentResolver
        ContentResolver resolver = getContentResolver();
        // 通过ContentResolver 根据URI 向ContentProvider中插入数据
        resolver.insert(uri_user, values);

        // 通过ContentResolver 向ContentProvider中查询数据
        Cursor cursor = resolver.query(uri_user, new String[]{"_id", "name"}, null, null, null);
        while (cursor.moveToNext()) {
            // 将表中数据全部输出
            Log.d(TAG,"query user:" + cursor.getInt(0) + " " + cursor.getString(1));
        }
        // 关闭游标
        cursor.close();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (myObserver!=null) {
            this.getContentResolver().unregisterContentObserver(myObserver);
        }
    }
}