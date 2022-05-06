package com.kodilla.good.patterns.flightBrowser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public interface ServiceDto {

    Map retrieve(String departureCityName, ArrayList<String> arrivalCityList, HashMap<DepartureCity, ArrivalCityList> singleFlightList);

}
