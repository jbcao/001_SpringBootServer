package com.src.practise.ood_design_pattern.ool_template.hook;

/**
 * @author caojianbang
 * @date 2021/9/18 17:22
 */
public class PureSoyaMilk extends SoyaMilk {
    @Override
    void addCondiments() {
        /**
         * 这里不用事先
         */
    }

    /**
     * 重写父类钩子方法
     * @return
     */
    @Override
    boolean hook(){
        return false;
    }
}
