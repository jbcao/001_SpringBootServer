package com.src.practise.oob_javaSE.w_jdbc.my_diet.model;

import com.src.practise.oob_javaSE.w_jdbc.stu_management2.SqlHelper;

import java.sql.ResultSet;

/**
 * 功能
 *
 * @author caojianbang
 * @date 13/12/2021 18:00
 */
public class UserModel {
    /**
     *
     * @param id
     * @param pass
     * @return
     */

    public String checkUser(String id,String pass){
        String position = "";
        SqlHelper sqlHelper = null;
        String sql ="select rsgl.position from login,rsgl where login.rsid =? and login.passward =? and login.rsid = rsgl.empid";
        try {
            sqlHelper = new SqlHelper();
            String parse[] = {id,pass};
            ResultSet rs = sqlHelper.queryExecute(sql,parse);
            if (rs.next()){
                position = rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlHelper.close();
        }
        return position;
    }
}
