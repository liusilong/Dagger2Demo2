package com.lsl.dagger2demo2.demo5;

import android.app.Application;
import android.content.SharedPreferences;

import com.lsl.dagger2demo2.demo4.ParentComponent;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Reusable;

/**
 * Created by liusilong on 2017/11/14.
 * version:1.0
 * Describe:
 */
@Singleton
@Component(modules = SharedPrefModule.class)
public interface SharedPreComponent {
    void inject(Demo5Activity demo5Activity);

    SharedPreferences getSharedPref();

    @Component.Builder
    interface Builder {
        SharedPreComponent build();

        @BindsInstance
        Builder application(Application application);
    }
}
