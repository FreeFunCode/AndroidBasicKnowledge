package com.example.myfirstproject.threadpool;

import android.util.Log;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolUtil {
    public static final String TAG = "ThreadPoolUtil";

    /**
     * ExecutorService是Java提供的用于管理线程池的类。该类的两个作用：控制线程数量和重用线程
     */

    //1、FixedThreadPool，它的核心线程数和最大线程数是一样的，可以把它看成是固定线程数的线程池；
    public static void testFixedThreadPool() {
        // 创建一个可重用固定个数的线程池
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            final int index = i;
            executorService.execute(new Runnable() {
                public void run() {
                    try {
                        // 打印正在执行的线程信息
                        Log.d(TAG,Thread.currentThread().getName()+ "正在被执行,第"+ index+"次");
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    //2、CachedThreadPool，可以把它叫做可缓存线程池，它的特点是线程数可以持续增加(理论最大可达Integer.MAX_VALUE=2^31-1)；
    public static void testCachedThreadPool() {
        // 创建一个可缓存线程池
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            final int index = i;
            try {
                // sleep可明显看到使用的是线程池里面以前的线程，没有创建新的线程
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            executorService.execute(new Runnable() {
                public void run() {
                    // 打印正在执行的线程信息
                    Log.d(TAG,Thread.currentThread().getName()+ "正在被执行,第"+ index+"次");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    //3、ScheduledThreadPool，它支持定时或周期性的执行任务，有3个方法可以灵活的执行频率配置参数；
    public static void testScheduledThreadPool() {
        //创建一个定长线程池，支持定时及周期性任务执行——延迟执行
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);

        //每x秒执行一次
        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            public void run() {
                Log.d(TAG,Thread.currentThread().getName()+ "正在被执行");
            }
        }, 1, 500, TimeUnit.MILLISECONDS);

    }

    //4、SingleThreadExecutor，它会使用唯一的线程去执行任务，适用于所有任务都需要按照被提交的顺序依次执行的场景；
    public static void testSingleThreadExecutor() {
        //创建一个单线程化的线程池
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            final int index = i;
            singleThreadExecutor.execute(new Runnable() {
                public void run() {
                    try {
                        //结果依次输出，相当于顺序执行各个任务
                        Log.d(TAG,Thread.currentThread().getName()+ "正在被执行,第"+ index+"次");
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    //5、SingleThreadScheduledExecutor，它和SingleThreadExecutor有些类似，它的核心线程数是1，但是最大线程数是Integer.MAX_VALUE。
    public static void testSingleThreadScheduledExecutor() {
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        for (int i = 0; i < 10; i++) {
            final int index = i;
            scheduledExecutorService.schedule(new Runnable() {
                @Override
                public void run() {
                    try {
                        Log.d(TAG,Thread.currentThread().getName()+ "正在被执行,第"+ index+"次");
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }, 3L, TimeUnit.SECONDS);
        }
    }
}
