package com.icss.controller;

import com.icss.service.IUserService;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 李永庆
 * @since 2020/6/4
 */
public class UserController {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserService userService = (IUserService) applicationContext.getBean("userService");
        userService.insert();
    }
}
