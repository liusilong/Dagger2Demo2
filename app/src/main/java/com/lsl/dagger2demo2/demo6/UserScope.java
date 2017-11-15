package com.lsl.dagger2demo2.demo6;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by liusilong on 2017/11/15.
 * version:1.0
 * Describe:
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface UserScope {
}
