package com.src.practise.oob_callback;

/**
 * 3. 幼师回来了
 *
 * 发现小明完成了3位数的加法，老师觉得小明很聪明，是个可塑之才。于是又在黑板上写下了“26549 + 16487 = ”，让小明上课之前完成填空，然后又回办公室了。
 *
 * 小明看着教室外面撒欢儿的小伙伴，不禁悲从中来。再不出去玩，这个课间就要废了啊！！！！ 看着小红再一次递上来的计算器，小明心生一计：让小红代劳。
 *
 * 小明告诉小红题目是“26549 + 16487 = ”，然后指出填写结果的具体位置，然后就出去快乐的玩耍了。
 *
 * 这里，不把小红单独实现出来，而是把这个只能算加法的计算器和小红看成一个整体，一个会算结果还会填空的超级计算器。
 *
 * 这个超级计算器需要传的参数是两个加数和要填空的位置，而这些内容需要小明提前告知，也就是小明要把自己的一部分方法暴漏给小红，最简单的方法就是把自己的引用和两个加数一块告诉小红。
 *
 * 因此，超级计算器的add方法应该包含两个操作数和小明自身的引用，代码如下：
 */
public class Student2 {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name = null;

    public Student2(String name) {
        this.name = name;
    }

    private void callHelp(int a, int b) {
        new SuperCalculator().add(a, b, this);
    }

    public void fillBlank(int a, int b, int result) {

        System.out.println(name + "求助小红使用超级计算器" + a + "+" + b + "=" + result);
    }

    /**
     * 执行流程为：小明通过自身的callHelp方法调用了小红（new SuperCalculator()）的add方法，
     *
     * 在调用的时候将自身的引用（this）当做参数一并传入，小红在使用计算器得出结果之后，
     *
     * 回调了小明的fillBlank方法，将结果填在了黑板上的空格里。
     *
     * 灯灯灯！到这里，回调功能就正式登场了，小明的fillBlank方法就是我们常说的回调函数。
     *
     * 通过这种方式，可以很明显的看出，对于完成老师的填空题这个任务上，
     *
     * 小明已经不需要等待到加法做完且结果填写在黑板上才能去跟小伙伴们撒欢了，填空这个工作由超级计算器小红来做了。
     *
     * 回调的优势已经开始体现了。
     * @param args
     */
    public static void main(String[] args) {
        int a = 45666;
        int b = 45899;
        Student2 s = new Student2("小明");
        s.callHelp(a, b);
    }
}