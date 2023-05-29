package com.src.practise.oof_concurrency.ooa_java_multi_thread_programming.chapter_1_multi_thread.ooa_process_multi_thread_summary;

/**
 * @author caojianbang
 * @date 2020/12/18 21:51
 */
public class Test {
    /*
     *进程：受操作系统管理的基本运行单元
     *
     *      运行3次main方法后，任务管理器详细信息中创建了3个javaw.exe进程
     *
     *
     */
    public static void main(String[] args) {
        for (int i=0;i<1200;i++) {
            System.out.println("你哦好曹建邦"+i);
        }
        try {
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

