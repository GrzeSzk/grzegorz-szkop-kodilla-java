package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class  Forum {

    private final List<ForumUser> usersList = new ArrayList<>();

    public Forum() {

        usersList.add(new ForumUser(1, "Tom", 'M', LocalDate.of(2002,12,02), 0));
        usersList.add(new ForumUser(2, "Don", 'M', LocalDate.of(1992,10,07), 149));
        usersList.add(new ForumUser(3, "Marc", 'M', LocalDate.of(2000,01,02), 249));
        usersList.add(new ForumUser(4, "Sara", 'F', LocalDate.of(1999,04,20), 80));
        usersList.add(new ForumUser(5, "Clara", 'F', LocalDate.of(2005,12,05), 30));
        usersList.add(new ForumUser(6, "Tina", 'F', LocalDate.of(2010,11,03), 40));
        usersList.add(new ForumUser(7, "John", 'M', LocalDate.of(2001,03,11), 250));
    }

    public List<ForumUser> getList() {
        return new ArrayList<>(usersList);
    }
}
