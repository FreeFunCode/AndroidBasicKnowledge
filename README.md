
------------------------


安装环境

JDK:
https://www.oracle.com/java/
jdk环境变量配置

Android Studio
https://developer.android.google.cn/studio

SDK

NDK ?



------------------------


Activity 生命周期：
onCreate、onStart、onResume、onPause、onStop、onDestroy、onRestart。


打开新的activity页面：
2021-08-03 16:03:02.261 29605-29605/com.example.myfirstproject D/MainActivity-TEST: onCreate
2021-08-03 16:03:02.431 29605-29605/com.example.myfirstproject D/MainActivity-TEST: onStart
2021-08-03 16:03:02.435 29605-29605/com.example.myfirstproject D/MainActivity-TEST: onResume
-----jump secondActivity--------
2021-08-03 16:03:26.400 29605-29605/com.example.myfirstproject D/MainActivity-TEST: onPause
2021-08-03 16:03:26.432 29605-29605/com.example.myfirstproject D/SecondActivity-TEST: onCreate
2021-08-03 16:03:26.483 29605-29605/com.example.myfirstproject D/SecondActivity-TEST: onStart
2021-08-03 16:03:26.485 29605-29605/com.example.myfirstproject D/SecondActivity-TEST: onResume
2021-08-03 16:03:26.782 29605-29605/com.example.myfirstproject D/MainActivity-TEST: onStop
2021-08-03 16:03:26.784 29605-29605/com.example.myfirstproject D/MainActivity-TEST: onSaveInstanceStateBundle[{android:viewHierarchyState=Bundle[{android:views={16908290=android.view.AbsSavedState$1@eb73172, 2131230768=androidx.appcompat.widget.Toolbar$SavedState@53cf9c3, 2131230770=android.view.AbsSavedState$1@eb73172, 2131230776=android.view.AbsSavedState$1@eb73172, 2131230843=android.view.AbsSavedState$1@eb73172, 2131231130=com.google.android.material.button.MaterialButton$SavedState@ee1f240, 2131231131=android.view.AbsSavedState$1@eb73172, 2131231132=com.google.android.material.button.MaterialButton$SavedState@b83d579, 2131231133=com.google.android.material.button.MaterialButton$SavedState@6c2f2be, 2131231134=android.view.AbsSavedState$1@eb73172}}], androidx.lifecycle.BundlableSavedStateRegistry.key=Bundle[{}], android:lastAutofillId=1073741823, android:fragments=android.app.FragmentManagerState@3eb6f1f}]
-----锁屏-------
2021-08-03 16:04:26.542 29605-29605/com.example.myfirstproject D/SecondActivity-TEST: onPause
2021-08-03 16:04:26.616 29605-29605/com.example.myfirstproject D/SecondActivity-TEST: onStop
2021-08-03 16:04:26.628 29605-29605/com.example.myfirstproject D/SecondActivity-TEST: onSaveInstanceStateBundle[{android:viewHierarchyState=Bundle[{android:views={16908290=android.view.AbsSavedState$1@eb73172, 2131230768=androidx.appcompat.widget.Toolbar$SavedState@85bab1, 2131230770=android.view.AbsSavedState$1@eb73172, 2131230776=android.view.AbsSavedState$1@eb73172, 2131230843=android.view.AbsSavedState$1@eb73172}}], androidx.lifecycle.BundlableSavedStateRegistry.key=Bundle[{}], android:lastAutofillId=1073741823, android:fragments=android.app.FragmentManagerState@db89b96}]
------解屏-----
2021-08-03 16:05:55.354 29605-29605/com.example.myfirstproject D/SecondActivity-TEST: onRestart
2021-08-03 16:05:55.355 29605-29605/com.example.myfirstproject D/SecondActivity-TEST: onStart
2021-08-03 16:05:55.356 29605-29605/com.example.myfirstproject D/SecondActivity-TEST: onResume
------返回上一页mainActivity--物理返回键-----
2021-08-03 16:06:35.619 29605-29605/com.example.myfirstproject D/SecondActivity-TEST: onPause
2021-08-03 16:06:35.688 29605-29605/com.example.myfirstproject D/MainActivity-TEST: onRestart
2021-08-03 16:06:35.698 29605-29605/com.example.myfirstproject D/MainActivity-TEST: onStart
2021-08-03 16:06:35.703 29605-29605/com.example.myfirstproject D/MainActivity-TEST: onResume
2021-08-03 16:06:36.000 29605-29605/com.example.myfirstproject D/SecondActivity-TEST: onStop
2021-08-03 16:06:36.001 29605-29605/com.example.myfirstproject D/SecondActivity-TEST: onDestroy

-------------------------------------
打开AlertDialog弹窗生命周期无变化。

