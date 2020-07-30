package com.kodilla.exception.test;

public class FlightFinderRunner {
    public static void main(String[] args) {

        FlightFinder flightFinder = new FlightFinder();
        Flight flight1 = new Flight("Thorngrave", "Berlin");
        Flight flight2 = new Flight("Oslo", "Warsaw");

        System.out.println("First search: ");
        try {
            flightFinder.findFlight(flight1);

            } catch  (RouteNotFoundException e) {
            System.out.println("Route not found");
        } finally {
            System.out.println("End of search.");
        }

        System.out.println("Next search ");
        try {
            flightFinder.findFlight(flight2);
        } catch (RouteNotFoundException e) {
            System.out.println("Route not found");
        } finally {
            System.out.println("End of search.");
        }
    }
}
