package com.src.practise.ooc_spring.oog_transaction.declarative;

import javax.sql.DataSource;
import java.util.List;

/**
 * @author caojianbang
 * @date 2020/11/18 22:04
 */
public interface StudentDAO {
    public void setDataSource(DataSource dataSource);
    public void create(String name,Integer age,Integer marks,Integer year);
    public  List<StudentMarks> listStudent();
}
