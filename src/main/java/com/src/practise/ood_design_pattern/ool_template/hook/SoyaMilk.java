package com.src.practise.ood_design_pattern.ool_template.hook;

/**
 * @author caojianbang
 * @date 2021/9/18 17:15
 */
public abstract class SoyaMilk {
    /**
     * 模板方法一般做成  final，不让子类去覆盖
     */
    final void template() {
        select();
        if (hook()) {
            addCondiments();
        }
        soak();
        beat();
    }

    void select() {
        System.out.println("选择新鲜黄豆");
    }

    /**
     * 添加不同配料，抽象方法，子类具体实现
     */


    abstract void addCondiments();

    void soak() {
        System.out.println("黄豆和配料开始浸泡");
    }


    void beat() {
        System.out.println("将黄豆和配料都放到豆浆机中歌曲打磨");
    }

    boolean hook() {
        return true;
    }
}


