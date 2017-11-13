package com.lsl.dagger2demo2.demo2;

import android.content.Context;


import javax.inject.Inject;

/**
 * Created by liusilong on 2017/11/13.
 * version:1.0
 * Describe:
 */

public class RxUtils extends RxUtilsAbs {
    private Context context;

    @Inject
    public RxUtils(Context context) {
        this.context = context;
    }
}
