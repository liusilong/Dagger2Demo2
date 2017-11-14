package com.lsl.dagger2demo2.demo5;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by liusilong on 2017/11/14.
 * version:1.0
 * Describe:
 */
@Module
public class SharedPrefModule {
    @Provides
    @Singleton
    public SharedPreferences provideSharedPref(Application application) {
        return application.getSharedPreferences("store", Context.MODE_PRIVATE);
    }
}
