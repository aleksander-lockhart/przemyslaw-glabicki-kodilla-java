package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.suppliers.Supplier;

import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrieveOrder() {

        Supplier newSupplier = new Supplier("ExtraFoodShop",
                "Crazy New Anti-Meat Sausage", 12);

        LocalDateTime orderDate = LocalDateTime.now();

        return new OrderRequest(newSupplier, orderDate);
    }
}
