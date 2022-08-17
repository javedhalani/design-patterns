package com.javedhalani.dependencyinjection;

public class EmailServiceImpl implements MessageService {
    @Override
    public void sendMessage(String message, String receiver) {
        // logic to send email
        System.out.println("Email sent to "+receiver+" with message ->"+message);
    }
}
