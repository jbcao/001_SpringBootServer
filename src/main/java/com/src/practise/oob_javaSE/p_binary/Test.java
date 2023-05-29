package com.src.practise.oob_javaSE.p_binary;

/**
 * 位运算和位移运算
 * @author caojianbang
 * @date 2021/11/4 17:11
 *
 *         ~2=?	  //-3
 *         2&3=?   //2
 *         2|3=?   //3
 *         ~-5=?   //4
 *         13&7=?  //5
 *         5|4=?   //5
 *         -3^3=?  //-2
 *
 *
 *  int a=1>>2;//算数右移
 * 	int b=-1>>2;
 * 	int c=1<<2; //算数左移
 * 	int d=-1<<2;
 * 	int e=3>>>2;//逻辑右移
 * 	//a,b,c,d,e结果是多少
 * 	System.out.println("a="+a);//a=0
 * 	System.out.println("b="+b);//b=-1
 * 	System.out.println("c="+c);//c=4
 * 	System.out.println("d="+d);//d=-4
 * 	System.out.println("e="+e);//e=0
 */
public class Test {
    public static void main(String[] args) {
        /**位与：两位全为1，结果为1
         *
         * 2补码	0	0	…	0	0	0	0	1	0
         * 3补码	0	0	…	0	0	0	0	1	1
         * 结果为2	0	0	…	0	0	0	0	1	0
         */
        System.out.println(2&3);
/**位取反：
 *
 * 补码	            0	…	0	1	0
 * 取反	            1	…	1	0	1
 * 是负数，反码为	1	…	1	0	0
 * 原码结果-3	    1	…	0	1	1
 */
        System.out.println(~2);

    }
}
