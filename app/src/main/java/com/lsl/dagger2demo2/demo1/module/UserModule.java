package com.lsl.dagger2demo2.module;

import com.lsl.dagger2demo2.User;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by liusilong on 2017/11/13.
 * version:1.0
 * Describe:
 */
@Module
public class UserModule {
    @Singleton
    @Provides
    User provideUser() {
        return new User();
    }
}
