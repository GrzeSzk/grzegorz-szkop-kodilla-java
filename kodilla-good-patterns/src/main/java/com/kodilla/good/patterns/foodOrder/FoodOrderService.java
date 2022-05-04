package com.kodilla.good.patterns.foodOrder;

public class FoodOrderService {
    static void OrderCreate(FoodOrderRequest foodOrderRequest) {
        if (foodOrderRequest.getFoodProducer().process()) {
            System.out.println("Ordered products quantity is: " + foodOrderRequest.getFoodQuantity());
        } else {
            System.out.println("Order canceled");
        }
    }
}
