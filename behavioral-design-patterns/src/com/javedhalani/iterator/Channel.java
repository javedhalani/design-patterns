package com.javedhalani.iterator;

public class Channel {

    private double frequency;
    private ChannelType channelType;

    public Channel(double frequency, ChannelType channelType) {
        this.frequency = frequency;
        this.channelType = channelType;
    }

    public double getFrequency() {
        return frequency;
    }

    public ChannelType getChannelType() {
        return channelType;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "frequency=" + frequency +
                ", channelType=" + channelType +
                '}';
    }
}
