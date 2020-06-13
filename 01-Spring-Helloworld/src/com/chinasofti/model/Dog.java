package com.chinasofti.model;

/**
 * @author 李永庆
 * @since 2020/6/3
 */
public class Dog {
    private String name;

    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
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
