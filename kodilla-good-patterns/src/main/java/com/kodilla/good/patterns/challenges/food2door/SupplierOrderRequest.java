package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDateTime;

public class SupplierOrderRequest {
    public Supplier supplier;
    public LocalDateTime when;


    public SupplierOrderRequest(Supplier supplier, LocalDateTime when) {
        this.supplier = supplier;
        this.when = when;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public LocalDateTime getWhen() {
        return when;
    }

}
