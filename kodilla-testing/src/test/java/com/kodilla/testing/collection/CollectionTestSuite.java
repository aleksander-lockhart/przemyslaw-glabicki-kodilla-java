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
            ArrayList<Integer> numbersList1 = new ArrayList<>();

            //When
            ArrayList<Integer> dividedList = numbersExterminator.exterminate(numbersList1);

            //Then
            System.out.println("Testing for empty list");
            Assert.assertEquals(0, dividedList.size());
        }

        @Test
        public void testOddNumbersExterminatorNormalList() {
            //Given
            OddNumbersExterminator numbersExterminator = new OddNumbersExterminator();
            ArrayList<Integer> numbersList2 = new ArrayList<>();
            numbersList2.add(2);
            numbersList2.add(4);
            numbersList2.add(3);
            numbersList2.add(5);
            //When
            ArrayList<Integer> dividedList2 = numbersExterminator.exterminate(numbersList2);

            //Then

            Assert.assertEquals(2, dividedList2.size());
        }

}
