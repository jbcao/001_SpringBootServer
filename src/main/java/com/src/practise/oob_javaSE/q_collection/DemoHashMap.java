package com.src.practise.oob_javaSE.q_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;


public class DemoHashMap {
    public static void main(String[] args) {
        //注意包不要引用错误
        List list = new ArrayList();


        HashMap hashMap = new HashMap();
        Emp emp = new Emp("22", "a宋江", 3000.5f);
        Emp emp2 = new Emp("23", "b吴用", 3000.5f);
        Emp emp3 = new Emp("23", "c卢俊义  ", 3000.5f);
        //将emp放入hashMap
        hashMap.put("001", emp);
        hashMap.put("002", emp2);
        //这里会进行修改
        hashMap.put("002", emp3);
        //查找
        if (hashMap.containsKey("001")) {
            System.out.println("有");
            //取出
            Emp emp1 = (Emp) hashMap.get("001");
            System.out.println(emp1.getName());
        } else {
            System.out.println("没有");
        }
        //遍历hashmap中所有的key和value
        //Iterator迭代
        //遍历的结果是无序的
        Iterator iterator = hashMap.keySet().iterator();
        while (iterator.hasNext()) {
            //取出key,返回的是object对象，需要转一下
            String key = iterator.next().toString();
            //通过key取出value,返回的是object对象，需要转一下
            Emp emp1 = (Emp) hashMap.get(key);
            System.out.println(emp1.getName());
        }
    }
}
