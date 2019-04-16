package com.SpringJdbcTemplate.service;

import com.SpringJdbcTemplate.dao.UserDao;
import com.SpringJdbcTemplate.entity.Student;
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
    public void add(Student student){
        userDao.add(student);
    }
    public void update(Student student){
        userDao.update(student);
    }
    public void delete(int id){
        userDao.delete(id);
    }
    public void queryAll(){
        userDao.queryAll();
    }
    public void queryMapper(){
        userDao.queryMapper();
    }
}
