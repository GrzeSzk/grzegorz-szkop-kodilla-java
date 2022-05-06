package com.kodilla.good.patterns.foodOrder;

public abstract class FoodProducer {
    private String companyName;
    private String foodType;
    private int companyId;

    public FoodProducer(String companyName, String foodType, int companyId) {
        this.companyName = companyName;
        this.foodType = foodType;
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getFoodType() {
        return foodType;
    }

    public int getCompanyId() {
        return companyId;
    }

    public boolean process(FoodOrderRequest foodOrderRequest) {
        System.out.println("Order confirmed for distributor: " + getCompanyName() + getCompanyId());
        return true;
    }
}
