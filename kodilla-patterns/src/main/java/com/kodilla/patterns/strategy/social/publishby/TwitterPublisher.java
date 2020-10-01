package com.kodilla.patterns.strategy.social.publishby;

import com.kodilla.patterns.strategy.social.SocialPublisher;

public class TwitterPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "[Twitter connection enabled] Twitter post sent";
    }
}