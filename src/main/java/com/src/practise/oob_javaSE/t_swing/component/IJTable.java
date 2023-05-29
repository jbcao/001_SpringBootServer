package com.src.practise.oob_javaSE.t_swing.component;

import javax.swing.*;
import java.util.Vector;

/**
 * 功能:Jtable
 *
 * @author caojianbang
 * @date 09/12/2021 14:47
 */
public class IJTable extends JFrame {
    Vector rowData;
    Vector columnNames;
    JScrollPane jsp = null;
    JTable jt = null;
    public static void main(String[] args) {
        IJTable ijTable = new IJTable();
    }
    public IJTable(){
        columnNames =new Vector();
        columnNames.add("学号");
        columnNames.add("名字");
        columnNames.add("性别");
        columnNames.add("年龄");
        columnNames.add("籍贯");
        columnNames.add("系别");


        rowData = new Vector();
        Vector hang = new Vector();
        hang.add("sp001");
        hang.add("孙悟空");
        hang.add("男");
        hang.add("500");
        hang.add("花果山");
        hang.add("三星派");

        rowData.add(hang);

        jt=new JTable(rowData,columnNames);
        jsp=new JScrollPane(jt);
        this.add(jsp);
        this.setTitle("学生管理系统");
        this.setSize(500,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
