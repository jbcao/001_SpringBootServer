package com.src.practise.oob_javaSE.w_jdbc.stu_management2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 * 功能
 *
 * @author caojianbang
 * @date 09/12/2021 16:33
 */
public class StuManagement extends JFrame implements ActionListener {
    JPanel jp1, jp2;
    JLabel jl1;
    JButton jb1, jb2, jb3, jb4;
    JTable jt;
    JScrollPane jsp;
    JTextField jtf;
    StuModel sm;

    // PreparedStatement ps = null;
    Connection cn = null;
    ResultSet rs = null;

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        new StuManagement();
    }

    public StuManagement() {
        jp1 = new JPanel();
        jtf = new JTextField(10);
        jb1 = new JButton("查询");
        jb1.addActionListener(this);
        jl1 = new JLabel("请输入名字");
        jp1.add(jl1);
        jp1.add(jtf);
        jp1.add(jb1);


        jp2 = new JPanel();
        jb2 = new JButton("添加");
        jb3 = new JButton("修改");
        jb4 = new JButton("删除");
        jb2.addActionListener(this);
        jb3.addActionListener(this);
        jb4.addActionListener(this);
        jp2.add(jb2);
        jp2.add(jb3);
        jp2.add(jb4);

        sm = new StuModel();
        String parse[] = {"1"};
        sm.queryStu("select * from stu where 1 = ?", parse);
        jt = new JTable(sm);
        jsp = new JScrollPane(jt);
        this.add(jsp);
        this.add(jp1, BorderLayout.NORTH);
        this.add(jp2, BorderLayout.SOUTH);
        this.setTitle("学生管理系统");
        this.setSize(1000, 800);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jb1) {
            StuModel sm = null;
            String name = this.jtf.getText();
            if (name.equals("")) {
                sm = new StuModel();
                String parse[] = {"1"};
                sm.queryStu("select * from stu where 1 =?", parse);
            } else {

                String sql = "select * from stu where stuName = ?";
                String parse[] = {name};
                sm = new StuModel();
                sm.queryStu(sql, parse);
            }
            jt.setModel(sm);
        } else if (e.getSource() == jb2) {
            StuAddDialog stuAddDialog = new StuAddDialog(this, "add student", true);
            sm = new StuModel();
            String parse[] = {"1"};
            sm.queryStu("select * from stu where 1 =?", parse);
            jt.setModel(sm);
        } else if (e.getSource() == jb3) {
            int rowNum = jt.getSelectedRow();
            if (rowNum == -1) {
                JOptionPane.showMessageDialog(this, "请选择一行", "提示", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            new StuUpdDialog(this, "修改", true, sm, rowNum);
            sm = new StuModel();
            String parse[] = {"1"};
            sm.queryStu("select * from stu where 1 =?", parse);
            jt.setModel(sm);
        } else if (e.getSource() == jb4) {
            int rowNum = jt.getSelectedRow();
            if (rowNum == -1) {
                JOptionPane.showMessageDialog(this, "请选择一行", "提示", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            String stuId = (String) sm.getValueAt(rowNum,0);
            String sql ="delete from stu where stuId =?";
            String parse[] ={stuId};
            sm =new StuModel();
            if(sm.updateStu(sql,parse)){
                JOptionPane.showMessageDialog(this,"删除数据成功","删除数据提示",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this,"删除数据失败","删除数据提示",JOptionPane.ERROR_MESSAGE);
            }
            sm = new StuModel();
            String parse1[] = {"1"};
            sm.queryStu("select * from stu where 1 =?", parse1);
            jt.setModel(sm);
        }
    }
}
