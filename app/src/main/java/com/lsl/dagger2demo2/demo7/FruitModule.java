package com.lsl.dagger2demo2.demo7;

import dagger.Module;
import dagger.Provides;

/**
 * Created by liusilong on 2017/11/15.
 * version:1.0
 * Describe:
 */
@Module
public class FruitModule {
    @Provides
    @AppleQualifier
    public Fruit provideApple() {
        return new Apple();
    }

    @Provides
    @PearQualifier
    public Fruit providePear() {
        return new Pear();
    }
}
