package com.javedhalani.mediator;

public class ClientApp {

    public static void main(String[] args) {

        ChatMediator mediator = new ChatMediatorImpl();

        User user1 = new UserImpl(mediator, "Javed");
        User user2 = new UserImpl(mediator, "Ashwin");
        User user3 = new UserImpl(mediator, "Pankaj");
        User user4 = new UserImpl(mediator, "David");

        user1.send("Hello All");

    }
}
