package com.src.practise.ood_design_pattern.oov_responsibility;

/**
 * 请求类
 */
public class PurchaseRequest {
    //请求类型
    private int type = 0;
    //请求金额
    private float price =0.0f;
    //请求id
    private int id = 0;

    public PurchaseRequest(int type, float price, int id) {
        this.type = type;
        this.price = price;
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public float getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }
}
