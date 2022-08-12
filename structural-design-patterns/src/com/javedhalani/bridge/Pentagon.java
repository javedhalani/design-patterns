package com.javedhalani.bridge;

public class Pentagon extends Shape {

    public Pentagon(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.println("Pentagon colored with ->");
        this.color.applyColor();
    }
}
