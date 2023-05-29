package com.src.practise.ood_design_principle.depend_inversion;

public class Inversion1 {
    public static void main(String[] args) {
        Inversion1 inversion1 = new Inversion1();
        Person person = inversion1.new Person();
        person.receive(inversion1.new Email());
    }

    class Email{
        String getInfo(){
            return "电子邮件信息：hello，world";
        }
    }
    class Person{
        void receive(Email email){
            System.out.println(email.getInfo());

        }
    }
}
