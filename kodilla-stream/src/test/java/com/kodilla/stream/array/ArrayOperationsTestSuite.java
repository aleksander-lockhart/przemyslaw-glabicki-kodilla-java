package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;


public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = new int[] {2, 4, 6, 10, 22, 12, 14, 16};

        //When
        double arrayOperationsResult = ArrayOperations.getAverage(numbers);

        //Then

        Assert.assertEquals(10.75, arrayOperationsResult, 0);
    }
}
