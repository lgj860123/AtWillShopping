package com.luogj.atwillshopping.base;

import android.app.Application;

/**
 *
 * Created by luogj on 2018/4/12.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        init();
    }

    /**
     * 初始化各种第三方
     */
    private void init() {

    }
}
