package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    private Statistics statistics;
    private int userQnt;
    private int postsQnt;
    private int commentsQnt;
    private double postPerUser;
    private double commentPerUser;
    private double commentPerPost;

    public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics() {
        userQnt = statistics.usersNames().size();
        postsQnt = statistics.postsCount();
        commentsQnt = statistics.commentsCount();
        postPerUser = ((double)statistics.postsCount()) / statistics.usersNames().size();

        if (commentsQnt == 0) {
            commentPerUser = 0;
        } else {
            commentPerUser = ((double)commentsQnt / statistics.usersNames().size());
            }

        if (postsQnt == 0) {
            commentPerPost = 0;
        } else {
            commentPerPost = ((double)statistics.commentsCount()) / postsQnt;
        }
    }

    public Statistics getStatistics() {
        return statistics;
    }

    public int getUserQnt() {
        return userQnt;
    }

    public int getPostsQnt() {
        return postsQnt;
    }

    public int getCommentsQnt() {
        return commentsQnt;
    }

    public double getPostPerUser() {
        return postPerUser;
    }

    public double getCommentPerUser() {
        return commentPerUser;
    }

    public double getCommentPerPost() {
        return commentPerPost;
    }
}
