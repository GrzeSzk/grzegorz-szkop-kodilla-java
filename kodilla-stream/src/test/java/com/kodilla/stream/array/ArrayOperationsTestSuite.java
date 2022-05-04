package com.kodilla.stream.array;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ArrayOperationsTestSuite {
    private static int testCounter = 0;

    @BeforeEach
    public void before(){

        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after(){

        System.out.println("Test Case: end");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter ++;
        System.out.println("Preparing to execute to execute test # " + testCounter);
    }

    @Test
    public void testGetAverage() {
        //Given
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double expectedAverage = 5.5;

        //When
        double average = ArrayOperations.getAverage(intArray);

        //Then
        assertEquals(expectedAverage, average, 0);
    }
}
