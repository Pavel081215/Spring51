package com.Spring.app;

import task180416.Calculator;

import java.util.List;


public class AddLongMinus implements Calculator {
    @Override
    public String calculate(List calculator) {

        long operator1 = Long.valueOf(calculator.get(1).toString());
        long operator2 = Long.valueOf(calculator.get(2).toString());
        long resultInt = operator1 - operator2;
        String result = Float.toString(resultInt);

        return result;
    }
}
