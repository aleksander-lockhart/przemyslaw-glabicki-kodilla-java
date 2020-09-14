package com.kodilla.good.patterns.challenges.food2door;

public class SendOrderInformation implements InfoForNewOrder {
    public void sendInfoToSupplier(Supplier supplier) {
        System.out.println("New Order information send to supplier: "
                + supplier.getSupplierId());
    }
}
