package com.src.practise.oob_javaSE.q_collection;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * @author caojianbang
 * @date 2021/11/7 22:36
 */
public class DemoHashTable {
/**
 * map； 图
 *       映射
 * hashtable用得相对比较少
 */
public static void main(String[] args) {
/**
 * hashmap   异步    不安全   效率高      key value 允许为空
 * hashtable 同步    安全     效率低      key value 不允许为空
 */

    Hashtable hashtable = new Hashtable();
    HashMap hashMap = new HashMap();
    hashMap.put(null,null);
    System.out.println(hashMap.get(null));
}
}
