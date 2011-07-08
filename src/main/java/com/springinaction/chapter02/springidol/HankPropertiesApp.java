package com.springinaction.chapter02.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HankPropertiesApp {

    public static void main(String[] args) throws PerformanceException {
        String config = "com/springinaction/chapter02/springidol/hank-properties.xml";
        ApplicationContext appContext = new ClassPathXmlApplicationContext(config);
        ((Performer) appContext.getBean("hank")).perform();
    }

}
