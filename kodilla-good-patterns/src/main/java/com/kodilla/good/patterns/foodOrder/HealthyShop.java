package com.kodilla.good.patterns.foodOrder;

public class HealthyShop extends FoodProducer {

    public HealthyShop(String companyName, String foodType, int companyId) {
        super(companyName, foodType, companyId);
    }

    @Override
    public boolean process(FoodOrderRequest foodOrderRequest) {
        System.out.println("Healthy Shop order realization");
        return true;
    }
}
