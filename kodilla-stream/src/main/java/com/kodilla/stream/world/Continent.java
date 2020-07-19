package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    final List<Country> countryList = new ArrayList<>();

    public Continent() {
    }

    public List<Country> getCountryList() {
        return countryList;
    }
}
