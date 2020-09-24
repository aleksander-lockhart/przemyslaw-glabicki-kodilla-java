package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double resultAdd = calculator.add(6,5);
        double resultSub = calculator.sub(12, 5);
        double resultMul = calculator.mul(15, 5);
        double resultDiv = calculator.div(25, 5);

        //Then
        Assert.assertEquals(11.0, resultAdd, 0);
        Assert.assertEquals(7.0, resultSub, 0);
        Assert.assertEquals(75.0, resultMul, 0);
        Assert.assertEquals(5.0, resultDiv, 0);


    }
}