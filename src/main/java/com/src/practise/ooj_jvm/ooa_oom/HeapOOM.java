package com.src.practise.ooj_jvm.ooa_oom;

import java.util.ArrayList;
import java.util.List;

/**
 * java堆溢出
 * @author caojianbang
 * @date 2020/10/21 16:47
 */

/**
 * 虚拟机参数：
 *          -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 */
public class HeapOOM {
 static class OOMObject{
 }

    public static void main(String[] args) {
        List<OOMObject> oomObjects = new ArrayList<OOMObject>();
        while(true){
            oomObjects.add(new OOMObject()) ;
        }
    }
}











