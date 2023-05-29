package com.src.practise.ood_design_pattern.ooe_adaptor.objectadapter;

/**
 * @author caojianbang
 * @date 2021/9/22 14:08
 */
public class Voltage220V {
    /*输出220V电压*/
    public int output220V(){
        int src = 220;
        System.out.println("电压="+src+"伏特");
        return src;
    }
}
