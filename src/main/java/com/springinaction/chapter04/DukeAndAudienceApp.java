package com.springinaction.chapter04;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.springinaction.chapter02.springidol.PerformanceException;
import com.springinaction.chapter02.springidol.Performer;

public class DukeAndAudienceApp {

    public static void main(String[] args) throws PerformanceException {
        String config = "target/classes/com/springinaction/chapter04/AudienceAdvice.xml";
        BeanFactory factory = new XmlBeanFactory(new FileSystemResource(config));
        Performer aPerformer = (Performer) factory.getBean("duke");
        aPerformer.perform();
    }

}
