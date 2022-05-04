package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightBrowser {

    public String findFlight (Flight flight) throws RouteNotFoundException {
        final Map<String, Boolean> availaibleFlightMap = new HashMap<>();
        availaibleFlightMap.put("Chopin", true);
        availaibleFlightMap.put("Modlin", false);
        availaibleFlightMap.put("Walesa", true);

        if (!availaibleFlightMap.containsKey(flight.arrivalAirport)){
            throw new RouteNotFoundException();
        }
        return flight.arrivalAirport;

    }

    public static void main(String[] args){

        Flight flight = new Flight("Chopin", "ABC");
        FlightBrowser flightBrowser = new FlightBrowser();

        try {
            flightBrowser.findFlight(flight);
            System.out.println(flight.arrivalAirport);
        } catch (RouteNotFoundException e){
            System.out.println(flight.getArrivalAirport() + "? " + e.getMessage());
        }
    }
}
