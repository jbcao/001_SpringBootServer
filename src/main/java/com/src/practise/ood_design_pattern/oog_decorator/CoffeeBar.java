package com.src.practise.ood_design_pattern.oog_decorator;

public class CoffeeBar {
    public static void main(String[] args) {
        //装饰者模式下订单：两份巧克力+一份牛奶的longblack
        //1.点一份longblack
        Drink order = new LongBlack();
        System.out.println("费用="+order.cost());
        System.out.println("描述="+order.getDes());

        //2.order加入一份牛奶
        order= new Milk(order);
        System.out.println("order加入一份牛奶费用="+order.cost());
        System.out.println("order加入一份牛奶描述="+order.getDes());

        //3.order加入一份巧克力
        order = new Chocolate(order);
        System.out.println("order加入一份巧克力加入一份牛奶费用="+order.cost());
        System.out.println("order加入一份巧克力加入一份牛奶描述="+order.getDes());

        //4.order加入一份巧克力
        order = new Chocolate(order);
        System.out.println("order加入一份巧克力加入一份牛奶加入一份巧克力费用="+order.cost());
        System.out.println("order加入一份巧克力加入一份牛奶加入一份巧克力描述="+order.getDes());

        Drink order2=  new Decaf();
        System.out.println("order无因咖啡费用="+order2.cost());
        System.out.println("order无因咖啡描述="+order2.getDes());

        order2=new Milk(order2);
        System.out.println("order无因咖啡+牛奶描述="+order2.getDes());
        System.out.println("order无因咖啡+牛奶费用="+order2.cost());
    }
}
