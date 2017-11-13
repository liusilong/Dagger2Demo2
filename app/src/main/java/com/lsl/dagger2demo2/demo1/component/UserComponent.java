package com.lsl.dagger2demo2.demo1.component;

import com.lsl.dagger2demo2.demo1.MainActivity;
import com.lsl.dagger2demo2.module.UserModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by liusilong on 2017/11/13.
 * version:1.0
 * Describe:
 */
@Singleton
@Component(modules = UserModule.class)
public interface UserComponent {
    void inject(MainActivity activity);
}
