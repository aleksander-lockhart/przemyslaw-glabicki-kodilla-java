package com.kodilla.good.patterns.challenges.salesservice;

public class SaleDto {

    private final ShopUser shopUser;
    private final boolean isSold;

    public SaleDto(ShopUser shopUser, boolean isSold) {
        this.shopUser = shopUser;
        this.isSold = isSold;
    }

    public ShopUser getShopUser() {
        return shopUser;
    }

    public boolean isSold() {
        return isSold;
    }
}
