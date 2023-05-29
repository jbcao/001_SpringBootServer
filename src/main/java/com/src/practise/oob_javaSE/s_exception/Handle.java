package com.src.practise.oob_javaSE.s_exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.Socket;

/**
 * 异常处理
 */
public class Handle {
    public static void main(String[] args) {
        /**
         * 最小异常捕获
         */
        try {
            FileReader fileReader = new FileReader("d:\\aa.txt");
        } catch (FileNotFoundException e) {
            //最小异常捕获：FileNotFoundException,认为是什么异常，就捕获什么异常，捕获到异常后，进入对应catch块里面，进行处理
            //最大异常捕获：Exception，一般使用这个，可以捕获所有异常，因为异常可能不止一个
            //出现异常要输出异常信息，易于排错
            e.printStackTrace();
        }
        /**
         * 最大异常捕获
         *
         * 推荐使用这个
         */
        try {
            FileReader fileReader = new FileReader("d:\\aa.txt");
            Socket socket = new Socket("192.168.20.12",80);
        } catch (Exception e) {
            //
            e.printStackTrace();
        }
        /**
         * 分步捕获异常
         */
        try {
            Socket socket = new Socket("192.168.20.12",80);
            FileReader fileReader = new FileReader("d:\\aa.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
            //也有下面这个方式
            /**
             * 推荐使用上面方式，可以打印出错行
             * 书上倾向于下面这种方式，可能是掩耳盗铃，看见红字就害怕
             */
            System.out.println(e.getMessage());
        }
        //
        try {
            FileReader fileReader2 = new FileReader("d:\\aa.txt");
            /**
             * 在出现异常的地方，就终止了执行
             * 然后进入到对应的catch,
             * 如果你有多个catch语句，则进入匹配异常的那个
             */
            Socket socket2 = new Socket("192.168.20.12",80);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        /**
         * 捕获异常，下面代码还得执行
         */
        System.out.println("ok");

        //2、连接一个ip的端口号
        //Socket socket = new Socket("192.168.20.12",80);





        /**
         *运行时异常
         */
        //除0
        int a=4/0;

        //数组越界异常
        int arr[]={1,2,2,2,24,55};
        //System.out.println(arr[6]);
    }
}
