package com.src.practise.ooc_spring.ood_annotation.ooe_based_on_java.dependence_of_bean;


/**
 * @author caojianbang
 * @date 2020/11/3 21:41
 */
public class TextEditor {

    private SpellChecker spellChecker;


    public TextEditor(SpellChecker spellChecker) {
        System.out.println("Inside TextEditor constructor.");
        this.spellChecker = spellChecker;
    }

    public void spellcheck() {
        spellChecker.checkSpelling();
    }
}
