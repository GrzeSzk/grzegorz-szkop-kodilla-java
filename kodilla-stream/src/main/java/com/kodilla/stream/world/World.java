package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class World {

    private final Set<Continent> listOfContinents = new HashSet<>();

    public Set<Continent> getListOfContinents(){
        return listOfContinents;
    }

    public final BigDecimal getPeopleQuantity(){
        return listOfContinents.stream()
                .flatMap(continent -> continent.getListOfCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }

    @Override
    public  String toString(){
        return "In my world live " + getPeopleQuantity() + " people.";
    }
}
