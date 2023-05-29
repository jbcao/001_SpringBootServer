package com.src.practise.ooi_create_times;

import java.io.*;
import java.net.*;
import java.util.*;

/**
 * 新闻页面刷数据
 */
public class TestGetPostPage {
    // param:请求参数，格式应该满足name1=value1&name2=value2的形式。
    public static String sendGet(String url, String param) {
        String result = "";
        if (param != null) {
            url = url + "?" + param;
        }
        try {
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            HttpURLConnection conn = getHttpURLConnection(realUrl);
            // 打印头信息
            printHeader(conn);
            // 获取响应
            result = getResponse(conn);
            conn.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    // param:请求参数，格式应该满足name1=value1&name2=value2的形式。
    public static String sendPost(String url, String param) {
        String result = "";
        try {
            URL realUrl = new URL(url);
            HttpURLConnection conn = getHttpURLConnection(realUrl);
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            {// Post发送参数：
                // 获取HttpURLConnection 对象对应的输出流
                PrintWriter out = new PrintWriter(conn.getOutputStream());
                // 发送请求参数
                out.print(param);
                out.close();
            }
            // 获取响应
            result = getResponse(conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    // 提供主方法，测试发送GET请求和POST请求
    public static void main(String args[]) {
        String url = "https://www.toutiao.com/i6860855946546315789/";
        // "https://zhuanlan.zhihu.com/hulaoshi";
        String param = null;
        // 也可以自己写个Servlet测试是否接收到参数
        // url = "http://localhost:8080/TestJavaWeb/AHServlet";
        // param = "uname=tiger";
        // ----------------------------
        int i=1;
        while (i<100){
            String s;
            // 发送GET请求
            s = TestGetPostPage.sendGet(url, param);
            write("http_get.html", s);
            System.out.println("-----------------------------------------------");
            System.out.println("成功浏览"+i+"次");
            i++;
        }

        // 发送POST请求
        //s = TestGetPostPage.sendPost(url, param);
        //write("http_post.html", s);
    }
    private static HttpURLConnection getHttpURLConnection(URL realUrl) {
        StringBuilder sb = new StringBuilder();
        sb.append("Mozilla/5.0 (Windows NT 10.0; Win64; x64)");
        sb.append(" AppleWrbKit/537.36(KHTML, like Gecko)");
        sb.append(" Chrome/72.0.3626.119 Safari/537.36");
        HttpURLConnection conn = null;
        try {
            // 打开和URL之间的连接
            conn = (HttpURLConnection) realUrl.openConnection();
            // 设置通用的请求属性
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent", sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return conn;
    }
    private static String getResponse(HttpURLConnection conn) {
        // 读取URL的响应
        String result = "";
        try (InputStream is = conn.getInputStream();
             InputStreamReader isr = new InputStreamReader(is, "utf-8");
             BufferedReader in = new BufferedReader(isr)) {
            String line;
            while ((line = in.readLine()) != null) {
                result += "\n" + line;
            }
        } catch (Exception e) {
            System.out.println("Err:getResponse()");
            e.printStackTrace();
        } finally {
            conn.disconnect();
        }
        System.out.println("getResponse()：" + result.length());
        return result;
    }
    private static void printHeader(HttpURLConnection conn) {
        System.out.println("---↓↓↓响应头字段---");
        Map<String, List<String>> map = conn.getHeaderFields();
        for (String key : map.keySet()) {
            System.out.println(key + "--->" + map.get(key));
        }
        System.out.println("---↑↑↑响应头字段---");
    }
    private static void write(String fileName, String text) {
        File f = new File(fileName);
        try (FileOutputStream fos = new FileOutputStream(f);
             OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
             BufferedWriter bw = new BufferedWriter(osw);) {
            bw.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}