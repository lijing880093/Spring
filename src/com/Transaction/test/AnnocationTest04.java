package com.Transaction.test;


import com.Transaction.entity.Student;
import com.Transaction.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Iman
 * date   : 2019/4/16
 */
public class AnnocationTest04 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =  new ClassPathXmlApplicationContext("spring04.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        Student student=new Student();
        student.setName("444");
        student.setCid(6);
        userService.add04(student);


    }
}
