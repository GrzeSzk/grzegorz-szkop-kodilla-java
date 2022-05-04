package com.kodilla.good.patterns.foodOrder;

public class User {
    String userName;
    int userId;

    public User(String userName, int userId) {
        this.userName = userName;
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public int getUserId() {
        return userId;
    }
}
