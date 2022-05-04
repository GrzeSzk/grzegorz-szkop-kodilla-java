package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculationOfAdvStatisticsTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {

        System.out.println("This is the begining of tests.");
    }
    @AfterAll
    public static void afetrAllTests(){

        System.out.println("All tests are finished.");
    }
    @BeforeEach
    public void beforeEveryTest(){

        testCounter++;
        System.out.println("Preparing to execute test #"+ testCounter);
    }

    @DisplayName("Tests of forum statistics")
    @Test
    void testNumberOfPostsEqualZero(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postCount = 0;
        List<String> userNames = new ArrayList<>();
        userNames.add("Alex");
        userNames.add("Tom");

        CalculationOfAdvStatistics calculationOfAdvStatistics = new CalculationOfAdvStatistics();
        when(statisticsMock.postCount()).thenReturn(postCount);
        when(statisticsMock.userNames()).thenReturn(userNames);
        calculationOfAdvStatistics.calculateAdvStatistics(statisticsMock);

        //When
        int postCountResult = calculationOfAdvStatistics.getNumberOfPosts();

        //Then
        Assertions.assertEquals(0, postCountResult);
    }

    @Test
    void testNumberOfPostsEqualThousand(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postCount = 1000;
        List<String> userNames = new ArrayList<>();
        userNames.add("Alex");
        userNames.add("Tom");

        CalculationOfAdvStatistics calculationOfAdvStatistics = new CalculationOfAdvStatistics();
        when(statisticsMock.postCount()).thenReturn(postCount);
        when(statisticsMock.userNames()).thenReturn(userNames);
        calculationOfAdvStatistics.calculateAdvStatistics(statisticsMock);

        //When
        int postCountResult = calculationOfAdvStatistics.getNumberOfPosts();

        //Then
        Assertions.assertEquals(1000, postCountResult);
    }

    @Test
    void testNumberOfCommentsEqualZero() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int commentsCount = 0;
        int postCount = 100;
        List<String> userNames = new ArrayList<>();
        userNames.add("Alex");
        userNames.add("Tom");

        CalculationOfAdvStatistics calculationOfAdvStatistics = new CalculationOfAdvStatistics();
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.postCount()).thenReturn(postCount);
        when(statisticsMock.userNames()).thenReturn(userNames);
        calculationOfAdvStatistics.calculateAdvStatistics(statisticsMock);

        //When
        int commentsCountResult = calculationOfAdvStatistics.getNumberOfComments();

        //Then
        Assertions.assertEquals(0, commentsCountResult);
    }

    @Test
    void testNumberOfCommentsIsLessNumberOfPosts(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int commentsCount = 50;
        int postCount = 150;
        List<String> userNames = new ArrayList<>();
        userNames.add("Alex");
        userNames.add("Tom");

        CalculationOfAdvStatistics calculationOfAdvStatistics = new CalculationOfAdvStatistics();
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.postCount()).thenReturn(postCount);
        when(statisticsMock.userNames()).thenReturn(userNames);
        calculationOfAdvStatistics.calculateAdvStatistics(statisticsMock);

        //When
        int commentsCountResult = calculationOfAdvStatistics.getNumberOfComments();
        int postCountResult = calculationOfAdvStatistics.getNumberOfPosts();

        //Then
        Assertions.assertTrue(commentsCountResult < postCountResult);
    }

    @Test
    void testNumberOfCommentsIsGraterNumberOfPosts(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int commentsCount = 150;
        int postCount = 50;
        List<String> userNames = new ArrayList<>();
        userNames.add("Alex");
        userNames.add("Tom");

        CalculationOfAdvStatistics calculationOfAdvStatistics = new CalculationOfAdvStatistics();
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.postCount()).thenReturn(postCount);
        when(statisticsMock.userNames()).thenReturn(userNames);
        calculationOfAdvStatistics.calculateAdvStatistics(statisticsMock);

        //When
        int commentsCountResult = calculationOfAdvStatistics.getNumberOfComments();
        int postCountResult = calculationOfAdvStatistics.getNumberOfPosts();

        //Then
        Assertions.assertTrue(commentsCountResult > postCountResult);
    }

    @Test
    void testNumberOfUsersEqualZero(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int commentsCount = 50;
        int postCount = 100;
        List<String> userNames = new ArrayList<>();

        CalculationOfAdvStatistics calculationOfAdvStatistics = new CalculationOfAdvStatistics();
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.postCount()).thenReturn(postCount);
        when(statisticsMock.userNames()).thenReturn(userNames);
        calculationOfAdvStatistics.calculateAdvStatistics(statisticsMock);

        //When
        int numberOfUsersResult = calculationOfAdvStatistics.getNumberOfUsers();

        //Then
        Assertions.assertEquals(0, numberOfUsersResult);

    }

    @Test
    void testNumberOfUsersEqualHundred(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int commentsCount = 50;
        int postCount = 100;
        List<String> userNames = new ArrayList<>();
        for (int n = 0; n < 100; n++){
            userNames.add(Integer.toString(n));
        }

        CalculationOfAdvStatistics calculationOfAdvStatistics = new CalculationOfAdvStatistics();
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.postCount()).thenReturn(postCount);
        when(statisticsMock.userNames()).thenReturn(userNames);
        calculationOfAdvStatistics.calculateAdvStatistics(statisticsMock);

        //When
        int numberOfUsersResult = calculationOfAdvStatistics.getNumberOfUsers();

        //Then
        Assertions.assertEquals(100, numberOfUsersResult);

    }


}
