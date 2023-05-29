package com.src.practise.oob_javaSE.t_swing.layout;

import javax.swing.*;
import java.awt.*;

/**
 * 流式布局使用案例
 *
 * @author caojianbang
 * @date 2021/11/10 23:21
 */
public class DemoFlowLayout extends JFrame {

    //定义组件
    JButton jButton1, jButton2, jButton3, jButton4, jButton5, jButton6;

    public static void main(String[] args) {
        DemoFlowLayout demoFlowLayout = new DemoFlowLayout();

    }

    public DemoFlowLayout() {
        //创建组件
        jButton1 = new JButton(" 关羽");
        jButton2 = new JButton(" 张飞");
        jButton3 = new JButton(" 赵云");
        jButton4 = new JButton(" 马超");
        jButton5 = new JButton(" 黄忠");
        jButton6 = new JButton(" 魏延");
        //添加组件
        this.add(jButton1);
        this.add(jButton2);
        this.add(jButton3);
        this.add(jButton4);
        this.add(jButton5);
        this.add(jButton6);
        //设置布局管理器
        //流式布局默认居中，也可以居左，居右
        this.setLayout(new FlowLayout(FlowLayout.RIGHT));
        //设置窗体属性
        this.setTitle("边界布局管案例");
        this.setSize(300, 100);
        this.setLocation(400, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //禁止用户缩放
        this.setResizable(false);
        //设置可见性,不设置的话看不见
        this.setVisible(true);
    }
}
