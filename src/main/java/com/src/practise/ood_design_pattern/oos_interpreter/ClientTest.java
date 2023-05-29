package com.src.practise.ood_design_pattern.oos_interpreter;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class ClientTest {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        // a+b
        String expStr = getExpStr();
        // var {a=10, b=20}
        HashMap<String, Integer> var = getValue(expStr);
        Calculator calculator = new Calculator(expStr);
        System.out.println("运算结果：" + expStr + "=" + calculator.run(var));
    }

    // 获得表达式
    public static String getExpStr() throws IOException {
        System.out.print("请输入表达式：");
        return (new BufferedReader(new InputStreamReader(System.in))).readLine();
    }


    /**
     * 获得值映射
     * 通过键盘输入获取表达式中参数的值
     *
     * @param expStr
     * @return
     * @throws IOException
     */
    public static HashMap<String, Integer> getValue(String expStr) throws IOException {
        HashMap<String, Integer> map = new HashMap<>();

        for (char ch : expStr.toCharArray()) {
            //不是加号的符号，比如 a+b,中的a
            if (ch != '+' && ch != '-') {
                //先判断一下map中没有该值，再在控制台提醒输入
                if (!map.containsKey(String.valueOf(ch))) {
                    System.out.print("请输入" + String.valueOf(ch) + "的值：");
                    String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
                    /**
                     * super.left.interpreter(var) - super.right.interpreter(var);
                     * var.get(this.key);
                     *  取的就是这个值
                     */
                    map.put(String.valueOf(ch), Integer.valueOf(in));
                }
            }
        }
        return map;
    }
}
