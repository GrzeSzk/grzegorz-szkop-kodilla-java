package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskQueueTestSuite {

    @Test
    public void testUpdateTask() {
        //Given
        Mentor davidBorrow = new Mentor("David Borrow");
        Mentor chrisPat = new Mentor("Chris Pat");
        StudentMichael studentMichael = new StudentMichael();
        StudentAna studentAna = new StudentAna();
        StudentJimmy studentJimmy = new StudentJimmy();
        studentMichael.registerObserver(davidBorrow);
        studentAna.registerObserver(chrisPat);
        studentJimmy.registerObserver(davidBorrow);
        //When
        studentMichael.addTask("Michael task no1");
        studentMichael.addTask("Michael task no2");
        studentAna.addTask("Ana task no1");
        studentAna.addTask("Ana task no2");
        studentAna.addTask("Ana task no3");
        studentJimmy.addTask("Jimmy task no1");
        studentJimmy.addTask("Jimmy task no2");
        studentJimmy.addTask("Jimmy task no3");
        //Then
        assertEquals(5, davidBorrow.getUpdateTaskCount());
        assertEquals(3, chrisPat.getUpdateTaskCount());
    }

    @Test
    public void testRemovObserver() {
        //Given
        Mentor davidBorrow = new Mentor("David Borrow");
        Mentor chrisPat = new Mentor("Chris Pat");
        StudentMichael studentMichael = new StudentMichael();
        StudentAna studentAna = new StudentAna();
        StudentJimmy studentJimmy = new StudentJimmy();
        studentMichael.registerObserver(davidBorrow);
        studentAna.registerObserver(chrisPat);
        studentJimmy.registerObserver(davidBorrow);
        studentJimmy.registerObserver(chrisPat);
        //When
        studentMichael.addTask("Michael task no1");
        studentMichael.addTask("Michael task no2");
        studentAna.addTask("Ana task no1");
        studentAna.addTask("Ana task no2");
        studentAna.addTask("Ana task no3");

        studentJimmy.removeObserver(davidBorrow);
        studentJimmy.addTask("Jimmy task no1");
        studentJimmy.addTask("Jimmy task no2");
        studentJimmy.addTask("Jimmy task no3");
        //Then
        assertEquals(2, davidBorrow.getUpdateTaskCount());
        assertEquals(6, chrisPat.getUpdateTaskCount());
    }
}
