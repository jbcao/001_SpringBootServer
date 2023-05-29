package com.src.practise.oob_javaSE.x_socket.banshuanggong2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 功能
 *
 * @author caojianbang
 * @date 16/12/2021 15:56
 */
public class Server {
    public static void main(String[] args) {
        Server server = new Server();
    }
    InputStreamReader isr1,isr2;
    BufferedReader br1,br2;
    PrintWriter pw;
    public Server() {
        try {
            ServerSocket ss = new ServerSocket(9999);
            Socket s = ss.accept();
            isr1 = new InputStreamReader(s.getInputStream());
            isr2 = new InputStreamReader(System.in);
            br1 = new BufferedReader(isr1);
            br2 = new BufferedReader(isr2);
            pw =new PrintWriter(s.getOutputStream(),true);
            while(true)
            {
            String info = br1.readLine();
                System.out.println("客户端说"+info);
                System.out.println("请输入回复的内容：");
                String response = br2.readLine();
                pw.println(response);
            }
        } catch (IOException e) {
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
