package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.suppliers.Supplier;

public class SupplierOrderRequest {
    private final Supplier supplier;

    public SupplierOrderRequest(final Supplier supplier) {
        this.supplier = supplier;

    }

    public Supplier getSupplier() {
        return supplier;
    }

}
