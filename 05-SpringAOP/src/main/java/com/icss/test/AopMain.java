package com.icss.test;

import com.icss.bean.Target;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 李永庆
 * @since 2020/6/5
 */
public class AopMain {

    @Test
    public void testAop(){

        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("application.xml");
        Target target = (Target) applicationContext.getBean("target");
        target.calc();
        target.save("执行");
    }
}
