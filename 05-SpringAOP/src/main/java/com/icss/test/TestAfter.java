package com.icss.test;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author 李永庆
 * @since 2020/6/5
 */
//@Component
//@Aspect
public class TestAfter {

    @After(value = "execution(* com..*.*(..))")
    public void doAfter(JoinPoint jp){
        System.out.println("最终通知，目标组件正常运行后或抛出异常前都会执行");
    }
}
