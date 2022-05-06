package com.kodilla.good.patterns.flightBrowser;

import java.util.HashMap;
import java.util.List;

public class FlightApplication {

    public static void main(String[] args) {

        FlightListRetrieve flightListRetrieve = new FlightListRetrieve();
        HashMap<DepartureCity, ArrivalCityList> result = flightListRetrieve.flightListRetrieve();

        result.entrySet().forEach(System.out::println);

        FlightFilterDepartureBased flightFilterDepartureBased = new FlightFilterDepartureBased();

        System.out.println("Flights from the city departures in Gdansk");
        List<String> departureBasedFlightListResult = flightFilterDepartureBased.departureFilter(result, "Gdansk");
        departureBasedFlightListResult.forEach(System.out::println);

        System.out.println("Flights with the city of arrival in Poznan");
        List<String> arrivalBasedFlightsResult = flightFilterDepartureBased.arrivalFilter(result, "Poznan");
        arrivalBasedFlightsResult.forEach(System.out::println);

        System.out.println("Flights via the city of Warsaw");
        flightFilterDepartureBased.fixedFilter(result, "Warsaw");
    }
}
