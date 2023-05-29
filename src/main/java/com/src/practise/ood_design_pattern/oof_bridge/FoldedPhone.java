package com.src.practise.ood_design_pattern.oof_bridge;

/**
 * @author caojianbang
 * @date 2021/9/26 17:34
 */
public class FoldedPhone extends Phone {
    /*constructor*/
    public FoldedPhone(Brand brand) {
        super(brand);
    }
    @Override
    public void open(){
        System.out.println("folded phone");
        super.open();
    }
    @Override
    public void close(){
        System.out.println("folded phone");
        super.close();
    }
    @Override
    public void call(){
        System.out.println("folded phone");
        super.call();
    }
}
