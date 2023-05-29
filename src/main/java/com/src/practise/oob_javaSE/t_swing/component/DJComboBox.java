package com.src.practise.oob_javaSE.t_swing.component;

import javax.swing.*;
import java.awt.*;

/**
 * 下拉框
 * 列表框
 * 滚动框
 */
public class DJComboBox extends JFrame {
    //定义组件
    JPanel jp1,jp2;
    JLabel jl1,jl2;
    JComboBox jcb;
    JList jl;
    JScrollPane jsp;
    public static void main(String[] args) {
        DJComboBox djComboBox = new DJComboBox();
    }

    public DJComboBox()  {
jp1 = new JPanel();
jp2 = new JPanel();

jl1 = new JLabel("你的籍贯");
jl2 = new JLabel("旅游地点");

//下拉框
        String jg[] = {"JB","SH","GD","FS"};
        jcb = new JComboBox(jg);

        String dd[]= {"长城","东方明珠","海河","什么什么"};
        jl = new JList(dd);

        //设置你希望显示多少个选项
        jl.setVisibleRowCount(1);
        jsp=new JScrollPane(jl);

        //设定布局
        this.setLayout(new GridLayout(2,1));

        //加入组件
        jp1.add(jl1);
        jp1.add(jcb);

        jp2.add(jl2);
        jp2.add(jsp);

        this.add(jp1);
        this.add(jp2);

        //设置窗体
        this.setTitle("用户注册");
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
