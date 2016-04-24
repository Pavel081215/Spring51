package com.Spring.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import task180416.*;
import java.io.IOException;


@Configuration
public class AppConfig {

    @Bean
    public Calculator addLongMinus() {
        Calculator addLongMinus = new AddLongMinus();
        return addLongMinus;
    }

    @Bean
    public Calculator addIntPlus() {
        Calculator addIntPlus = new AddIntPlus();
        return addIntPlus;
    }

    @Bean
    public Calculator addIntMinus() {
        Calculator addIntMinus = new AddIntMinus();
        return addIntMinus;
    }

    @Bean
    public Body Body() {
        Body body = new Body();
        body.addImplementsFunction("+Long", addLongMinus());
        body.addImplementsFunction("+Int", addIntPlus());
        body.addImplementsFunction("-Int", addIntMinus());

        return body;
    }

    @Bean
    public ConsoleWorker consoleWorker() {
        ConsoleWorker consoleWorker = new ConsoleWorker();
        consoleWorker.setKey(Body().getImplementsFunctionMap().keySet());
        return consoleWorker;
    }

    @Bean
    public BodyCalculator bodyCalculator(ConsoleWorker consoleWorker) throws IOException {
        BodyCalculator bodyCalculator = new BodyCalculator(consoleWorker);
        bodyCalculator.setImplementsFunctionMap(Body().getImplementsFunctionMap());
        return bodyCalculator;
    }


}
