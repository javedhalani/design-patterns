package com.javedhalani.factory;

import java.util.Locale;

public class ComputerFactory {

    public static Computer getComputer(String type, String ram, String hdd, String cpu) {
        return switch (type.toLowerCase(Locale.ROOT)) {
            case "pc" -> new PC(ram, hdd, cpu);
            case "server" -> new Server(ram, hdd, cpu);
            default -> throw new RuntimeException("Invalid Computer Type");
        };
    }
}
