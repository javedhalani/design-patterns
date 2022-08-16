package com.javedhalani.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {

    private List<User> users;

    public ChatMediatorImpl() {
        this.users = new ArrayList<>();
    }


    @Override
    public void sendMessage(String message, User user) {
        this.users.stream()
                .filter(u -> !u.getName().equalsIgnoreCase(user.getName()))
                .forEach(u -> u.receive(message));

    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }
}
