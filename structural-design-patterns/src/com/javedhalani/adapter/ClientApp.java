package com.javedhalani.adapter;

public class ClientApp {

    public static void main(String[] args) {
        testSocketClassAdapter();
        testSocketObjectAdapter();
    }

    private static void testSocketClassAdapter() {
        SocketAdapter adapter = new SocketClassAdapterImpl();
        Volt volt3 = adapter.get3Volt();
        Volt volt12 = adapter.get12Volt();
        Volt volt120 = adapter.get120Volt();

        System.out.println("3 Volts = " + volt3.getVolts());
        System.out.println("12 Volts = " + volt12.getVolts());
        System.out.println("120 Volts = " + volt120.getVolts());

    }

    private static void testSocketObjectAdapter() {
        SocketAdapter adapter = new SocketObjectAdapterImpl();
        Volt volt3 = adapter.get3Volt();
        Volt volt12 = adapter.get12Volt();
        Volt volt120 = adapter.get120Volt();

        System.out.println("3 Volts = " + volt3.getVolts());
        System.out.println("12 Volts = " + volt12.getVolts());
        System.out.println("120 Volts = " + volt120.getVolts());

    }
}
