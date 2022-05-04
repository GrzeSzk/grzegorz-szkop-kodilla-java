package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public class Continent {

    private final String continentName;
    private final Set<Country> listOfCountries = new HashSet<>();

    public Continent(String continentName) {
        this.continentName = continentName;
    }
    public void addCountry(Country country){
        listOfCountries.add(country);
    }
    public Set<Country> getListOfCountries() {
        return listOfCountries;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "continentName='" + continentName + '\'' +
                ", listOfCountries=" + listOfCountries +
                '}';
    }
}
