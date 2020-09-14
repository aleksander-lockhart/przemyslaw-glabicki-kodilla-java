package com.kodilla.good.patterns.challenges.food2door;

public class SupplierOrderDto {
    public Supplier supplier;
    public boolean gotNewOrder;

    public SupplierOrderDto(Supplier supplier, boolean gotNewOrder) {
        this.supplier = supplier;
        this.gotNewOrder = gotNewOrder;
    }

    public Supplier getNewSupplier() {
        return supplier;
    }

    public boolean gotNewOrder() {
        return gotNewOrder;
    }
}
