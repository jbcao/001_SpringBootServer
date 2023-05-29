package com.src.practise.oob_javaSE.d_process_control;

/**
 * 循环控制：就是让你的代码可以循环地执行
 * <p>
 * 分类：
 * for
 * while
 * do...while
 *
 *
 *
 */
public class LoopPyramid {
    //TODO 这里面有好几个流程图要画
    public static void main(String[] args) {
        //1->2->4->3
        //要牢牢记执行图
     /*   for (int i = 0; i < 10; i++) {
            System.out.println("刘德华");
        }*/
        //while
       /* int i = 0;
        while (i < 10) {
            System.out.println("cjb");
            i++;
        }*/

        //do...while:先执行后判断
     /*   int j=0;
        do {
            System.out.println("nnn");
            j++;
        }while (j<10);*/


        //打印金字塔，遇到复杂问题，先拆解成简单问题
        //死去活来法，打四层
        //注意：print不换行，println换行
        int lay = 10;
        //层数
        for (int i = 1; i <= lay; i++
        ) {
            //空格规律
            for (int k = 1; k <= lay - i; k++) {
                System.out.print(" ");
            }
            //*规律
            for (int j = 1; j <= (2 * i - 1); j++) {
                //第一行和最后一行
                if (i == 1 || i == lay) {
                    System.out.print("*");
                } else {
                    //第一个和最后一个*
                    if (j == 1 || j == 2 * i - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            //打出换行
            System.out.println();
        }
    }

}
