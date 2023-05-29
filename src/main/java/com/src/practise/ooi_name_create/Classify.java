package com.src.practise.ooi_name_create;

import org.springframework.context.ConfigurableApplicationContext;

import java.io.File;

/**文件名中间加上一些内容
 * @author caojianbang
 * @date 2021/9/19 2:14
 */
public class Classify {

    public static void main(String[] args) {
        String path = "";
        File file = new File(path);
        File[] list = file.listFiles();
        // 如果目录下文件存在
        if (file.exists() && file.isDirectory()) {
            for (int i = 0; i < list.length; i++) {

                //取文件名子存入name中
                String name = list[i].getName();
                if (name.indexOf("00")==0){
                    // 截取.之前的字符串出来
                    int index = name.indexOf("底");
                    int index2 = name.indexOf("层");
                    //不包含该索引值
                    String name2 =name.substring(0,index);
                    String name3 = name.substring(index2+1);
                    // 拼接字符串
                    String newName = name2+"_底层_"+name3;
                    //重命名
                    File dest = new File(path + "/" + newName);
                    list[i].renameTo(dest);
                    System.out.println(dest.getName());
                }else if (name.indexOf("01")==0){

                }else if (name.indexOf("02")==0){
                    // 截取.之前的字符串出来
                    int index = name.indexOf("基");
                    int index2 = name.indexOf("础");
                    String name2 =name.substring(0,index);
                    String name3 = name.substring(index2+1);
                    // 拼接字符串
                    String newName = name2+"_基础_"+name3;
                    //重命名
                    File dest = new File(path + "/" + newName);
                    list[i].renameTo(dest);
                    System.out.println(dest.getName());
                }else if (name.indexOf("03")==0){
                    // 截取.之前的字符串出来
                    int index = name.indexOf("模");
                    int index2 = name.indexOf("构");
                    String name2 =name.substring(0,index);
                    String name3 = name.substring(index2+1);
                    // 拼接字符串
                    String newName = name2+"_模式与结构_"+name3;
                    //重命名
                    File dest = new File(path + "/" + newName);
                    list[i].renameTo(dest);
                    System.out.println(dest.getName());
                }else if (name.indexOf("04")==0){
                    // 截取.之前的字符串出来
                    int index = name.indexOf("多");
                    int index2 = name.indexOf("程");
                    String name2 =name.substring(0,index);
                    String name3 = name.substring(index2+1);
                    // 拼接字符串
                    String newName = name2+"_多线程_"+name3;
                    //重命名
                    File dest = new File(path + "/" + newName);
                    list[i].renameTo(dest);
                    System.out.println(dest.getName());
                }else if (name.indexOf("05")==0){
                    // 截取.之前的字符串出来
                    int index = name.indexOf("数");
                    int index2 = name.indexOf("库");
                    String name2 =name.substring(0,index);
                    String name3 = name.substring(index2+1);
                    // 拼接字符串
                    String newName = name2+"_数据库_"+name3;
                    //重命名
                    File dest = new File(path + "/" + newName);
                    list[i].renameTo(dest);
                    System.out.println(dest.getName());
                }else if (name.indexOf("06")==0){
                    // 截取.之前的字符串出来
                    int index = name.indexOf("框");
                    int index2 = name.indexOf("架");
                    String name2 =name.substring(0,index);
                    String name3 = name.substring(index2+1);
                    // 拼接字符串
                    String newName = name2+"_框架_"+name3;
                    //重命名
                    File dest = new File(path + "/" + newName);
                    list[i].renameTo(dest);
                    System.out.println(dest.getName());
                }else if (name.indexOf("07")==0){
                    // 截取.之前的字符串出来
                    int index = name.indexOf("分");
                    int index2 = name.indexOf("件");
                    String name2 =name.substring(0,index);
                    String name3 = name.substring(index2+1);
                    // 拼接字符串
                    String newName = name2+"_分布式中间件_"+name3;
                    //重命名
                    File dest = new File(path + "/" + newName);
                    list[i].renameTo(dest);
                    System.out.println(dest.getName());
                }else if (name.indexOf("08")==0){
                    // 截取.之前的字符串出来
                    int index = name.indexOf("应");
                    int index2 = name.indexOf("器");
                    String name2 =name.substring(0,index);
                    String name3 = name.substring(index2+1);
                    // 拼接字符串
                    String newName = name2+"_应用服务器_"+name3;
                    //重命名
                    File dest = new File(path + "/" + newName);
                    list[i].renameTo(dest);
                    System.out.println(dest.getName());
                }else if (name.indexOf("09")==0){
                    // 截取.之前的字符串出来
                    int index = name.indexOf("构");
                    int index2 = name.indexOf("建");
                    String name2 =name.substring(0,index);
                    String name3 = name.substring(index2+1);
                    // 拼接字符串
                    String newName = name2+"_构建_"+name3;
                    //重命名
                    File dest = new File(path + "/" + newName);
                    list[i].renameTo(dest);
                    System.out.println(dest.getName());
                }else if (name.indexOf("10")==0){
                    // 截取.之前的字符串出来
                    int index = name.indexOf("前");
                    int index2 = name.indexOf("端");
                    String name2 =name.substring(0,index);
                    String name3 = name.substring(index2+1);
                    // 拼接字符串
                    String newName = name2+"_前端_"+name3;
                    //重命名
                    File dest = new File(path + "/" + newName);
                    list[i].renameTo(dest);
                    System.out.println(dest.getName());
                }else if (name.indexOf("11")==0){
                    // 截取.之前的字符串出来
                    int index = name.indexOf("工");
                    int index2 = name.indexOf("学");
                    String name2 =name.substring(0,index);
                    String name3 = name.substring(index2+1);
                    // 拼接字符串
                    String newName = name2+"_工程学_"+name3;
                    //重命名
                    File dest = new File(path + "/" + newName);
                    list[i].renameTo(dest);
                    System.out.println(dest.getName());
                }

            }
        }
    }
}