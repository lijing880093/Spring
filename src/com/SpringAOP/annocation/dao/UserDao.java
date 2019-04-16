package com.SpringAOP.annocation.dao;

import org.springframework.stereotype.Repository;

/**
 * @author: Iman
 * date   : 2019/4/16
 */
// 持久层  数据访问层 DAO
@Repository("userDao")
public class UserDao {

    public void add(){

        System.out.println("UserDao.add......");
    }
}
