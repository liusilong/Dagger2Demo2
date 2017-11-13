package com.lsl.dagger2demo2.demo3;

import javax.inject.Inject;

/**
 * Created by liusilong on 2017/11/13.
 * version:1.0
 * Describe:
 */

public class Boy {
    private Apple apple;

    @Inject
    public Boy(Apple apple) {
        this.apple = apple;
    }

    public void eat() {
        StringBuilder sb = new StringBuilder("小男孩吃了");
        sb.append(apple.getAppleInfo());
        System.out.println(sb.toString());
    }
}
