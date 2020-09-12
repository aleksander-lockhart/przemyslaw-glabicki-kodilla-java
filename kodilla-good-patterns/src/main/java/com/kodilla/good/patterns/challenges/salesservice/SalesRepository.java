package com.kodilla.good.patterns.challenges.salesservice;

import java.time.LocalDateTime;

public interface SalesRepository {

    boolean createTransaction(ShopUser shopUser, LocalDateTime orderDate, String itemId, int itemQuantity);
}
