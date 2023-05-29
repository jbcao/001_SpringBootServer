package com.src.practise.oob_javaSE.v_io.a_file;

import java.io.File;
import java.io.IOException;

/**
 * 功能：file基本用法
 *
 * @author caojianbang
 * @date 26/11/2021 14:43
 */
public class File01 {
    public static void main(String[] args) {
        //创建文件对象
        File file = new File("/Users/apple/Desktop/Files/io-file/file文件.rtf");
        //获取文件路径
        System.out.println("文件路径" + file.getAbsolutePath());
        //获取文件大小,字节大小
        System.out.println("文件大小" + file.length());
        //是否可读
        System.out.println("是可读" + file.canRead());
        /**
         * 创建文件
         */
        File f = new File("/Users/apple/Desktop/Files/io-file/test1126.txt");
        if (!f.exists()) {
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("已有文件，不能创建");
        }
        /**
         * 创建文件夹
         */
        File f1 = new File("/Users/apple/Desktop/Files/io-file/directory20211126");
        if (f1.isDirectory()) {
            System.out.println("文件夹已存在");
        } else {
            //创建
            f1.mkdir();
        }
        /**
         * 列出文件夹下所有文件
         *
         */
        File f2 = new File("/Users/apple/Desktop/Files/io-file/");
        if (f2.isDirectory()){
            File list[] = f2.listFiles();
            for (int i=0;i<list.length;i++){
                System.out.println(list[i].getName());
            }
         }
    }
}
