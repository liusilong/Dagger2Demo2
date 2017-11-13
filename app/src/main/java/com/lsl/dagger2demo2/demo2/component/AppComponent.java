package com.lsl.dagger2demo2.demo2.component;

import com.lsl.dagger2demo2.demo2.Demo2Activity;
import com.lsl.dagger2demo2.demo2.module.AppMoudle;
import com.lsl.dagger2demo2.demo2.module.ReceiversModule;
import com.lsl.dagger2demo2.demo2.module.UtilsModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by liusilong on 2017/11/13.
 * version:1.0
 * Describe:
 */
@Singleton
@Component(modules = {AppMoudle.class, UtilsModule.class, ReceiversModule.class})
public interface AppComponent {
    void inject(Demo2Activity demo2Activity);
}
