package com.kodilla.stream.world;

import org.junit.jupiter.api.*;

import java.math.BigDecimal;

public class WorldTestSuite {

    private static int testCounter = 0;

    @BeforeEach
    public void before(){

        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after(){

        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @DisplayName("Testing if getPeopleQuantity method works properly")

    @Test
    public void testGetPeopleQuantity(){
        //Given
        World world = new World();

        Continent asia = new Continent("Asia");
        Continent europe = new Continent("Europe");
        Continent africa = new Continent("Africa");

        asia.addCountry(new Country("China", new BigDecimal("20")));
        asia.addCountry(new Country("India", new BigDecimal("20")));
        asia.addCountry(new Country("Indonesia", new BigDecimal("20")));

        europe.addCountry(new Country("Poland", new BigDecimal("20")));
        europe.addCountry(new Country("Germany", new BigDecimal("20")));
        europe.addCountry(new Country("Italy", new BigDecimal("20")));

        africa.addCountry(new Country("Nigeria", new BigDecimal("20")));
        africa.addCountry(new Country("Egypt", new BigDecimal("20")));
        africa.addCountry(new Country("Ethiopia", new BigDecimal("20")));

        world.getListOfContinents().add(asia);
        world.getListOfContinents().add(europe);
        world.getListOfContinents().add(africa);

        //When
        BigDecimal numberOfPeople = world.getPeopleQuantity();
        System.out.println(world.toString());

        //Then
        BigDecimal expectedNumberOfPeople = new BigDecimal("180");
        Assertions.assertEquals(expectedNumberOfPeople, numberOfPeople);

    }

}
