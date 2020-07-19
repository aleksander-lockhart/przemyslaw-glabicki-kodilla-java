package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    final int userID;
    final String userName;
    final char userSex;
    final LocalDate dateOfBirth;
    final int userPostNumber;

    public ForumUser(final int userID, final String userName, final char userSex, final LocalDate dateOfBirth,
                     final int userPostNumber) {
        this.userID = userID;
        this.userName = userName;
        this.userSex = userSex;
        this.dateOfBirth = dateOfBirth;
        this.userPostNumber = userPostNumber;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getUserSex() {
        return userSex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getUserPostNumber() {
        return userPostNumber;
    }

    @Override
    public String toString() {
        return "ForumUser: " +
                "userID= " + userID +
                ", userName= '" + userName + '\'' +
                ", userSex= " + userSex +
                ", dateOfBirth= " + dateOfBirth +
                ", userPostNumber= " + userPostNumber;
    }
}
