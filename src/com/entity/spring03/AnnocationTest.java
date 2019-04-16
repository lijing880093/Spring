package com.entity.spring03;

import com.entity.spring03.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Iman
 * date   : 2019/4/15
 */
public class AnnocationTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("annotation.xml");
        UserService userService = ac.getBean("userService", UserService.class);
        userService.add();


    }
}
