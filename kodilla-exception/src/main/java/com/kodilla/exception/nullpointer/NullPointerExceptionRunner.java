package com.kodilla.exception.nullpointer;

public class NullPointerExceptionRunner {

    public static void main(String[] args) {
        User user = null;

        MessageSender messageSender = new MessageSender();
        try {
            messageSender.SendMessageTo(user, "hello");
        } catch (MessageNotSentException e) {
            System.out.println("Message not sent, prog still running");
        }
        System.out.println("next in line");
    }
}
