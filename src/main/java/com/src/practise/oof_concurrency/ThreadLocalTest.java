package com.src.practise.oof_concurrency;

import java.util.ArrayList;
import java.util.List;

public class ThreadLocalTest {

   private static ThreadLocal<List<String>> threadLocal = new ThreadLocal<>();
    
   public void setThreadLocal(List<String> value) {

          threadLocal.set(value);
   }

   public void getThreadLocal() {

          threadLocal.get().forEach(name -> System.out.println(Thread.currentThread().getName()+"###" + name ));  
   }


   public static void main(String[] args) {

            final ThreadLocalTest test = new ThreadLocalTest();
            
            new Thread(new Runnable() {
           @Override
           public void run() {
               List<String> strs = new ArrayList<String>();
               strs.add("1");
               strs.add("2");
               strs.add("3");
               test.setThreadLocal(strs);
               test.getThreadLocal(); }
       },"t1").start();
            
       new Thread(new Runnable() {
           
           @Override
           public void run() {
               List<String> strs = new ArrayList<String>();
               strs.add("a");
               strs.add("b");
               test.setThreadLocal(strs);
               test.getThreadLocal();
           }
       },"t2").start();
   }

}