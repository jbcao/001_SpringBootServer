package com.src.practise.oob_javaSE.y_xml;

import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 * 功能:使用jaxp方式解析xml文件
 *
 * @author caojianbang
 * @date 18.3.22 8:28 PM
 */
public class Test {
    public static void main(String[] args) throws Exception{
        DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = factory.newDocumentBuilder();
        Document document=documentBuilder.parse("/Users/apple/Desktop/Files/SpringBootServer/src/main/java/com/src/practise/oob_javaSE/y_xml/class.xml");
        System.out.println(document);
    }

}
