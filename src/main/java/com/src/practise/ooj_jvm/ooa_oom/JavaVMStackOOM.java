package com.src.practise.ooj_jvm.ooa_oom;

/**
 * @author caojianbang
 * @date 2020/10/21 20:59
 */
public class JavaVMStackOOM {
    private  void  dontStop(){
        while(true){
        }
    }
    public void stackLeakByThread(){
        while(true){

            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    dontStop();
                }
            });
            thread.start();
        }
    }

    public static void main(String[] args) {
        JavaVMStackOOM javaVMStackOOM =new JavaVMStackOOM();
        javaVMStackOOM.stackLeakByThread();
    }
}

