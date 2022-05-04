package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class SingleOrderRepository implements OrderRepository {
    public boolean createOrder(User user, LocalDateTime orderDateTime) {
        System.out.println("Order for: " + user.getUserName() + " " + user.getUserSurname() + "finished at: " + orderDateTime);
        return true;
    }
}
