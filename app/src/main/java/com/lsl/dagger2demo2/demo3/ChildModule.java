package com.lsl.dagger2demo2.demo3;

import dagger.Module;
import dagger.Provides;

/**
 * Created by liusilong on 2017/11/13.
 * version:1.0
 * Describe:
 */
@Module
public class ChildModule {
    /**
     * 此处的Apple参数有依赖的父Component提供
     *
     * @param apple
     * @return
     */
    @Provides
    public Boy provideBoy(Apple apple) {
        return new Boy(apple);
    }
}
