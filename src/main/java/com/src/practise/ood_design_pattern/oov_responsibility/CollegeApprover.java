package com.src.practise.ood_design_pattern.oov_responsibility;

public class CollegeApprover extends Approver {
    public CollegeApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() >  5000 && purchaseRequest.getPrice() <= 10000) {
            System.out.println("请求编号=" + purchaseRequest + "被" + this.name + "处理");
        } else {
            approver.processRequest(purchaseRequest);
        }
    }
}


