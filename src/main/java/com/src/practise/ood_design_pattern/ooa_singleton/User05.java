package com.src.practise.ood_design_pattern.ooa_singleton;

/**
 * @author caojianbang
 * @date 2021/9/4 14:34
 * <p>
 * 双重检验锁方式创建单例
 */

public class User05 {
    //volatile可以保证可见性、禁止指令重排序
    private static volatile User05 user05;

    public static User05 getInstance() {
        if (user05 == null) {
            //static的所以不用给this加锁，而是给当前类.class文件加锁
            synchronized (User05.class) {
                //假设有两个线程A B，A获得锁后，B只能在锁外面，但应景通过了第一次判断
                //当A执行完释放锁后，B进去获得锁要重新判断，直接获取A创建对象的引用
                if (user05 == null) {
                    //static的成员就不用this了
                    //记住：多线程情况下可能重排序，单线程不会
                    user05 = new User05();
                }
            }
        }
        return user05;
    }

    public static void main(String[] args) {
        User05 instance = User05.getInstance();
        User05 instance2 = User05.getInstance();
        System.out.println(instance == instance2);

    }
}
