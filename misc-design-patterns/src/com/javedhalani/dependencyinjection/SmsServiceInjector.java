package com.javedhalani.dependencyinjection;

public class SmsServiceInjector implements MessageServiceInjector {
    @Override
    public Consumer getConsumer() {
        return new MyDIApplication(new SmsServiceImpl());
    }
}
