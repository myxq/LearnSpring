package com.chinasofti.test;

import com.chinasofti.model.Boy;
import com.chinasofti.model.Car;
import com.chinasofti.model.Dog;
import com.chinasofti.model.Product;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;

/**
 * @author 李永庆
 * @since 2020/6/3
 */
public class TestSpringHelloWorld {

        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("com\\chinasofti\\test\\applicationContext.xml");
    public static void main(String[] args) {
        /*Dog dog = new Dog();
        dog.setName("吉娃娃");
        dog.setAge(2);

        Boy boy = new Boy();
        boy.setName("yangyang");
        boy.setDog(dog);

        System.out.println(boy.getName()+"\t"+boy.getDog().getName());
        */

    }

    @Test
    public void testSpringBean(){
        Dog dog = (Dog) applicationContext.getBean("dog2");
//        dog.shot();
        System.out.println(dog.getName());
    }

//    通过静态工厂来创建对象
    @Test
    public void testStaticFactory(){
        Product product = (Product) applicationContext.getBean("product");
        System.out.println(product.getProductName());
    }

    @Test
    public void testCarStaticFactory(){
        Car car = (Car) applicationContext.getBean("car");
        System.out.println(car.getPrice());
    }

    @Test
    public void testCustomFactory(){
        Product product = (Product) applicationContext.getBean("product");
        product.desc();
    }
}
