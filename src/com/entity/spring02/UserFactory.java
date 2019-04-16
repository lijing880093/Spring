package com.entity.spring02;

/**
 * @author: Iman
 * date   : 2019/4/15
 */
public class UserFactory {
    public   User creatUser(){
        User user5=new User();
        user5.setId(1005);
        user5.setName("Justin");
        user5.setAge(22);
        return user5;
    }

    public static   User creatStaticUser(){
        User user6=new User();
        user6.setId(1006);
        user6.setName("Lily");
        user6.setAge(20);
        return user6;
    }
}
