package com.mo.moqiyan.depotmanage;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import java.util.Timer;
import java.util.TimerTask;


public class WelcomActivity extends Activity {



    protected void onCreate(Bundle savedInstanceState){
        //隐藏标题
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //全屏设置，隐藏所有装饰
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcom_view);

        final Intent it = new Intent(this, LoginActivity.class); //你要转向的Activity
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                startActivity(it); //执行
            }
        };
        timer.schedule(task, 1000 * 10); //10秒后




    }
}



