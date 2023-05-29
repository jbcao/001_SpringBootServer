package com.src.practise.oob_javaSE.s_exception;

/**
 * 异常类型
 */
public class Demo {
    public static void main(String[] args) {
        /**
         * 检查性异常
         */
        //1、打开不存在的文件
        //FileReader fileReader = new FileReader("d:\\aa.txt");
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
