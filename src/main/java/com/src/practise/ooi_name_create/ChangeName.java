package com.src.practise.ooi_name_create;

import java.io.File;

/**去掉名称前的字符
 *
 * @author caojianbang
 * @date 2021/9/18 15:15
 */
public class ChangeName {
    public static void main(String[] args) {
        File file = new File("/Users/apple/Desktop/Files/003_视频学习资料/javaEE_韩顺平_30G完整版/spring");
        File[] list = file.listFiles();

        // 如果目录下文件存在
        if (file.exists() && file.isDirectory()) {
            for (int i = 0; i < list.length; i++) {
                //取文件名子存入name中
                String name = list[i].getName();
                System.out.println("修改前"+name);
                //mac下文件夹有影藏文件，用于描述文件夹内文件显示方式
                if (!".DS_Store".equals(name)){
                    // 截取.之前的字符串出来
                    int index = name.indexOf("第");
                    System.out.println(index);
                    String name3 = name.substring(index);
                    // 拼接字符串
                    String newName = name3;
                    System.out.println("修改后"+newName);
                    //重命名
                    File dest = new File("/Users/apple/Desktop/Files/003_视频学习资料/javaEE_韩顺平_30G完整版/spring" + "/" + newName);
                    list[i].renameTo(dest);
                    System.out.println(dest.getName());
                }
            }
        }
    }
    /*
   String类可能使用的方法

substring(int beginIndex)
         截取从beginIndex到末尾的字符串并返回
substring(int beginIndex, int endIndex)
         截取从beginIndex到endIndex的字符串并返回
concat(String str)
          将指定字符串str连接到此字符串的结尾
indexOf(int ch)
          返回指定字符在此字符串中第一次出现处的索引
indexOf(String str)
          返回指定子字符串在此字符串中第一次出现处的索引
lastIndexOf(int ch)
          返回指定字符在此字符串中最后一次出现处的索引
lastIndexOf(int ch, int fromIndex)
          返回指定字符在此字符串中最后一次出现处的索引，从指定的索引处开始进行反向搜索
length()   返回此字符串的长度
replace(CharSequence target, CharSequence replacement)
          使用指定的字面值替换序列替换此字符串所有匹配字面值目标序列的子字符串
replaceAll(String regex, String replacement)
          使用给定的 replacement 替换此字符串所有匹配给定的正则表达式的子字符串
          */
}
