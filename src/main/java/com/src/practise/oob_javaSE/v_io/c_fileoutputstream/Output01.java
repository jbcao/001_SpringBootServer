package com.src.practise.oob_javaSE.v_io.c_fileoutputstream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 功能:字节输出流
 *
 * @author caojianbang
 * @date 27/11/2021 01:34
 */
public class Output01 {
    public static void main(String[] args) {
        File file = new File("/Users/apple/Desktop/Files/io-file/test1127.txt");
        FileOutputStream fileOutputStream = null;
        if (file.exists()) {
            System.out.println("文件已存在");
        } else {
            try {
                fileOutputStream = new FileOutputStream(file);
                String a = "hello\r\n";
                String b = "jjj";
                fileOutputStream.write(a.getBytes());
                fileOutputStream.write(b.getBytes());
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
