package com.icss.controller;

import com.icss.model.User;
import com.icss.service.IUserService;
import javafx.application.Application;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 李永庆
 * @since 2020/6/4
 */
public class UserController {

    //    public static void main(String[] args) throws ParseException {
    ApplicationContext applicationContext =
            new ClassPathXmlApplicationContext("applicationContext.xml");
    IUserService userService = (IUserService) applicationContext.getBean("userService");
//        userService.insert();
//        userService.updateSalary(2000,102);
//        userService.delUser(102);
//        List<User> userList = userService.findAll();
//        for (User user : userList){
//            System.out.println(user.getId()+"\t"+user.getName()+"\t"+user.getBirthday()
//            +"\t"+user.getSalary());
//        }
//    }

    @Test
    public void testInsert(){
//        ApplicationContext applicationContext =
//                new ClassPathXmlApplicationContext("applicationContext.xml");
//        IUserService userService = (IUserService) applicationContext.getBean("userService");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date birthday = null;
        try {
            birthday = simpleDateFormat.parse("1998-05-24");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        User user = new User(103, "lucy", birthday, 5000f);
        try {
            userService.insert(user);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testSelectUserById(){
        User user = userService.selectUserById(102);
        System.out.println(user.getId()+"\t"+user.getName()+"\t"+user.getBirthday()
                +"\t"+user.getSalary());
    }

    @Test
    public void testInsertBatch(){
        userService.insertBatch();
    }
}
