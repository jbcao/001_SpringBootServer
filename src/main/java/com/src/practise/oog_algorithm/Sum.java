package com.src.practise.oog_algorithm;

/**
 * 程序运行时间计算，为了简化分析，我们进行以下的约定：
 * 1.不存在特定的时间单位
 * 2.抛弃一些前导的常数以及低阶项，
 * 3.计算的就是O的运行时间
 * <p>
 * /
 * <p>
 * / **
 * 分析程序运行时间的意义：
 * 1.大O是一个上界，需要仔细，不能低估程序的运行时间
 * 2.分析结果为程序在一定时间内运行结束提供了保障
 * 3.程序可能提前结束，但是绝对不能错后
 */


public class Sum {
    /**
     * 方法功能：i的三次方从1到n求和
     * 算法总计：6N+4
     * 时间复杂度：O(N)
     */
    public static int sum(int n) {
        int partialSum = 0;
        //占用一个时间单元
        partialSum = 0;
        /**
         * 在初始化i、测试i<=N、自增运算都有开销
         * 1.初始化是一个时间单元
         * 2.测试i<=N为N+1个时间单元
         * 3.自增运算为N个时间单元
         * 合计：2N+2
         */
        for (int i = 1; i <= n; i++) {
            /**
             * 占用四个时间单元
             * 1.两次乘法
             * 2.一次加法
             * 3.一次赋值
             * 执行N次共占用4N个时间单元
             */
            partialSum += i * i * i;
        }
        //占用一个时间单元
        return partialSum;

    }

    public static void main(String[] args) {

        System.out.println(Sum.sum(8));
    }
}
