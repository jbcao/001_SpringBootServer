package com.src.practise.oob_javaSE.w_jdbc.stu_management2;


import javax.swing.table.AbstractTableModel;
import java.sql.*;
import java.util.Vector;

/**
 * 功能
 *
 * @author caojianbang
 * @date 10/12/2021 01:13
 */
public class StuModel extends AbstractTableModel {
    Vector rowData = null;
    Vector columnNames = null;
    SqlHelper sqlHelper = null;
    ResultSet rs = null;


    public boolean updateStu(String sql, String parse[]) {
        sqlHelper = new SqlHelper();
        return sqlHelper.updExecute(sql, parse);
    }

    public void queryStu(String sql, String parse[]) {
        columnNames = new Vector();
        columnNames.add("学号");
        columnNames.add("姓名");
        columnNames.add("性别");
        columnNames.add("年龄");
        columnNames.add("籍贯");
        columnNames.add("系别");

        rowData = new Vector();
        try {
            sqlHelper = new SqlHelper();
            rs = sqlHelper.queryExecute(sql, parse);
            while (rs.next()) {
                Vector hang = new Vector();
                hang.add(rs.getString(1));
                hang.add(rs.getString(2));
                hang.add(rs.getString(3));
                hang.add(rs.getInt(4));
                hang.add(rs.getString(5));
                hang.add(rs.getString(6));
                rowData.add(hang);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlHelper.close();
        }
    }


    @Override
    public int getRowCount() {
        return this.rowData.size();
    }

    @Override
    public int getColumnCount() {
        return this.columnNames.size();
    }

    @Override
    public String getColumnName(int column) {
        return (String) this.columnNames.get(column);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return ((Vector) this.rowData.get(rowIndex)).get(columnIndex);
    }
}
