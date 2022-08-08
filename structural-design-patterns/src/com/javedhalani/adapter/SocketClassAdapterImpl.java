package com.javedhalani.adapter;

public class SocketClassAdapterImpl extends Socket implements SocketAdapter {


    @Override
    public Volt get120Volt() {
        return this.getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt v = this.getVolt();
        return convert(v, 10);
    }

    @Override
    public Volt get3Volt() {
        Volt v = this.getVolt();
        return convert(v, 40);
    }

    private Volt convert(Volt v, int i) {
        return new Volt(v.getVolts() / i);
    }
}
