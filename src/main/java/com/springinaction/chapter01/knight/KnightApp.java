package com.springinaction.chapter01.knight;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class KnightApp {

    public static void main(String[] args) throws QuestFailedException {
        String config = "target/classes/com/springinaction/chapter01/knight/knight.xml";
        BeanFactory factory = new XmlBeanFactory(new FileSystemResource(config));
        Knight aKnight = (Knight) factory.getBean("knight"); //already gets a name and a quest from XML
        aKnight.embarkOnQuest();
    }

}
