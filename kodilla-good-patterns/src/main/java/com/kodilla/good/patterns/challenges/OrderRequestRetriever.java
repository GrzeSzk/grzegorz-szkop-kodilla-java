package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrieve(){
        User user = new User("Marck", "Sparck", 123456789);

        LocalDateTime orderDateTime = LocalDateTime.of(2022,4,29,10,30);

        return new OrderRequest(user, orderDateTime);
    }
}
