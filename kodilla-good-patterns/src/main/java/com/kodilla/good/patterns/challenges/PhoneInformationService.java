package com.kodilla.good.patterns.challenges;

public class PhoneInformationService implements InformationService {
    public void inform(User user) {
        System.out.println("User" + user.getUserName() + " " + user.getUserSurname() + "has been informed about order's realization via text message on phone number: " + user.getPhoneNumber());
    }
}
