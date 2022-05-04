package com.kodilla.good.patterns.challenges;

public class User {

    private String userName;
    private String userSurname;
    private int phoneNumber;

    public User(String userName, String userSurname, int i) {
        this.userName = userName;
        this.userSurname = userSurname;
        this.phoneNumber = phoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
}
