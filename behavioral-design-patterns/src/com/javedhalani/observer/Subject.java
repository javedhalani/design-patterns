package com.javedhalani.observer;

public interface Subject {

    void subscribe(Observer observer);

    void unsubscribe(Observer observer);

    void notifyAllObservers();

    Object getUpdate(Observer observer);
}
