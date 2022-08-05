package com.javedhalani.builder;

public class ClientApp {

    public static void main(String[] args) {

        Computer.ComputerBuilder builder = new Computer.ComputerBuilder("16", "256GB");
        Computer pc = builder
                .setBluetoothEnabled(true)
                .setGraphicsEnabled(true)
                .build();

    }
}
