package com.lsl.dagger2demo2.demo2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.lsl.dagger2demo2.App;

import javax.inject.Inject;

/**
 * Created by liusilong on 2017/11/13.
 * version:1.0
 * Describe:
 */

public class Demo2Activity extends AppCompatActivity {
    @Inject
    RxUtilsAbs rxUtilsAbs;
    @Inject
    RxUtilsAbs rxUtilsAbs1;
    @Inject
    NetworkUtils networkUtils;
    @Inject
    NetworkUtils networkUtils1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        App.getComponent().inject(this);
        System.out.println("rxUtilsAbs is null:\t" + rxUtilsAbs == null);
        System.out.println("networkUtils is null:\t" + networkUtils == null);

        System.out.println("rxUtilsAbs == rxUtilsAbs1" + (rxUtilsAbs == rxUtilsAbs1));
        System.out.println("networkUtils == networkUtils1" + (networkUtils == networkUtils1));


    }
}
