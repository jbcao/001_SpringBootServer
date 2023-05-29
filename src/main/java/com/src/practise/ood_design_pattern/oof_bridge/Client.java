package com.src.practise.ood_design_pattern.oof_bridge;

/**
 * @author caojianbang
 * @date 2021/9/26 17:35
 */
public class Client {
    public static void main(String[] args) {
        /**
         * 样式+品牌
         */
        Phone phone = new FoldedPhone(new ViVo());
        phone.open();
        phone.close();
        phone.call();
    }
}
