package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishby.SnapchatPublisher;

public class ZGeneration extends User{
    public ZGeneration(String name) {
        super(name);
        this.socialpublisher = new SnapchatPublisher();
    }
}
