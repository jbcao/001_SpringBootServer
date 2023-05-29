package com.src.practise.oog_algorithm.load_balance;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author caojianbang
 * @date 2021/8/14 14:59
 * <p>
 * 负载均衡
 * <p>
 * 随机法
 */
public class RandomAccess {
    static List<String> list = new ArrayList<String>() {{
        add("192.168.20.12");
        add("192.168.20.13");
        add("192.168.20.14");
    }};

    public static String getConnectionAddress() {
        Random random = new Random();
        int pos = random.nextInt(list.size());
        return list.get(pos);
    }
}
