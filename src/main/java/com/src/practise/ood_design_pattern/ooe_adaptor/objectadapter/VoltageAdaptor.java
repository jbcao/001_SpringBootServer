package com.src.practise.ood_design_pattern.ooe_adaptor.objectadapter;

/**
 * @author caojianbang
 * @date 2021/9/22 14:19
 */
public class VoltageAdaptor implements IVoltage5V {
    //聚合
    private Voltage220V output220V;

    public VoltageAdaptor(Voltage220V output220V) {
        this.output220V = output220V;
    }

    @Override
    public int output5V() {
        int dst=0;
        if (null!=output220V){
            /*获取到220V电压*/
            int src = output220V.output220V();
            dst = src / 44;
        }
        return dst;
    }
}
