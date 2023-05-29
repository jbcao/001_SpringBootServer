package com.src.practise.oob_javaSE.t_swing.component;

import javax.swing.*;
import java.awt.*;

/**
 * 页签组件
 */
public class GJTabbedPane extends JFrame {
    //定义北部
    //标签
    JLabel jl1;

    //南部
    //按钮：登录、取消、注册向导
    JButton jb1,jb2,jb3;
    JPanel jpl;

    //窗体中部
    //页签窗格
    JTabbedPane jtp;
    JPanel jp2,jp3,jp4;//面板组件

    //qq号码、qq密码、忘记密码、申请密码保护
    JLabel jl2,jl3,jl4,jl5;
    JTextField jtf;//qq号码文本框
    JPasswordField jpf;//密码框
    JButton jb4;//清除号码按钮
    JCheckBox jcb1,jcb2;//隐身 记住密码复选框

    //Jpanel组件
    JLabel jl6,jl7;//
    JTextField jtf1;
    JPasswordField jpf1;

    //Jpanel3组件
    JLabel jl8,jl9;//标签
    JTextField jtf2;
    JPasswordField jpf2;


    public static void main(String[] args) {
        GJTabbedPane gjTabbedPane = new GJTabbedPane();
    }

    public GJTabbedPane() {
        //创建北部组件
        jl1 = new JLabel(new ImageIcon("image/qqd.jpg"));

        //创建JFrame中部JPanel2组件
        jl2 = new JLabel("QQ号码",JLabel.CENTER);
        jl3 = new JLabel("QQ密码",JLabel.CENTER);
        jl4 = new JLabel("忘记密码",JLabel.CENTER);

        jl4.setFont(new Font("宋体", Font.PLAIN,16));//设置字体，字号
        jl4.setForeground(Color.BLUE);//设置字体颜色

        jl5 = new JLabel("<html><a href='www.qq.com'>申请密码保护</a></html>");
        jl5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));//鼠标移动到标签上会变成手指图标

        //号码文本框组件 密码框组件
        jtf = new JTextField();
        jpf = new JPasswordField();
        jb4 = new JButton("清除号码");//JButton上可以放图片：new JButton(new ImageIcon("图片路径"))；

        jcb1 = new JCheckBox("隐身登录");
        jcb2 = new JCheckBox("记住密码");

        jtp = new JTabbedPane();//页签组件

        jp2= new JPanel();
        jp2.setLayout(new GridLayout(3,3));
        jp3= new JPanel();
        jp3.setLayout(new GridLayout(3,3));
        jp3.setBackground(Color.RED);//给面板设置背景色
        jp4= new JPanel();
        jp4.setBackground(new Color(0,0,255));
        jp4.setLayout(new GridLayout(3,3));

        //创建JFrame中部JTabbedPane选项卡JPanel3组件
        jl6=new JLabel("手机号码",JLabel.CENTER);
        jl7=new JLabel("密　　码",JLabel.CENTER);
        jtf1=new JTextField(20);
        jpf1=new JPasswordField(20);

        //创建JFrame中部JTabbedPane选项卡JPanel4组件
        jl8=new JLabel("电子邮箱",JLabel.CENTER);
        jl9=new JLabel("密　　码",JLabel.CENTER);
        jtf2=new JTextField(20);
        jpf2=new JPasswordField(20);

        //创建中部JTabbedPane选项卡JPanel4组件
        jl6 = new JLabel("手机号码",JLabel.CENTER);
        jl7 = new JLabel("密    码",JLabel.CENTER);
        jtf1 = new JTextField(20);
        jpf2 = new JPasswordField(20);

        //创建JFrame南部JPanel组件
        jpl= new JPanel();
        jb1 = new JButton("登录");
        jb2 = new JButton("取消");
        jb3 = new JButton("注册向导");

        //设置布局管理器
        jp2.setLayout(new GridLayout(3,3));


        //加入组件
        //将组件加入到JPanel2中
        jp2.add(jl2);//加入QQ号码标签
        jp2.add(jtf);//加入文本框
        jp2.add(jb4);//清除号码按钮

        jp2.add(jl3);//qq密码标签
        jp2.add(jpf);//QQ密码框
        jp2.add(jl4);//忘记密码标签

        jp2.add(jcb1);//隐身登录复选框
        jp2.add(jcb2);//记住密码复选框
        jp2.add(jl5);//申请密码保护标签


        //将组件添加到JPanel3中
        jp3.add(jl6);
        jp3.add(jtf1);
        jp3.add(jl7);
        jp3.add(jpf1);

        //将组件添加到JPanel4中
        jp4.add(jl8);
        jp4.add(jtf2);
        jp4.add(jl9);
        jp4.add(jpf2);

        //将单选按钮添加到jPanel面板组件中
        jpl.add(jb1);//登录
        jpl.add(jb2);//取消
        jpl.add(jb3);//注册向导


        //页签组件添加面板组件
        jtp.add("QQ号码",jp2);//
        jtp.add("手机号码",jp3);//
        jtp.add("电子邮箱",jp4);//

        //在窗体北部上添加Jlabel1标签
        this.add(jl1,BorderLayout.NORTH);
        //将页签组件添加到Frame中部
        this.add(jtp,BorderLayout.CENTER);
        //窗体南部添加面板组件
        this.add(jpl,BorderLayout.SOUTH);

        //设置窗体属性
        this.setTitle("QQ登录界面");
        this.setIconImage(new ImageIcon("image/qq.jpeg").getImage());
        this.setSize(350,300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);

    }
}
