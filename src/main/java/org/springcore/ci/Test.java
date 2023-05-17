package org.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main (String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ciconfig.xml");
        Person p = (Person) context.getBean("person");
        System.out.println(p);
    }
}