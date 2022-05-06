package com.kodilla.good.patterns.flightBrowser;

import java.util.ArrayList;

public class ArrivalCityList {
    private ArrayList<String> arrivalCitiesList;

    public ArrivalCityList(final ArrayList<String> arrivalCitiesList) {
        this.arrivalCitiesList = arrivalCitiesList;
    }

    public ArrayList<String> getArrivalCitiesList() {
        return arrivalCitiesList;
    }

    public String toString() {
        return String.join(", ", getArrivalCitiesList());
    }
}
