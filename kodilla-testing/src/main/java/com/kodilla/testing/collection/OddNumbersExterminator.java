package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {

        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for(Integer checkedNum : numbers) {
            if (checkedNum % 2 == 0) {
                evenNumbers.add(checkedNum);
            }
        }
        return evenNumbers;
    }

}
