package com.entity.spring01;

import com.entity.java.TestWork;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Iman
 * date   : 2019/4/15
 */
public class SpringTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        User user = ac.getBean("user", User.class);
        System.out.println(user);

        TestWork testwork = ac.getBean("testwork", TestWork.class);
        testwork.doTest();

    }


}
