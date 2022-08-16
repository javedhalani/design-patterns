package com.javedhalani.template;

public class GlassHouse extends HouseTemplate {
    @Override
    protected void buildWalls() {
        System.out.println("GlassHouse Walls");
    }

    @Override
    protected void buildPillars() {
        System.out.println("GlassHouse Pillars");
    }
}
