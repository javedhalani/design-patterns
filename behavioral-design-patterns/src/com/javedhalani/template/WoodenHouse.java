package com.javedhalani.template;

public class WoodenHouse extends HouseTemplate {
    @Override
    protected void buildWalls() {
        System.out.println("Wooden Walls");
    }

    @Override
    protected void buildPillars() {
        System.out.println("Wooden Pillars");
    }
}
