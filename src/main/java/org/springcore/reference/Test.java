package org.springcore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main (String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("refconfig.xml");
        A aref = (A) context.getBean("aref");
        System.out.println(aref);
    }
}
