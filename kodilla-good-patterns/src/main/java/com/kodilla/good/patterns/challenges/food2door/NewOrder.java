package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDateTime;

public interface NewOrder {
    boolean createOrder(Supplier supplier, LocalDateTime when);
}
