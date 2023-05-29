package com.src.practise.ood_design_pattern.ooa_singleton;

/**
 * @author caojianbang
 * @date 2021/9/3 23:20
 * <p>
 * 枚举方式创建单例
 */
//立即加载
public class User04 {
    public static User04 getInstance() {
        return Singleton.INSTANCE.getInstance();
    }

    private User04() {
    }

    private static enum Singleton {
        //枚举元素为单例
        //1.枚举默认是static final修饰的
        INSTANCE;
        //2.聚合
        private User04 user04;

        //3.
        private Singleton() {
            // 枚举默认是static final修饰的,这里不需要this
            user04 = new User04();
        }

        //4.就是等同于getUser04，参考com.src.practise.ood_design_pattern.singleton.UserEnum
        public User04 getInstance() {
            return user04;
        }
    }

    public static void main(String[] args) {
        User04 user04 = User04.getInstance();
        User04 user02 = User04.getInstance();
        System.out.println(user02 == user04);
    }
}
