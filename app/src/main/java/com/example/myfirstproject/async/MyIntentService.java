package com.example.myfirstproject.async;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

public class MyIntentService extends IntentService {
    private static final String TAG = "MyIntentService";

//    /**
//     * Creates an IntentService.  Invoked by your subclass's constructor.
//     *
//     * @param name Used to name the worker thread, important only for debugging.
//     */
//    public MyIntentService(String name) {
//        super(name);
//    }

    public MyIntentService() {
        super("");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        String action = intent.getStringExtra("action");
        try {
            Thread.sleep(2000);
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }
        Log.d(TAG, "onHandleIntent被调用, action:" + action);
    }
    @Override
    public void onDestroy() {
        Log.d(TAG, "onDestroy被调用");
        super.onDestroy();
    }

}
