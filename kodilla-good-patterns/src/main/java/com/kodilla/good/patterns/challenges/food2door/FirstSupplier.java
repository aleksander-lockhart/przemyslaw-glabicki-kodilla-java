package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDateTime;

public class FirstSupplier {
    public SupplierOrderRequest process() {

        Supplier firstSupplier = new Supplier("GlutenFreeShop",
                "GlutenFree HairCut for the go!", 21);
        LocalDateTime when = LocalDateTime.of(2017, 11, 10, 10, 44);

        return new SupplierOrderRequest(firstSupplier, when);
    }
}
