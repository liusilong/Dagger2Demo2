package com.lsl.dagger2demo2.demo7;

import javax.inject.Inject;

/**
 * Created by liusilong on 2017/11/15.
 * version:1.0
 * Describe:
 */

public class Boy {
    Fruit fruit;

    @Inject
    public Boy(@PearQualifier Fruit fruit) {
        this.fruit = fruit;
    }

    public void getGift() {
        System.out.println("小男孩得到了" + fruit.getName());
    }
}
