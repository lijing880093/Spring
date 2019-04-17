package com.Transaction.test;


import com.Transaction.entity.Student;
import com.Transaction.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Iman
 * date   : 2019/4/16
 */
public class AnnocationTest03 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =  new ClassPathXmlApplicationContext("spring03.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        Student student=new Student();
        student.setName("333");
        student.setCid(6);
        userService.add03(student);


    }
}