--------------------------------------
打开theme是Diloag的Activity。
半遮挡：
2021-08-03 16:11:05.582 30559-30559/com.example.myfirstproject D/MainActivity-TEST: onCreate
2021-08-03 16:11:05.750 30559-30559/com.example.myfirstproject D/MainActivity-TEST: onStart
2021-08-03 16:11:05.754 30559-30559/com.example.myfirstproject D/MainActivity-TEST: onResume
------------打开dialogActivity--------
2021-08-03 16:11:24.890 30559-30559/com.example.myfirstproject D/MainActivity-TEST: onPause
2021-08-03 16:11:24.928 30559-30559/com.example.myfirstproject D/DialogActivity-TEST: onCreate
2021-08-03 16:11:24.965 30559-30559/com.example.myfirstproject D/DialogActivity-TEST: onStart
2021-08-03 16:11:24.966 30559-30559/com.example.myfirstproject D/DialogActivity-TEST: onResume
---------锁屏----------
2021-08-03 16:12:25.088 30559-30559/com.example.myfirstproject D/DialogActivity-TEST: onPause
2021-08-03 16:12:25.204 30559-30559/com.example.myfirstproject D/DialogActivity-TEST: onStop
2021-08-03 16:12:25.207 30559-30559/com.example.myfirstproject D/DialogActivity-TEST: onSaveInstanceStateBundle[{android:viewHierarchyState=Bundle[{android:views={16908290=android.view.AbsSavedState$1@7d66227, 2131231103=android.view.AbsSavedState$1@7d66227}}], androidx.lifecycle.BundlableSavedStateRegistry.key=Bundle[{}], android:lastAutofillId=1073741823, android:fragments=android.app.FragmentManagerState@959dcd4}]
2021-08-03 16:12:25.212 30559-30559/com.example.myfirstproject D/MainActivity-TEST: onStop
2021-08-03 16:12:25.216 30559-30559/com.example.myfirstproject D/MainActivity-TEST: onSaveInstanceStateBundle[{android:viewHierarchyState=Bundle[{android:views={16908290=android.view.AbsSavedState$1@7d66227, 2131230768=androidx.appcompat.widget.Toolbar$SavedState@ee1f240, 2131230770=android.view.AbsSavedState$1@7d66227, 2131230776=android.view.AbsSavedState$1@7d66227, 2131230843=android.view.AbsSavedState$1@7d66227, 2131231130=com.google.android.material.button.MaterialButton$SavedState@b83d579, 2131231131=android.view.AbsSavedState$1@7d66227, 2131231132=com.google.android.material.button.MaterialButton$SavedState@6c2f2be, 2131231133=com.google.android.material.button.MaterialButton$SavedState@3eb6f1f, 2131231134=android.view.AbsSavedState$1@7d66227}}], androidx.lifecycle.BundlableSavedStateRegistry.key=Bundle[{}], android:lastAutofillId=1073741823, android:fragments=android.app.FragmentManagerState@813f26c}]
--------解屏-----
2021-08-03 16:13:22.628 30559-30559/com.example.myfirstproject D/MainActivity-TEST: onRestart
2021-08-03 16:13:22.631 30559-30559/com.example.myfirstproject D/MainActivity-TEST: onStart
2021-08-03 16:13:22.633 30559-30559/com.example.myfirstproject D/DialogActivity-TEST: onRestart
2021-08-03 16:13:22.633 30559-30559/com.example.myfirstproject D/DialogActivity-TEST: onStart
2021-08-03 16:13:22.635 30559-30559/com.example.myfirstproject D/DialogActivity-TEST: onResume
-------返回上一页mainActivity--物理返回键-----
2021-08-03 16:16:34.631 30559-30559/com.example.myfirstproject D/DialogActivity-TEST: onPause
2021-08-03 16:16:34.731 30559-30559/com.example.myfirstproject D/MainActivity-TEST: onResume
2021-08-03 16:16:34.790 30559-30559/com.example.myfirstproject D/DialogActivity-TEST: onStop
2021-08-03 16:16:34.792 30559-30559/com.example.myfirstproject D/DialogActivity-TEST: onDestroy
---------------------
全遮挡：
2021-08-03 16:18:07.207 31534-31534/com.example.myfirstproject D/MainActivity-TEST: onCreate
2021-08-03 16:18:07.381 31534-31534/com.example.myfirstproject D/MainActivity-TEST: onStart
2021-08-03 16:18:07.385 31534-31534/com.example.myfirstproject D/MainActivity-TEST: onResume
------------打开dialogActivity--------
2021-08-03 16:18:29.276 31534-31534/com.example.myfirstproject D/MainActivity-TEST: onPause
2021-08-03 16:18:29.305 31534-31534/com.example.myfirstproject D/DialogActivity-TEST: onCreate
2021-08-03 16:18:29.347 31534-31534/com.example.myfirstproject D/DialogActivity-TEST: onStart
2021-08-03 16:18:29.349 31534-31534/com.example.myfirstproject D/DialogActivity-TEST: onResume
2021-08-03 16:18:29.668 31534-31534/com.example.myfirstproject D/MainActivity-TEST: onStop
2021-08-03 16:18:29.671 31534-31534/com.example.myfirstproject D/MainActivity-TEST: onSaveInstanceStateBundle[{android:viewHierarchyState=Bundle[{android:views={16908290=android.view.AbsSavedState$1@813f26c, 2131230768=androidx.appcompat.widget.Toolbar$SavedState@fe35035, 2131230770=android.view.AbsSavedState$1@813f26c, 2131230776=android.view.AbsSavedState$1@813f26c, 2131230843=android.view.AbsSavedState$1@813f26c, 2131231130=com.google.android.material.button.MaterialButton$SavedState@4377cca, 2131231131=android.view.AbsSavedState$1@813f26c, 2131231132=com.google.android.material.button.MaterialButton$SavedState@1e1de3b, 2131231133=com.google.android.material.button.MaterialButton$SavedState@b83c958, 2131231134=android.view.AbsSavedState$1@813f26c}}], androidx.lifecycle.BundlableSavedStateRegistry.key=Bundle[{}], android:lastAutofillId=1073741823, android:fragments=android.app.FragmentManagerState@85bab1}]
---------锁屏----------
2021-08-03 16:19:16.524 31534-31534/com.example.myfirstproject D/DialogActivity-TEST: onPause
2021-08-03 16:19:16.586 31534-31534/com.example.myfirstproject D/DialogActivity-TEST: onStop
2021-08-03 16:19:16.588 31534-31534/com.example.myfirstproject D/DialogActivity-TEST: onSaveInstanceStateBundle[{android:viewHierarchyState=Bundle[{android:views={16908290=android.view.AbsSavedState$1@813f26c, 2131230768=androidx.appcompat.widget.Toolbar$SavedState@9bfd9b3, 2131230770=android.view.AbsSavedState$1@813f26c, 2131230776=android.view.AbsSavedState$1@813f26c, 2131230843=android.view.AbsSavedState$1@813f26c}}], androidx.lifecycle.BundlableSavedStateRegistry.key=Bundle[{}], android:lastAutofillId=1073741823, android:fragments=android.app.FragmentManagerState@e766b70}]
--------解屏-----
2021-08-03 16:19:44.208 31534-31534/com.example.myfirstproject D/DialogActivity-TEST: onRestart
2021-08-03 16:19:44.209 31534-31534/com.example.myfirstproject D/DialogActivity-TEST: onStart
2021-08-03 16:19:44.210 31534-31534/com.example.myfirstproject D/DialogActivity-TEST: onResume
-------返回上一页mainActivity--物理返回键-----
2021-08-03 16:20:54.847 31534-31534/com.example.myfirstproject D/DialogActivity-TEST: onPause
2021-08-03 16:20:54.885 31534-31534/com.example.myfirstproject D/MainActivity-TEST: onRestart
2021-08-03 16:20:54.888 31534-31534/com.example.myfirstproject D/MainActivity-TEST: onStart
2021-08-03 16:20:54.895 31534-31534/com.example.myfirstproject D/MainActivity-TEST: onResume
2021-08-03 16:20:55.218 31534-31534/com.example.myfirstproject D/DialogActivity-TEST: onStop
2021-08-03 16:20:55.220 31534-31534/com.example.myfirstproject D/DialogActivity-TEST: onDestroy

-----------------------------
总结：
当前页如果被新页面完全遮挡，
onPause-》新页面生命周期-》onStop

半遮挡：
onPause-》新页面生命周期


----------------------------------
横竖屏切换生命周期变化：

android:configChanges=""：
android:configChanges="orientation"：
android:configChanges="orientation|keyboardHidden":
android:configChanges="screenSize":
2021-08-03 17:08:00.364 5717-5717/com.example.myfirstproject D/MainActivity-TEST: onCreate
2021-08-03 17:08:00.532 5717-5717/com.example.myfirstproject D/MainActivity-TEST: onStart
2021-08-03 17:08:00.535 5717-5717/com.example.myfirstproject D/MainActivity-TEST: onResume
--------旋转---------
2021-08-03 17:08:41.253 5717-5717/com.example.myfirstproject D/MainActivity-TEST: onPause
2021-08-03 17:08:41.259 5717-5717/com.example.myfirstproject D/MainActivity-TEST: onStop
2021-08-03 17:08:41.263 5717-5717/com.example.myfirstproject D/MainActivity-TEST: onSaveInstanceStateBundle[{android:viewHierarchyState=Bundle[{android:views={16908290=android.view.AbsSavedState$1@77b2f2d, 2131230768=androidx.appcompat.widget.Toolbar$SavedState@1a0fc62, 2131230770=android.view.AbsSavedState$1@77b2f2d, 2131230776=android.view.AbsSavedState$1@77b2f2d, 2131230843=android.view.AbsSavedState$1@77b2f2d, 2131231130=com.google.android.material.button.MaterialButton$SavedState@43d81f3, 2131231131=android.view.AbsSavedState$1@77b2f2d, 2131231132=com.google.android.material.button.MaterialButton$SavedState@ba8eb0, 2131231133=com.google.android.material.button.MaterialButton$SavedState@3089129, 2131231134=android.view.AbsSavedState$1@77b2f2d}}], androidx.lifecycle.BundlableSavedStateRegistry.key=Bundle[{}], android:lastAutofillId=1073741823, android:fragments=android.app.FragmentManagerState@5967cae}]
2021-08-03 17:08:41.265 5717-5717/com.example.myfirstproject D/MainActivity-TEST: onDestroy
2021-08-03 17:08:41.701 5717-5717/com.example.myfirstproject D/MainActivity-TEST: onCreate
2021-08-03 17:08:41.793 5717-5717/com.example.myfirstproject D/MainActivity-TEST: onStart
2021-08-03 17:08:41.794 5717-5717/com.example.myfirstproject D/MainActivity-TEST: onRestoreInstanceState
2021-08-03 17:08:41.795 5717-5717/com.example.myfirstproject D/MainActivity-TEST: onResume


