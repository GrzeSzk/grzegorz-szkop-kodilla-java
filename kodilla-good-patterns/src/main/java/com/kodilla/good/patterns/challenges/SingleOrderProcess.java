package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class SingleOrderProcess implements ProductOrderService {
    public boolean order(User user, LocalDateTime when) {
        System.out.println("Order realization for user: " + user.getUserName() + " " + user.getUserSurname());
        return when.isBefore(LocalDateTime.now());
    }

}
