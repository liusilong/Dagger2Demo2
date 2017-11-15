package com.lsl.dagger2demo2.demo6;

import dagger.Module;
import dagger.Provides;

/**
 * Created by liusilong on 2017/11/15.
 * version:1.0
 * Describe:
 */
@Module
public class UserModule {

    @Provides
    @UserScope
    public User provideUser(String name, int age) {
        return new User(name, age);
    }
}
