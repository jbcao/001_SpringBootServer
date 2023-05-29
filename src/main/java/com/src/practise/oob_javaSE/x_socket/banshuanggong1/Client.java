package com.src.practise.oob_javaSE.x_socket.banshuanggong1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * 功能
 *
 * @author caojianbang
 * @date 16/12/2021 15:15
 */
public class Client {
    public static void main(String[] args) {
        Client c = new Client();
    }
    public Client() {
        try {
            Socket s = new Socket("127.0.0.1",9999);
            PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
            pw.println("你好，我是客户端");
            InputStreamReader isr = new InputStreamReader(s.getInputStream());
            BufferedReader br = new BufferedReader(isr);
            String info = br.readLine();
            System.out.println("服务器返回信息"+info);
            br.close();
            isr.close();
            pw.close();
            s.close();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
    }
}
