package com.entity.spring03.service;

import com.entity.spring03.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: Iman
 * date   : 2019/4/15
 */
@Service
public class UserService {

    @Resource
    private UserDao userDao;

    public void add(){
        System.out.println("UserDao.add...");
        userDao.add();
    }
}
