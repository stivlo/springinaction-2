package com.springinaction.chapter01.hello;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class HelloApp {

    public static void main(String[] args) {
        String config = "target/classes/com/springinaction/chapter01/hello/hello.xml";
        BeanFactory factory = new XmlBeanFactory(new FileSystemResource(config));
        GreetingService greetingService = (GreetingService) factory.getBean("greetingService");
        greetingService.sayGreeting();
    }

}
