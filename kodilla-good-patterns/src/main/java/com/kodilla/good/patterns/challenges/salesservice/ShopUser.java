package com.kodilla.good.patterns.challenges.salesservice;

public class ShopUser {

    private final String userName;
    private final String userSurName;

    public ShopUser(final String userName, final String userSurName) {
        this.userName = userName;
        this.userSurName = userSurName;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserSurName() {
        return userSurName;
    }
}
