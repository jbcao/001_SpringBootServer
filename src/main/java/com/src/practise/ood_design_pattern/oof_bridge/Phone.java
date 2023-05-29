package com.src.practise.ood_design_pattern.oof_bridge;

/**
 * @author caojianbang
 * @date 2021/9/26 17:33
 */
public abstract class Phone {
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }
    public void open(){
        this.brand.open();
    }
    public void close(){
        this.brand.close();
    }
    public void call(){
        this.brand.call();
    }
}
