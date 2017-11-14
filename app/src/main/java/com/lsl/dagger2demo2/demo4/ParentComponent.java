package com.lsl.dagger2demo2.demo4;

import com.lsl.dagger2demo2.demo3.ChildModule;
import com.lsl.dagger2demo2.demo3.ParentModule;

import dagger.Component;

/**
 * Created by liusilong on 2017/11/14.
 * version:1.0
 * Describe: 父组件
 */
@Component(modules = ParentModule.class)
public interface ParentComponent {
    ChildComponent plusChildComponent(ChildModule childModule);
    // other method
    // void inject(...)
}
