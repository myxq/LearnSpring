package com.chinasofti.test;

import com.chinasofti.model.Boy;
import com.chinasofti.model.Dog;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 李永庆
 * @since 2020/6/3
 */
public class TestSpringHelloWorld {

        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("application-main.xml");

    @Test
    public void testSpringBean(){
//        Dog dog = (Dog) applicationContext.getBean("dog2");
//        System.out.println(dog.getName()+"\t"+dog.getAge());
        Boy boy = (Boy) applicationContext.getBean("boy");
        System.out.println(boy.getName()+"的宠物："+boy.getDog().getName());
    }

}
