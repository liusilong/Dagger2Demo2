package com.lsl.dagger2demo2.demo3;

import dagger.Component;

/**
 * Created by liusilong on 2017/11/13.
 * version:1.0
 * Describe:
 */
@Component(dependencies = ParentComponent.class, modules = ChildModule.class)
public interface ChildComponent {
    void inject(Demo3Activity demo3Activity);
}
