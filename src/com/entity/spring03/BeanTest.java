package com.entity.spring03;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : 张晋飞
 * date : 2019/4/15
 */
public class BeanTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =  new ClassPathXmlApplicationContext("spring03.xml");

        Person person1 = applicationContext.getBean("person1",Person.class);
        System.out.println(person1);
        Person person2 = applicationContext.getBean("person2",Person.class);
        System.out.println(person2);
        Person person3 = applicationContext.getBean("person3",Person.class);
        System.out.println(person3);
        Person person4 = applicationContext.getBean("person4",Person.class);
        System.out.println(person4);
        Person person5 = applicationContext.getBean("person5",Person.class);
        System.out.println(person5.getAddr());
        Person person6 = applicationContext.getBean("person6",Person.class);
        System.out.println(person6.getLove());
        Person person7 = applicationContext.getBean("person7",Person.class);
        System.out.println(person7.getAddress());
        Person person8 = applicationContext.getBean("person8",Person.class);
        System.out.println(person8.getProperties());
    }
}
