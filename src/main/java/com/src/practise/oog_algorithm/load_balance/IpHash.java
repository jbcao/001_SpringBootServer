package com.src.practise.oog_algorithm.load_balance;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author caojianbang
 * @date 2021/8/14 17:01
 * <p>
 * 负载均衡
 * IpHash算法
 */
public class IpHash {
    static List<String> list = new ArrayList<String>() {{
        add("192.168.20.12");
        add("192.168.20.13");
        add("192.168.20.14");
    }};

    public static String getConnectionAddress() throws UnknownHostException {
        //获取客户端IP，通过哈希函数计算得到一个数值
        int ipHashCode = InetAddress.getLocalHost().getHostAddress().hashCode();
        System.out.println(ipHashCode);
        //取模
        int pos = ipHashCode % list.size();
        return list.get(pos);
    }

    public static void main(String[] args) {
        try {
            IpHash.getConnectionAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
