package com.lsl.dagger2demo2.demo7;

import dagger.Component;

/**
 * Created by liusilong on 2017/11/15.
 * version:1.0
 * Describe:
 */

@Component(modules = FruitModule.class)
public interface FruitComponent {
    void inject(Demo7Activity demo7Activity);
}
