package com.javedhalani.dependencyinjection;

public class ClientApp2 {

    public static void main(String[] args) {
        String message = "Hi Javed";
        String receiver = "abc@example.com";

        MessageServiceInjector messageServiceInjector = null;
        Consumer app = null;

        messageServiceInjector = new EmailServiceInjector();
        app = messageServiceInjector.getConsumer();
        app.processMessages(message, receiver);


        messageServiceInjector = new SmsServiceInjector();
        app = messageServiceInjector.getConsumer();
        app.processMessages(message, receiver);

    }
}
