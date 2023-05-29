package com.src.practise.ooc_spring.ooc_autowire.by_constructor;


/**
 * @author caojianbang
 * @date 2020/11/3 21:41
 */
public class TextEditor {

    private SpellChecker spellChecker;
    private String name;

    public TextEditor(SpellChecker spellChecker, String name) {
        this.spellChecker = spellChecker;
        this.name = name;
    }

    public SpellChecker getSpellChecker() {
        System.out.println("inside   spellCheckerByName========>" + spellChecker);
        return spellChecker;
    }

    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public String getName() {
        System.out.println("名称" + name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void spellcheck() {
        spellChecker.checkSpelling();
    }
}
