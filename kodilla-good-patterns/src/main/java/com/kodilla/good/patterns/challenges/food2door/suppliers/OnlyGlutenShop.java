package com.kodilla.good.patterns.challenges.food2door.suppliers;

import java.time.LocalDateTime;

public class OnlyGlutenShop implements SupplierProcess {

    public boolean process(Supplier supplier, LocalDateTime orderDate) {

        if (supplier.getItemQnt() > 10) {
            System.out.println("Sorry, we are out of stock for " + supplier.getTypeOfProduct());

            return false;

        } else {
            System.out.println("Date: " + orderDate + "\n" + "Order contains: "
                    + supplier.getTypeOfProduct() + " with quantity of: " + supplier.getItemQnt() +
                    " from: " + supplier.getSupplierId());

            return true;
        }
    }
}

