package com.icss.model;

import java.util.Date;

/**
 * @author 李永庆
 * @since 2020/6/8
 */
public class User {
    private int id;
    private String name;
    private Date birthday;
    private Float salary;


    public User(int id, String name, Date birthday, Float salary) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
