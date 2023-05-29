package com.src.practise.ood_design_pattern.ooe_adaptor.objectadapter;

/**
 * @author caojianbang
 * @date 2021/9/22 14:22
 */
public class Phone {
    /*充电*/
    public void charging(IVoltage5V iVoltage5V){
        if (iVoltage5V.output5V()==5){
            System.out.println("电压5V,可以充电");
        }else if(iVoltage5V.output5V()>5){
            System.out.println("电压大于五伏特，不能充电");
        }
    }
}
