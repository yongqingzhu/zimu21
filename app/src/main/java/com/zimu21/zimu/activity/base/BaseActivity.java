package com.zimu21.zimu.activity.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.WindowManager;

/**
  * @author: an - bndroid
  * @function:activity的基类, 处理公共事件
  * @date: 2017/3/7 18:00
  * 邮箱：13145202327@163.com
  */
public class BaseActivity extends AppCompatActivity {

    public String TAG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TAG = getComponentName().getClassName();
        Log.i("test","TAG-ac"+"-----"+TAG);
    }

    @Override
    protected void onResume(){
        super.onResume();
    }

    @Override
    protected void onStart(){
        super.onStart();
    }

    @Override
    protected void onPause(){
        super.onPause();
    }

    @Override
    protected void onStop(){
        super.onStop();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
    }

    /**
     * 隐藏状态栏
     */
    public void hiddenStatusBar() {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
    /**
     * 改变状态栏颜色
     *
     * @param color
     */
//    public void changeStatusBarColor(@ColorRes int color) {
//        StatusBarUtil.setStatusBarColor(this, color);
//    }

    /**
     * 调整状态栏为亮模式，状态栏的文字颜色为深模式。
     */
//    private void reverseStatusColor() {
//        StatusBarUtil.statusBarLightMode(this);
//    }



}
