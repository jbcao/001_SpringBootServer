package com.src.practise.ooi_name_create;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
//刷单 ，将很多条评价评价复制到每一个文件中去
public class EvaluateCopy {
    public static void main(String[] args) {
        BufferedReader br = null;

        try {
            //做缓冲字符流
            FileReader fr = new FileReader("/Users/apple/Desktop/pj.txt");
            //缓冲字符流
            br = new BufferedReader(fr);
            FileWriter fw=null;
            BufferedWriter bw = null;
            //该行评价
            String comment = "";
            Integer number = 1;
            while ((comment = br.readLine()) != null) {
                String numStr = String.valueOf(number);
                //创建文件字符流对象
                fw= new FileWriter("/Users/apple/Desktop/未命名文件夹/" + numStr + "/pj.txt");
                bw = new BufferedWriter(fw);
                bw.write(comment);
                System.out.println("复制第"+number+"个文件");
                bw.close();
                number++;
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                br.close();
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println("执行完毕");
        }
    }
}
