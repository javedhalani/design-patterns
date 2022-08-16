package com.javedhalani.observer;

import java.util.*;

public class MyTopic implements Subject {

    private Set<Observer> observerList;
    private String message;
    private boolean changed;
    private final Object MUTEX = new Object();

    public MyTopic() {
        this.observerList = new HashSet<>();
    }

    @Override
    public void subscribe(Observer observer) {
        Optional.ofNullable(observer)
                .ifPresentOrElse(
                        o -> {
                            synchronized (MUTEX) {
                                this.observerList.add(o);
                            }
                        },
                        () -> {
                            throw new NullPointerException("Observer is null");
                        });

    }

    @Override
    public void unsubscribe(Observer observer) {
        synchronized (MUTEX) {
            this.observerList.remove(observer);
        }
    }

    @Override
    public void notifyAllObservers() {
        synchronized (MUTEX) {
            if (changed) {
                this.observerList.forEach( Observer::update);
                changed = false;
            }
        }
    }

    @Override
    public Object getUpdate(Observer observer) {
        return this.message;
    }

    public void postMessage(String message) {
        System.out.println("Message posted to topic -> " + message);
        this.message = message;
        this.changed = true;
        notifyAllObservers();
    }
}
