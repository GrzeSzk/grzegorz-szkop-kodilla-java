package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        // When
        BigDecimal calculatedCost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Classic pizza with tomato sauce and cheese", description);
    }

    @Test
    public void testDoubleCheesePizzaOrderGetCost() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DoubleCheesePizza(theOrder);
        // When
        BigDecimal calculatedCost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(20), calculatedCost);
    }

    @Test
    public void testDoubleCheesePizzaOrderGetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DoubleCheesePizza(theOrder);
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Classic pizza with tomato sauce and cheese + double cheese", description);
    }

    @Test
    public void testDoubleCheeseWithProsciuttoPizzaOrderGetCost() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DoubleCheesePizza(theOrder);
        theOrder = new ProsciuttoPizza(theOrder);
        // When
        BigDecimal calculatedCost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(30), calculatedCost);
    }

    @Test
    public void testDoubleCheeseWithProsciuttoPizzaOrderGetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DoubleCheesePizza(theOrder);
        theOrder = new ProsciuttoPizza(theOrder);
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Classic pizza with tomato sauce and cheese + double cheese + prosciutto", description);
    }

    @Test
    public void testDoubleCheeseWithSalamiPizzaOrderGetCost() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DoubleCheesePizza(theOrder);
        theOrder = new SalamiPizza(theOrder);
        // When
        BigDecimal calculatedCost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(25), calculatedCost);
    }

    @Test
    public void testDoubleCheeseWithSalamiPizzaOrderGetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DoubleCheesePizza(theOrder);
        theOrder = new SalamiPizza(theOrder);
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Classic pizza with tomato sauce and cheese + double cheese + salami", description);
    }

    @Test
    public void testSalamiJalapenoPizzaOrderGetCost() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new SalamiPizza(theOrder);
        theOrder = new JalapenoPizza(theOrder);
        // When
        BigDecimal calculatedCost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(25), calculatedCost);
    }

    @Test
    public void testSalamiJalapenoPizzaOrderGetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new SalamiPizza(theOrder);
        theOrder = new JalapenoPizza(theOrder);
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Classic pizza with tomato sauce and cheese + salami + super hot jalapeno", description);
    }

    @Test
    public void testVegetarianWithJalapenoPizzaOrderGetCost() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new VegetarianPizza(theOrder);
        theOrder = new JalapenoPizza(theOrder);
        // When
        BigDecimal calculatedCost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(30), calculatedCost);
    }

    @Test
    public void testVegetarianPizzaOrderGetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new VegetarianPizza(theOrder);
        theOrder = new JalapenoPizza(theOrder);
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Classic pizza with tomato sauce and cheese + sicilian tomatoes, basil, zucchini + super hot jalapeno", description);
    }
}
