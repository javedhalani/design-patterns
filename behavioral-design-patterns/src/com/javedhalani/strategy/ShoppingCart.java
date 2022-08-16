package com.javedhalani.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private final List<Item> itemList;

    public ShoppingCart() {
        this.itemList = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.itemList.add(item);
    }

    public void removeItem(Item item) {
        this.itemList.remove(item);
    }

    public int calculateTotal() {
        return this.itemList.stream()
                .map(Item::getPrice)
                .reduce(0, Integer::sum);
    }

    public void pay(PaymentStrategy paymentMethod) {
        paymentMethod.pay(calculateTotal());
    }

}
