package com.javedhalani.strategy;

public class ClientApp {

    public static void main(String[] args) {

        Item item1 = new Item("1234", 10);
        Item item2 = new Item("5786", 40);

        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);

        shoppingCart.pay(new PayPalStrategy("abc@example.com", "pwd"));

    }




}
