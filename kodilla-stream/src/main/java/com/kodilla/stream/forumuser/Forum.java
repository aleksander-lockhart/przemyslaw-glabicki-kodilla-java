package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(1001, "User1", 'M', LocalDate.of(1990, 12, 2), 2));
        forumUserList.add(new ForumUser(1002, "User2", 'F', LocalDate.of(1992, 9, 22), 0));
        forumUserList.add(new ForumUser(1003, "User3", 'F', LocalDate.of(2012, 11, 24), 22));
        forumUserList.add(new ForumUser(1004, "User4", 'M', LocalDate.of(2002, 5, 12), 12));
        forumUserList.add(new ForumUser(1005, "User5", 'F', LocalDate.of(1984, 2, 2), 42));
        forumUserList.add(new ForumUser(1006, "User6", 'M', LocalDate.of(1990, 4, 5), 21));
        forumUserList.add(new ForumUser(1007, "User7", 'M', LocalDate.of(2011, 12, 11), 25));
    }

    public List<ForumUser> getUserList() {
        return forumUserList;
    }
}
