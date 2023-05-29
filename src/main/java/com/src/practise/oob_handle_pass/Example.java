package com.src.practise.oob_handle_pass;

/**
 * 值传递
 */
public class Example {
    String str = new String("hello");

    //char[]ch={'a','b'};
    public static void main(String args[]) {
        Example ex = new Example();
        //ex.change(ex.str,ex.ch);
        //ex.change();
        ex.change(ex.str);
        System.out.print(ex.str + " and ");//hello
        //System.out.print(ex.ch);
    }

    //public void change(String str,char ch[]){
    public void change(String str) {
        //public void change(){
        System.out.println("局部变量参数值（局部值等于全局值）" + str);//hello
        str = "test ok";
        System.out.println("局部变量参数值2（变了）" + str);//test ok
        System.out.println("全局参数（没变）" + this.str);//hello
        //ch[0]='c';
    }
}

