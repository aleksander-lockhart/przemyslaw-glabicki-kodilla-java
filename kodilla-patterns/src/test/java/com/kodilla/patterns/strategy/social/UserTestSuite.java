package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishby.SnapchatPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User johnFace = new Millenials("Hide ur face");
        User emiliaTwitter = new YGeneration("Mrs Ask Me 256 times");
        User alekSnap = new ZGeneration("Chat and Snap");

        //WhenK
        String facePublish = johnFace.sharePost();
        System.out.println("Media selected: " + facePublish);
        String twitterPublish = emiliaTwitter.sharePost();
        System.out.println("Media selected: " + twitterPublish);
        String snapchatPublish = alekSnap.sharePost();
        System.out.println("Media selected: " + snapchatPublish);

        //Then
        Assert.assertEquals("[Facebook connection enabled] Facebook post sent",
                facePublish);
        Assert.assertEquals("[Twitter connection enabled] Twitter post sent",
                twitterPublish);
        Assert.assertEquals("[Snapchat connection enabled] Snapchat video sent",
                snapchatPublish);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User notSoSureSteven = new Millenials("Random Media Clicker");

        //When
        String areUSureSteven = notSoSureSteven.sharePost();
        System.out.println("Media selected: " + areUSureSteven);
        notSoSureSteven.setPublishMethod(new SnapchatPublisher());
        areUSureSteven = notSoSureSteven.sharePost();
        System.out.println("Media changed, now using: " + areUSureSteven);

        //Then
        Assert.assertEquals("[Snapchat connection enabled] Snapchat video sent", areUSureSteven);
    }
}