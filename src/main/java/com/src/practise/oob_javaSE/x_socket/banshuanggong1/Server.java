package com.src.practise.oob_javaSE.x_socket.banshuanggong1;

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
 * @date 16/12/2021 14:33
 */
public class Server {
    public static void main(String[] args) {
        Server s = new Server();
    }

    public Server() {
        try {
            ServerSocket ss = new ServerSocket(9999);
            Socket s = ss.accept();
            InputStreamReader isr = new InputStreamReader(s.getInputStream());
            BufferedReader bf = new BufferedReader(isr);
            String info = bf.readLine();
            System.out.println("服务器收到"+info);
            PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
            pw.println("我是服务器，收到信息");
            pw.close();
            bf.close();
            isr.close();
            s.close();
            ss.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
    }
}
