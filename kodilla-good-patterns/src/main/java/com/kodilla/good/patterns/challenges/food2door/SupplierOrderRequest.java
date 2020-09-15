package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDateTime;

public class SupplierOrderRequest {
    private final Supplier supplier;

    public SupplierOrderRequest(final Supplier supplier) {
        this.supplier = supplier;

    }

    public Supplier getSupplier() {
        return supplier;
    }

}
