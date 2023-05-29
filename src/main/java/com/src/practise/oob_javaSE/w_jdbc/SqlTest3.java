package com.src.practise.oob_javaSE.w_jdbc;

import java.sql.*;

/**
 * 功能:jdbc直接连接mysql数据库，操作单表
 *
 * @author caojianbang
 * @date 09/12/2021 11:09
 */
public class SqlTest3 {
    public static void main(String[] args) {
        PreparedStatement ps =null;
        Connection ct = null;
        ResultSet rs =null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            ct =DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydb1","root","root");
            if(ct!=null){
                System.out.println("数据库连接成功");

            }else{
                System.out.println("数据库连接失败");
            }
            ps =ct.prepareStatement("select ename,sal from emp");
            rs =ps.executeQuery();
            while(rs.next()){
                String ename = rs.getString(1);
                float sal = rs.getFloat(2);
                System.out.println(ename +"\t"+sal);

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(rs!=null){
                    System.out.println("ok");
                    rs.close();
                }
                if(ct!=null){
                    ct.close();
                }
                if(ps!=null){
                    ps.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
