package com.kodilla.patterns.strategy.social.publishby;

import com.kodilla.patterns.strategy.social.SocialPublisher;

public class SnapchatPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "[Snapchat connection enabled] Snapchat video sent";
    }
}
