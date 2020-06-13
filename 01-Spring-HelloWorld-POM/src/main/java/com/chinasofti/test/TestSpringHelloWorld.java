package com.chinasofti.test;

import com.chinasofti.model.Boy;
import com.chinasofti.model.Car;
import com.chinasofti.model.Dog;
import com.chinasofti.model.Product;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sound.midi.Soundbank;
import java.util.Calendar;
import java.util.Iterator;

/**
 * @author 李永庆
 * @since 2020/6/3
 */
public class TestSpringHelloWorld {

        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
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
//        System.out.println("分隔");
        Dog dog = (Dog) applicationContext.getBean("dog2");
        applicationContext.close();
//        dog.shot();
//        System.out.println(dog.getName());
    }
    @Test
    public void testBoyBean(){
//        System.out.println("分隔");
        Boy boy = (Boy) applicationContext.getBean("boy");
        System.out.println(boy.getName()+"\n"+boy.getDog().getName());
//        JDK1.8之后
//        boy.getFer().forEach(item-> System.out.println(item));
//        boy.getFer().forEach(System.out::println);
//        boy.getBooks().forEach(System.out::println);
//        for (String subject : boy.getScores().keySet()) {
//            Integer score = (Integer) boy.getScores().get(subject);
//            System.out.println(subject + " : " + score);
//        }
//        boy.getScores().forEach((k,v)-> System.out.println(k+":"+v));
//        JDK1.8之前
//        for (String item : boy.getFer()){
//            System.out.println(item);
//        }
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
