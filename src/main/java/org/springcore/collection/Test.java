package org.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main (String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("collectionconfig.xml");

        Employee emp = (Employee) context.getBean("emp");
        System.out.println(emp);
    }
}
