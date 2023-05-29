package com.src.practise.ooj_jvm.ooa_oom;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caojianbang
 * @date 2020/10/21 21:00
 */
public class RuntimeConstantPoolOOM {
    public static void main(String[] args) {
        List<String> stringList =new ArrayList<String>();
        int i =0;
        while(true){
            stringList.add(String.valueOf(i++).intern());
        }
    }
}
