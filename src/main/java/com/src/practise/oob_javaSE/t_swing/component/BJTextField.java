package com.src.practise.oob_javaSE.t_swing.component;

import javax.swing.*;
import java.awt.*;

/**
 * 文本框
 * 密码框
 * 标签
 */
public class BJTextField extends JFrame {
    JPanel jp1, jp2, jp3;
    JLabel jlb1, jlb2;
    JButton jb1, jb2;
    JTextField jtf;
    JPasswordField jpf;

    public static void main(String[] args) {
        BJTextField demoJTextField = new BJTextField();
    }

    public BJTextField() {
        //创建面板
        jp1 = new JPanel();
        jp2 = new JPanel();
        jp3 = new JPanel();
        //创建标签
        jlb1 = new JLabel("用户名");
        jlb2 = new JLabel("登录码");
        //创建文本框，大小为10
        jtf = new JTextField(10);
        //设置密码框
        jpf = new JPasswordField(10);
        //创建按钮
        jb1 = new JButton("登录");
        jb2 = new JButton("取消");

        //设置布局管理,网格布局管理
        this.setLayout(new GridLayout(3, 1));
        //面板加入组件
        jp1.add(jlb1);
        jp1.add(jtf);
        jp2.add(jlb2);
        jp2.add(jpf);
        jp3.add(jb1);
        jp3.add(jb2);

        //加入到JFrame
        this.add(jp1);
        this.add(jp2);
        this.add(jp3);

        //设置窗体属性
        this.setTitle("用户登录");
        this.setSize(300, 150);
        //居中显示
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        //锁定窗体
        this.setResizable(false);
    }
}
