package com.Spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import task180416.BodyCalculator;

import java.io.IOException;

/**
 * Created by Pavel on 21.04.2016.
 */
public class Cheks {

    public static void main(String[] args) throws IOException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-Context.xml");

        BodyCalculator bodyCalculator = applicationContext.getBean("BodyCalculator",BodyCalculator.class);

        bodyCalculator.solution();

        System.out.println();

    }




}
