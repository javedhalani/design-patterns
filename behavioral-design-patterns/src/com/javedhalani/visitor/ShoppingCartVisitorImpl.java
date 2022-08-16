package com.javedhalani.visitor;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {
    @Override
    public int visit(Book book) {
        int cost = book.getPrice();
        // apply Rs.50 discount if price above Rs.500
        if (book.getPrice() > 500) {
            cost -= 50;
        }
        System.out.println("Price of book -> " + cost);
        return cost;
    }

    @Override
    public int visit(Fruit fruit) {
        int cost = fruit.getPricePerKg() * fruit.getWeight();
        System.out.println("Price of fruit -> " + cost);
        return cost;
    }
}
