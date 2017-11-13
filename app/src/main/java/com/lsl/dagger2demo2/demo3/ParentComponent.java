package com.lsl.dagger2demo2.demo3;

import dagger.Component;

/**
 * Created by liusilong on 2017/11/13.
 * version:1.0
 * Describe:
 */
@Component(modules = ParentModule.class)
public interface ParentComponent {
    //当父组件中的对象需要提供给子组件使用时，必须显示的声明对象
    Apple getApple();
}
