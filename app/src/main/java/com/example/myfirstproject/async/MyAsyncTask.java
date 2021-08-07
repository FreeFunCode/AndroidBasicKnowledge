package com.example.myfirstproject.async;

import android.os.AsyncTask;
import android.util.Log;

public class MyAsyncTask extends AsyncTask<String, Integer, Long> {
    public static final String TAG = "MyAsyncTask";

    @Override
    protected Long doInBackground(String... params) {
        int count = 100;
        long total = 0;
        for(int i = 0; i < count; i++) {
            // 模拟耗时操作
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }

            // 更新进度给onProgressUpdate
            publishProgress((int) ((i / (float) count) * 100));
            total ++;
            Log.d(TAG,""+((i / (float) count) * 100));
            // 是否停止异步任务
            if(isCancelled()) {
                Log.d(TAG,"AsyncTask 任务取消！！！");
                break;
            }
        }
        // 返回结果给onPostExecute
        return total;
    }
    @Override
    protected void onProgressUpdate(Integer... progress) {
        // 这里做进度更新界面
    }
    @Override
    protected void onPostExecute(Long result) {
        // 这里做完成界面处理
    }
    @Override
    protected void onCancelled() {
        // 如果被停止，则做停止界面处理
    }
}
