package com.kodilla.good.patterns.challenges.salesservice;

public class InfoService implements SalesInformationService{

    public void inform(ShopUser shopUser) {
        System.out.println("Confirmation mail send to: " + shopUser.getUserSurName() + " " + shopUser.getUserName());
    }
}
