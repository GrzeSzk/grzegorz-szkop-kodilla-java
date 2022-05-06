package com.kodilla.good.patterns.flightBrowser;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DepartureCity {
    private String departureCityName;
    private LocalDateTime localDateTime = LocalDateTime.now();

    public DepartureCity(String departureCityName) {
        this.departureCityName = departureCityName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DepartureCity that = (DepartureCity) o;

        return departureCityName.equals(that.departureCityName);
    }

    @Override
    public int hashCode() {
        return departureCityName.hashCode();
    }

    public String getDepartureCityName() {
        return departureCityName;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }
    public String getFormatTimeNow(LocalDateTime now) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatDateTime = now.format(formatter);
        return formatDateTime;
    }

    @Override
    public String toString() {
        return "DepartureCity{" +
                "departureCityName='" + departureCityName + '\'' +
                ", localDateTime=" + localDateTime +
                '}';
    }
}
