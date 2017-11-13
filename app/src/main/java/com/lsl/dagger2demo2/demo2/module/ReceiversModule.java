package com.lsl.dagger2demo2.demo2.module;

import com.lsl.dagger2demo2.demo2.NetworkChannel;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by liusilong on 2017/11/13.
 * version:1.0
 * Describe: 提供NetworkChannel依赖
 */
@Module
public class ReceiversModule {

    @Provides
    @Singleton
    public NetworkChannel provideNetworkChannel() {
        return new NetworkChannel();
    }
}
