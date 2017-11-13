package com.lsl.dagger2demo2;

import android.app.Application;

import com.lsl.dagger2demo2.demo2.component.AppComponent;
import com.lsl.dagger2demo2.demo2.component.DaggerAppComponent;
import com.lsl.dagger2demo2.demo2.module.AppMoudle;

/**
 * Created by liusilong on 2017/11/13.
 * version:1.0
 * Describe:
 */

public class App extends Application {
    private static AppComponent component;

    public static AppComponent getComponent() {
        return component;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        component = buildComponent();
    }

    protected AppComponent buildComponent() {
        return DaggerAppComponent.builder()
                .appMoudle(new AppMoudle(this))
                .build();
    }
}
