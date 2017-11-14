package com.lsl.dagger2demo2.demo4;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.lsl.dagger2demo2.demo3.Boy;
import com.lsl.dagger2demo2.demo3.ChildModule;

import javax.inject.Inject;

/**
 * Created by liusilong on 2017/11/14.
 * version:1.0
 * Describe:
 */

public class Demo4Activity extends AppCompatActivity {
    @Inject
    Boy boy;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        获取父组件
        ParentComponent parentComponent = DaggerParentComponent.create();
//        通过父组件获取子组件
        ChildComponent childComponent = parentComponent.plusChildComponent(new ChildModule());
        childComponent.inject(this);
        boy.eat();

    }
}
