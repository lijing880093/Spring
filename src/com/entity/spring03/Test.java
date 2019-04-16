package com.entity.spring03;

import com.entity.spring03.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Iman
 * date   : 2019/4/15
 */
public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("databases.xml");
        /* 采用xml依赖注入 */
//        UserService userService = applicationContext.getBean("userService", UserService.class);
//        userService.add();

        /* byName依赖注入 */
//        UserService userService1 = applicationContext.getBean("userService1", UserService.class);
//        userService1.add();

        /* byType依赖注入 */
        UserService userService2 = applicationContext.getBean("userService2", UserService.class);
        userService2.add();

    }
}
