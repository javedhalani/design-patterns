package com.javedhalani.builder;

public class Computer {

    private String ram;
    private String hdd;
    private boolean isBluetoothEnabled;
    private boolean isGraphicsEnabled;

    private Computer(ComputerBuilder computerBuilder) {
        this.ram = computerBuilder.ram;
        this.hdd = computerBuilder.hdd;
        this.isBluetoothEnabled = computerBuilder.isBluetoothEnabled;
        this.isGraphicsEnabled = computerBuilder.isGraphicsEnabled;
    }


    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    public boolean isGraphicsEnabled() {
        return isGraphicsEnabled;
    }

    public String getRAM() {
        return this.ram;
    }

    public String getHDD() {
        return this.hdd;
    }


    @Override
    public String toString() {
       return String.format("RAM=%s, HDD=%s, CPU=%s", this.getRAM(), this.getHDD());
    }

    public static class ComputerBuilder {

        // Required parameters
        private String ram;
        private String hdd;

        // Optional Parameters
        private boolean isBluetoothEnabled;
        private boolean isGraphicsEnabled;

        public ComputerBuilder(String ram, String hdd) {
            this.ram = ram;
            this.hdd = hdd;
        }

        public ComputerBuilder setGraphicsEnabled(boolean isGraphicsEnabled) {
            this.isGraphicsEnabled = isGraphicsEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }


    }
}
