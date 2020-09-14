package com.kodilla.good.patterns.challenges.flightsearch;

public class Main {

    public static void main(String args[]) {

        System.out.println("Search for a flight From Gdansk");
        System.out.println(FlightService.findFlightFrom("Gdansk"));
        System.out.println("");

        System.out.println("Search for a flight To Gdansk");
        System.out.println(FlightService.findFlightTo("Gdansk"));
        System.out.println("");

        System.out.println("Search for a flight From Gdansk to Wroclaw");
        System.out.println(FlightService.findFlightThrough("Gdansk", "Wroclaw", "Krakow"));
    }
}

