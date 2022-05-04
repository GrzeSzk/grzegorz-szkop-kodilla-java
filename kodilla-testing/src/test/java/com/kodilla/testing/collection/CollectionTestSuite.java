package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.SocketHandler;

public class CollectionTestSuite {

    @BeforeEach
    public void before(){
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after(){
        System.out.println("Test Case: end");
    }

    @DisplayName("Check if OddNumberExterminator works properly with an empty list")

    @Test
    void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList<Integer> emptyList = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        List<Integer> resultList = oddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing empty list");
        //Then
        Assertions.assertEquals(emptyList, resultList);
    }

    @DisplayName("Check if OddNumberExterminator works properly with sample numbers")

    @Test
    void testOddNumbersExterminatorNormalList(){
        //Given
        ArrayList<Integer> sampleList = new ArrayList<>();
        sampleList.add(1);
        sampleList.add(2);
        sampleList.add(3);
        sampleList.add(4);
        sampleList.add(5);
        sampleList.add(6);
        sampleList.add(8);
        sampleList.add(10);
        sampleList.add(11);
        sampleList.add(12);

        ArrayList<Integer> expectedResultList = new ArrayList<>();
        expectedResultList.add(2);
        expectedResultList.add(4);
        expectedResultList.add(6);
        expectedResultList.add(8);
        expectedResultList.add(10);
        expectedResultList.add(12);
        //When
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> resultList = oddNumbersExterminator.exterminate(sampleList);
        System.out.println("Testing sample list");
        //Then
        Assertions.assertEquals(expectedResultList, resultList);
    }
}
