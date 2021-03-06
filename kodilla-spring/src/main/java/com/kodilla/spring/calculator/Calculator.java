package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    private Display display;
    private double val;

    @Autowired
    private Calculator(final Display display) {
        this.display = display;
    }

    public double add(double a, double b) {
        val = a + b;
        display.displayValue(val);
        return val;
    }

    public double sub(double a, double b) {
        val = a - b;
        display.displayValue(val);
        return val;
    }

    public double mul(double a, double b) {
        val = a * b;
        display.displayValue(val);
        return val;
    }

    public double div(double a, double b) {
        val = a / b;
        display.displayValue(val);
        return val;
    }

}