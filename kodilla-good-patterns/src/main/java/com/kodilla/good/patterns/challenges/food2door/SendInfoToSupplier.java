package com.kodilla.good.patterns.challenges.food2door;

public class SendInfoToSupplier implements InformationService {

    public void sendInfoToSupplier(Supplier supplier) {
        System.out.println("New Order information send to supplier: "
                + supplier.getSupplierId());
    }
}
