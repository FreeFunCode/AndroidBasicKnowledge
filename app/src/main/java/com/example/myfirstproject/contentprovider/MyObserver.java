package com.example.myfirstproject.contentprovider;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;

import com.example.myfirstproject.MyApplication;

public class MyObserver extends ContentObserver{
    public static final String TAG = "MyObserver_ContentProvider";

    /**
     * Creates a content observer.
     *
     * @param handler The handler to run {@link #onChange} on, or null if none.
     */
    public MyObserver(Handler handler) {
        super(handler);
    }

    @Override
    public void onChange(boolean selfChange) {
        super.onChange(selfChange);

        // 设置URI
        Uri uri_user = Uri.parse("content://com.example.myprovider/user");
        // 获取ContentResolver
        ContentResolver resolver = MyApplication.getContext().getContentResolver();
        // 通过ContentResolver 向ContentProvider中查询数据
        Cursor cursor = resolver.query(uri_user, new String[]{"_id", "name"}, null, null, null);
        while (cursor.moveToNext()) {
            // 将表中数据全部输出
            Log.d(TAG,"query user:" + cursor.getInt(0) + " " + cursor.getString(1));
        }
        // 关闭游标
        cursor.close();
    }


}
