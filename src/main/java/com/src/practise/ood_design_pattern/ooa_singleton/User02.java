package com.src.practise.ood_design_pattern.ooa_singleton;

/**
 * 懒汉模式
 * <p>
 * 初始化时不创建对象
 * 真正使用的时候才创建
 * 天生线程不安全
 * 需要解决线程安全问题，所以效率比较低
 */
public class User02 {
    /**
     * 聚合
     */
    //延迟加载
    private static User02 user02;

    private User02() {

    }

    //不加同步时，多线程访问时，可能会创建多个对象，这样和单例概念相违背
    // 线程不安全，所以加同步，所以效率低，一次只有一个线程进行使用
    //这就是第三种的静态方式
    public static synchronized User02 getInstance() {
        if (user02 == null) {
            user02 = new User02();
        }
        return user02;
    }

    public static void main(String[] args) {
        User02 instance = User02.getInstance();
        User02 instance2 = User02.getInstance();
        System.out.println(instance == instance2);
    }
}
