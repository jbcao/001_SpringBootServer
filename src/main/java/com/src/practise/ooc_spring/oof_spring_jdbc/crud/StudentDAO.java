package com.src.practise.ooc_spring.oof_spring_jdbc.crud;

import javax.sql.DataSource;
import java.util.List;

/**
 * 数据访问对象接口
 *
 * @author caojianbang
 * @date 2020/11/14 2:07
 */
public interface StudentDAO {
    /**
     * This is the method to be used to initialize
     * database resources ie. connection.
     */
    public void setDataSource(DataSource ds);
    /**
     * This is the method to be used to create
     * a record in the Student table.
     */
    public void create(String name, Integer age);
    /**
     * This is the method to be used to list down
     * a record from the Student table corresponding
     * to a passed student id.
     */
    public Student getStudent(Integer id);
    /**
     * This is the method to be used to list down
     * all the records from the Student table.
     */
    public List<Student> listStudents();
    /**
     * This is the method to be used to delete
     * a record from the Student table corresponding
     * to a passed student id.
     */
    public void delete(Integer id);
    /**
     * This is the method to be used to update
     * a record into the Student table.
     */
    public void update(Integer id, Integer age);

}
