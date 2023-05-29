package com.src.practise.oob_main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
 
/**
 * Mysql千万级别数据批量插入
 *
 * 1）配置my.ini文件
 *      文件中配置
 *          bulk_insert_buffer_size=120M 或者更大
 *      将insert语句的长度设为最大。
 *          max_allowed_packet=1M
 *          net_buffer_length=8k
 *      保存
 * 2）查看设置的参选有没有生效.
 *      SHOW VARIABLES;  --bulk_insert_buffer_size默认是8M，我们要把它调成100M或百兆以上，也不要太大。
 * 3）INSERT INTO table (field1,field2,field3) VALUES ('a',"b","c"), ('a',"b","c"),('a',"b","c");
 *      将以上Mysql插入模式用java语言字符串拼接SQL方法如下
 */
public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection conn;
        PreparedStatement stmt;
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/loan";
        String user = "root";
        String password = "root";
        //String sql = "insert into test values (?,?,?)";
        String sql = "insert into t_user(username,password,age) values (?,?,?)";
        Class.forName(driver);
        conn = DriverManager.getConnection(url, user, password);
        stmt = (PreparedStatement) conn.prepareStatement(sql);
        System.out.println(new Date());
        // ------ 5000,000条 ----------
        // Sat Jul 27 14:07:59 CST 2019
        // Sat Jul 27 16:21:13 CST 2019
        // 耗时;7994秒  平均625条/秒
        /*for (int i = 10; i < 5000000; i++) {
            stmt.setInt(1, i);
            stmt.setString(2, "test_" + i);
            stmt.setString(3, "外环路" + i + "号院");
            stmt.executeUpdate();
        }*/
        /* —————————————————————————— */
        // ------- 1000,000条 ---------
        // Sat Jul 27 18:49:57 CST 2019
        // Sat Jul 27 18:59:07 CST 2019
        // 耗时;550秒  平均1818条/秒
        for (int i = 1009782; i < 10000000; i ++) {
            stmt.setString(1, "user"+i);
            stmt.setString(2, "password");
            stmt.setString(3,"100");
            stmt.executeUpdate();
        }
        System.out.println(new Date());
 
        try {
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
