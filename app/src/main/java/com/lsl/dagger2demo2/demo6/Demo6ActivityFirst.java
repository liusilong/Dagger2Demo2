package com.lsl.dagger2demo2.demo6;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import javax.inject.Inject;

/**
 * Created by liusilong on 2017/11/15.
 * version:1.0
 * Describe:
 */

public class Demo6ActivityFirst extends AppCompatActivity {
    @Inject
    User user;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((Demo6App) getApplication()).getUserComponent().inject(this);
        System.out.println(user.toString());
        user.setName("Liusilong");
        user.setAge(18);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Demo6ActivityFirst.this, Demo6ActivitySecond.class));
            }
        }, 2000);

    }

    @Override
    protected void onStop() {
        super.onStop();
        ((Demo6App) getApplication()).releaseUserComponent();
    }
}
