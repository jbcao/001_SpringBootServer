package com.src.practise.oob_abstract_class;



class Teacher extends People {
    // 必须实现该方法
    public void work() {
        System.out.println("我的名字叫" + this.getName() + "，我正在讲课，请大家不要东张西望…");
    }
}