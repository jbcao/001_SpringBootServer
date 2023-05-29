package com.src.practise.ood_design_pattern.oov_responsibility;

public abstract class Approver {
    /**
     * 名字
     */
    String name;

    public Approver(String name) {
        this.name = name;
    }

    /**
     * 下一个处理者
     */
    Approver approver;

    public abstract void processRequest(PurchaseRequest purchaseRequest);

    public Approver setName(String name) {
        this.name = name;
        return this;
    }

    public Approver setApprover(Approver approver) {
        this.approver = approver;
        return this;
    }
}
