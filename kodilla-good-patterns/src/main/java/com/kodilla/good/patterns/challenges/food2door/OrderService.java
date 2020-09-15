package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.suppliers.Supplier;

import java.time.LocalDateTime;

public interface OrderService {
    boolean processOrder(Supplier supplier, LocalDateTime orderTime);
}
