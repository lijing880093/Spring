package com.SpringAOP.xml.service;

import com.SpringAOP.xml.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: Iman
 * date   : 2019/4/16
 */
// 业务层
@Service
public class UserService {
    // Resource 通过byName赋值； Autowired 通过byType赋值
    @Resource
    private UserDao userDao;

    public void add(){
        System.out.println("UserService.add......");
        userDao.add();
    }
}
