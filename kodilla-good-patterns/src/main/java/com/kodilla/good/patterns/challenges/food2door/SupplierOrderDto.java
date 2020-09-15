package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.suppliers.Supplier;

public class SupplierOrderDto {
    private final Supplier supplier;
    private final boolean isOrdered;

    public SupplierOrderDto(final Supplier supplier, final boolean isOrdered) {
        this.supplier = supplier;
        this.isOrdered = isOrdered;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public boolean gotIsOrdered() {
        return isOrdered;
    }
}
