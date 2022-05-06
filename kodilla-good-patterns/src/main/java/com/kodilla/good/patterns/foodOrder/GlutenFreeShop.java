package com.kodilla.good.patterns.foodOrder;

public class GlutenFreeShop extends FoodProducer {

    public GlutenFreeShop(String companyName, String foodType, int companyId) {
        super(companyName, foodType, companyId);
    }

    @Override
    public boolean process(FoodOrderRequest foodOrderRequest) {
        System.out.println("Gluten Free Shop order realization");
        return false;
    }
}
