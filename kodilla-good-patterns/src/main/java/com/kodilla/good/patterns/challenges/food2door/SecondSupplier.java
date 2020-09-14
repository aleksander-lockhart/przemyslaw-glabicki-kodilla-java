package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDateTime;

public class SecondSupplier {
    public SupplierOrderRequest process() {

        Supplier secondSupplier = new Supplier("ExtraFoodShop",
                "Crazy New Anti-Meat Sausage", 12);
        LocalDateTime when = LocalDateTime.of(2020, 9, 10, 10, 44);

        return new SupplierOrderRequest(secondSupplier, when);
    }
}
