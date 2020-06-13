package com.icss.service;

import com.icss.dao.IUserDao;
import com.icss.model.User;
import jdk.nashorn.internal.ir.IfNode;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author 李永庆
 * @since 2020/6/4
 */
public class UserServiceImpl implements IUserService {

    private IUserDao userDao;

    public void insert(User user) throws ParseException {
        userDao.insertUser(user);
        System.out.println("============service--insert()=============");
    }

    public void updateSalary(float salary, int id) {
        userDao.updateUserSalary(salary, id);
    }

    public void delUser(int id) {
        userDao.delUser(id);
    }

    public List<User> findAll() {
        return userDao.findAll();
    }

    public User selectUserById(int id) {
        return userDao.selectUserById(id);
    }

    public IUserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

    public void insertBatch(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date birthday = null;
        try {
            birthday = simpleDateFormat.parse("1998-05-24");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        try {
//          当i=5时，产生一个运行时异常
            for (int i=0;i<10;i++){
                if (i==5){
                    throw new RuntimeException("运行时异常");
                }
                User user = new User(105+i, "n105", birthday, 5000f);
                insert(user);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}
