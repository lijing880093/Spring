package com.SpringJdbcTemplate.test;

import com.SpringJdbcTemplate.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Iman
 * date   : 2019/4/16
 */
public class AnnocationTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =  new ClassPathXmlApplicationContext("springjdbc.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
//        Student student=new Student();
//        student.setName("vvv");
//        student.setCid(6);
//        userService.add(student);
        userService.queryMapper();
//        student.setId(2);
//        student.setName("eee");
//        student.setCid(10);
//        userService.update(student);
//        userService.delete(1);

    }
}
