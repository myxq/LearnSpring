package com.icss.service;

import com.icss.dao.IUserDao;
import com.icss.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author 李永庆
 * @since 2020/6/4
 */
@Service(value = "userService")
public class UserServiceImpl implements IUserService {

    @Resource(name = "userDao")
    private IUserDao userDao;

    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,readOnly = false)
    public void insert(User user) throws ParseException {
        userDao.insertUser(user);
        System.out.println("============service--insert()=============");
    }

    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,readOnly = false)
    public void updateSalary(float salary, int id) {
        userDao.updateUserSalary(salary, id);
    }

    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,readOnly = false)
    public void delUser(int id) {
        userDao.delUser(id);
    }

    @Transactional(readOnly = true)
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Transactional(readOnly = true)
    public User selectUserById(int id) {
        return userDao.selectUserById(id);
    }

    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,readOnly = false)
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
                /*if (i==5){
                    throw new RuntimeException("运行时异常");
                }*/
                User user = new User(105+i, "n105", birthday, 5000f);
                insert(user);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
