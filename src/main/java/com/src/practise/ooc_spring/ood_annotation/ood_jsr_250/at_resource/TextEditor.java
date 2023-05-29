package com.src.practise.ooc_spring.ood_annotation.ood_jsr_250.at_resource;


import javax.annotation.Resource;

/**
 * @author caojianbang
 * @date 2020/11/3 21:41
 */
public class TextEditor {

    private SpellChecker spellChecker;

    public SpellChecker getSpellChecker() {
        System.out.println("inside   spellCheckerByName========>" + spellChecker);
        return spellChecker;
    }

    /**
     * 可以在字段中或者 setter 方法中使用@Resource注释,它和在 Java EE 5 中的运作是一样的
     *
     * @param spellChecker
     * @Resource注释使用一个name属性，该属性以bean名称的形式被注入 它遵循by-name自动连接语义
     * <p>
     * 代替autowire="byName"
     */

    /*
     * 如果没有明确地指定一个name，默认名称源于字段名或者setter方法。
     *
     * 在字段的情况下，它使用的是字段名
     *
     * 在一个 setter 方法情况下，它使用的是 bean 属性名称。
     */
    @Resource(name = "spellChecker")
    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }


    public void spellcheck() {
        spellChecker.checkSpelling();
    }
}
