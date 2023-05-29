package com.src.practise.ood_design_pattern.ooa_singleton;

/**
 * @author caojianbang
 * @date 2021/9/4 16:40
 */
// 静态内部类方式，延迟加载
public class User03 {
    private User03() {
        System.out.println("初始化..");
    }

    public static class SingletonClassInstance {
        private static final User03 singletonDemo03 = new User03();
    }

    // 方法没有同步
    public static User03 getInstance() {
        System.out.println("getInstance");
        return SingletonClassInstance.singletonDemo03;
    }

    public static void main(String[] args) {
        User03 s1 = User03.getInstance();
        User03 s2 = User03.getInstance();
        System.out.println(s1 == s2);
    }
}
