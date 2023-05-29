package com.src.practise.ooc_spring.ood_annotation.ooe_based_on_java.dependence_of_bean;




import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author caojianbang
 * @date 2020/10/9 22:08
 */
public class MainApp {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(TextEditorConfig.class);
        TextEditor textEditor = (TextEditor) applicationContext.getBean(TextEditor.class);
        textEditor.spellcheck();
    }
}
