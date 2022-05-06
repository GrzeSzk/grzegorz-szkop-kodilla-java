package com.kodilla.good.patterns.flightBrowser;

import java.util.ArrayList;
import java.util.HashMap;

public class FlightListRetrieve {
    private HashMap<DepartureCity, ArrivalCityList> flightsList = new HashMap<>();
    private FlightServiceDto flightServiceDto = new FlightServiceDto();

    public HashMap<DepartureCity, ArrivalCityList> flightListRetrieve() {

        ArrayList<String> arrivalCitiesForGdansk = new ArrayList<>();
        arrivalCitiesForGdansk.add("Poznan");
        arrivalCitiesForGdansk.add("Warsaw");
        arrivalCitiesForGdansk.add("Wroclaw");

        flightServiceDto.retrieve("Gdansk", arrivalCitiesForGdansk, flightsList);

        ArrayList<String> arrivalCitiesForPoznan = new ArrayList<>();
        arrivalCitiesForPoznan.add("Warsaw");
        arrivalCitiesForPoznan.add("Wroclaw");
        arrivalCitiesForPoznan.add("Krakow");

        flightServiceDto.retrieve("Poznan", arrivalCitiesForPoznan, flightsList);

        return flightsList;
    }
}
