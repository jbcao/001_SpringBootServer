package com.src.practise.oob_javaSE.t_swing.event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 功能；事件监听
 * 通过按钮改变面板颜色
 *
 * @author caojianbang
 * @date 19/11/2021 11:23
 */
public class Demo1 extends JFrame implements ActionListener {
    JPanel jPanel;
    JButton jButton;
    JButton jButton2;
    Cat cat;

    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
    }

    public Demo1() {
        jPanel = new JPanel();
        cat = new Cat();
        jPanel.setBackground(Color.RED);
        jButton = new JButton("黑色");
        jButton2 = new JButton("红色");
        //指定action命令
        jButton.setActionCommand("aa");
        jButton2.setActionCommand("bb");
        //注册监听
        jButton.addActionListener(this);
        jButton2.addActionListener(this);
        jButton.addActionListener(cat);
        jButton2.addActionListener(cat);
        this.add(jPanel, BorderLayout.CENTER);
        this.add(jButton, BorderLayout.NORTH);
        this.add(jButton2, BorderLayout.SOUTH);

        this.setTitle("事件监听机制");
        this.setSize(500, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase("aa")) {
            jPanel.setBackground(Color.black);
        } else if (e.getActionCommand().equalsIgnoreCase("bb")) {
            jPanel.setBackground(Color.red);
        }

    }
}

class Cat implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase("aa")) {
            System.out.println("cat black");
        } else if (e.getActionCommand().equalsIgnoreCase("bb")) {
            System.out.println("cat red");
        }
    }
}