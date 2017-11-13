package com.lsl.dagger2demo2.demo3;

import dagger.Module;
import dagger.Provides;

/**
 * Created by liusilong on 2017/11/13.
 * version:1.0
 * Describe:
 */

@Module
public class ParentModule {
    @Provides
    public Apple provideApple() {
        return new Apple();
    }
}
