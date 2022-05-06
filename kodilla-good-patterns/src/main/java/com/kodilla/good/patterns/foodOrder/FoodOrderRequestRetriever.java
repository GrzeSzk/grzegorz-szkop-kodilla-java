package com.kodilla.good.patterns.foodOrder;

public class FoodOrderRequestRetriever {

    public FoodOrderRequest retrieve() {

        int foodQuantity = 32;
        String foodType = "Gluten free food";

        return new FoodOrderRequest(foodQuantity, foodType);
    }
}
