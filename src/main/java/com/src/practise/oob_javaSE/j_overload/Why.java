package com.src.practise.oob_javaSE.j_overload;

/**
 * 1.概念：
 * 方法重载时类的同一种功能的多种实现方式，
 * 到底采用哪种方式，取决于调用者给出的参数。
 *
 * 提出问题 解决问题 深入思考 结论
 *
 * 2.注意事项：（经典考题）
 * 4、方法的修饰符可以不同(只是控制访问修饰符不同，不能构成重载)
 * 3、方法返回类型可以不同(只是返回类型不一样，不能构成重载)
 * 1、方法名相同
 * 2、方法的参数类型，顺序,个数，至少有一项不同（只是形参不一样，不能构成重载 ）
 */
public class Why {
    public static void main(String[] args) {
Ab1 ab1 = new Ab1();
        ab1.getMax(23,34);
    }
}
class Ab1{
    public int getMax(int a,int b){
        if (a>b){
            return a;
        }else {
            return b;
        }
    }
    public float getMax(float a,float b){
        if (a>b){
            return a;
        }else {
            return b;
        }
    }
}