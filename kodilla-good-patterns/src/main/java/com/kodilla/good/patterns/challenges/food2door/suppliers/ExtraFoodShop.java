package com.kodilla.good.patterns.challenges.food2door.suppliers;

import com.kodilla.good.patterns.challenges.food2door.Supplier;
import com.kodilla.good.patterns.challenges.food2door.SupplierOrderRequest;

import java.time.LocalDateTime;

public class ExtraFoodShop implements SupplierProcess {

    public boolean process(Supplier supplier, LocalDateTime orderDate) {

        if (supplier.getItemQnt() < 5) {
            System.out.println("Sorry, the order is to low, only " + supplier.getItemQnt()
                    + " of " + supplier.getTypeOfProduct()
                    + " was ordered. You need at least: " + (5 - supplier.getItemQnt()) + " more.");
            System.out.println("You need to order more of " + supplier.getTypeOfProduct());

            return false;

        } else {
            System.out.println("Date: " + orderDate + "\n" + "Order contains: "
                    + supplier.getTypeOfProduct() + " with quantity of: " + supplier.getItemQnt() +
                    " from: " + supplier.getSupplierId());

            return true;
        }
    }
}
