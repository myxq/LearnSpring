package com.icss.test;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author 李永庆
 * @since 2020/6/5
 */
//@Component
//@Aspect
public class TestBefore {

    @Before("execution(* com..*.*(..))")
    public void doBefore(JoinPoint jp){
        System.out.println("目标函数的参数"+jp.getArgs()[0]);
        System.out.println("目标对象"+jp.getTarget().getClass().getName());
        System.out.println("执行了前置通知");
    }
}
