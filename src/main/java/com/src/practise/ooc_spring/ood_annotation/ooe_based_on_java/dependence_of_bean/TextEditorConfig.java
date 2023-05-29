package com.src.practise.ooc_spring.ood_annotation.ooe_based_on_java.dependence_of_bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author caojianbang
 * @date 2020/11/10 23:27
 */

@Configuration
public class TextEditorConfig {
    @Bean
    public TextEditor textEditor(){
        return new TextEditor(spellChecker());
    }
    @Bean
    public SpellChecker spellChecker(){
        return new SpellChecker();
    }
}
