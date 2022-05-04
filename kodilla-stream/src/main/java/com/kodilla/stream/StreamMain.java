package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {

    public static void main(String[] args) {
        Forum theForum = new Forum();
        Map<Integer, ForumUser> theResultMapOfUsers = theForum.getList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getDateOfBirth().getYear() < 2002)
                .filter(forumUser -> forumUser.getNumbersOfPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserId, ForumUser -> ForumUser));

                System.out.println("# elements: " + theResultMapOfUsers.size());
                theResultMapOfUsers.entrySet().stream()
                        .map(entry -> entry.getKey() + ": " + entry.getValue())
                        .forEach(System.out::println);
    }
}







//        BookDirectory theBookDirectory = new BookDirectory();
//        String theResultStringOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .map(Book::toString)
//                .collect(Collectors.joining(",\n","<<", ">>"));
//
//        System.out.println(theResultStringOfBooks);
//    }



//        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
//
//        System.out.println("Calculating expressions with lambdas");
//        expressionExecutor.executeExpression(10,5,(a, b) -> a + b);
//        expressionExecutor.executeExpression(10,5,(a, b) -> a - b);
//        expressionExecutor.executeExpression(10,5,(a, b) -> a * b);
//        expressionExecutor.executeExpression(10,5,(a, b) -> a / b);
//
//        System.out.println("Calculating expressions with method references");
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
//
//        System.out.println("Beutifier execution...");
//        PoemBeutifier poemBeutifier = new PoemBeutifier();
//        poemBeutifier.beautify("One", (txt) -> txt.toUpperCase());
//        poemBeutifier.beautify("TWO", (txt) -> txt.toLowerCase());
//        poemBeutifier.beautify(" Three ", (txt) -> txt.trim());
//
//        System.out.println("Using Stream to generate even numbers from 1 to 20");
//        NumbersGenerator.generateEven(20);

