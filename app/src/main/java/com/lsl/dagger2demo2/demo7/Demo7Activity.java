package com.lsl.dagger2demo2.demo7;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

/**
 * Created by liusilong on 2017/11/15.
 * version:1.0
 * Describe:
 */

public class Demo7Activity extends AppCompatActivity {
    @Inject
    Girl girl;
    @Inject
    Boy boy;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DaggerFruitComponent.create().inject(this);
        girl.getGift();
        boy.getGift();
    }
}
