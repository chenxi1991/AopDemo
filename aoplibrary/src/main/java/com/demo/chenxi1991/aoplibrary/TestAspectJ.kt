package com.demo.chenxi1991.aoplibrary

import android.util.Log
import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Pointcut

/**
 * Created by chenxi1991 on 2018/2/1.
 */
@Aspect
class TestAspectJ {
    @Pointcut("execution(@com.demo.chenxi1991.aoplibrary.apt.TestAnnotation * *(..))")
    fun methodAnnotated() {
    }

    @Around("methodAnnotated()")
    fun aroundJoinPoint(joinPoint: ProceedingJoinPoint) {
        Log.i("chenxi", "annotationContent")
        joinPoint.proceed()
    }
}