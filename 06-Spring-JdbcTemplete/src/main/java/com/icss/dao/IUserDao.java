package com.icss.dao;

import com.icss.model.User;

import java.text.ParseException;
import java.util.List;

/**
 * @author 李永庆
 * @since 2020/6/4
 */
public interface IUserDao {
    void insertUser(User user) throws ParseException;

    void updateUserSalary(float salary,int id);

    void delUser(int id);

    List<User> findAll();

    User selectUserById(int id);
}
