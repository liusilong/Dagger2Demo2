package com.lsl.dagger2demo2.demo6;

import android.app.Application;

/**
 * Created by liusilong on 2017/11/15.
 * version:1.0
 * Describe:
 */

public class Demo6App extends Application {
    UserComponent userComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        userComponent = DaggerUserComponent.builder()
                .name("Jack")
                .age(24)
                .build();
    }

    UserComponent getUserComponent() {
        return userComponent;
    }

    void releaseUserComponent() {
        userComponent = null;
    }
}
