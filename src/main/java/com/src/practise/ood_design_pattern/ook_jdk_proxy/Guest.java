package com.src.practise.ood_design_pattern.ook_jdk_proxy;

public class Guest {
    public static void main(String[] args) {

        StarProxy proxy = new StarProxy();
        //new对象快捷键 CTRL+ALT+空格
        Star ldh = (Star) proxy.bind(new LiuDeHua());
        ldh.sing("ldh");

//        proxy.setTarget(ldh);
//        Object object = proxy.bind(new );
//        Star star = (Star) object;
//        star.sing("ldh");
//        star.dance("ldh");
    }
}

