package com.lsl.dagger2demo2.demo3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

/**
 * Created by liusilong on 2017/11/13.
 * version:1.0
 * Describe:
 */

public class Demo3Activity extends AppCompatActivity {
    @Inject
    Boy boy;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ParentComponent parentComponent = DaggerParentComponent.create();
        ChildComponent childComponent = DaggerChildComponent
                .builder()
                .parentComponent(parentComponent)
                .build();
        childComponent.inject(this);
        boy.eat();
    }
}
