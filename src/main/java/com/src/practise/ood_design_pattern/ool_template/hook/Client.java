package com.src.practise.ood_design_pattern.ool_template.hook;

/**模板模式
 * @author caojianbang
 * @date 2021/9/18 17:23
 */
public class Client {
    public static void main(String[] args) {
        /*纯豆浆*/
        SoyaMilk soyaMilk = new PureSoyaMilk();
        soyaMilk.template();
    }
}
