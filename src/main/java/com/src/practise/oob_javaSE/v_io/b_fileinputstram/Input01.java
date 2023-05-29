package com.src.practise.oob_javaSE.v_io.b_fileinputstram;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 功能:文件字节输入流
 * fileinputstream使用
 *
 * @author caojianbang
 * @date 26/11/2021 23:28
 */
public class Input01 {
    public static void main(String[] args) {
        File file = new File("/Users/apple/Desktop/Files/io-file/test1126.txt");
        //因为file没有读写的能力，所以需要使用input流
        FileInputStream fileInputStream = null;
        try {
            fileInputStream =new FileInputStream(file);
            byte bytes[] = new byte[1024];

            int n = 0;
            while ((n=fileInputStream.read(bytes))!=-1){
                String s = new String(bytes,0,n);
                System.out.println(s);
                System.out.println(n);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
