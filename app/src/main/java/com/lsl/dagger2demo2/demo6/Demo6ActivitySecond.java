package com.lsl.dagger2demo2.demo6;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

/**
 * Created by liusilong on 2017/11/15.
 * version:1.0
 * Describe:
 */

public class Demo6ActivitySecond extends AppCompatActivity {
    @Inject
    User user;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((Demo6App) getApplication()).getUserComponent().inject(this);
        System.out.println(user.toString());
        user.setName("xuhao");
        user.setAge(25);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Demo6ActivitySecond.this, Demo6ActivityThird.class));
            }
        }, 2000);
    }
}
