package com.springinaction.chapter01.minstrel;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import com.springinaction.chapter01.knight.Knight;
import com.springinaction.chapter01.knight.QuestFailedException;

/**
 * In this application we use AOP so the Minstrel can sing about the Knight, without the Knight
 * having to tell to do so.
 * 
 * @author stivlo
 */
public class KnightAndMinstrelApp {

    public static void main(String[] arg) throws QuestFailedException {
        String config = "com/springinaction/chapter01/minstrel/knightAndMinstrel.xml";
        BeanFactory factory;
        for (int run = 0; run < 3; run++) {
            switch (run) {
            case 0:
                factory = new ClassPathXmlApplicationContext(config);
                break;
            case 1:
                factory = new XmlBeanFactory(new ClassPathResource(config));
                break;
            default:
                factory = new XmlBeanFactory(new FileSystemResource("target/classes/" + config));
            }
            System.out.println("\nRunning in a " + factory.getClass().getSimpleName());
            Knight aKnight = (Knight) factory.getBean("knight"); //already gets a name and a quest from XML
            aKnight.embarkOnQuest();
        }
    }

}
