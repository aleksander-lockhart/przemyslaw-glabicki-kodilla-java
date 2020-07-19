package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;


import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {
    public static void main(String[] args) {
        Forum forumUsers = new Forum();
        Map<Integer, ForumUser> theResultMapOfUsers = forumUsers.getUserList().stream()
                .filter(user -> user.getUserSex() == 'M')
                .filter(user -> LocalDate.now().getDayOfYear() - user.getDateOfBirth().getYear() < 20)
                .filter(user -> user.getUserPostNumber() > 0)
                .collect(Collectors.toMap(ForumUser::getUserID, user -> user));

        theResultMapOfUsers.entrySet().stream()
                .map(entry -> "User Key: " + entry.getKey() + " >>> " + entry.getValue())
                .forEach(System.out::println);
    }
}