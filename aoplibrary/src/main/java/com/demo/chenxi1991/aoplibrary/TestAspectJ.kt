package com.demo.chenxi1991.aoplibrary

import android.util.Log
import com.demo.chenxi1991.aoplibrary.apt.TestAnnotation
import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Pointcut
import org.aspectj.lang.reflect.MethodSignature

/**
 * Created by chenxi1991 on 2018/2/1.
 */
@Aspect
class TestAspectJ {
    @Pointcut("execution(@com.demo.chenxi1991.aoplibrary.apt.TestAnnotation * *(..))")
    fun methodAnnotated() {
    }

    @Around("methodAnnotated()")
    @Throws(Throwable::class)
    fun aroundJoinPoint(joinPoint: ProceedingJoinPoint) {
        val methodSignature = joinPoint.signature as MethodSignature
        val className = methodSignature.declaringType.simpleName
        val methodName = methodSignature.name
        val paramValue = methodSignature.method.getAnnotation(TestAnnotation::class.java).value
        Log.i("chenxi", "$className  $methodName  $paramValue")
        joinPoint.proceed()
    }
}