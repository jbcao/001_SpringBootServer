package com.src.practise.oob_javaSE.o_array;

/**多维数组：二维
 * @author caojianbang
 * @date 2021/11/4 12:15
 */
public class TwoDimensional {
    public static void main(String[] args) {
        int a[][]=new int[4][6];
        int bp[]=new int[9];
        System.out.println(bp[8]);
        a[1][2]=1;
        a[2][1]=2;
        a[2][3]=3;
        /**
         * "\t" 空格
         *
         * print 输出
         *
         * println 输出换行
         */
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
