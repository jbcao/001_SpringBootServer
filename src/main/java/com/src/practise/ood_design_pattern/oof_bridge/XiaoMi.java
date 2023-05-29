package com.src.practise.ood_design_pattern.oof_bridge;

/**
 * @author caojianbang
 * @date 2021/9/26 17:32
 */
public class XiaoMi implements Brand{
    @Override
    public void open() {
        System.out.println("xiaomi open");
    }

    @Override
    public void close() {
        System.out.println("xiaomi close");
    }

    @Override
    public void call() {
        System.out.println("xiaomi call");
    }
}
