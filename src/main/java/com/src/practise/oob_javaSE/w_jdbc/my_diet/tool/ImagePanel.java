package com.src.practise.oob_javaSE.w_jdbc.my_diet.tool;

import javax.swing.*;
import java.awt.*;

/**
 * 功能
 *
 * @author caojianbang
 * @date 13/12/2021 15:48
 */
public class ImagePanel extends JPanel {
Image image;
    public ImagePanel(Image image) {
        this.image = image;
        int w=Toolkit.getDefaultToolkit().getScreenSize().width;
        int h=Toolkit.getDefaultToolkit().getScreenSize().height;
        this.setSize(w,h);
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(image,0,0,this.getWidth(),this.getHeight(),this);
    }
}
