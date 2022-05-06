package com.kodilla.good.patterns.flightBrowser;

import java.util.ArrayList;
import java.util.HashMap;

public class FlightServiceDto implements ServiceDto {

    public HashMap<DepartureCity, ArrivalCityList> retrieve(String departureCityName, ArrayList<String> arrivalCityListNames, HashMap<DepartureCity, ArrivalCityList> singleFlightList) {
        DepartureCity departureCity = new DepartureCity(departureCityName);
        ArrivalCityList arrivalCityList = new ArrivalCityList(arrivalCityListNames);

        singleFlightList.put(departureCity, arrivalCityList);

        return singleFlightList;
    }
}
