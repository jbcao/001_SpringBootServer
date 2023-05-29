package com.src.practise.ood_design_pattern.ook_jdk_proxy;

/**
 * 明星刘德华多才多艺
 */
public class LiuDeHua implements Star {
    @Override
    public String sing(String name) {
        System.err.println("刘德华执行动作：曾经年少爱追bai梦 一心只想往前飞\n" + "\n" + "行遍千山和万水 一路走du来不能回");
        return "唱完";
    }

    @Override
    public String dance(String name) {
        System.err.println("开心马骝");
        return "跳完";
    }
}
