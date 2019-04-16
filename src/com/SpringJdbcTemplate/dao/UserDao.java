package com.SpringJdbcTemplate.dao;

import com.SpringJdbcTemplate.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: Iman
 * date   : 2019/4/16
 */
// 持久层  数据访问层 DAO
@Repository("userDao")
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void add(Student student){
        String sql="insert into t_student (s_name,s_cid) values (?,?)";
        int i = jdbcTemplate.update(sql, student.getName(), student.getCid());
        System.out.println("添加成功");
    }
    public void update(Student student){
        String sql="update  t_student set s_name=?,s_cid=? where s_id=?";
        int i = jdbcTemplate.update(sql, student.getName(), student.getCid(),student.getId());
        System.out.println("修改成功");
    }
    public void delete(int id){
        String sql="delete from t_student where s_id=?";
        int i = jdbcTemplate.update(sql,id);
        System.out.println("删除成功");
    }
    public void queryAll(){
        String sql="select * from t_student ";
        List<Student> list=new ArrayList<>();
        jdbcTemplate.query(sql, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet resultSet) throws SQLException {
                int id = resultSet.getInt("s_id");
                String name = resultSet.getString("s_name");
                int cid = resultSet.getInt("s_cid");
                Student student=new Student(id,name,cid);
                list.add(student);
            }
        });
        System.out.println(list);
    }
    public void queryMapper(){
        String sql="select s_id id,s_name name,s_cid cid from t_student where s_id=?";
        List<Student> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Student.class), 4);
        System.out.println(query);
    }
}
