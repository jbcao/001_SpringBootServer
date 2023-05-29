package com.src.practise.ooj_jvm.ooa_oom;

/**
 * @author caojianbang
 * @date 2020/10/21 20:58
 */
public class JavaVMStackSOF {
    private int stackLength = 1;

    public void stackLeak() {
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) {

        JavaVMStackSOF javaVMStackSOF = new JavaVMStackSOF();
        try {
            javaVMStackSOF.stackLeak();
        } catch (Exception e) {
            System.out.println("虚拟机栈长度==============>" + javaVMStackSOF.stackLength);
            e.printStackTrace();
        }
    }
}
