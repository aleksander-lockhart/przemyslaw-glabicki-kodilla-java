package com.kodilla.patterns.singleton;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void logALog() {
        Logger.getInstance().log("He felt that his whole life was some kind of dream and he sometimes" +
                " wondered whose it was and whether they were enjoying it.");
    }

    @Test
    public void testGetFileName() {
        //Given
        //When
        String checkLog = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("He felt that his whole life was some kind of dream and he sometimes" +
                " wondered whose it was and whether they were enjoying it.", checkLog);
    }
}
