package com.kodilla.good.patterns.foodOrder;

public class ExtraFoodShop extends FoodProducer {

    public ExtraFoodShop(String companyName, String foodType, int companyId) {
        super(companyName, foodType, companyId);
    }

    @Override
    public boolean process(FoodOrderRequest foodOrderRequest) {
        System.out.println("Extra Food Shop order realization");
        return false;
    }
}
