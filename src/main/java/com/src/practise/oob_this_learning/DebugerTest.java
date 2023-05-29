package com.src.practise.oob_this_learning;
public class DebugerTest {

    public static void main(String[] args) {
        UserExample samp1 = new UserExample("amy");
        System.out.println("who are u? ");
        System.out.println(samp1.whoAreU());
        System.out.println("intro yourself?");
        System.out.println(samp1.introYourself());
    }

}

class UserExample {

    private String name;

    private Integer age;

    private MyDoll myDoll;

    public UserExample() {
        this(null);
    }

    // 3. 调用本类的其他构造方法
    public UserExample(String name) {
        this(name, -1);
    }

    public UserExample(String name, Integer age) {
        this.name = name;
        this.age = age;
        this.myDoll = new MyDoll("prize");
    }

    // 2. 调用本类属性
    public void changeMyName(String name) {
        this.name = name;
    }

    public void changeMyAge(Integer age) {
        this.age = age;
    }

    public String whoAreU() {
        return "I am " + name + ". ";
    }

    public String haoOldAreU() {
        return "i am " + age + " old.";
    }

    // 1. 调用本类方法
    public String introYourself() {
        return this.whoAreU() +
                this.haoOldAreU() +
                "\r\n whoAmI@ " + this.myDoll.whoAmI() +
                "\r\n whoAreSuper@ " + this.myDoll.whoAreSuper();
    }

    class MyDoll {

        private String name;

        public MyDoll(String name) {
            this.name = name;
        }

        public void changeMyName(String name) {
            this.name = name;
        }

        // 5. 隐藏式的调用
        public String whoAmI() {
            return whoAreU();
        }

        public String whoAreU() {
            return "I am a Doll, my name is " + name + ". ";
        }

        // 4. 调用父类的或指定的其他的类的同名方法
        public String whoAreSuper() {
            return "super is " + UserExample.this.whoAreU() + ". ";
        }

    }
}