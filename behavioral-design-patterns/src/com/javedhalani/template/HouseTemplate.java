package com.javedhalani.template;

public abstract class HouseTemplate {

    // Template method so that child classes cannot inherit
    public final void buildHouse() {
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House is built");
    }

    // Default implementation
    private void buildWindows() {
        System.out.println("Windows added");
    }

    // Methods to be implemented by sub-classes
    protected abstract void buildWalls();

    protected abstract void buildPillars();

    private void buildFoundation() {
        System.out.println("Foundation Built");

    }
}
