package com.kodilla.testing.forum.statistics;
import org.junit.*;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateAdvStatisticsTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("Test start");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("End of tests");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Test #" + testCounter);
    }

    @Test
    public void testIfPostCountZero() {
        //Given
        Statistics statisticMock = mock(Statistics.class);
        when(statisticMock.postsCount()).thenReturn(0);
        ForumStatistics compute = new ForumStatistics(statisticMock);
        //When
        compute.calculateAdvStatistics();
        //Then
        Assert.assertEquals(0, compute.getPostsQnt());
    }

    @Test
    public void testIfPostCount1000() {
        //Given
        Statistics statisticMock = mock(Statistics.class);
        when(statisticMock.postsCount()).thenReturn(1000);
        ForumStatistics compute = new ForumStatistics(statisticMock);
        //When
        compute.calculateAdvStatistics();
        //Then
        Assert.assertEquals(1000, compute.getPostsQnt());
    }

    @Test
    public void testIfCommentsCountZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(0);
        ForumStatistics compute = new ForumStatistics(statisticsMock);
        //When
        compute.calculateAdvStatistics();
        //Then
        Assert.assertEquals(0, compute.getCommentsQnt());
    }

    @Test
    public void testIfMoreCommentsThenPost() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics compute = new ForumStatistics(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        //When
        compute.calculateAdvStatistics();
        //Then
        Assert.assertEquals(10, compute.getCommentPerPost(), 0);
    }

    @Test
    public void testIfMorePostsThenComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics compute = new ForumStatistics(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(500);
        //When
        compute.calculateAdvStatistics();
        //Then
        Assert.assertEquals(0.5, compute.getCommentPerPost(), 0);
    }

    @Test
    public void testUserCountZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics compute = new ForumStatistics(statisticsMock);
        ArrayList<String> users = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(users);

        //When
        compute.calculateAdvStatistics();
        //Then
        Assert.assertEquals(0, compute.getUserQnt(), 0);
    }

    @Test
    public void testUserCount100() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics compute = new ForumStatistics(statisticsMock);
        ArrayList<String> users = new ArrayList<>();
        for (int i = 0; i <100; i++) {
            users.add("User" + i);
        }
        when(statisticsMock.usersNames()).thenReturn(users);

        //When
        compute.calculateAdvStatistics();
        //Then
        Assert.assertEquals(100, compute.getUserQnt(), 0);
    }

    @Test
    public void testCommentAndPostPerUser() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics compute = new ForumStatistics(statisticsMock);
        ArrayList<String> users = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            users.add("User" + i);
        }
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(20);

        //When
        compute.calculateAdvStatistics();
        //Then
        Assert.assertEquals(20, compute.getPostPerUser(), 0);
        Assert.assertEquals(4, compute.getCommentPerUser(), 0);
    }



}
