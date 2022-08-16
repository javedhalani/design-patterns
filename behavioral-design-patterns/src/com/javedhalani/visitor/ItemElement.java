package com.javedhalani.visitor;

public interface ItemElement {

    int accept(ShoppingCartVisitor visitor);
}
