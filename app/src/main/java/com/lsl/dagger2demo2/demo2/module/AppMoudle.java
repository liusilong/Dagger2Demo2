package com.lsl.dagger2demo2.demo2.module;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by liusilong on 2017/11/13.
 * version:1.0
 * Describe: 提供ApplicationContext的依赖
 */
@Module
public class AppMoudle {
    private Context appContext;

    public AppMoudle(Context appContext) {
        this.appContext = appContext;
    }

    @Provides
    @Singleton
    Context provideContext() {
        return appContext;
    }
}
