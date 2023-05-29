package com.src.practise.ooi_voice_announcements;

import java.util.Scanner;

import com.jacob.com.Dispatch;
import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.Variant;

/*将jacob-1.17-M2-x86.dll添加到JDK的bin目录和Windows的system32目录（64位系统添加jacob-1.17-M2-x64.dll）
 *
 *
 *
 * */
public class VoiceAnnouncements {
    public static void main(String[] args) {
        try {
            StringBuilder stringbuilder = new StringBuilder();
            //创建Scanner对象，接受从控制台输入
            Scanner scanner = new Scanner(System.in);
            String m = "-1";
            //如果输入的是“t”,则结束服务
            while (!"t".equalsIgnoreCase(stringbuilder.toString())) {
                System.out.println("请输入需要语音播报的内容：");
                read("请输入需要语音播报的内容");

                while (true) {
                    String text = scanner.nextLine().trim();
                    if ("".equals(text)) {
                        break;
                    }
                    stringbuilder.append(text);
                }
                if (stringbuilder.toString().endsWith("t")) {
                    System.out.println("感谢使用");
                    read("感谢使用");
                    break;
                } else {
                    System.err.println("需要播报的输入内容为："+stringbuilder.toString());

                    //播报
                    read(stringbuilder.toString());
                    /**
                     * 清空字符串
                     */
                    stringbuilder.delete(0, stringbuilder.length());
                    read("播报结束");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }

    /**
     * 根据字符串进行语音播报
     * 问题：为什么方法为static
     * @param str
     */

    public static void read(String str) {
        ActiveXComponent sap = new ActiveXComponent("Sapi.SpVoice");
        // 音量 0-100
        sap.setProperty("Volume", new Variant(100));
        // 语音朗读速度 -10 到 +10
        sap.setProperty("Rate", new Variant(0));
        // 获取执行对象
        Dispatch sapo = sap.getObject();
        // 执行朗读
        Dispatch.call(sapo, "Speak", new Variant(str));
                    /*// 关闭执行对象
                    sapo.safeRelease();
                    // 关闭应用程序连接
                    sap.safeRelease();*/
    }
}
