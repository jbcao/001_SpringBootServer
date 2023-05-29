package com.src.practise.oob_flow_control;

/**分支语句
 * @author caojianbang
 * @date 2021/9/15 22:05
 */
public class Flow {
    public static void main(String[] args) {
        char c = 'a';
        switch (c) {
            case 'a':
                System.out.println("周一");
                break;//break表示跳出switch
            case 'b':
                System.out.println("周二");
                break;
            default:
                System.out.println("不知道");
                break;
        }
    }
}
