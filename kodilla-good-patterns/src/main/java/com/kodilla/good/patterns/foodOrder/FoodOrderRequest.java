package com.kodilla.good.patterns.foodOrder;

public class FoodOrderRequest {

    private int foodQuantity;
    private String foodType;

    public FoodOrderRequest(final int foodQuantity,
                            final String foodType) {
        this.foodQuantity = foodQuantity;
        this.foodType = foodType;
    }


    public int getFoodQuantity() {

        return foodQuantity;
    }

    public String getFoodType() {

        return foodType;
    }
}
