package com.icss.service;

import com.icss.model.User;

import java.text.ParseException;
import java.util.List;

/**
 * @author 李永庆
 * @since 2020/6/4
 */
public interface IUserService {
    void insert(User user) throws ParseException;

    void updateSalary(float salary,int id);

    void delUser(int id);

    List<User> findAll();

    User selectUserById(int id);

    void insertBatch();
}
