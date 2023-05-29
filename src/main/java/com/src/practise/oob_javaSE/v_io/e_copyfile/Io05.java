package com.src.practise.oob_javaSE.v_io.e_copyfile;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 功能:拷贝文本文件
 *
 * @author caojianbang
 * @date 28/11/2021 23:47
 */
public class Io05 {
    public static void main(String[] args) {
        FileReader fr= null;
        FileWriter fw=null;

        try {
            fr = new FileReader("/Users/apple/Desktop/Files/io-file/test1127.txt");
            fw = new FileWriter("/Users/apple/Desktop/Files/io-file/directory20211126/test1127.txt");
            int n=0;
            char buf[] = new char[1024];
            while((n=fr.read(buf))!=-1){
                String s = new String(buf,0,n);
                System.out.println(s);
                fw.write(buf,0,n);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
