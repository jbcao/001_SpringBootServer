package com.src.practise.oob_javaSE.w_jdbc;

import java.sql.*;

/**
 * 功能
 *
 * @author caojianbang
 * @date 09/12/2021 12:02
 */
public class SqlTest4 {
    public static void main(String[] args) {
        PreparedStatement  ps=null;
        Connection cn =null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydb1","root","root");
            if(cn!=null){
                System.out.println("连接成功");
            }
            ps=cn.prepareStatement("select ename,sal,dname from emp,dept where emp.deptno = dept.deptno");
            rs=ps.executeQuery();
            while(rs.next()){
                System.out.println(rs.next());
                String name =rs.getString("ename");
                float sal = rs.getFloat("sal");
               String dname = rs.getString("dname");
               System.out.println(name+"\t"+sal+"\t"+dname);
           }
            //ps =cn.prepareStatement("insert into dept values(?,?,?)");
            //ps.setInt(1,70);
            //ps.setString(2,"finance");
            //ps.setString(3,"alsjia");
            //ps=cn.prepareStatement("delete from dept where deptno =?");
            //ps.setInt(1,50);
            //int i =ps.executeUpdate();
           // if (i==1){
            //    System.out.println("添加数据成功");
            //}else{
            //    System.out.println("数据添加失败");
            //}
            //ps =cn.prepareStatement("update dept set deptno = ? where loc = ? ");
            //ps.setInt(1,4);
            //ps.setString(2,"ttt");
            //int i =ps.executeUpdate();
            //if(i==1){
            //    System.out.println("修改成功");
            //}else {
             //   System.out.println("修改失败");
            //}
            ps.close();
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
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
