package com.kodilla.good.patterns.flightBrowser;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class FlightFilterDepartureBased {
    public List<String> departureFilter(HashMap<DepartureCity, ArrivalCityList> flightsList, String queryCityName) {
        return flightsList.entrySet().stream()
                .filter(entry -> entry.getKey().getDepartureCityName().equals(queryCityName))
                .map(entry -> entry.getValue().getArrivalCitiesList().toString())
                .collect(Collectors.toList());
    }

    public List<String> arrivalFilter(HashMap<DepartureCity, ArrivalCityList> flightsList, String queryCityName) {
        return flightsList.entrySet().stream()
                .filter(entry -> entry.getValue().getArrivalCitiesList().contains(queryCityName))
                .map(entry -> entry.getKey().getDepartureCityName())
                .collect(Collectors.toList());
    }

    public void fixedFilter(HashMap<DepartureCity, ArrivalCityList> flightsList, String queryCityName) {
        flightsList.entrySet().stream()
                .filter(entry -> entry.getValue().getArrivalCitiesList().contains(queryCityName) || entry.getKey().getDepartureCityName().equals(queryCityName))
                .forEach(System.out::println);
    }
}
