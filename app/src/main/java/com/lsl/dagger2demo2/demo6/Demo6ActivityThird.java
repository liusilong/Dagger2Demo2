package com.lsl.dagger2demo2.demo6;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

/**
 * Created by liusilong on 2017/11/15.
 * version:1.0
 * Describe:
 */

public class Demo6ActivityThird extends AppCompatActivity {
    @Inject
    User user;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((Demo6App) getApplication()).getUserComponent().inject(this);
        System.out.println(user.toString());
    }
}
