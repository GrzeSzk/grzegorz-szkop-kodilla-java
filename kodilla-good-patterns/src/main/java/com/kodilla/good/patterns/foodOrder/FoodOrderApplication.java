package com.kodilla.good.patterns.foodOrder;

public class FoodOrderApplication {

    public static void main(String[] args) {
        FoodOrderRequestRetriever foodOrderRequestRetriever = new FoodOrderRequestRetriever();
        FoodOrderRequest foodOrderRequest = foodOrderRequestRetriever.retrieve();

        FoodOrderService foodOrderService = new FoodOrderService();
        FoodOrderService.OrderCreate(foodOrderRequest);
    }
}
