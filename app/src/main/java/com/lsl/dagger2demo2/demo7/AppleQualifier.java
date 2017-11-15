package com.lsl.dagger2demo2.demo7;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by liusilong on 2017/11/15.
 * version:1.0
 * Describe:
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface AppleQualifier {
}
