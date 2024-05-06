package com.springcore.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/springcore/coreconfig.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);
    }
}
