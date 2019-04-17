package com.Transaction.service;


import com.Transaction.dao.UserDao1;
import com.Transaction.entity.Student;
import com.Transaction.util.TransactionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;

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
    private UserDao1 userDao1;
    @Autowired
    private TransactionUtil transaction;

    public void add(Student student){
        System.out.println("UserService.add01......");
        // 开始事务
        TransactionStatus begin = null;
        try {
            begin = transaction.begin();
            userDao1.add(student);
//            System.out.println(1/0);
            transaction.commit(begin);
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback(begin);
        }
    }
    public void add02(Student student){
        System.out.println("UserService.add02......");
        userDao1.add(student);
        // 在service 不要去捕捉异常，抛出异常，异常交给controller解决
//        System.out.println(1/0);
    }
    public void add03(Student student){
        System.out.println("UserService.add03......");
        userDao1.add(student);
        System.out.println(1/0);
    }

    @Transactional
    public void add04(Student student){
        System.out.println("UserService.add04......");
        userDao1.add(student);
//        System.out.println(1/0);
    }

    public void update(Student student){
        userDao1.update(student);
    }
    public void delete(int id){
        userDao1.delete(id);
    }
    public void queryAll(){
        userDao1.queryAll();
    }
    public void queryMapper(){
        userDao1.queryMapper();
    }
}
