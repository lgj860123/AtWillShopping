package com.luogj.atwillshopping.activity;

import android.os.Bundle;

import com.luogj.atwillshopping.R;
import com.luogj.atwillshopping.base.BaseActivity;

/**
 * 首页
 */
public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setStatusBarColor(R.color.color21);
    }
}
