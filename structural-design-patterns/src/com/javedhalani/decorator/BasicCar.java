package com.javedhalani.decorator;

public class BasicCar implements Car {
    @Override
    public void assemble() {
        System.out.println("Basic Car");
    }
}
