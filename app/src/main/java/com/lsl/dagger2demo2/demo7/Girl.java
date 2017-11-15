package com.lsl.dagger2demo2.demo7;


import javax.inject.Inject;

/**
 * Created by liusilong on 2017/11/15.
 * version:1.0
 * Describe:
 */

public class Girl {
    Fruit fruit;

    @Inject
    public Girl(@AppleQualifier Fruit fruit) {
        this.fruit = fruit;
    }

    public void getGift() {
        System.out.println("小女孩得到了" + fruit.getName());
    }
}