//android:configChanges="orientation|keyboardHidden|screenSize"
android:configChanges="orientation|screenSize"
2021-08-03 17:11:47.546 6771-6771/com.example.myfirstproject D/MainActivity-TEST: onConfigurationChanged{1.0 ?mcc?mnc [zh_CN_#Hans,en_GB] ldltr sw360dp w640dp h336dp 480dpi nrml long land finger -keyb/v/h -nav/h winConfig={ mBounds=Rect(0, 0 - 1920, 1080) mAppBounds=Rect(0, 0 - 1920, 1080) mWindowingMode=fullscreen mActivityType=standard} nonFullScreen=0 suim:1 s.24}

总结：
禁止横竖屏切换重走生命周期使用：android:configChanges="orientation|screenSize"

如果横竖屏切换重走生命周期，需要保存数据：onSaveInstanceStateBundle保存，onRestoreInstanceState恢复。


------------------------------------------------


四种启动模式：
standard、singleTop、singleTask、singleInstance

检测方法：
public void showTask(Activity activity) {
        ActivityManager activityManager = (ActivityManager) activity.getSystemService(Activity.ACTIVITY_SERVICE);
        List<ActivityManager.RunningTaskInfo> list = activityManager.getRunningTasks(100);
        int size = list.size();
        ActivityManager.RunningTaskInfo task;
        for (int i = 0; i < size; i++) {
            task = list.get(i);
            Log.d("栈信息", "===================================");
            Log.d("栈当前activity的hashCode", "" + LaunchModeActivity.this.hashCode());
            Log.d("栈id", "" + task.id);
            Log.d("栈底activity", task.baseActivity.getClassName());
            Log.d("栈顶activity", task.topActivity.getClassName());
            Log.d("栈内activity个数", task.numActivities + "");
            Log.d("栈结束", "===================================");
        }
    }

结果：

standard:

2021-08-04 08:08:39.174 29909-29909/com.example.myfirstproject D/栈信息: ===================================
2021-08-04 08:08:39.174 29909-29909/com.example.myfirstproject D/栈当前activity的hashCode: 106020151
2021-08-04 08:08:39.174 29909-29909/com.example.myfirstproject D/栈id: 92
2021-08-04 08:08:39.174 29909-29909/com.example.myfirstproject D/栈底activity: com.example.myfirstproject.Activity.LaunchModeActivity
2021-08-04 08:08:39.174 29909-29909/com.example.myfirstproject D/栈顶activity: com.example.myfirstproject.Activity.LaunchModeActivity
2021-08-04 08:08:39.174 29909-29909/com.example.myfirstproject D/栈内activity个数: 1
2021-08-04 08:08:39.174 29909-29909/com.example.myfirstproject D/栈结束: ===================================

2021-08-04 08:08:33.482 29909-29909/com.example.myfirstproject D/MainActivity-TEST: onCreate
2021-08-04 08:08:33.705 29909-29909/com.example.myfirstproject D/MainActivity-TEST: onStart
2021-08-04 08:08:33.709 29909-29909/com.example.myfirstproject D/MainActivity-TEST: onResume
2021-08-04 08:08:39.098 29909-29909/com.example.myfirstproject D/MainActivity-TEST: onPause
2021-08-04 08:08:39.131 29909-29909/com.example.myfirstproject D/LaunchModeActivity-TEST: onCreate
2021-08-04 08:08:39.179 29909-29909/com.example.myfirstproject D/LaunchModeActivity-TEST: onStart
2021-08-04 08:08:39.180 29909-29909/com.example.myfirstproject D/LaunchModeActivity-TEST: onResume
2021-08-04 08:08:39.513 29909-29909/com.example.myfirstproject D/MainActivity-TEST: onStop
2021-08-04 08:08:39.516 29909-29909/com.example.myfirstproject D/MainActivity-TEST: onDestroy

--------再次创建当前页-------
2021-08-04 08:09:15.479 29909-29909/com.example.myfirstproject D/栈信息: ===================================
2021-08-04 08:09:15.479 29909-29909/com.example.myfirstproject D/栈当前activity的hashCode: 251684229
2021-08-04 08:09:15.479 29909-29909/com.example.myfirstproject D/栈id: 92
2021-08-04 08:09:15.479 29909-29909/com.example.myfirstproject D/栈底activity: com.example.myfirstproject.Activity.LaunchModeActivity
2021-08-04 08:09:15.479 29909-29909/com.example.myfirstproject D/栈顶activity: com.example.myfirstproject.Activity.LaunchModeActivity
2021-08-04 08:09:15.479 29909-29909/com.example.myfirstproject D/栈内activity个数: 2
2021-08-04 08:09:15.479 29909-29909/com.example.myfirstproject D/栈结束: ===================================

2021-08-04 08:09:15.405 29909-29909/com.example.myfirstproject D/LaunchModeActivity-TEST: onPause
2021-08-04 08:09:15.433 29909-29909/com.example.myfirstproject D/LaunchModeActivity-TEST: onCreate
2021-08-04 08:09:15.483 29909-29909/com.example.myfirstproject D/LaunchModeActivity-TEST: onStart
2021-08-04 08:09:15.485 29909-29909/com.example.myfirstproject D/LaunchModeActivity-TEST: onResume
2021-08-04 08:09:15.800 29909-29909/com.example.myfirstproject D/LaunchModeActivity-TEST: onStop
2021-08-04 08:09:15.802 29909-29909/com.example.myfirstproject D/LaunchModeActivity-TEST: onSaveInstanceStateBundle[{android:viewHierarchyState=Bundle[{android:views={16908290=android.view.AbsSavedState$1@d357f8e, 2131230768=androidx.appcompat.widget.Toolbar$SavedState@278c3af, 2131230770=android.view.AbsSavedState$1@d357f8e, 2131230776=android.view.AbsSavedState$1@d357f8e, 2131230843=android.view.AbsSavedState$1@d357f8e, 2131231135=com.google.android.material.button.MaterialButton$SavedState@164d3bc, 2131231136=android.view.AbsSavedState$1@d357f8e}}], androidx.lifecycle.BundlableSavedStateRegistry.key=Bundle[{}], android:lastAutofillId=1073741823, android:fragments=android.app.FragmentManagerState@fd99f45}]

-----------------------------
singleTop：

2021-08-04 08:12:58.890 30376-30376/com.example.myfirstproject D/栈信息: ===================================
2021-08-04 08:12:58.890 30376-30376/com.example.myfirstproject D/栈当前activity的hashCode: 106020151
2021-08-04 08:12:58.890 30376-30376/com.example.myfirstproject D/栈id: 93
2021-08-04 08:12:58.890 30376-30376/com.example.myfirstproject D/栈底activity: com.example.myfirstproject.Activity.LaunchModeActivity
2021-08-04 08:12:58.890 30376-30376/com.example.myfirstproject D/栈顶activity: com.example.myfirstproject.Activity.LaunchModeActivity
2021-08-04 08:12:58.890 30376-30376/com.example.myfirstproject D/栈内activity个数: 1
2021-08-04 08:12:58.890 30376-30376/com.example.myfirstproject D/栈结束: ===================================

2021-08-04 08:12:50.908 30376-30376/com.example.myfirstproject D/MainActivity-TEST: onCreate
2021-08-04 08:12:51.121 30376-30376/com.example.myfirstproject D/MainActivity-TEST: onStart
2021-08-04 08:12:51.125 30376-30376/com.example.myfirstproject D/MainActivity-TEST: onResume
2021-08-04 08:12:58.819 30376-30376/com.example.myfirstproject D/MainActivity-TEST: onPause
2021-08-04 08:12:58.848 30376-30376/com.example.myfirstproject D/LaunchModeActivity-TEST: onCreate
2021-08-04 08:12:58.895 30376-30376/com.example.myfirstproject D/LaunchModeActivity-TEST: onStart
2021-08-04 08:12:58.896 30376-30376/com.example.myfirstproject D/LaunchModeActivity-TEST: onResume
2021-08-04 08:12:59.247 30376-30376/com.example.myfirstproject D/MainActivity-TEST: onStop
2021-08-04 08:12:59.250 30376-30376/com.example.myfirstproject D/MainActivity-TEST: onDestroy

--------再次创建当前页-------

2021-08-04 08:13:43.465 30376-30376/com.example.myfirstproject D/LaunchModeActivity-TEST: onPause
2021-08-04 08:13:43.466 30376-30376/com.example.myfirstproject D/LaunchModeActivity-TEST: onNewIntent
2021-08-04 08:13:43.467 30376-30376/com.example.myfirstproject D/LaunchModeActivity-TEST: onResume

--------------------------------
singleTask：

2021-08-04 08:17:06.517 31279-31279/com.example.myfirstproject D/栈信息: ===================================
2021-08-04 08:17:06.517 31279-31279/com.example.myfirstproject D/栈当前activity的hashCode: 36162102
2021-08-04 08:17:06.517 31279-31279/com.example.myfirstproject D/栈id: 95
2021-08-04 08:17:06.517 31279-31279/com.example.myfirstproject D/栈底activity: com.example.myfirstproject.Activity.LaunchModeActivity
2021-08-04 08:17:06.517 31279-31279/com.example.myfirstproject D/栈顶activity: com.example.myfirstproject.Activity.LaunchModeActivity
2021-08-04 08:17:06.517 31279-31279/com.example.myfirstproject D/栈内activity个数: 1
2021-08-04 08:17:06.517 31279-31279/com.example.myfirstproject D/栈结束: ===================================

2021-08-04 08:16:53.760 31279-31279/com.example.myfirstproject D/MainActivity-TEST: onCreate
2021-08-04 08:16:53.970 31279-31279/com.example.myfirstproject D/MainActivity-TEST: onStart
2021-08-04 08:16:53.974 31279-31279/com.example.myfirstproject D/MainActivity-TEST: onResume
2021-08-04 08:17:06.436 31279-31279/com.example.myfirstproject D/MainActivity-TEST: onPause
2021-08-04 08:17:06.475 31279-31279/com.example.myfirstproject D/LaunchModeActivity-TEST: onCreate
2021-08-04 08:17:06.522 31279-31279/com.example.myfirstproject D/LaunchModeActivity-TEST: onStart
2021-08-04 08:17:06.524 31279-31279/com.example.myfirstproject D/LaunchModeActivity-TEST: onResume
2021-08-04 08:17:06.838 31279-31279/com.example.myfirstproject D/MainActivity-TEST: onStop
2021-08-04 08:17:06.841 31279-31279/com.example.myfirstproject D/MainActivity-TEST: onDestroy

--------再次创建当前页-------

2021-08-04 08:17:48.911 31279-31279/com.example.myfirstproject D/LaunchModeActivity-TEST: onPause
2021-08-04 08:17:48.911 31279-31279/com.example.myfirstproject D/LaunchModeActivity-TEST: onNewIntent
2021-08-04 08:17:48.914 31279-31279/com.example.myfirstproject D/LaunchModeActivity-TEST: onResume
-------------------------

singleInstance:

2021-08-04 08:19:40.571 31732-31732/com.example.myfirstproject D/栈信息: ===================================
2021-08-04 08:19:40.571 31732-31732/com.example.myfirstproject D/栈当前activity的hashCode: 106020151
2021-08-04 08:19:40.571 31732-31732/com.example.myfirstproject D/栈id: 97
2021-08-04 08:19:40.571 31732-31732/com.example.myfirstproject D/栈底activity: com.example.myfirstproject.Activity.LaunchModeActivity
2021-08-04 08:19:40.571 31732-31732/com.example.myfirstproject D/栈顶activity: com.example.myfirstproject.Activity.LaunchModeActivity
2021-08-04 08:19:40.571 31732-31732/com.example.myfirstproject D/栈内activity个数: 1
2021-08-04 08:19:40.571 31732-31732/com.example.myfirstproject D/栈结束: ===================================


2021-08-04 08:19:26.517 31732-31732/com.example.myfirstproject D/MainActivity-TEST: onCreate
2021-08-04 08:19:26.740 31732-31732/com.example.myfirstproject D/MainActivity-TEST: onStart
2021-08-04 08:19:26.746 31732-31732/com.example.myfirstproject D/MainActivity-TEST: onResume
2021-08-04 08:19:40.430 31732-31732/com.example.myfirstproject D/MainActivity-TEST: onPause
2021-08-04 08:19:40.527 31732-31732/com.example.myfirstproject D/LaunchModeActivity-TEST: onCreate
2021-08-04 08:19:40.575 31732-31732/com.example.myfirstproject D/LaunchModeActivity-TEST: onStart
2021-08-04 08:19:40.577 31732-31732/com.example.myfirstproject D/LaunchModeActivity-TEST: onResume
2021-08-04 08:19:40.885 31732-31732/com.example.myfirstproject D/MainActivity-TEST: onStop
2021-08-04 08:19:40.888 31732-31732/com.example.myfirstproject D/MainActivity-TEST: onDestroy


--------再次创建当前页-------
2021-08-04 08:20:55.348 31732-31732/com.example.myfirstproject D/LaunchModeActivity-TEST: onPause
2021-08-04 08:20:55.348 31732-31732/com.example.myfirstproject D/LaunchModeActivity-TEST: onNewIntent
2021-08-04 08:20:55.352 31732-31732/com.example.myfirstproject D/LaunchModeActivity-TEST: onResume


------------------------


Service生命周期：

两种启动方式：startService()；bindService()

startService : onCreate -> onStartCommand -> onDestroy
bindService : onCreate -> onBind -> onUnbind -> onDestroy


Log输出:


startService->stopService:

2021-08-04 17:21:33.205 27757-27757/com.example.myfirstproject D/FirstService-TEST_SERVICE: onCreate
2021-08-04 17:21:33.207 27757-27757/com.example.myfirstproject D/FirstService-TEST_SERVICE: onStartCommand Intent { cmp=com.example.myfirstproject/.service.FirstService }
2021-08-04 17:21:33.207 27757-27757/com.example.myfirstproject D/FirstService-TEST_SERVICE: onStartIntent { cmp=com.example.myfirstproject/.service.FirstService }
-------stopService-------
2021-08-04 17:22:00.170 27757-27757/com.example.myfirstproject D/FirstService-TEST_SERVICE: onDestroy

bindService->unBindService
2021-08-04 17:22:46.916 27757-27757/com.example.myfirstproject D/FirstService-TEST_SERVICE: onCreate
2021-08-04 17:22:46.918 27757-27757/com.example.myfirstproject D/FirstService-TEST_SERVICE: onBind Intent { cmp=com.example.myfirstproject/.service.FirstService }
2021-08-04 17:22:46.942 27757-27757/com.example.myfirstproject D/MainActivity-TEST_SERVICE: onNullBinding ComponentInfo{com.example.myfirstproject/com.example.myfirstproject.service.FirstService}
--------onUnbindService----
2021-08-04 17:23:26.428 27757-27757/com.example.myfirstproject D/FirstService-TEST_SERVICE: onUnbind Intent { cmp=com.example.myfirstproject/.service.FirstService }
2021-08-04 17:23:26.429 27757-27757/com.example.myfirstproject D/FirstService-TEST_SERVICE: onDestroy

startService->startService->stopService:

2021-08-04 17:24:23.657 27757-27757/com.example.myfirstproject D/FirstService-TEST_SERVICE: onCreate
2021-08-04 17:24:23.675 27757-27757/com.example.myfirstproject D/FirstService-TEST_SERVICE: onStartCommand Intent { cmp=com.example.myfirstproject/.service.FirstService }
2021-08-04 17:24:23.675 27757-27757/com.example.myfirstproject D/FirstService-TEST_SERVICE: onStartIntent { cmp=com.example.myfirstproject/.service.FirstService }
-------startService-------
2021-08-04 17:24:45.667 27757-27757/com.example.myfirstproject D/FirstService-TEST_SERVICE: onStartCommand Intent { cmp=com.example.myfirstproject/.service.FirstService }
2021-08-04 17:24:45.668 27757-27757/com.example.myfirstproject D/FirstService-TEST_SERVICE: onStartIntent { cmp=com.example.myfirstproject/.service.FirstService }
-------stopService-------
2021-08-04 17:25:19.052 27757-27757/com.example.myfirstproject D/FirstService-TEST_SERVICE: onDestroy


bindService->bindService->unBindService
2021-08-04 17:25:51.741 27757-27757/com.example.myfirstproject D/FirstService-TEST_SERVICE: onCreate
2021-08-04 17:25:51.773 27757-27757/com.example.myfirstproject D/FirstService-TEST_SERVICE: onBind Intent { cmp=com.example.myfirstproject/.service.FirstService }
2021-08-04 17:25:51.783 27757-27757/com.example.myfirstproject D/MainActivity-TEST_SERVICE: onNullBinding ComponentInfo{com.example.myfirstproject/com.example.myfirstproject.service.FirstService}
--------bindService----
2021-08-04 17:26:15.197 27757-27757/com.example.myfirstproject D/MainActivity-TEST_SERVICE: onNullBinding ComponentInfo{com.example.myfirstproject/com.example.myfirstproject.service.FirstService}
--------onUnbindService----
2021-08-04 17:26:50.697 27757-27757/com.example.myfirstproject D/FirstService-TEST_SERVICE: onUnbind Intent { cmp=com.example.myfirstproject/.service.FirstService }
2021-08-04 17:26:50.698 27757-27757/com.example.myfirstproject D/FirstService-TEST_SERVICE: onDestroy


startService->bindService->unBindService->stopService:
2021-08-04 17:27:32.271 27757-27757/com.example.myfirstproject D/FirstService-TEST_SERVICE: onCreate
2021-08-04 17:27:32.272 27757-27757/com.example.myfirstproject D/FirstService-TEST_SERVICE: onStartCommand Intent { cmp=com.example.myfirstproject/.service.FirstService }
2021-08-04 17:27:32.272 27757-27757/com.example.myfirstproject D/FirstService-TEST_SERVICE: onStartIntent { cmp=com.example.myfirstproject/.service.FirstService }
--------bindService----
2021-08-04 17:27:44.858 27757-27757/com.example.myfirstproject D/FirstService-TEST_SERVICE: onBind Intent { cmp=com.example.myfirstproject/.service.FirstService }
2021-08-04 17:27:44.876 27757-27757/com.example.myfirstproject D/MainActivity-TEST_SERVICE: onNullBinding ComponentInfo{com.example.myfirstproject/com.example.myfirstproject.service.FirstService}
--------onUnbindService----
2021-08-04 17:28:05.381 27757-27757/com.example.myfirstproject D/FirstService-TEST_SERVICE: onUnbind Intent { cmp=com.example.myfirstproject/.service.FirstService }
-------stopService-------
2021-08-04 17:28:37.031 27757-27757/com.example.myfirstproject D/FirstService-TEST_SERVICE: onDestroy

startService->bindService->stopService->unBindService:
2021-08-04 17:28:54.687 27757-27757/com.example.myfirstproject D/FirstService-TEST_SERVICE: onCreate
2021-08-04 17:28:54.690 27757-27757/com.example.myfirstproject D/FirstService-TEST_SERVICE: onStartCommand Intent { cmp=com.example.myfirstproject/.service.FirstService }
2021-08-04 17:28:54.690 27757-27757/com.example.myfirstproject D/FirstService-TEST_SERVICE: onStartIntent { cmp=com.example.myfirstproject/.service.FirstService }
--------bindService----
2021-08-04 17:28:59.569 27757-27757/com.example.myfirstproject D/FirstService-TEST_SERVICE: onBind Intent { cmp=com.example.myfirstproject/.service.FirstService }
2021-08-04 17:28:59.574 27757-27757/com.example.myfirstproject D/MainActivity-TEST_SERVICE: onNullBinding ComponentInfo{com.example.myfirstproject/com.example.myfirstproject.service.FirstService}
-------stopService-------
无log
--------onUnbindService----
2021-08-04 17:29:12.897 27757-27757/com.example.myfirstproject D/FirstService-TEST_SERVICE: onUnbind Intent { cmp=com.example.myfirstproject/.service.FirstService }
2021-08-04 17:29:12.898 27757-27757/com.example.myfirstproject D/FirstService-TEST_SERVICE: onDestroy


bindService->startService->stopService->unBindService:
2021-08-04 17:30:54.224 27757-27757/com.example.myfirstproject D/FirstService-TEST_SERVICE: onCreate
2021-08-04 17:30:54.227 27757-27757/com.example.myfirstproject D/FirstService-TEST_SERVICE: onBind Intent { cmp=com.example.myfirstproject/.service.FirstService }
2021-08-04 17:30:54.230 27757-27757/com.example.myfirstproject D/MainActivity-TEST_SERVICE: onNullBinding ComponentInfo{com.example.myfirstproject/com.example.myfirstproject.service.FirstService}
------startService-----------
2021-08-04 17:31:14.568 27757-27757/com.example.myfirstproject D/FirstService-TEST_SERVICE: onStartCommand Intent { cmp=com.example.myfirstproject/.service.FirstService }
2021-08-04 17:31:14.568 27757-27757/com.example.myfirstproject D/FirstService-TEST_SERVICE: onStartIntent { cmp=com.example.myfirstproject/.service.FirstService }
-------stopService-------
无log
--------onUnbindService----
2021-08-04 17:32:07.340 27757-27757/com.example.myfirstproject D/FirstService-TEST_SERVICE: onUnbind Intent { cmp=com.example.myfirstproject/.service.FirstService }
2021-08-04 17:32:07.341 27757-27757/com.example.myfirstproject D/FirstService-TEST_SERVICE: onDestroy


bindService->startService->unBindService->stopService:
2021-08-04 17:33:13.591 27757-27757/com.example.myfirstproject D/FirstService-TEST_SERVICE: onCreate
2021-08-04 17:33:13.592 27757-27757/com.example.myfirstproject D/FirstService-TEST_SERVICE: onBind Intent { cmp=com.example.myfirstproject/.service.FirstService }
2021-08-04 17:33:13.594 27757-27757/com.example.myfirstproject D/MainActivity-TEST_SERVICE: onNullBinding ComponentInfo{com.example.myfirstproject/com.example.myfirstproject.service.FirstService}
------startService-----------
2021-08-04 17:33:17.349 27757-27757/com.example.myfirstproject D/FirstService-TEST_SERVICE: onStartCommand Intent { cmp=com.example.myfirstproject/.service.FirstService }
2021-08-04 17:33:17.349 27757-27757/com.example.myfirstproject D/FirstService-TEST_SERVICE: onStartIntent { cmp=com.example.myfirstproject/.service.FirstService }
--------onUnbindService----
2021-08-04 17:33:24.889 27757-27757/com.example.myfirstproject D/FirstService-TEST_SERVICE: onUnbind Intent { cmp=com.example.myfirstproject/.service.FirstService }
-------stopService-------
2021-08-04 17:33:29.542 27757-27757/com.example.myfirstproject D/FirstService-TEST_SERVICE: onDestroy


-----------------

总结：
1、多次startService不会重新onCreate.多次bindService不会重新onBind。
2、不管先startService还是bindService.
 如果是stopService先于onUnbindService，则service不会立即onDestroy.只有在onUnbindService时候依次调用onUnbind.onDestroy。
 如果是onUnbindService先于stopService，则service在调用onUnbindService时候调用onUnbind,最后执行stopService调用onDestroy。


----------------------------------------------

Android8.0 后startForegroundService。启动前台服务，Service保活。


8.0以后 通知栏的使用 需要与NotificationChannel配合着使用：

NotificationChannel channel = new NotificationChannel(channelId, channelName, importance);

     channelId,channelName的话都是字符串，channelid需要有唯一性(如果是重复的，在通知栏里面就会给覆盖掉)。

     importance是表示设置通知的优先级:
	 
	 
----------------------------------------

广播 BrocastReceiver

两种注册方式:静态&动态

https://www.cnblogs.com/io1024/p/11552239.html

 intent.setClassName(MainActivity.this,"com.example.myfirstproject.broadcast.StaticReceiver");



---------------------

默认广播: Normalbroadcasts 
sendBroadcast

abortBroadcast() ->  BroadcastReceiver trying to return result during a non-ordered broadcast

有序广播: orderedbroadcasts
sendOrderedBroadcast

abortBroadcast() 在高优先级接收者里面进行拦截。

----------------------

本地广播：LocalBroadcast

-----------------


内容提供者： ContentProvider



https://blog.csdn.net/carson_ho/article/details/76101093


content://com.example.myprovider/user

----------------


内容观察者：ContentObserver

notifyChange(uri, null);




-------四大组件---end---------

Fragment 生命周期 

2021-08-07 10:50:13.540 5066-5066/? D/MyFragment-TEST: onAttach
2021-08-07 10:50:13.541 5066-5066/? D/MyFragment-TEST: onCreate
2021-08-07 10:50:13.548 5066-5066/? D/MyFragment-TEST: onViewCreated
2021-08-07 10:50:13.548 5066-5066/? D/MyFragment-TEST: onActivityCreated
2021-08-07 10:50:13.548 5066-5066/? D/MyFragment-TEST: onViewStateRestored
2021-08-07 10:50:13.549 5066-5066/? D/MyFragment-TEST: onStart
2021-08-07 10:50:13.554 5066-5066/? D/MyFragment-TEST: onResume
------锁屏-------
2021-08-07 10:51:11.606 5066-5066/com.example.myfirstproject D/MyFragment-TEST: onPause
2021-08-07 10:51:11.668 5066-5066/com.example.myfirstproject D/MyFragment-TEST: onStop
2021-08-07 10:51:11.675 5066-5066/com.example.myfirstproject D/MyFragment-TEST: onSaveInstanceState
------解屏-----
2021-08-07 10:51:29.387 5066-5066/com.example.myfirstproject D/MyFragment-TEST: onStart
2021-08-07 10:51:29.389 5066-5066/com.example.myfirstproject D/MyFragment-TEST: onResume
------退出------
2021-08-07 10:51:38.153 5066-5066/com.example.myfirstproject D/MyFragment-TEST: onPause
2021-08-07 10:51:38.154 5066-5066/com.example.myfirstproject D/MyFragment-TEST: onStop
2021-08-07 10:51:38.155 5066-5066/com.example.myfirstproject D/MyFragment-TEST: onDestroyView
2021-08-07 10:51:38.172 5066-5066/com.example.myfirstproject D/MyFragment-TEST: onDestroy
2021-08-07 10:51:38.173 5066-5066/com.example.myfirstproject D/MyFragment-TEST: onDetach

activity&Fragment 

2021-08-07 20:32:48.882 13191-13191/com.example.myfirstproject D/MainActivity-TEST: onCreate
2021-08-07 20:32:49.051 13191-13191/com.example.myfirstproject D/MyFragment-TEST: onAttach
2021-08-07 20:32:49.051 13191-13191/com.example.myfirstproject D/MainActivity-TEST: onAttachFragment
2021-08-07 20:32:49.051 13191-13191/com.example.myfirstproject D/MyFragment-TEST: onCreate
2021-08-07 20:32:49.057 13191-13191/com.example.myfirstproject D/MyFragment-TEST: onViewCreated
2021-08-07 20:32:49.057 13191-13191/com.example.myfirstproject D/MyFragment-TEST: onActivityCreated
2021-08-07 20:32:49.057 13191-13191/com.example.myfirstproject D/MyFragment-TEST: onViewStateRestored
2021-08-07 20:32:49.058 13191-13191/com.example.myfirstproject D/MyFragment-TEST: onStart
2021-08-07 20:32:49.058 13191-13191/com.example.myfirstproject D/MainActivity-TEST: onStart
2021-08-07 20:32:49.062 13191-13191/com.example.myfirstproject D/MainActivity-TEST: onResume
2021-08-07 20:32:49.062 13191-13191/com.example.myfirstproject D/MyFragment-TEST: onResume
---------退出------
2021-08-07 20:35:03.357 13411-13411/com.example.myfirstproject D/MyFragment-TEST: onPause
2021-08-07 20:35:03.358 13411-13411/com.example.myfirstproject D/MyFragment-TEST: onStop
2021-08-07 20:35:03.361 13411-13411/com.example.myfirstproject D/MyFragment-TEST: onDestroyView
2021-08-07 20:35:03.375 13411-13411/com.example.myfirstproject D/MyFragment-TEST: onDestroy
2021-08-07 20:35:03.375 13411-13411/com.example.myfirstproject D/MyFragment-TEST: onDetach
2021-08-07 20:35:03.691 13411-13411/com.example.myfirstproject D/MainActivity-TEST: onPause
2021-08-07 20:35:04.284 13411-13411/com.example.myfirstproject D/MainActivity-TEST: onStop
2021-08-07 20:35:04.292 13411-13411/com.example.myfirstproject D/MainActivity-TEST: onDestroy

fragment是依附于activity页面内创建的：
创建和重建 activity生命周期优先于fragment
暂停和销毁 fragment生命周期优先于activity

add & replace

add:
2021-08-07 11:07:13.310 7510-7510/com.example.myfirstproject D/MyFragment-TEST: onAttach
2021-08-07 11:07:13.311 7510-7510/com.example.myfirstproject D/MyFragment-TEST: onCreate
2021-08-07 11:07:13.318 7510-7510/com.example.myfirstproject D/MyFragment-TEST: onViewCreated
2021-08-07 11:07:13.318 7510-7510/com.example.myfirstproject D/MyFragment-TEST: onActivityCreated
2021-08-07 11:07:13.318 7510-7510/com.example.myfirstproject D/MyFragment-TEST: onViewStateRestored
2021-08-07 11:07:13.318 7510-7510/com.example.myfirstproject D/MyFragment-TEST: onStart
2021-08-07 11:07:13.324 7510-7510/com.example.myfirstproject D/MyFragment-TEST: onResume
2021-08-07 11:07:20.033 7510-7510/com.example.myfirstproject D/My2Fragment-TEST: onAttach
2021-08-07 11:07:20.034 7510-7510/com.example.myfirstproject D/My2Fragment-TEST: onCreate
2021-08-07 11:07:20.053 7510-7510/com.example.myfirstproject D/My2Fragment-TEST: onViewCreated
2021-08-07 11:07:20.053 7510-7510/com.example.myfirstproject D/My2Fragment-TEST: onActivityCreated
2021-08-07 11:07:20.053 7510-7510/com.example.myfirstproject D/My2Fragment-TEST: onViewStateRestored
2021-08-07 11:07:20.053 7510-7510/com.example.myfirstproject D/My2Fragment-TEST: onStart
2021-08-07 11:07:20.053 7510-7510/com.example.myfirstproject D/My2Fragment-TEST: onResume



replace:
2021-08-07 11:09:09.712 7806-7806/com.example.myfirstproject D/MyFragment-TEST: onAttach
2021-08-07 11:09:09.713 7806-7806/com.example.myfirstproject D/MyFragment-TEST: onCreate
2021-08-07 11:09:09.723 7806-7806/com.example.myfirstproject D/MyFragment-TEST: onViewCreated
2021-08-07 11:09:09.723 7806-7806/com.example.myfirstproject D/MyFragment-TEST: onActivityCreated
2021-08-07 11:09:09.723 7806-7806/com.example.myfirstproject D/MyFragment-TEST: onViewStateRestored
2021-08-07 11:09:09.724 7806-7806/com.example.myfirstproject D/MyFragment-TEST: onStart
2021-08-07 11:09:09.730 7806-7806/com.example.myfirstproject D/MyFragment-TEST: onResume
2021-08-07 11:09:22.321 7806-7806/com.example.myfirstproject D/My2Fragment-TEST: onAttach
2021-08-07 11:09:22.321 7806-7806/com.example.myfirstproject D/My2Fragment-TEST: onCreate

2021-08-07 11:09:22.324 7806-7806/com.example.myfirstproject D/MyFragment-TEST: onPause
2021-08-07 11:09:22.324 7806-7806/com.example.myfirstproject D/MyFragment-TEST: onStop
2021-08-07 11:09:22.325 7806-7806/com.example.myfirstproject D/MyFragment-TEST: onDestroyView

2021-08-07 11:09:22.346 7806-7806/com.example.myfirstproject D/My2Fragment-TEST: onViewCreated
2021-08-07 11:09:22.346 7806-7806/com.example.myfirstproject D/My2Fragment-TEST: onActivityCreated
2021-08-07 11:09:22.346 7806-7806/com.example.myfirstproject D/My2Fragment-TEST: onViewStateRestored
2021-08-07 11:09:22.346 7806-7806/com.example.myfirstproject D/My2Fragment-TEST: onStart
2021-08-07 11:09:22.347 7806-7806/com.example.myfirstproject D/My2Fragment-TEST: onResume


replace相比如add，replace之前的fragment是走的销毁生命周期。
-----------

Activity与Fragment通信方式

activity 向 fragment : bundle
fragment 向 activity ：接口回调

EventBus.


------------------------


线程池：ThreadPool



常见的5种线程池分别是：

1、FixedThreadPool，它的核心线程数和最大线程数是一样的，可以把它看成是固定线程数的线程池；
2021-08-07 15:19:44.959 26761-26795/ D/ThreadPoolUtil: pool-1-thread-1正在被执行,第0次
2021-08-07 15:19:44.959 26761-26797/ D/ThreadPoolUtil: pool-1-thread-3正在被执行,第2次
2021-08-07 15:19:44.959 26761-26796/ D/ThreadPoolUtil: pool-1-thread-2正在被执行,第1次
2021-08-07 15:19:46.962 26761-26795/ D/ThreadPoolUtil: pool-1-thread-1正在被执行,第4次
2021-08-07 15:19:46.962 26761-26797/ D/ThreadPoolUtil: pool-1-thread-3正在被执行,第3次
2021-08-07 15:19:46.962 26761-26796/ D/ThreadPoolUtil: pool-1-thread-2正在被执行,第5次
2021-08-07 15:19:48.963 26761-26796/ D/ThreadPoolUtil: pool-1-thread-2正在被执行,第6次
2021-08-07 15:19:48.965 26761-26797/ D/ThreadPoolUtil: pool-1-thread-3正在被执行,第7次
2021-08-07 15:19:48.965 26761-26795/ D/ThreadPoolUtil: pool-1-thread-1正在被执行,第8次
2021-08-07 15:19:50.964 26761-26796/ D/ThreadPoolUtil: pool-1-thread-2正在被执行,第9次

2、CachedThreadPool，可以把它叫做可缓存线程池，它的特点是线程数可以持续增加(理论最大可达Integer.MAX_VALUE=2^31-1)；
2021-08-07 15:21:20.986 27016-27095/ D/ThreadPoolUtil: pool-1-thread-2正在被执行,第1次
2021-08-07 15:21:20.986 27016-27094/ D/ThreadPoolUtil: pool-1-thread-1正在被执行,第0次
2021-08-07 15:21:20.988 27016-27096/ D/ThreadPoolUtil: pool-1-thread-3正在被执行,第2次
2021-08-07 15:21:20.989 27016-27098/ D/ThreadPoolUtil: pool-1-thread-5正在被执行,第4次
2021-08-07 15:21:20.989 27016-27097/ D/ThreadPoolUtil: pool-1-thread-4正在被执行,第3次
2021-08-07 15:21:20.989 27016-27100/ D/ThreadPoolUtil: pool-1-thread-7正在被执行,第6次
2021-08-07 15:21:20.989 27016-27099/ D/ThreadPoolUtil: pool-1-thread-6正在被执行,第5次
2021-08-07 15:21:20.989 27016-27101/ D/ThreadPoolUtil: pool-1-thread-8正在被执行,第7次
2021-08-07 15:21:20.989 27016-27102/ D/ThreadPoolUtil: pool-1-thread-9正在被执行,第8次
2021-08-07 15:21:20.989 27016-27103/ D/ThreadPoolUtil: pool-1-thread-10正在被执行,第9次

设置休眠1秒
2021-08-07 15:22:33.212 27277-27363/ D/ThreadPoolUtil: pool-1-thread-1正在被执行,第0次
2021-08-07 15:22:34.218 27277-27368/ D/ThreadPoolUtil: pool-1-thread-2正在被执行,第1次
2021-08-07 15:22:35.217 27277-27363/ D/ThreadPoolUtil: pool-1-thread-1正在被执行,第2次
2021-08-07 15:22:36.221 27277-27381/ D/ThreadPoolUtil: pool-1-thread-3正在被执行,第3次
2021-08-07 15:22:37.221 27277-27363/ D/ThreadPoolUtil: pool-1-thread-1正在被执行,第4次
2021-08-07 15:22:38.222 27277-27368/ D/ThreadPoolUtil: pool-1-thread-2正在被执行,第5次
2021-08-07 15:22:39.222 27277-27381/ D/ThreadPoolUtil: pool-1-thread-3正在被执行,第6次
2021-08-07 15:22:40.223 27277-27363/ D/ThreadPoolUtil: pool-1-thread-1正在被执行,第7次
2021-08-07 15:22:41.223 27277-27368/ D/ThreadPoolUtil: pool-1-thread-2正在被执行,第8次
2021-08-07 15:22:42.224 27277-27381/ D/ThreadPoolUtil: pool-1-thread-3正在被执行,第9次


3、ScheduledThreadPool，它支持定时或周期性的执行任务，有3个方法可以灵活的执行频率配置参数；
2021-08-07 15:37:09.965 28901-28969/ D/ThreadPoolUtil: pool-1-thread-1正在被执行
2021-08-07 15:37:10.465 28901-28969/ D/ThreadPoolUtil: pool-1-thread-1正在被执行
2021-08-07 15:37:10.965 28901-28970/ D/ThreadPoolUtil: pool-1-thread-2正在被执行
2021-08-07 15:37:11.466 28901-28970/ D/ThreadPoolUtil: pool-1-thread-2正在被执行
2021-08-07 15:37:11.966 28901-28970/ D/ThreadPoolUtil: pool-1-thread-2正在被执行
2021-08-07 15:37:12.466 28901-28970/ D/ThreadPoolUtil: pool-1-thread-2正在被执行
2021-08-07 15:37:12.966 28901-29005/ D/ThreadPoolUtil: pool-1-thread-3正在被执行
2021-08-07 15:37:13.466 28901-29005/ D/ThreadPoolUtil: pool-1-thread-3正在被执行
2021-08-07 15:37:13.966 28901-29005/ D/ThreadPoolUtil: pool-1-thread-3正在被执行
2021-08-07 15:37:14.466 28901-28969/ D/ThreadPoolUtil: pool-1-thread-1正在被执行
....周期打印.....


4、SingleThreadExecutor，它会使用唯一的线程去执行任务，适用于所有任务都需要按照被提交的顺序依次执行的场景；
2021-08-07 15:25:02.397 27833-27896/ D/ThreadPoolUtil: pool-1-thread-1正在被执行,第0次
2021-08-07 15:25:04.398 27833-27896/ D/ThreadPoolUtil: pool-1-thread-1正在被执行,第1次
2021-08-07 15:25:06.401 27833-27896/ D/ThreadPoolUtil: pool-1-thread-1正在被执行,第2次
2021-08-07 15:25:08.404 27833-27896/ D/ThreadPoolUtil: pool-1-thread-1正在被执行,第3次
2021-08-07 15:25:10.405 27833-27896/ D/ThreadPoolUtil: pool-1-thread-1正在被执行,第4次
2021-08-07 15:25:12.406 27833-27896/ D/ThreadPoolUtil: pool-1-thread-1正在被执行,第5次
2021-08-07 15:25:14.407 27833-27896/ D/ThreadPoolUtil: pool-1-thread-1正在被执行,第6次
2021-08-07 15:25:16.409 27833-27896/ D/ThreadPoolUtil: pool-1-thread-1正在被执行,第7次
2021-08-07 15:25:16.409 27833-27896/ D/ThreadPoolUtil: pool-1-thread-1正在被执行,第7次
2021-08-07 15:25:18.410 27833-27896/ D/ThreadPoolUtil: pool-1-thread-1正在被执行,第8次
2021-08-07 15:25:20.411 27833-27896/ D/ThreadPoolUtil: pool-1-thread-1正在被执行,第9次

5、SingleThreadScheduledExecutor，它和SingleThreadExecutor有些类似，它的核心线程数是1，但是最大线程数是Integer.MAX_VALUE。
2021-08-07 15:27:22.167 28291-28321/ D/ThreadPoolUtil: pool-1-thread-1正在被执行,第0次
2021-08-07 15:27:22.170 28291-28321/ D/ThreadPoolUtil: pool-1-thread-1正在被执行,第1次
2021-08-07 15:27:22.172 28291-28321/ D/ThreadPoolUtil: pool-1-thread-1正在被执行,第2次
2021-08-07 15:27:22.174 28291-28321/ D/ThreadPoolUtil: pool-1-thread-1正在被执行,第3次
2021-08-07 15:27:22.176 28291-28321/ D/ThreadPoolUtil: pool-1-thread-1正在被执行,第4次
2021-08-07 15:27:22.178 28291-28321/ D/ThreadPoolUtil: pool-1-thread-1正在被执行,第5次
2021-08-07 15:27:22.180 28291-28321/ D/ThreadPoolUtil: pool-1-thread-1正在被执行,第6次
2021-08-07 15:27:22.182 28291-28321/ D/ThreadPoolUtil: pool-1-thread-1正在被执行,第7次
2021-08-07 15:27:22.185 28291-28321/ D/ThreadPoolUtil: pool-1-thread-1正在被执行,第8次
2021-08-07 15:27:22.187 28291-28321/ D/ThreadPoolUtil: pool-1-thread-1正在被执行,第9次


-------------



ThreadPoolExecutor:5个参数

corePoolSize: 线程池核心线程个数
maximunPoolSize: 线程池最大线程数量
keeyAliveTime: 空闲线程存活时间
TimeUnit: 存活时间单位
workQueue: 用于保存等待执行任务的阻塞队列


拒绝策略：
AbortPolicy（丢弃任务，并抛出异常RejectedExecutionException.默认策略。）
DiscardPolicy(默默丢弃、不抛异常。）
DiscardOldestPolicy(尝试去竞争第一个，也就是丢弃任务队列前面的任务，重新提交执行，失败了也不抛异常。)
CallerRunsPolicy(使用调用者所在线程执行-提交任务的线程，就是哪里来的回哪里去)



-----------------

异步任务：

Handler，AsyncTask，HandlerThread，IntentService

Handler：线程间通信。
					Message：消息的载体
					MessageQueue：消息队列，负责存储消息
					Handler：负责发送和处理消息（发送和处理不在同一个线程）
					Looper：通过死循环来取出消息并且通知Handler处理


AsyncTask：一种轻量级的异步任务类，它封装了线程池和Handler。通过直接继承它可以很方便地实现后台异步任务的执行和进度的回调更新UI。

-------------mMyAsyncTask.execute()--------------
......
2021-08-07 18:46:13.910 9129-9679/ D/MyAsyncTask: 17.0
2021-08-07 18:46:14.921 9129-9679/ D/MyAsyncTask: 18.0
2021-08-07 18:46:15.941 9129-9679/ D/MyAsyncTask: 19.0
2021-08-07 18:46:16.900 9129-9679/ D/MyAsyncTask: 20.0
----------mMyAsyncTask.cancel(true);------------
2021-08-07 18:46:16.900 9129-9679/ D/MyAsyncTask: AsyncTask 任务取消！！！

HandlerThread：继承了Thread，它本质上就是具有消息循环的Thread，它内部建立了Looper。
2021-08-07 18:48:54.812 9885-9959/ D/MainActivity: currentThread:handler_thread   HandlerThread,接收到：msg={ when=-1ms what=0 obj=我是HandlerThread target=com.example.myfirstproject.async.MainActivity$6 }

IntentService：一种特殊的Service，它继承了Service并且它是一个抽象类，系统对其进行了封装使其可以更方便地执行后台任务，内部采用了HandlerThread来执行任务。
当任务执行完毕后IntentService会自动退出onDestory。

18:56:11.820 10804-10988/ D/MyIntentService: onHandleIntent被调用, action:action_IntentService_1
18:56:13.825 10804-10988/ D/MyIntentService: onHandleIntent被调用, action:action_IntentService_2
18:56:15.827 10804-10988/ D/MyIntentService: onHandleIntent被调用, action:action_IntentService_3
18:56:15.832 10804-10804/ D/MyIntentService: onDestroy被调用









	 
	 
	 













