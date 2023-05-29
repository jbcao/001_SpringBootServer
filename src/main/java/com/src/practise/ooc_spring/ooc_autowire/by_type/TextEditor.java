package com.src.practise.ooc_spring.ooc_autowire.by_type;



/**
 * @author caojianbang
 * @date 2020/11/3 21:41
 */
public class TextEditor {

    private SpellChecker spellCheckerByName;
    private String name;

    public SpellChecker getSpellCheckerByName() {
        System.out.println("inside   spellCheckerByName========>"+spellCheckerByName);
        return spellCheckerByName;
    }

    public void setSpellCheckerByName(SpellChecker spellCheckerByName) {
        this.spellCheckerByName = spellCheckerByName;
    }

    public String getName() {
        System.out.println("名称" + name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void spellcheck() {
        spellCheckerByName.checkSpelling();
    }
}
