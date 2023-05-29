package com.src.practise.oob_javaSE.t_swing.component;

import javax.swing.*;
import java.awt.*;

/**
 * 多行文本组件
 */
public class FJTextArea extends JFrame {
    JTextArea jta;
    JScrollPane jsp;
    JPanel jpl;

    //下拉框
    JComboBox jcb;
    JTextField jtf;
    JButton jb;
    public static void main(String[] args) {
        FJTextArea jjTextArea = new FJTextArea();
    }

    public FJTextArea(){
        jta = new JTextArea();
        jsp = new JScrollPane(jta);

        jpl = new JPanel();
        String chatter[]={"毛泽东","邓小平"};
        jcb= new JComboBox(chatter);
        jtf = new JTextField(10);
        jb=new JButton("发送");

        //设定布局管理器
        //加入组件
        jpl.add(jcb);
        jpl.add(jtf);
        jpl.add(jb);

        //窗体添加面板组件,默认中间
        this.add(jsp);
        this.add(jpl,BorderLayout.SOUTH);

        //设置窗体属性
        this.setTitle("QQ");
        this.setIconImage(new ImageIcon("image/qq.jpeg").getImage());
        this.setSize(300,200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
    }
}
