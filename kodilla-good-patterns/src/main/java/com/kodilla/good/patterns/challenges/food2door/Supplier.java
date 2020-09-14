package com.kodilla.good.patterns.challenges.food2door;

public class Supplier {
    String supplierId;
    String typeOfProduct;
    int itemQnt;

    public Supplier(String supplierName, String typeOfProduct, int itemQnt) {
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