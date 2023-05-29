package com.src.practise.oob_javaSE.s_exception;


import java.io.FileReader;

/**
 * @author caojianbang
 * @date 2021/11/8 23:20
 */
public class Throws {
    public static void main(String[] args) throws Exception {
/**谁都不管，交给虚拟机
 *
 * 不容易排错
 */
        Father father = new Father();
        father.test1();
    }
}

class Father {
    private Son son = null;

    public Father() {
        this.son = new Son();
    }
    /**
     * 抛出异常，交给调用方
     *
     * @throws Exception
     */
    public void test1() throws Exception {
        System.out.println("1");
        son.test2();
    }
}

class Son {
    /**
     * 异常不处理，抛给调用者
     *
     * @throws Exception
     */
    public void test2() throws Exception {
        FileReader fr = null;
        fr = new FileReader("d:\\aaa.txt");
    }
}