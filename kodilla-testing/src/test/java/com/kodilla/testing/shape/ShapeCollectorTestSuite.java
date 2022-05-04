package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

@DisplayName("TDD: Shape Test Suite")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0; //czy to jest potrzebne i czemu to służy??

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the begining pf tests.");
    }
    @AfterAll
    public static void afetrAllTests(){
        System.out.println("All tests are finished.");
    }
    @BeforeEach
    public void beforeEveryTest(){
        testCounter++; //czy to jest potrzebne i czemu to służy?? j.w.
        System.out.println("Preparing to execute test #"+ testCounter);
    }

    @DisplayName("Adding figure test")

    @Test
    public void testAddFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square("Square no1", 10);
        //When
        shapeCollector.addFiggure(shape);
        //Then
        Assertions.assertEquals(shape, shapeCollector.getFiggure(0));
    }
    @DisplayName("Removing figure test")

    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Circle("Circle no1", 10);
        //When
        boolean result = shapeCollector.removeFigure(shape);
        //Then
        Assertions.assertFalse(result);
    }

    @Test
    public  void testGetFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Triangle("Triangle no1", 10,12);
        shapeCollector.addFiggure(shape);
        //When
        Shape retrievedShape = shapeCollector.getFiggure(0);
        //Then
        Assertions.assertEquals(shape, retrievedShape);
    }

    @Test
    public void testShowFigures(){
        //Given
        Shape shape1 = new Square("Square no1", 10);
        Shape shape2 = new Circle("Circle no1", 10);
        Shape shape3 = new Triangle("Triangle no1", 10,12);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFiggure(shape1);
        shapeCollector.addFiggure(shape2);
        shapeCollector.addFiggure(shape3);
        //When
        shapeCollector.showFigures();
        String shapeCollectorNames = "Square no1 + Circle no1 + Triangle no1"; //czy to można zastąpić jakims get'em żeby sobie pobrał nazwy?
        //Then
        Assertions.assertEquals(shapeCollectorNames, shapeCollector.showFigures()); //coś tu ciągle nie gra, nie wiem dlaczego
    }

}
