package com.springinaction.chapter02.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TwoSaxophonesApp {

    public static void main(String[] args) throws PerformanceException {
        String config = "com/springinaction/chapter02/springidol/two-saxophones.xml";
        ApplicationContext appContext = new ClassPathXmlApplicationContext(config);
        ((Performer) appContext.getBean("kenny")).perform();
        ((Performer) appContext.getBean("duke")).perform();
    }

}
