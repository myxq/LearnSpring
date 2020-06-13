package com.icss.service;

import com.icss.dao.IUserDao;

/**
 * @author 李永庆
 * @since 2020/6/4
 */
public class UserServiceImpl implements IUserService {

    private IUserDao userDao;

    public void insert() {
        userDao.insertUser();
        System.out.println("============service--insert()=============");
    }

    public IUserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

}
