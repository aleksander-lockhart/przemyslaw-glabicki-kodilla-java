package com.kodilla.good.patterns.challenges.salesservice;

import java.time.LocalDateTime;

public class SoldSalesRepository implements SalesRepository {

    public boolean createTransaction(ShopUser shopUser, LocalDateTime orderDate, String itemId, int itemQuantity) {
        System.out.println("User: " + shopUser.getUserName() + " " + shopUser.getUserSurName() + " have bought: "
                + itemId + " || " + "Qnt: " + itemQuantity + " (date: " + orderDate + ")");
    return true;
    }
}
