package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

import java.sql.SQLOutput;
import java.util.Calendar;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        //Kolejny test
        System.out.println("");
        System.out.println("Calculator tests:");

        Calculator simpleCalculator = new Calculator(10, 5);
         int calcAddResult = 15;
         int calcSubstractResult = 5;

         if (calcAddResult == simpleCalculator.addAtoB()) {
             System.out.println("Add OK");
         } else {
             System.out.println("Add error");
         }

         if (calcSubstractResult == simpleCalculator.substractAfromB()) {
             System.out.println("Substract OK");
         } else {
             System.out.println("Substract error");
                 }
             }

}
