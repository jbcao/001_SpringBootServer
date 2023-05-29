package com.src.practise.oob_javaSE.w_jdbc.stu_management2;

import javax.swing.*;
import java.sql.*;

/**
 * 功能
 *
 * @author caojianbang
 * @date 11/12/2021 02:47
 */
public class SqlHelper {
    PreparedStatement ps = null;
    Connection cn = null;
    ResultSet rs = null;
    String driver = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://127.0.0.1:3306/LiangShanHero?useSSL=false&&characterEncoding=utf-8";
    String user = "root";
    String pass = "root";

    public SqlHelper() {
        try {
            Class.forName(driver);
            cn = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (cn != null) {
                cn.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ResultSet queryExecute(String sql) {
        try {
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public ResultSet queryExecute(String sql, String parse[]) {
        try {
            ps = cn.prepareStatement(sql);
            for (int i = 0; i < parse.length; i++) {
                ps.setString(i + 1, parse[i]);
            }
            rs = ps.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public boolean updExecute(String sql, String parse[]) {
        boolean b = true;
        try {
            ps = cn.prepareStatement(sql);
            for (int i = 0; i < parse.length; i++) {
                ps.setString(i + 1, parse[i]);
            }
            if (ps.executeUpdate() != 1) {
                b = false;
            }

        } catch (SQLException e) {
            b = false;
            JOptionPane.showMessageDialog(null, "数据源错误或数据库用户名、密码错误", "数据库连接错误提示", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } finally {
            close();
        }
        return b;
    }

}
