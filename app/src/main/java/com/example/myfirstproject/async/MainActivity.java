package com.example.myfirstproject.async;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.myfirstproject.R;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";
    private Button btnStart,btnCancel,btnIntentService;
    MyAsyncTask mMyAsyncTask;
    HandlerThread myHandlerThread;
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        initView();
        initListener();

        //Handler
//        testHandler();

        //HandlerThread
        testHandlerThread();

    }

    private void initView() {
        btnStart = findViewById(R.id.btn_start);
        btnCancel = findViewById(R.id.btn_cancel);
        btnIntentService = findViewById(R.id.btn_intent_service);
    }

    private void initListener() {
        //AsyncTask启动
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMyAsyncTask = new MyAsyncTask();
                // 开始任务
                mMyAsyncTask.execute();
            }
        });

        //AsyncTask取消
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 停止任务
                if (mMyAsyncTask != null) {
                    mMyAsyncTask.cancel(true);
                }
            }
        });


        //IntentService
        btnIntentService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MyIntentService.class);
                intent.putExtra("action","action_IntentService_1");
                startService(intent);
                intent.putExtra("action","action_IntentService_2");
                startService(intent);
                intent.putExtra("action","action_IntentService_3");
                startService(intent);
            }
        });

    }



    private void testHandler() {
         handler = new Handler(){
            public void handleMessage(Message msg){
                Log.d(TAG,"currentThread:"+Thread.currentThread().getName()+"   HandlerThread,接收到：msg="+msg);
            }
         };

        new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                    Message message = new Message();
                    message.obj = "我是Handler";
                    handler.sendMessage(message);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }

    private void testHandlerThread() {
        myHandlerThread = new HandlerThread("handler_thread") ;
        myHandlerThread.start();

        // 给Handler指定myHandlerThread的Looper
        handler =new Handler(myHandlerThread.getLooper()){
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                // 这里接收Handler发来的消息，运行在handler_thread线程中
                Log.d(TAG,"currentThread:"+Thread.currentThread().getName()+"   HandlerThread,接收到：msg="+msg);
            }
        };
        new Thread(new Runnable() {
            @Override
            public void run() {
                // 在子线程给Handler发送数据
                try {
                    Thread.sleep(3000);
                    Message message = new Message();
                    message.obj = "我是HandlerThread";
                    handler.sendMessage(message) ;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (myHandlerThread !=null) {
            myHandlerThread.quit();
        }
    }
}