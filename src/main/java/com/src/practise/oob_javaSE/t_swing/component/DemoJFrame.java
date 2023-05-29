package com.src.practise.oob_javaSE.t_swing.component;

import javax.swing.*;
import java.awt.*;
//javax后面的x表示扩展的意思

/**
 * GUI界面开发演示
 * <p>
 * 这里是结构
 *
 * @author caojianbang
 * @date 2021/11/9 18:48
 */
public class DemoJFrame extends JFrame {
    /**
     * 把需要的swing组件，定义到这里
     */
    JButton jButton;

    public DemoJFrame() throws HeadlessException {
        this.jButton = new JButton("按钮");
        /**
         * Jframe是顶层容器类，
         * 容器类：可以添加其他swing组件的类
         */
        JFrame jFrame = new JFrame();
        //给窗体设置标题
        jFrame.setTitle("hello world");
        //设置大小，像素
        //像素：
        // 1、是密度单位，而不是长度单位
        // 2、一个固定长度，100像素表示100个点来表示，1000像素表示1000个点来表示
        // 3、一般来说，像素越高，表达越清晰，但也越消耗性能
        this.setSize(200, 200);
        this.add(jButton);
        //设置坐标位置
        this.setLocation(100, 200);
        //设置关闭窗口，退出jvm,不然会导致内存消耗完
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //显示
        this.setVisible(true);
    }

    public static void main(String[] args) {
        DemoJFrame demo1 = new DemoJFrame();
    }



}
