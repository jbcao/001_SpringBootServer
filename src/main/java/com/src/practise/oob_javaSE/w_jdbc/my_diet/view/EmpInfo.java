package com.src.practise.oob_javaSE.w_jdbc.my_diet.view;

import com.src.practise.oob_javaSE.w_jdbc.my_diet.model.EmpModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 功能
 *
 * @author caojianbang
 * @date 14/12/2021 18:13
 */
public class EmpInfo extends JPanel implements ActionListener {
    JPanel jp1, jp2, jp3, jp4, jp5;
    JLabel jl1, jl2;
    JTextField jtf;
    JButton jb1, jb2, jb3, jb4, jb5;
    JScrollPane jsp;
    JTable jt;
    EmpModel empModel;
    public static void main(String[] args) {
        EmpInfo empInfo = new EmpInfo();
    }

    public EmpInfo() {
        jp2 =new JPanel(new BorderLayout());
        jl1 = new JLabel("姓名/员工号/职位");
        jtf = new JTextField(20);
        jb1 = new JButton("查询");
        jp1 = new JPanel();
        //加入jp1
        jp1.add(jl1);
        jp1.add(jtf);
        jp1.add(jb1);
        jp3 = new JPanel(new FlowLayout(FlowLayout.LEFT));


        jp4 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        jb2 = new JButton("详情");
        jb3 = new JButton("增加");
        jb4 = new JButton("修改");
        jb5 = new JButton("删除");
        jp4.add(jb2);
        jp4.add(jb3);
        jp4.add(jb4);
        jp4.add(jb5);
        jp5 = new JPanel(new BorderLayout());

        empModel= new EmpModel();
        String parse[] = {"1"};
        String sql = " select * from rsgl where 1 =?";
        empModel.query(sql, parse);
        jt = new JTable(empModel);
        jl2 = new JLabel("总共" + jt.getRowCount() + "条记录");
        jp3.add(jl2);
        jsp = new JScrollPane(jt);
        jp2.add(jsp);
        jp5.add(jp3, "West");
        jp5.add(jp4, "East");
        this.setLayout(new BorderLayout());
        this.add(jp1, "North");
        this.add(jp2, "Center");
        this.add(jp5, "South");
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
