package com.src.practise.ood_design_pattern.ooe_adaptor.objectadapter;

/**
 * @author caojianbang
 * @date 2021/9/22 16:13
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("对象适配器模式");
        Phone phone = new Phone();
        phone.charging(new VoltageAdaptor(new Voltage220V()));
    }
}
