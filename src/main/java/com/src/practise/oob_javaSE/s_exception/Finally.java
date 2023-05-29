package com.src.practise.oob_javaSE.s_exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author caojianbang
 * @date 2021/11/8 22:49
 */
public class Finally {
    public static void main(String[] args) {
        FileReader fr=null;
        try {
            fr= new FileReader("d:\\aa.txt");
        } catch (FileNotFoundException e) {
            /**
             * 系统异常退出，finally不执行
             */
            //System.exit(-1);
            e.printStackTrace();
        } finally {
            //不管是否发现异常，这个语句块一定会执行
            //需要关闭的资源
            //文件
            //连接
            //内存
            System.out.println("进入finally");
            if (fr!=null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("okopk");
    }
}
