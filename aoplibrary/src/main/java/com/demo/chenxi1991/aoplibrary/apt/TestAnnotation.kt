package com.demo.chenxi1991.aoplibrary.apt

/**
 * Created by chenxi1991 on 2018/2/1.
 */
@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class TestAnnotation(val value: String)