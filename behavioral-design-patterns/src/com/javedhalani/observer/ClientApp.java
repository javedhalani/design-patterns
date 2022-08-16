package com.javedhalani.observer;

public class ClientApp {

    public static void main(String[] args) {
        // Create Observable
        MyTopic topic = new MyTopic();

        // Create observers and subscribe to the subject
        Observer o1 = new MyTopicSubscriber("O1", topic);
        Observer o2 = new MyTopicSubscriber("O2", topic);
        Observer o3 = new MyTopicSubscriber("O3", topic);
        Observer o4 = new MyTopicSubscriber("O4", topic);

        o1.update();

        topic.postMessage("Hello World");


    }
}
