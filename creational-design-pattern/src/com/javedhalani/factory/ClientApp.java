package com.javedhalani.factory;

public class ClientApp {

    public static void main(String[] args) {

        Computer pc = ComputerFactory.getComputer("PC", "16", "256GB", "Core i5");
        Computer server = ComputerFactory.getComputer("Server", "64", "1TB", "Core i7");

        System.out.println("PC Details : " + pc.toString());
        System.out.println("Server Details : " + server.toString());
    }
}
