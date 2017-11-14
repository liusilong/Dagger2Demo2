package com.lsl.dagger2demo2.demo5;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by liusilong on 2017/11/14.
 * version:1.0
 * Describe:
 */

public class Demo5Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SharedPreComponent sharedPreComponent =
                DaggerSharedPreComponent.builder()
                        .application(this.getApplication())
                        .build();
        SharedPreferences sp = sharedPreComponent.getSharedPref();
        sp.edit().putString("test", "Dagger Demo5...").commit();
        System.out.println(sp.getString("test", ""));

    }
}
