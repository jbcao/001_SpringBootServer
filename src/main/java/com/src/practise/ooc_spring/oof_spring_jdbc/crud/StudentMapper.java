package com.src.practise.ooc_spring.oof_spring_jdbc.crud;


import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author caojianbang
 * @date 2020/11/14 2:10
 */
public class StudentMapper implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet resultSet, int i) throws SQLException {
        Student student = new Student();
        student.setAge(resultSet.getInt("age"));
        student.setName(resultSet.getString("name"));
        student.setId(resultSet.getInt("id"));
        return student;
    }
}
