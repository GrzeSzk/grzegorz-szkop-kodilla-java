package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface OrderRepository {
    static boolean createOrder(User user, LocalDateTime orderDateTime) {
        return false;
    }

}
