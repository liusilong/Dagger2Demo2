package com.lsl.dagger2demo2.demo2;

import android.content.Context;

import javax.inject.Inject;

/**
 * Created by liusilong on 2017/11/13.
 * version:1.0
 * Describe:
 */

public class NetworkUtils {
    private Context context;
    private NetworkChannel networkChannel;

    @Inject
    public NetworkUtils(Context context, NetworkChannel networkChannel) {
        this.context = context;
        this.networkChannel = networkChannel;
    }
}
