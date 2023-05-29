package com.src.practise.oob_javaSE.a_c;

/**
 * @author caojianbang
 * @date 2021/7/25 13:47
 */
public class ShowStudy {
    public  boolean test(){
        boolean a = false;
        int b= 100;
        if (b==100){
            return true;
        }
        System.out.println("程序结束了吗");
        return a;
    }
    public static void main(String[] args) {
        ShowStudy s = new ShowStudy();
        System.out.println(s.test());//true
    }
}
