package com.kodilla.good.patterns.foodOrder;

public class FoodOrderRequestRetriever {

    public FoodOrderRequest retrieve() {

        FoodProducer foodProducer = new FoodProducer("VegeShop", "Plant based", 376872);
        int foodQuantity = 32;
        String foodType = "vegetables";

        return new FoodOrderRequest(foodProducer, foodQuantity, foodType);
    }
}
