package com.src.practise.oob_javaSE.w_jdbc.my_diet.view;

import com.src.practise.oob_javaSE.w_jdbc.my_diet.model.UserModel;
import com.src.practise.oob_javaSE.w_jdbc.my_diet.tool.MyTool;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;


/**
 * 功能
 *
 * @author caojianbang
 * @date 12/12/2021 19:45
 */
public class UserLogin extends JDialog implements ActionListener {
    JLabel jl1, jl2;
    JTextField jtf;
    JPasswordField jpf;
    JButton jb1, jb2;

    public static void main(String[] args) {
        UserLogin userLogin = new UserLogin();
    }

    public UserLogin() {
        Container ct = this.getContentPane();
        this.setLayout(null);
        jl1 = new JLabel("用户名/工号：");
        jl1.setBounds(60, 190, 150, 30);
        jl1.setFont(MyTool.f1);
        ct.add(jl1);
        jtf = new JTextField(20);
        jtf.setFocusable(true);
        jtf.setBounds(180, 190, 120, 30);
        jtf.setBorder(BorderFactory.createLoweredBevelBorder());
        ct.add(jtf);

        jl2 = new JLabel("密码：");
        jl2.setBounds(60, 240, 150, 30);
        jl2.setFont(MyTool.f1);
        ct.add(jl2);

        jpf = new JPasswordField(20);
        jpf.setBounds(180, 240, 120, 30);
        jpf.setBorder(BorderFactory.createLoweredBevelBorder());
        ct.add(jpf);


        jb1 = new JButton("确定");
        jb1.setBounds(90, 300, 70, 30);
        jb1.setFont(MyTool.f2);
        ct.add(jb1);
        jb2 = new JButton("取消");
        jb2.setBounds(210, 300, 70, 30);
        jb2.setFont(MyTool.f2);
        ct.add(jb2);
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        BackImage bi = new BackImage();
        bi.setBounds(0, 0, 360, 360);
        ct.add(bi);
        this.setUndecorated(true);
        this.setSize(360, 360);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==jb1){
            String u =this.jtf.getText().trim();
            String p =new String(this.jpf.getPassword());
            UserModel um = new UserModel();
            String position = um.checkUser(u,p);
            if(position.equals("system")){
                new Windows();
                this.dispose();
            }else {
                JOptionPane.showMessageDialog(this,"无权登陆，或用户名密码错误","登陆提示",JOptionPane.ERROR_MESSAGE);
                return;
            }

        }else if(e.getSource()==jb2){

            this.dispose();
            System.exit(0);
        }
    }

    class BackImage extends JPanel {
        Image im;

        public BackImage() {
            try {
                im = ImageIO.read(new File("image/login.jpg"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void paintComponent(Graphics g) {
            g.drawImage(im, 0, 0, 360, 360, this);
        }
    }
}
