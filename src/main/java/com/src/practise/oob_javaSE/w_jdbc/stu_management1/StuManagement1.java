package com.src.practise.oob_javaSE.w_jdbc.stu_management1;

import javax.swing.*;
import java.sql.*;
import java.util.Vector;

/**
 * 功能:学生管理系统1
 *
 * @author caojianbang
 * @date 09/12/2021 15:40
 */
public class StuManagement1 extends JFrame {
    Vector row =null;
    Vector column = null;
    JTable jt = null;
    JScrollPane jsp = null;

    PreparedStatement ps =null;
    Connection cn =null;
    ResultSet rs =null;
    public static void main(String[] args) {
        new StuManagement1();
    }

    public StuManagement1() {
        column = new Vector();
        column.add("学号");
        column.add("姓名");
        column.add("性别");
        column.add("年龄");
        column.add("籍贯");
        column.add("系别");

        row = new Vector();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/LiangShanHero","root","root");
            ps =cn.prepareStatement("select * from stu");
            rs =ps.executeQuery();
            while(rs.next()){
                Vector hang = new Vector();
                hang.add(rs.getString(1));
                hang.add(rs.getString(2));
                hang.add(rs.getString(3));
                hang.add(rs.getInt(4));
                hang.add(rs.getString(5));
                hang.add(rs.getString(6));
                row.add(hang);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(rs!=null){
                   rs.close();
                }
                if(cn!=null){
                    cn.close();
                }
                if(ps!=null){
                    ps.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        jt = new JTable(row,column);
        jsp =new JScrollPane(jt);
        this.add(jsp);
        this.setSize(600,450);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
