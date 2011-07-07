package com.springinaction.chapter02.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PoeticJugglerApp {

    public static void main(String[] args) throws PerformanceException {
        String config = "com/springinaction/chapter02/springidol/poetic-juggler.xml";
        ApplicationContext appContext = new ClassPathXmlApplicationContext(config);
        Performer performer = (Performer) appContext.getBean("duke");
        performer.perform();
    }

}
