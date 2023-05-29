package com.src.practise.ooi_name_create;

import java.sql.SQLOutput;

/**文件名称批量创建
 * 用于硕鼠批量下载视频
 * @author caojianbang
 * @date 2021/9/18 13:50
 */
public class NameCreate {
    public static void main(String[] args) {
        String name ="https://www.bilibili.com/video/BV1fh411y7R8?p=";
        for (int i = 1; i <=910; i++) {
            if (i%20==0){
                System.out.println(name+i);
                System.out.println();
            }else{
                System.out.println(name+i);
            }

        }
    }
}
