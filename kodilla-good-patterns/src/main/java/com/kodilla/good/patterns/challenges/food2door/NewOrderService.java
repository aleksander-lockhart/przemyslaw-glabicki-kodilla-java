package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDateTime;

public class NewOrderService implements NewOrder {
    public boolean createOrder(Supplier newSupplier, LocalDateTime when) {

        System.out.println("Order by the day: " + when.toString() + "\n" + " Order contains: "
                + newSupplier.typeOfProduct + " " + " with quantity: " + newSupplier.itemQnt +
                " from: " + newSupplier.supplierId);
        return true;
    }
}
