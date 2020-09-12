package com.kodilla.good.patterns.challenges.salesservice;

import java.time.LocalDateTime;

public class TransactionRetriever {

    public SaleRequest getRequest() {

        ShopUser shopUser = new ShopUser("Lesia", "Neverwhere");
        LocalDateTime orderDate = LocalDateTime.now();
        String itemName = "Sample item";
        int itemQuantity = 2;

        return new SaleRequest(shopUser, orderDate, itemName,itemQuantity);
    }
}
