package com.luogj.atwillshopping.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.luogj.atwillshopping.R;
import com.luogj.atwillshopping.base.BaseActivity;

/**
 * 应用启动页
 * Created by luogj on 2018/4/12.
 */

public class StartUpActivity extends BaseActivity{
    //启动页倒计时进入主页部分start;
    //倒计时间
    private int countdownTime = 3;
    private Handler handler = new Handler();
    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            if (countdownTime >= 0){
                tv_countdownTime.setText(countdownTime + "  s");
                countdownTime --;
                handler.postDelayed(runnable,1000);
            }else {
                handler.removeCallbacks(runnable);
                gotoMainView();
            }
        }
    };
    //启动页倒计时进入主页部分end;

    private TextView tv_countdownTime;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_up);
        initView();
    }

    /**
     * 初始化启动页界面
     */
    private void initView() {
        tv_countdownTime = findViewById(R.id.tv_countdownTime);
        handler.post(runnable);
    }

    /**
     * 进入首页
     */
    private void gotoMainView(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
