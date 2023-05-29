package com.src.practise.oob_javaSE.t_swing.component;

import javax.swing.*;
import java.awt.*;

/**
 * 单选框
 * 复选框
 */
public class CJCheckBox extends JFrame {
    JPanel jp1, jp2, jp3;
    JLabel jl1, jl2;
    JCheckBox jcb1, jcb2, jcb3;
    JRadioButton jrb1, jrb2;
    ButtonGroup bg;
    JButton jb1, jb2;

    public static void main(String[] args) {
        CJCheckBox cjCheckBox = new CJCheckBox();
    }

    public CJCheckBox() {
        //创建组件
        jp1 = new JPanel();
        jp2 = new JPanel();
        jp3 = new JPanel();

        jl1 = new JLabel("你最喜欢的运动");
        jl2 = new JLabel("性别");

        jcb1 = new JCheckBox("足球");
        jcb2 = new JCheckBox("篮球");
        jcb3 = new JCheckBox("网球");

        jrb1 = new JRadioButton("男");
        jrb2 = new JRadioButton("女");

        bg = new ButtonGroup();
        bg.add(jrb1);
        bg.add(jrb2);

        jb1 = new JButton("注册用户");
        jb2 = new JButton("取消注册");
        //创建布局
        this.setLayout(new GridLayout(3,1));

        //加入组件
        jp1.add(jl1);
        jp1.add(jcb1);
        jp1.add(jcb2);
        jp1.add(jcb3);

        jp2.add(jl2);
        jp2.add(jrb1);
        jp2.add(jrb2);

        jp3.add(jb1);
        jp3.add(jb2);


        this.add(jp1);
        this.add(jp2);
        this.add(jp3);

        //设置窗体
        this.setTitle("用户注册");
        this.setSize(300,150);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
