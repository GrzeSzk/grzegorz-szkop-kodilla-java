package com.kodilla.good.patterns.foodOrder;

import java.util.ArrayList;
import java.util.List;

public class FoodOrderService {

    List<FoodProducer> suppliers = new ArrayList<>();

    public FoodOrderService() {
       suppliers.add(new ExtraFoodShop("Extra Food Shop", "Extra food", 45));
       suppliers.add(new GlutenFreeShop("Gluten Free Shop", "Gluten free food", 12));
       suppliers.add(new HealthyShop("Healthy Shop", "Veggies", 7));
    }

    public void orderCreate(FoodOrderRequest foodOrderRequest) {
        for (FoodProducer p:suppliers) {
            if (p.getFoodType().equals(foodOrderRequest.getFoodType())) {
            p.process(foodOrderRequest);
            }
        }
    }
}
