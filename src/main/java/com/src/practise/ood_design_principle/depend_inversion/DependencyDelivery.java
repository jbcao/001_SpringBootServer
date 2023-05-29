package com.src.practise.ood_design_principle.depend_inversion;

/**
 * @author caojianbang
 * @date 2021/8/30 14:24
 */

/*依赖是可以传递的，A对象依赖B对象，B对象又依赖C对象，C对象又依赖D对象......生生不息，依赖不止，
要记住一点：只要做到抽象依赖，即使多层的依赖传递也无所畏惧。*/
public class DependencyDelivery {
    public static void main(String[] args) {
        DependencyDelivery dependencyDelivery = new DependencyDelivery();
        OpenAndClose openAndClose = dependencyDelivery.new OpenAndClose();
        openAndClose.open(dependencyDelivery.new ChangHong());
        OpenAndClose2 openAndClose2 = dependencyDelivery.new OpenAndClose2(dependencyDelivery.new ChangHong());
        openAndClose2.open();
        OpenAndClose3 openAndClose3 = dependencyDelivery.new OpenAndClose3();
        openAndClose3.setTv(dependencyDelivery.new ChangHong());
        openAndClose3.open();
    }

    //构造器方式
    //在类中通过构造函数依赖对象，安装依赖注入的说法，这种方式叫做构造函数注入
    //记忆的时候，这个接口可以不要，要的话只是为了体现依赖倒置原则
    interface IOpenAndClose2 {
        void open();
    }

    class OpenAndClose2 implements IOpenAndClose2 {
        //聚合
        ITV itv;

        OpenAndClose2(ITV itv) {
            this.itv = itv;
        }

        @Override
        public void open() {
            this.itv.play();
        }
    }

    //通过setter方式传递
    //在抽象中设置Setter方法声明依赖关系，依照依赖注入的说法，这个Setter依赖注入。
    //记忆的时候，这个接口可以不要，要的话只是为了体现依赖倒置原则
    interface IOpenAndClose3 {
        void open();
    }

    class OpenAndClose3 implements IOpenAndClose3 {
        //聚合
        ITV itv;

        public void setTv(ITV tv) {
            this.itv = tv;
        }

        @Override
        public void open() {
            this.itv.play();
        }
    }

    //通过接口传递实现依赖
    //在接口的方法中声明依赖对象，该方法也叫做接口注入。
    //记忆的时候，这个接口可以不要，要的话只是为了体现依赖倒置原则
    interface IOpenAndClose {

        void open(ITV itv);
   }

    interface ITV {
        void play();
    }

    class ChangHong implements ITV {
        @Override
        public void play() {
            System.out.println("长虹电视，打开");
        }
    }

    class OpenAndClose implements IOpenAndClose {
       @Override
        public void open(ITV itv) {
            itv.play();
        }
    }


}
