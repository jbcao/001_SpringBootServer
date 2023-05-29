package com.src.practise.oob_extend;



public class Findareas{
    public static void main (String []agrs){
        Figure f= new Figure(10 , 10);
        Rectangle r= new Rectangle(9 , 5);
        Figure figref;
        figref=f;
        System.out.println("Area is :"+figref.area());
        figref=r;
        System.out.println("Area is :"+r.area());
    }
}