package com.src.practise.oob_javaSE.d_process_control;

public class Loop {
    public static void main(String[] args) {
        /**
         * for
         *
         * while
         *
         * do while
         */
        for (int i = 0; i < 10; i++) {
            System.out.println("你哈，刘德华");
        }

        int i=0;
        while (i<10){
            System.out.println("hello,world");
            i++;
        }

        int i1=0;
        do {
            System.out.println("hello,world");
            i++;
        }while (i<10);
    }
}
