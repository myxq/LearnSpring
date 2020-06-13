package com.chinasofti.model;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * @author 李永庆
 * @since 2020/6/3
 */
public class Dog {
    private String name;

    private int age;

    public Dog(String name, int age) {
        System.out.println("Dog 构造函数执行");
        this.name = name;
        this.age = age;
    }

    public void init(){
        System.out.println("执行初始化方法");
    }
    public void destroy(){
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
