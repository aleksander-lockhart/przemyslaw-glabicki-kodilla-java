package com.kodilla.good.patterns.challenges.salesservice;

import java.time.LocalDateTime;

public class SaleRequest {

    private ShopUser shopUser;
    private LocalDateTime transactionDate;
    private final String itemName;
    private final int itemQuantity;

    public SaleRequest(final ShopUser shopUser, final LocalDateTime transactionDate, final String itemName, final int itemQuantity) {
        this.shopUser = shopUser;
        this.transactionDate = transactionDate;
        this.itemName = itemName;
        this.itemQuantity = itemQuantity;
    }

    public ShopUser getShopUser() {
        return shopUser;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public String getItemName() {
        return itemName;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }
}
