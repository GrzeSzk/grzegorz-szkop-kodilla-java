package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.Map;

public class GoodPatternsMain {

    public static void main(String[] args) {
        MovieStore movies = new MovieStore();
        Map<String, List<String>> theResultListOfMovies = movies.getMovies();
        System.out.println("elements: " + theResultListOfMovies.size());
            theResultListOfMovies.entrySet().stream()
                    .map(entry -> entry.getKey() + entry.getValue() + " ! ")
                    .forEach(System.out::print);
    }
}
