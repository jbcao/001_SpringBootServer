package com.src.practise.oob_callback;

/**
 * 第4章. 门口的婆婆
 * <p>
 * 幼稚园的门口有一个头发花白的老婆婆，每天风雨无阻在那里摆着地摊卖一些快过期的垃圾食品。由于年纪大了，脑子有些糊涂，经常算不清楚自己挣了多少钱。有一天，她无意间听到了小明跟小伙伴们吹嘘自己如何在小红的帮助下与幼师斗智斗勇。于是，婆婆决定找到小红牌超级计算器来做自己的小帮手，并提供一包卫龙辣条作为报酬。小红经不住诱惑，答应了。
 * <p>
 * 回看一下上一章的代码，我们发现小红牌超级计算器的add方法需要的参数是两个整型变量和一个Student对象，但是老婆婆她不是学生，是个小商贩啊，这里肯定要做修改。这种情况下，我们很自然的会想到继承和多态。如果让小明这个学生和老婆婆这个小商贩从一个父类进行继承，那么我们只需要给小红牌超级计算器传入一个父类的引用就可以啦。
 * <p>
 * 不过，实际使用中，考虑到java的单继承，以及不希望把自身太多东西暴漏给别人，这里使用从接口继承的方式配合内部类来做。
 * <p>
 * 换句话说，小红希望以后继续向班里的小朋友们提供计算服务，同时还能向老婆婆提供算账服务，甚至以后能够拓展其他人的业务，于是她向所有的顾客约定了一个办法，用于统一的处理，也就是自己需要的操作数和做完计算之后应该怎么做。这个统一的方法，小红做成了一个接口，提供给了大家，代码如下：
 */

/**
 * 小明和老婆婆拿到这个接口之后，只要实现了这个接口，就相当于按照统一的模式告诉小红得到结果之后的处理办法，按照之前说的使用内部类来做，代码如下：
 */
public class Student3 {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name = null;

    public Student3(String name) {
        this.name = name;
    }

    public class doHomework implements DoJob {
        @Override
        public void fillBlank(int a, int b, int result) {
            System.out.println(name + "求助小红计算:" + a + " + " + b + " = " + result);
        }
    }

    private void callHelp(int a, int b) {
        new SuperCalculator2().add(a, b, new doHomework());
    }

    /**
     * 可以很明显的看到，小红已经把这件事情当做一个事业来做了，看她给接口命的名字doJob就知道了。
     *
     * 有人也许会问，为什么老婆婆摆摊能挣那么多钱？ 你的关注点有问题好吗！！这里聊的是回调机制啊！！
     *
     * 我只知道，后来小红的业务不断扩大，终于在幼稚园毕业之前，用挣到的钱买了人生的第一套房子。
     *
     * 完！！！
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        int a = 45666;
        int b = 45899;
        Student3 s = new Student3("小明");
        s.callHelp(a, b);
    }
}
