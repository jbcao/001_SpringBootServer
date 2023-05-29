package com.src.practise.oob_javaSE.x_socket.banshuanggong2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * 功能
 *
 * @author caojianbang
 * @date 16/12/2021 15:56
 */
public class Client {
    public static void main(String[] args) {
        Client client = new Client();
    }
    InputStreamReader isr1,isr2;
    BufferedReader br1,br2;
    PrintWriter pw;
    public Client() {
        try {
            Socket s =  new Socket("127.0.0.1",9999);
            pw = new PrintWriter(s.getOutputStream(),true);
            isr1 = new InputStreamReader(System.in);
            br1 =new BufferedReader(isr1);

            isr2 = new InputStreamReader(s.getInputStream());
            br2 = new BufferedReader(isr2);
            while(true){
                System.out.println("请输入发送给父服务器的内容");
                pw.println(br1.readLine());
                String info =br2.readLine();
                System.out.println("服务器回复内容："+info);

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                pw.close();
                br2.close();
                br1.close();
                isr2.close();
                isr1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
