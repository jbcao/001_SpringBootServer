package com.src.practise.oob_javaSE.f_static_;

/**
 * 类方法=静态方法
 * 学生
 * 小结：
 * 1.什么时候使用类变量
 * 案例：定义学生类，统计学生一共交了多少钱
 * 用类变量，属于公共的属性
 * *
 * 2.类变量与实例变量的区别
 * 一、加上static成为类变量或静态变量，否则称为实例变量
 * 二、类变量是与类相关的，公共的属性
 * 三、实例变量属于每个对象个体的属性
 * 四、类变量可以通过类名.类变量名直接访问
 *
 * 看到了23分钟
 */

public class Student {
    int age;
    String name;
    int fee;
    static int totalFee;

    public Student(int age, String name, int fee) {
        this.age = age;
        this.name = name;
        totalFee += fee;
    }

    /**
     * 这样写的坏处
     * 1.总价不属于学生1，也不属于学生2，语义理解上有歧义
     * 2.每个对象都有这个方法信息，占用内存空间
     * 3.于是声明类方法=静态方法，这样所有对象共享一个方法，节省栈、内存的开销
     *
     * @return
     */
    public int getTotalFee() {
        return totalFee;
    }

    /**
     * java 中规则
     * 1.类变量用类方法去访问
     * 2.类方法不能访问非静态变量
     * 3.普通方法可以访问静态变量
     * 即
     * 1.普通方法既可以访问静态变量，也可以访问非静态变量
     * 2.静态方法只能访问静态变量
     *
     * @return
     */

    /**
     * 类方法使用场景
     * <p>
     * 当希望方法可以实现共享时候，可以大大提高效率
     *
     * @return
     */
    public static int getTotalFeeOfStudent() {
        return totalFee;
    }

    public static void main(String[] args) {
        Student student = new Student(27, "hh", 180);
        Student student2 = new Student(27, "hh", 180);
        System.out.println(student2.getTotalFee());
        System.out.println(Student.getTotalFeeOfStudent());
    }
}
