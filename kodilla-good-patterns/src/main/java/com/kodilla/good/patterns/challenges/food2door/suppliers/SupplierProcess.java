package com.kodilla.good.patterns.challenges.food2door.suppliers;

import com.kodilla.good.patterns.challenges.food2door.Supplier;

import java.time.LocalDateTime;

public interface SupplierProcess {
    boolean process(Supplier supplier, LocalDateTime orderDate);
}