package com.src.practise.ood_design_pattern.ooe_adaptor.classadapter;

/**
 * @author caojianbang
 * @date 2021/9/22 14:19
 */
public class VoltageAdaptor extends Voltage220V implements IVoltage5V {
    @Override
    public int output5V() {
/*获取到220V电压*/
        int src  = output220V();
        int dest=src/44;
        return dest;
    }
}
