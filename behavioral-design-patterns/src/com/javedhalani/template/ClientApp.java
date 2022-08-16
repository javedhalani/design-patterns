package com.javedhalani.template;

public class ClientApp {

    public static void main(String[] args) {
        HouseTemplate houseType = new WoodenHouse();

        // Using template method
        houseType.buildHouse();
        System.out.println("*********");

        houseType = new GlassHouse();
        houseType.buildHouse();
    }
}
