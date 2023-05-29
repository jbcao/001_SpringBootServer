package com.src.practise.oob_javaSE.v_io.g_notepad;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

/**
 * 功能：记事本
 *
 * @author caojianbang
 * @date 30/11/2021 00:47
 */
public class NotePad extends JFrame implements ActionListener {
    JTextArea jta = null;
    JMenuBar jmb = null;
    JMenu jm = null;
    JMenuItem jm1 = null;
    JMenuItem jm2 = null;
    JMenuItem jm3 = null;

    public static void main(String[] args) {
        NotePad notePad = new NotePad();
    }

    public NotePad() {
        jta = new JTextArea();
        jmb = new JMenuBar();
        jm = new JMenu("文件（F）");
        jm.setMnemonic('F');
        jm1 = new JMenuItem("打开（O）");
        jm2 = new JMenuItem("保存（S）");
        jm3 = new JMenuItem("退出（X）");
        jm1.addActionListener(this);
        jm2.addActionListener(this);
        jm3.addActionListener(this);
        jm1.setActionCommand("open");
        jm2.setActionCommand("save");
        jm3.setActionCommand("exit");

        this.setJMenuBar(jmb);
        jmb.add(jm);
        jm.add(jm1);
        jm.add(jm2);
        jm.add(jm3);
        this.add(jta);
        this.setTitle("记事本界面与功能");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("open")) {
            JFileChooser jfc = new JFileChooser();
            jfc.setDialogTitle("请选择要打开的文件");
            jfc.showOpenDialog(null);
            jfc.setVisible(true);
            String filename = jfc.getSelectedFile().getAbsolutePath();
            FileReader fr = null;
            BufferedReader br = null;

            try {
                fr = new FileReader(filename);
                br = new BufferedReader(fr);
                String s = "";
                String allCon = "";
                while ((s = br.readLine()) != null) {
                    //两种方式随便选
                    //allCon += s + "\r\n";
                    jta.setText(s+"\r\n");

                }
                //jta.setText(allCon);

            } catch (Exception e1) {

            } finally {
                try {
                    fr.close();
                    br.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }

            }


        } else if (e.getActionCommand().equals("save")) {
            JFileChooser jfc = new JFileChooser();
            jfc.setDialogTitle("将文件保存到");
            jfc.showSaveDialog(null);
            jfc.setVisible(true);
            String filename = jfc.getSelectedFile().getAbsolutePath();
            FileWriter fw = null;
            BufferedWriter bw = null;

            try {
                fw = new FileWriter(filename);
                bw = new BufferedWriter(fw);
                bw.write(jta.getText());

            } catch (Exception e1) {

            } finally {
                try {
                    bw.close();
                    fw.close();

                } catch (IOException e1) {
                    e1.printStackTrace();
                }

            }


        } else if (e.getActionCommand().equals("exit")) {
            System.exit(0);

        }
    }
}
