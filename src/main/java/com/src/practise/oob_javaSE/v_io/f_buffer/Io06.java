package com.src.practise.oob_javaSE.v_io.f_buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * 功能:缓冲字符流
 *
 * @author caojianbang
 * @date 29/11/2021 15:22
 */
public class Io06 {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            FileReader fr = new FileReader("/Users/apple/Desktop/Files/io-file/directory20211126/test1127.txt");
            FileWriter fw = new FileWriter("/Users/apple/Desktop/Files/io-file/test1127.txt");
            br = new BufferedReader(fr);
            bw = new BufferedWriter(fw);
            String s = "";
            while ((s=br.readLine()) != null) {
             bw.write(s+"\r\n");

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                br.close();
                bw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }
}
