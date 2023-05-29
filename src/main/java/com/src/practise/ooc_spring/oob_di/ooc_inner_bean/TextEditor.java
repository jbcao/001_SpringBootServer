package com.src.practise.ooc_spring.oob_di.ooc_inner_bean;



/**
 * @author caojianbang
 * @date 2020/11/3 21:41
 */
public class TextEditor {

    private SpellChecker spellChecker ;

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("Inside setSpellChecker========>");
        this.spellChecker = spellChecker;
    }

    public void spellcheck(){
        spellChecker.checkSpelling();
    }
}
