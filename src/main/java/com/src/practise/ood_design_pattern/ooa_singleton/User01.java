package com.src.practise.ood_design_pattern.ooa_singleton;

/**
 * 饿汉时
 * <p>
 * 类初始化时候创建对象（装载这个 class 文件，就是进行类初始化操作）
 * 天生线程安全
 * 调用效率高
 * 如果不使用对象的时候，浪费内存
 *
 * 饿汉 枚举 立即加载
 *
 * 懒汉 静态 延迟加载
 *
 * 饿立懒延
 *
 */
public class User01 {
    //永久区，GC不回收
    //组合
    //非延迟加载
    private static final User01 USER_01 = new User01();
    //要将构造函数私有化，否则其他本包，子类，其他包都可以调用
    private User01() {

    }
    public static User01 getInstance() {
        return USER_01;
    }

    //为什么线程安全
    //static 对象不能改变
    public static void main(String[] args) {
        User01 user01 = User01.getInstance();
        User01 user02 = User01.getInstance();
        System.out.println(user01 == user02);
    }
}
