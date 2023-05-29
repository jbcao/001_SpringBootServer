package com.src.practise.oob_javaSE.t_swing.component;

import javax.swing.*;
import java.awt.*;

/**
 * 面板组件使用
 */
public class APanel extends JFrame {
    JPanel jPanel, jPane2;
    JButton jButton1, jButton2, jButton3, jButton4, jButton5, jButton6;

    public static void main(String[] args) {
        APanel demoPanel = new APanel();
    }

    public APanel() {
        //创建组件
        jPanel = new JPanel();
        jPane2 = new JPanel();
        jButton1 = new JButton("西瓜");
        jButton2 = new JButton("西瓜2");
        jButton3 = new JButton("西瓜3");
        jButton4 = new JButton("西瓜4");
        jButton5 = new JButton("西瓜5");
        jButton6 = new JButton("西瓜6");
        //面板组件加入按钮组件
        jPanel.add(jButton1);
        jPanel.add(jButton2);
        jPane2.add(jButton3);
        jPane2.add(jButton4);
        jPane2.add(jButton5);
        //将panel加入到JFrame中，采用边界布局
        this.add(jPanel, BorderLayout.NORTH);
        this.add(jPane2, BorderLayout.SOUTH);
        this.add(jButton6, BorderLayout.CENTER);
        //设置窗体
        this.setSize(300, 200);
        this.setLocation(300, 200);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
