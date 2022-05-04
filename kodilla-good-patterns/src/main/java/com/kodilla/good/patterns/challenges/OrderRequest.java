package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {
    private User user;
    private LocalDateTime orderDateTime;

    public OrderRequest(User user, LocalDateTime orderDateTime) {
        this.user = user;
        this.orderDateTime = orderDateTime;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getOrderDateTime() {
        return orderDateTime;
    }
}
