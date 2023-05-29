package com.src.practise.ooi_voice_announcements;

import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.Dispatch;
import com.jacob.com.Variant;

import java.util.Scanner;

/**
 * 控制台多行输入
 * 当该行未空格键时结束
 */
public class ConsoleDisplay {
    public static void main(String[] args) {
        ActiveXComponent sap = new ActiveXComponent("Sapi.SpVoice");
        System.out.println("请输入需要语音播报的内容：");
        StringBuilder stringbuilder = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String text = scanner.nextLine().trim();
            if ("".equals(text)) {
                break;
            }
            stringbuilder.append(text);
        }
        System.out.println("以下是语音播报内容：  "+"\n"+stringbuilder.toString());
        // 音量 0-100
        sap.setProperty("Volume", new Variant(100));
        // 语音朗读速度 -10 到 +10
        sap.setProperty("Rate", new Variant(-2));
        // 获取执行对象
        Dispatch sapo = sap.getObject();
        // 执行朗读
        Dispatch.call(sapo, "Speak", new Variant(stringbuilder.toString()));
    }
}
