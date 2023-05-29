package com.src.practise.oob_javaSE.o_array;

/**
 * 数组使用的必要性
 */
public class Why {
    public static void main(String[] args) {
        //定义一个可以存放6个float类型的数组
        float arr[] = new float[6];
        //给数组个各个元素赋值
        arr[0] = 1;
        arr[2] = 1;
        arr[3] = 1;
        arr[4] = 1;
        arr[5] = 1;
        arr[1] = 3.6f;
        float all = 0;
        for (int i = 0; i < 6; i++) {
            all += arr[i];
        }
        System.out.println(all);
        /**
         * 三种使用方式：
         * 1、程序员法
         * 2、没事找事法：不知道什么时候使用的时候，先声明，真正用到的时候在开辟空间
         * 3、古板法：当知道数组元素的值得时候
         */
        //程序员法
        int a[] = new int[10];
        //没事找事法
        int b[];
        int[] c;
        c=new int[52];
        //古板法
        int d[] = {10,45,48,48,4,8,5,8,5};
        /**遍历
         */
        int al=0;
        for (int i = 0; i <d.length ; i++) {
            al+=d[i];
        }
        //引用 数组名【下标】
        //如果引用越界，则编译通过，会报运行时错误
        //System.out.println(d[9]);
        System.out.println(al/d.length);




    }
}
