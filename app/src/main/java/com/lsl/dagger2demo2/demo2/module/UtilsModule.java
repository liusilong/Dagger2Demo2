package com.lsl.dagger2demo2.demo2.module;

import android.content.Context;

import com.lsl.dagger2demo2.demo2.NetworkChannel;
import com.lsl.dagger2demo2.demo2.NetworkUtils;
import com.lsl.dagger2demo2.demo2.RxUtils;
import com.lsl.dagger2demo2.demo2.RxUtilsAbs;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by liusilong on 2017/11/13.
 * version:1.0
 * Describe:提供RxUtilsAbs和NetworkUtils依赖
 */
@Module
public class UtilsModule {

    @Provides
    @Singleton
    public RxUtilsAbs provideRxUtils(Context context) {
        return new RxUtils(context);
    }

    @Provides
    @Singleton
    public NetworkUtils provideNetworkUtils(Context context, NetworkChannel networkChannel) {
        return new NetworkUtils(context, networkChannel);
    }
}
