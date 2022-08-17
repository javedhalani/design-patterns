package com.javedhalani.dependencyinjection;

public class MyDIApplication implements Consumer {

    private MessageService messageService;

    public MyDIApplication(MessageService service) {
        this.messageService = service;
    }

    @Override
    public void processMessages(String message, String receiver) {
        this.messageService.sendMessage(message, receiver);
    }
}
