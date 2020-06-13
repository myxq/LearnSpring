package com.chinasofti.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author 李永庆
 * @since 2020/6/3
 */
@Component(value = "dog2")
public class Dog {

    @Value("吉娃娃")
    private String name;

    @Value("3")
    private int age;

    @PostConstruct
    private void init(){
        System.out.println("执行初始化方法");
    }

    @PreDestroy
    private void destroy(){
        System.out.println("销毁初始化方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void shot(){
        System.out.println("汪汪");
    }
}
