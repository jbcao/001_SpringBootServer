package com.src.practise.ood_design_principle.depend_inversion;

public class Inversion2 {
    public static void main(String[] args) {
       Inversion2 inversion2 = new Inversion2();
       Preson preson= inversion2.new Preson();
       preson.receive(inversion2.new Email());
       preson.receive(inversion2.new Wechat());
    }

    interface IReceiver {
        void getInfo();
    }

    class Preson {
        void receive(IReceiver iReceiver) {
            iReceiver.getInfo();
        }
    }

    class Email implements IReceiver {
        @Override
        public void getInfo() {
            System.out.println("发送邮件");
        }
    }

    class Wechat implements IReceiver {
        @Override
        public void getInfo() {
            System.out.println("发微信");
        }
    }
}
