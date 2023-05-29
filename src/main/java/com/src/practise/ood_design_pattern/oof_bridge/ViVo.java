package com.src.practise.ood_design_pattern.oof_bridge;

/**
 * @author caojianbang
 * @date 2021/9/26 17:32
 */
public class ViVo implements Brand {
    @Override
    public void open() {
        System.out.println("vivo open");
    }

    @Override
    public void close() {
        System.out.println("vivo close");
    }

    @Override
    public void call() {
        System.out.println("vivo call");
    }
}
