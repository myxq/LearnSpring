package com.icss.test;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author 李永庆
 * @since 2020/6/5
 */
//@Component
//@Aspect
public class TestThrowException {
    @AfterThrowing(pointcut = "execution(* com..*.*(..))", throwing = "e")
    public void doException(JoinPoint jp, Throwable e){
        System.out.println("e为目标组件抛出的异常信息" + e.getMessage());
    }
}
