package com.src.practise.ooc_spring.oob_di.ooa_based_on_constructor;

/**
 * @author caojianbang
 * @date 2020/11/3 21:41
 */
public class TextEditor {
    private SpellChecker spellChecker ;

    /**
     * 通过构造函数参数方式将下面将依赖类SpellChecker类文件入到TextEditor类文件
     *
     * 这便称为依赖注入
     *
     * 如果是多参数情况，构造函数的参数顺序要与bean定义顺序一致
     *
     * @param spellChecker
     */
    public TextEditor(SpellChecker spellChecker) {
        System.out.println("Inside TextEditor constructor.");
        this.spellChecker = spellChecker;
    }
    public void spellcheck(){
        spellChecker.checkSpelling();
    }
}
