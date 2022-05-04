package com.kodilla.good.patterns.foodOrder;

public class FoodOrderRequest {

    private FoodProducer foodProducer;
    private int foodQuantity;
    private String foodType;

    public FoodOrderRequest(final FoodProducer foodProducer, final int foodQuantity, final String foodType) {
        this.foodProducer = foodProducer;
        this.foodQuantity = foodQuantity;
        this.foodType = foodType;
    }

    public FoodProducer getFoodProducer() {
        return foodProducer;
    }

    public int getFoodQuantity() {
        return foodQuantity;
    }

    public String getFoodType() {
        return foodType;
    }
}
