package com.src.practise.oob_javaSE.x_socket.quanshuanggong;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * 功能
 *
 * @author caojianbang
 * @date 16/12/2021 17:05
 */

public class Client extends JFrame implements ActionListener {
    JTextField jtf;
    JScrollPane jsp;
    JTextArea jta;
    JButton jb;
    JPanel jp;
    InputStreamReader isr1;
    BufferedReader br1;
    PrintWriter pw;

    public static void main(String[] args) {
        Client client = new Client();
    }
    public Client() {
        jta = new JTextArea();
        jsp = new JScrollPane(jta);
        jp = new JPanel();
        jtf = new JTextField(20);
        jb = new JButton("发送");
        jb.addActionListener(this);
        jp.add(jtf);
        jp.add(jb);
        this.setLayout(new BorderLayout());
        this.add(jsp);
        this.add(jp, "South");
        this.setTitle("客户端聊天界面");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        try {
            Socket s =new Socket("127.0.0.1",9999);
            pw = new PrintWriter(s.getOutputStream(), true);
            isr1 = new InputStreamReader(s.getInputStream());
            br1 = new BufferedReader(isr1);
            while (true) {
                String info = br1.readLine();
                jta.append("服务器说：" + "\r\n"+ info +"\r\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() ==jb){
            String res = jtf.getText();
            pw.println(res);
            jta.append("客户端说："+"\r\n"+res+"" + "\r\n");
            jtf.setText("");
        }

    }
}
