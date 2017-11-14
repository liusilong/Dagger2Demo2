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

    /**
     * 父组件中获取子组件的方法
     *
     * @param childModule 子组件中需要的Module
     * @return 子组件
     */
    ChildComponent plusChildComponent(ChildModule childModule);
    // other method
    // void inject(...)
}
