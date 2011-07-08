package com.springinaction.chapter02.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springinaction.chapter02.springidol.PerformanceException;
import com.springinaction.chapter02.springidol.Performer;

class ByNameApp {

    public static void main(String[] args) throws PerformanceException {
        String config = "com/springinaction/chapter02/autowiring/by-name.xml";
        ApplicationContext appContext = new ClassPathXmlApplicationContext(config);
        ((Performer) appContext.getBean("kenny")).perform();
    }

}
