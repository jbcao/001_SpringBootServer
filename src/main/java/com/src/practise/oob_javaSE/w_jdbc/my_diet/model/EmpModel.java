package com.src.practise.oob_javaSE.w_jdbc.my_diet.model;

import com.src.practise.oob_javaSE.w_jdbc.stu_management2.SqlHelper;

import javax.swing.table.AbstractTableModel;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;

/**
 * 功能
 *
 * @author caojianbang
 * @date 14/12/2021 21:11
 */
public class EmpModel extends AbstractTableModel {
    Vector<Vector> row = null;
    Vector<String> column = null;
    SqlHelper sqlHelper = null;
    public void query(String sql,String parse[]){
        this.row = new Vector<>();
        this.column = new Vector<>();
        sqlHelper = new SqlHelper();
        ResultSet rs = sqlHelper.queryExecute(sql,parse);
        try {
            ResultSetMetaData rsmt = rs.getMetaData();
            for (int i=0;i<rsmt.getColumnCount();i++){
                column.add(rsmt.getColumnName(i+1));
            }
            while(rs.next()){
                Vector temp = new Vector();
                for (int i=0;i<rsmt.getColumnCount();i++){
                    temp.add(rs.getString(i+1));
                }
                row.add(temp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            sqlHelper.close();
        }

    }
    @Override
    public int getRowCount() {
        return this.row.size();
    }

    @Override
    public int getColumnCount() {
        return this.column.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return (this.row.get(rowIndex)).get(columnIndex);
    }

    @Override
    public String getColumnName(int column) {
        return this.column.get(column).toString();
    }
}
