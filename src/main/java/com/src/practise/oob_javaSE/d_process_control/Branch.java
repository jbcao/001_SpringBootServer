package com.src.practise.oob_javaSE.d_process_control;

public class Branch {
    public static void main(String[] args) {
        /**
         * 顺序控制：从上倒下、从左到右
         *
         * 听其名而知其意，让程序可以顺序的执行。
         */
        int a = 7;
        System.out.println(a);
        System.out.println("hello");
        a++;
        System.out.println(a);
        System.out.println("0(U_U)0");
        a++;
        System.out.println(a);
/**
 * 找到一个入口执行后，就结束判断了，
 * 即使还有入口满足，也不执行了
 */
        int b = 12;
        if (b > 18) {

            System.out.println(3);
        } else if (b < 18) {
            System.out.println(4);
        } else {
            System.out.println(5);
        }
        /**
         * 根据用户输入，判断星期几
         */
        char c = 'a';
        switch (c) {
            case 'a':
                int i =1;//可以定义变量，执行
                int i1=2;
                System.out.println(i+i1);
                System.out.println("今天星期一，猴子穿新衣");
                break;//跳出switch
            case 'b':
                System.out.println("星期二");
                break;
            default://前面条件匹配不上，执行它
                System.out.println("unknown");
        }
    }
}