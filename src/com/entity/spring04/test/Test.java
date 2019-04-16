package com.entity.spring04.test;

import com.entity.spring04.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Iman
 * date   : 2019/4/15
 */
public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("annotation.xml");
        UserService bean = applicationContext.getBean("userService", UserService.class);
        bean.add();
    }
}
