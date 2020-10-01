package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishby.TwitterPublisher;

public class YGeneration extends User{
    public YGeneration(String name) {
        super(name);
        this.socialpublisher = new TwitterPublisher();
    }
}

