package com.javedhalani.observer;

import java.util.Objects;

public class MyTopicSubscriber implements Observer {

    private final String name;
    private Subject topic;


    public MyTopicSubscriber(String name, Subject subject) {
        this.name = name;
        this.topic = subject;
        this.topic.subscribe(this);
    }
    @Override
    public void update() {
        String msg = (String) topic.getUpdate(this);
        if (Objects.isNull(msg)) {
            System.out.println(this.name + ": No Message available in Topic");
        } else {
            System.out.println(this.name + ": Consumed message -> " + msg);
        }

    }

    @Override
    public void setSubject(Subject sub) {
        this.topic = sub;
    }
}
