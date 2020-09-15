package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.suppliers.Supplier;

import java.time.LocalDateTime;

public class OrderRequest {

    private final Supplier supplier;
    private final LocalDateTime orderTime;

    public OrderRequest(final Supplier supplier, final LocalDateTime orderTime) {
        this.supplier = supplier;
        this.orderTime = orderTime;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }
}
