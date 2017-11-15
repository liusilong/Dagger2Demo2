package com.lsl.dagger2demo2.demo6;


import dagger.BindsInstance;
import dagger.Component;

/**
 * Created by liusilong on 2017/11/15.
 * version:1.0
 * Describe:
 */

@UserScope
@Component(modules = UserModule.class)
public interface UserComponent {
    void inject(Demo6ActivityFirst demo6Activity);

    void inject(Demo6ActivitySecond demo6ActivitySecond);

    void inject(Demo6ActivityThird demo6ActivityThird);

    @Component.Builder
    interface Builder {
        UserComponent build();

        @BindsInstance
        Builder name(String name);

        @BindsInstance
        Builder age(int age);

    }
}
