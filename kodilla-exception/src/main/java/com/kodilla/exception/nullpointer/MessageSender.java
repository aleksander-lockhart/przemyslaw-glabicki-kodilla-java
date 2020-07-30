package com.kodilla.exception.nullpointer;

public class MessageSender {
    public void SendMessageTo(User user, String message) throws MessageNotSentException {
        if (user != null) {
            System.out.println("Sending " + message + "to user" + user.getName());
    } else {
            throw new MessageNotSentException("USer was null");
        }

    }
}
