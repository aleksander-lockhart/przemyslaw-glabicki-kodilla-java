package com.kodilla.good.patterns.challenges.flightsearch;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightService {
    public static List<Flight> findFlightFrom(String departure) {

        PopulateFlightList flights = new PopulateFlightList();

        return flights.getFlightSet().stream()
                .filter(t -> t.getDepartureAirport().equals(departure))
                .collect(Collectors.toList());
    }

    public static List<Flight> findFlightTo(String arrival) {

        PopulateFlightList flights = new PopulateFlightList();

        return flights.getFlightSet().stream()
                .filter(t -> t.getArrivalAirport().equals(arrival))
                .collect(Collectors.toList());
    }

    public static List<Flight> findFlightThrough(String departure, String arrival,
                                                 String through) {

        PopulateFlightList flights = new PopulateFlightList();

        List<Flight> subset = flights.getFlightSet().stream()
                .filter(t -> t.getArrivalAirport().equals(arrival))
                .filter(f -> f.getDepartureAirport().equals(through))
                .collect(Collectors.toList());

        List<Flight> subset2 = flights.getFlightSet().stream()
                .filter(t -> t.getDepartureAirport().equals(departure))
                .filter(f -> f.getArrivalAirport().equals(through))
                .collect(Collectors.toList());

        if (subset.size() > 0 && subset2.size() > 0) {
            for (Flight f : subset2) {
                subset.add(f);
            }
            return subset;

        } else {
            return new ArrayList<>();
        }
    }
}
