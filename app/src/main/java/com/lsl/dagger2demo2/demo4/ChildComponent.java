package com.lsl.dagger2demo2.demo4;

import com.lsl.dagger2demo2.demo3.ChildModule;

import dagger.Subcomponent;

/**
 * Created by liusilong on 2017/11/14.
 * version:1.0
 * Describe: 子组件
 */
@Subcomponent(modules = ChildModule.class)
public interface ChildComponent {
    void inject(Demo4Activity demo4Activity);
}
