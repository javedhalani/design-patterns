package com.javedhalani.adapter;

public class SocketObjectAdapterImpl implements SocketAdapter {

    //Using Composition for adapter pattern
    private Socket sock = new Socket();

    @Override
    public Volt get120Volt() {
        return sock.getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt v = sock.getVolt();
        return convert(v, 10);
    }

    @Override
    public Volt get3Volt() {
        Volt v = sock.getVolt();
        return convert(v, 40);
    }

    private Volt convert(Volt v, int i) {
        return new Volt(v.getVolts() / i);
    }
}
