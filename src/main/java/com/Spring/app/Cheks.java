package com.Spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import task180416.BodyCalculator;

import java.io.IOException;

/**
 * Created by Pavel on 21.04.2016.
 */
public class Cheks {

    public static void main(String[] args) throws IOException {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        BodyCalculator bodyCalculator = applicationContext.getBean("bodyCalculator",BodyCalculator.class);

        bodyCalculator.solution();

        System.out.println();

    }




}
