package com.src.practise.ooc_spring.oog_transaction.declarative;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author caojianbang
 * @date 2020/11/18 22:28
 */
public class StudentMarksMapper implements RowMapper<StudentMarks> {
    @Override
    public StudentMarks mapRow(ResultSet resultSet, int i) throws SQLException {
        StudentMarks studentMarks = new StudentMarks();
        studentMarks.setAge(studentMarks.getAge());
        studentMarks.setName(studentMarks.getName());
        studentMarks.setId(studentMarks.getId());
        studentMarks.setMarks(studentMarks.getAge());
        studentMarks.setYear(studentMarks.getYear());
        studentMarks.setSid(studentMarks.getSid());
        return studentMarks;
    }
}
