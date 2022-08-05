package com.javedhalani.abstractfactory;

public class ClientApp {

    public static void main(String[] args) {
        ComputerAbstractFactory pcFactory = new PCFactory("16", "256GB", "Core i5");
        ComputerAbstractFactory serverFactory = new ServerFactory("64", "1TB", "Core i7");

        Computer pc = ComputerFactory.getComputer(pcFactory);
        Computer server = ComputerFactory.getComputer(serverFactory);

        System.out.println("PC Details : " + pc.toString());
        System.out.println("Server Details : " + server.toString());
    }
}
