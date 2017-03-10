package com.zimu21.zimu.application;

import android.app.Application;
 /**
  * @author: an - bndroid
  * @function:
  * @date: 2017/3/7 18:05
  * 邮箱：13145202327@163.com
  */
public class ZiMuApplication extends Application {
private static ZiMuApplication mApplication = null;
    @Override
    public void onCreate(){
        super.onCreate();
        mApplication = this;
    }

    public static ZiMuApplication getInstance(){
        return mApplication;
    }

}
