package com.src.practise.oob_javaSE.w_jdbc.stu_management2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 功能
 *
 * @author caojianbang
 * @date 11/12/2021 02:45
 */
public class StuUpdDialog extends JDialog implements ActionListener {
    JLabel jl1, jl2, jl3, jl4, jl5, jl6;
    JButton jb1, jb2;
    JTextField jtf1, jtf2, jtf3, jtf4, jtf5, jtf6;
    JPanel jp1, jp2, jp3;

    public StuUpdDialog(Frame owner, String title, boolean modal,StuModel sm,int rowNum) {
        super(owner, title, modal);
        jl1 = new JLabel("学号");
        jl2 = new JLabel("名字");
        jl3 = new JLabel("性别");
        jl4 = new JLabel("年龄");
        jl5 = new JLabel("籍贯");
        jl6 = new JLabel("系别");

        jtf1 = new JTextField(20);
        jtf2 = new JTextField(20);
        jtf3 = new JTextField(20);
        jtf4 = new JTextField(20);
        jtf5 = new JTextField(20);
        jtf6 = new JTextField(20);
        jtf1.setEditable(false);
        jtf1.setText((String)sm.getValueAt(rowNum,0));
        jtf2.setText((String) sm.getValueAt(rowNum,1));
        jtf3.setText((String) sm.getValueAt(rowNum,2));
        jtf4.setText((sm.getValueAt(rowNum,3)).toString());
        jtf5.setText((String) sm.getValueAt(rowNum,4));
        jtf6.setText((String) sm.getValueAt(rowNum,5));


        jb1 = new JButton("修改");
        jb2 = new JButton("取消");
        jp1 = new JPanel();
        jp2 = new JPanel();
        jp3 = new JPanel();

        jp1.setLayout(new GridLayout(6, 1));
        jp2.setLayout(new GridLayout(6, 1));
        jp1.add(jl1);
        jp1.add(jl2);
        jp1.add(jl3);
        jp1.add(jl4);
        jp1.add(jl5);
        jp1.add(jl6);
        jp2.add(jtf1);
        jp2.add(jtf2);
        jp2.add(jtf3);
        jp2.add(jtf4);
        jp2.add(jtf5);
        jp2.add(jtf6);

        jp3.add(jb1);
        jp3.add(jb2);

        this.add(jp1, BorderLayout.WEST);
        this.add(jp2, BorderLayout.CENTER);
        this.add(jp3, BorderLayout.SOUTH);

        jb1.addActionListener(this);
        jb2.addActionListener(this);
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jb1) {
            StuModel temp = new StuModel();
            String sql = "update stu set stuName = ? ,stuSex =?, stuAge =?,stuJg =?,stuDept =?  where stuId = ?";
            String parse[] = {jtf2.getText(), jtf3.getText(), jtf4.getText(), jtf5.getText(), jtf6.getText(), jtf1.getText()};
            if (!temp.updateStu(sql, parse)) {
                JOptionPane.showMessageDialog(this, "修改数据失败", "修改数据提示", JOptionPane.ERROR_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(this, "修改数据成功", "修改数据提示", JOptionPane.INFORMATION_MESSAGE);
            }
            this.dispose();
        }else {
            this.dispose();
        }
    }
}
