package com.src.practise.oob_jdbc_connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

/**
 * Mysql千万级别数据批量插入
 * <p>
 * 1）配置my.ini文件
 * 文件中配置
 * bulk_insert_buffer_size=120M 或者更大
 * 将insert语句的长度设为最大。
 * max_allowed_packet=1M
 * net_buffer_length=8k
 * 保存
 * 2）查看设置的参选有没有生效.
 * SHOW VARIABLES;  --bulk_insert_buffer_size默认是8M，我们要把它调成100M或百兆以上，也不要太大。
 * 3）INSERT INTO table (field1,field2,field3) VALUES ('a',"b","c"), ('a',"b","c"),('a',"b","c");
 * 将以上Mysql插入模式用java语言字符串拼接SQL方法如下
 * <p>
 * 执行步骤
 * 1.配置注册驱动、数据库信息
 * 2.操作Connection，打开Statement对象
 * 3.通过Statement对象执行SQL,返回结果到ResultSet对象
 * 4.使用ResultSet读取数据，然后通过代码转换为具体POJO对象
 * 5.关闭数据库相关资源
 * <p>
 * 缺点
 * 一、工作量比较大
 * 二、需要处理JDBC编程产生的异常，并正确关闭资源
 * <p>
 * 解决方案
 * 一、ORM模型，对象关系映射，Object Relationl Mapping,即将数据库表与POJO（Plain Ordinary Java Object）建立映射关系
 * 二、程序员更加容易理解和应用程序
 * 三、顺势产生了EJB
 * 四
 */

/**
 * 执行步骤
 * 1.配置注册驱动、数据库信息
 * 2.操作Connection，打开Statement对象
 * 3.通过Statement对象执行SQL,返回结果到ResultSet对象
 * 4.使用ResultSet读取数据，然后通过代码转换为具体POJO对象
 * 5.关闭数据库相关资源
 */


/**
 * 缺点
 * 一、工作量比较大
 * 二、需要处理JDBC编程产生的异常，并正确关闭资源
 */

/**
 * 解决方案
 * 一、ORM模型，对象关系映射，Object Relationl Mapping,即将数据库表与
 * POJO（Plain Ordinary Java Object）建立映射关系
 * 二、程序员更加容易理解和应用程序
 * 三、顺势产生了EJB
 * 四、各种ORM都是基于对JDBC的封装，只是程度不同
 */

/**
 * EJB很快被淘汰了，原因
 * 一、配置复杂
 * 二、适用范围小
 * 三、Hibernate应运而生
 */
public class JdbcExample {
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
        for (int i = 1009782; i < 10000000; i++) {
            stmt.setString(1, "user" + i);
            stmt.setString(2, "password");
            stmt.setString(3, "100");
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
