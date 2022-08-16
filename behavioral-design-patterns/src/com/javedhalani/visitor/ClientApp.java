package com.javedhalani.visitor;

import java.util.Arrays;

public class ClientApp {

    public static void main(String[] args) {
        ItemElement[] items = new ItemElement[]{
                new Book(20, "1234"),
                new Book(100, "5786"),
                new Fruit(10, 2, "Banana"),
                new Fruit(5, 5, "Apple")
        };

        int total = calculateTotal(items);
        System.out.println("Total cost -> " + total );
    }

    private static int calculateTotal(ItemElement[] items) {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        return Arrays.stream(items)
                .map(item -> item.accept(visitor))
                .reduce(0, Integer::sum);
    }
}
