package com.src.practise.oob_javaSE.v_io.d_copypicture;

import java.io.*;

/**
 * 功能:文件字节流
 *     拷贝图片
 *
 * @author caojianbang
 * @date 28/11/2021 22:52
 */
public class Io04 {
    public static void main(String[] args) {
        File f1 = new File("/Users/apple/Desktop/Files/io-file/directory20211126/视频.avi");
        File f2 = new File("/Users/apple/Desktop/Files/io-file/sp.avi");
        FileInputStream fileInputStream=null;
        FileOutputStream fileOutputStream = null;
        try {
             fileInputStream = new FileInputStream(f1);
             fileOutputStream = new FileOutputStream(f2);
            int n = 0;
            byte buf[] = new byte[1024];
            while((n=fileInputStream.read(buf))!=-1){
                fileOutputStream.write(buf);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                fileInputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }
}
