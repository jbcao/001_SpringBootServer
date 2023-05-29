package com.src.practise.ooc_spring.oog_transaction.declarative;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionException;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import javax.sql.DataSource;
import java.util.List;

/**
 * @author caojianbang
 * @date 2020/11/18 22:49
 */
public class StudentJDBCTemplate implements StudentDAO {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;
    private PlatformTransactionManager transactionManager;

    public void setTransactionManager(PlatformTransactionManager transactionManager) {
        this.transactionManager = transactionManager;
    }

    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    @Override
    public void create(String name, Integer age, Integer marks, Integer year) {
        TransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
        TransactionStatus transactionStatus = transactionManager.getTransaction(transactionDefinition);
        try {
            String SQL1 = "insert into Student (name, age) values (?, ?)";
            jdbcTemplateObject.update(SQL1, name, age);
            String SQL2 = "select max(id) from Student";
            int sid = jdbcTemplateObject.queryForObject(SQL2, null, Integer.class);
            String SQL3 = "insert into Marks(sid, marks, year) " +
                    "values (?, ?, ?)";
            jdbcTemplateObject.update(SQL3, sid, marks, year);
            System.out.println("name=" + name + "age=" + age);
            transactionManager.commit(transactionStatus);
        } catch (DataAccessException e) {
            System.out.println("Error in creating record, rolling back");
            transactionManager.rollback(transactionStatus);
            e.printStackTrace();
        } catch (TransactionException e) {
            e.printStackTrace();
        }


    }

    @Override
    public List<StudentMarks> listStudent() {
        String SQL ="select * from Student, Marks where Student.id=Marks.sid";
        List<StudentMarks> studentMarks= jdbcTemplateObject.query(SQL,new StudentMarksMapper());
        return studentMarks;
    }

}
