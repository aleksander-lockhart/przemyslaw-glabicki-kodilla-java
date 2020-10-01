package com.kodilla.patterns.strategy.social;

public class User {

    private final String userName;
    protected SocialPublisher socialpublisher;

    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public String sharePost() {
        return socialpublisher.share();
    }

    public void setPublishMethod(SocialPublisher socialpublisher) {
        this.socialpublisher = socialpublisher;
    }
}
