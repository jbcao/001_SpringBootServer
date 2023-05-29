package com.src.practise.oob_javaSE.t_swing.layout;

import javax.swing.*;
import java.awt.*;

/**
 * borderLayout演示:
 * <p>
 * 1.继承JFrame
 * 2.定义你需要的组件
 * 3.创建组件（构造函数）
 * 4.添加组件
 */
public class DemoBorderLayout extends JFrame {
    //定义组件
    JButton jButton, jButton1, jButton2, jButton3, jButton4;

    public static void main(String[] args) {
        DemoBorderLayout demoBorder = new DemoBorderLayout();
    }

    public DemoBorderLayout() throws HeadlessException {
        //创建组件
        jButton = new JButton("中部");
        jButton1 = new JButton("东部");
        jButton2 = new JButton("南部");
        jButton3 = new JButton("西部");
        jButton4 = new JButton("北部");
        //添加组件要指定位置，不然只能看见一个
        this.add(jButton, BorderLayout.CENTER);
        this.add(jButton2, BorderLayout.NORTH);
        this.add(jButton3, BorderLayout.SOUTH);
        this.add(jButton1, BorderLayout.EAST);
        this.add(jButton4, BorderLayout.WEST);
        //设置窗体属性
        this.setTitle("边界布局管案例");
        this.setSize(500, 600);
        this.setLocation(400, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置可见性,不设置的话看不见
        this.setVisible(true);
    }
}
