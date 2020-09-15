package com.kodilla.good.patterns.challenges.food2door.suppliers;

public class Supplier {
    final String supplierId;
    final String typeOfProduct;
    final int itemQnt;

    public Supplier(final String supplierName, final String typeOfProduct, final int itemQnt) {
        this.supplierId = supplierName;
        this.typeOfProduct = typeOfProduct;
        this.itemQnt = itemQnt;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public String getTypeOfProduct() {
        return typeOfProduct;
    }

    public int getItemQnt() {
        return itemQnt;
    }

}