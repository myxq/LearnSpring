package com.icss.test;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author 李永庆
 * @since 2020/6/5
 */
//@Component
//@Aspect
public class TestAfterReturn {

    @AfterReturning(pointcut = "execution(* com..*.*(..))", returning = "oRet")
    public void testAfterReturn(JoinPoint jp, Object oRet){
        System.out.println("目标函数的返回值："+oRet);
        System.out.println("后置通知执行");
    }
}
