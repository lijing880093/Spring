package com.SpringAOP.annocation.test;

import com.SpringAOP.annocation.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Iman
 * date   : 2019/4/16
 */
public class AnnocationTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =  new ClassPathXmlApplicationContext("annotation.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.add();

    }
}
