package com.src.practise.oob_this_learning;

/**this 使用
 * @author caojianbang
 * @date 2021/9/28 21:33
 */
public class Person {

        public int age;
        public String name;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public void showInfo() {
            System.out.println("人名是" + this.name);
        }
    }

