package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightFinder {
    public String findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> routes = new HashMap<>();

        routes.put("Thorngrave", true);
        routes.put("Oslo", true);
        routes.put("Malmo", false);
        routes.put("Warsaw", true);

        if (!routes.containsKey(flight.arrivalAirport) && routes.containsValue(false)) {
            throw new RouteNotFoundException("No route found");
        }

        return "Airport found";

    }
}

