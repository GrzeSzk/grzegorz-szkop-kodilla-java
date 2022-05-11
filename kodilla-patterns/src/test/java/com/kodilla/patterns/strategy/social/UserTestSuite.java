package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User marck = new YGeneration("Marck Zuker");
        User steve = new Millenials("Steve Jobs");
        User bill = new ZGeneration("Bill Gates");

        //When
        String marckSharePost = marck.sharePost();
        System.out.println("Marck using: " + marckSharePost);
        String steveSharePost = steve.sharePost();
        System.out.println("Steve using: " + steveSharePost);
        String billSharePost = bill.sharePost();
        System.out.println("Bill using: " + billSharePost);

        //Then
        assertEquals("[Facebook publisher] using facebook", marckSharePost);
        assertEquals("[Twitter publisher] using twitter", steveSharePost);
        assertEquals("[Snapchat publisher] using snapchat", billSharePost);

    }

    @Test
    void testIndividualSharingStrategy() {

        //Given
        User marck = new YGeneration("Marck Zuker");

        //When
        String marckSharePost = marck.sharePost();
        System.out.println("Marck using: " + marckSharePost);
        marck.setSocialMedia(new TwitterPublisher());
        marckSharePost = marck.sharePost();
        System.out.println("Marck starts using: " + marckSharePost);

        //Then
        assertEquals("[Twitter publisher] using twitter", marckSharePost);



    }
}
