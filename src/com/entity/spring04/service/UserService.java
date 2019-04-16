package com.entity.spring04.service;

import com.entity.spring04.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: Iman
 * date   : 2019/4/15
 */
@Service
public class UserService {
    @Resource
    private UserDao dao ;

    public void add(){
        System.out.println("userService.add...");
        dao.add();
    }
}
