package com.javedhalani.composite;

public class ClientApp {

    public static void main(String[] args) {
        Shape tri1 = new Triangle();
        Shape tri2 = new Triangle();
        Shape circle = new Circle();

        Diagram board = new Diagram();
        board.add(tri1);
        board.add(tri2);
        board.add(circle);

        board.draw("red");

        board.clear();

        board.add(circle);
        board.add(tri1);

        board.draw("blue");
    }
}
