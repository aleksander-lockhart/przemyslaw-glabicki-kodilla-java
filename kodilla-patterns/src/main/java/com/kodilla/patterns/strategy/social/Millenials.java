package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishby.FacebookPublisher;

public class Millenials extends User {
    public Millenials(String name) {
        super(name);
        this.socialpublisher = new FacebookPublisher();
    }
}