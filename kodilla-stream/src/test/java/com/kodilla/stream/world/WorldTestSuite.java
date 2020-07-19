package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country poland = new Country("Poland", new BigDecimal("45678765434567897"));
        Country spain = new Country("Spain", new BigDecimal("123456765432342"));
        Country germany = new Country("Germany", new BigDecimal("7656789087653243"));
        Country egipt = new Country("Egipt", new BigDecimal("65789876543234567"));
        Country rpa = new Country("RPA", new BigDecimal("4567898765456789"));
        Country china = new Country("China", new BigDecimal("87656009876789876"));
        Country india = new Country("India", new BigDecimal("6576543567876789"));

        Continent europe = new Continent();
        europe.countryList.add(poland);
        europe.countryList.add(spain);
        europe.countryList.add(germany);
        Continent africa = new Continent();
        africa.countryList.add(egipt);
        africa.countryList.add(rpa);
        Continent asia = new Continent();
        asia.countryList.add(china);
        asia.countryList.add(india);
        World worldList = new World();
        worldList.continentList.add(europe);
        worldList.continentList.add(africa);
        worldList.continentList.add(asia);

        //When
        BigDecimal worldTotal = worldList.getPeopleQuantity();


        //Then
        BigDecimal expectedPeople = new BigDecimal("218049340041011503");
        Assert.assertEquals(expectedPeople, worldTotal);
    }
}
