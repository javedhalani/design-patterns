package com.javedhalani.dependencyinjection;

public class EmailServiceInjector implements MessageServiceInjector {
    @Override
    public Consumer getConsumer() {
        return new MyDIApplication(new EmailServiceImpl());
    }
}
