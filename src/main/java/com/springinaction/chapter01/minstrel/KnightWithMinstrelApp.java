package com.springinaction.chapter01.minstrel;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.springinaction.chapter01.knight.Knight;
import com.springinaction.chapter01.knight.QuestFailedException;

public class KnightWithMinstrelApp {

    public static void main(String[] args) throws QuestFailedException {
        String config = "target/classes/com/springinaction/chapter01/minstrel/knightWithMinstrel.xml";
        BeanFactory factory = new XmlBeanFactory(new FileSystemResource(config));
        Knight aKnight = (Knight) factory.getBean("knight"); //already gets a name and a quest from XML
        aKnight.embarkOnQuest();
    }

}
