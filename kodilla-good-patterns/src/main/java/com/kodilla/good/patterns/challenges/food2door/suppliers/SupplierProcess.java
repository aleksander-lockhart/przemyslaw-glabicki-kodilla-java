package com.kodilla.good.patterns.challenges.food2door.suppliers;

import java.time.LocalDateTime;

public interface SupplierProcess {
    boolean process(Supplier supplier, LocalDateTime orderDate);
}