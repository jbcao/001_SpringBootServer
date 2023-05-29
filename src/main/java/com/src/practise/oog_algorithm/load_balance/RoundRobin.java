package com.src.practise.oog_algorithm.load_balance;

import java.util.*;

/**
 * @author caojianbang
 * @date 2021/8/14 14:32
 * <p>
 * 负载均衡
 * <p>
 * 轮询法
 */
public class RoundRobin {
    static List<String> list = new ArrayList<String>() {{
        add("192.168.20.12");
        add("192.168.20.13");
        add("192.168.20.14");
    }};
    static int pos = 0;
    static final Object lock = new Object();

    public static String getConnectionAddress() {
        String ip = null;
        synchronized (lock) {
            ip = list.get(pos);
            if (++pos >= list.size()) {
                pos = 0;
            }
        }
        return ip;
    }

}
