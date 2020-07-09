package com.kodilla.testing.collection;
import org.junit.*;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Random;

public class CollectionTestSuite {
        @Before
        public void before(){
            System.out.println("Test Case: begin");
        }
        @After
        public void after(){
            System.out.println("Test Case: end");
        }

        @Test
        public void testOddNumbersExterminatorEmptyList() {
            //Given
            OddNumbersExterminator numbersExterminator = new OddNumbersExterminator();
            ArrayList<Integer> numbersList = new ArrayList<>();

            //When
            numbersExterminator.exterminate(numbersList);

            //Then
            System.out.println("Testing for empty list");
            Assert.assertEquals(0, numbersList.size());
        }

        @Test
        public void testOddNumbersExterminatorNormalList() {
            //Given
            OddNumbersExterminator numbersExterminator = new OddNumbersExterminator();
            Random addNumber = new Random();
            ArrayList<Integer> numbersList = new ArrayList<>();
            for(int i=0; i<100; i++) {
                numbersList.add(addNumber.nextInt(100));
            }
            //When
            numbersExterminator.exterminate(numbersList);

            ArrayList<Integer>evenList = new ArrayList<>();
            for (Integer checkEven : numbersList) {
                if (checkEven % 2 == 0) {
                    evenList.remove(checkEven);
                }
            }
            //Then
            System.out.println("Check if list got only Even numbers, remove all %2");
            Assert.assertEquals(0, evenList.size());
        }

}
