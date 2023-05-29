package com.src.practise.oob_javaSE.t_swing.layout;

import javax.swing.*;
import java.awt.*;

/**
 * 网格布局
 *
 * @author caojianbang
 * @date 2021/11/11 13:24
 */
public class DemoGridLayout extends JFrame {
    int size = 9;
    JButton jbs[] = new JButton[size];

    public static void main(String[] args) {
        DemoGridLayout demoGridLayout = new DemoGridLayout();
    }

    //构造
    public DemoGridLayout() {
        //创建组件
        for (int i = 0; i < size; i++) {
            jbs[i] = new JButton(String.valueOf(i));
        }
        //添加组件
        for (int i = 0; i < size; i++) {
            this.add(jbs[i]);
        }
        //设置网格布局管理器
        //3行3列，行间距，列间距
        this.setLayout(new GridLayout(3, 3, 5, 5));

        //设置窗体属性
        this.setTitle("网格布局演示");
        this.setSize(300, 200);
        this.setLocation(200, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }
}
