package com.kodilla.patterns.strategy.social.publishby;

import com.kodilla.patterns.strategy.social.SocialPublisher;

public class FacebookPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "[Facebook connection enabled] Facebook post sent";
    }
}