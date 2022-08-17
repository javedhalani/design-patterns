package com.javedhalani.iterator;

public class ClientApp {

    public static void main(String[] args) {
        ChannelCollection channels = populateChannels();
        ChannelIterator baseIterator = channels.iterator(ChannelType.ALL);
        while (baseIterator.hasNext()) {
            Channel c = baseIterator.next();
            System.out.println(c.toString());
        }
        System.out.println("***********");
        // English Iterator
        ChannelIterator englishIterator = channels.iterator(ChannelType.ENGLISH);
        while (englishIterator.hasNext()) {
            Channel c = englishIterator.next();
            System.out.println(c.toString());
        }

    }

    public static ChannelCollection populateChannels() {
        ChannelCollection channels = new ChannelCollectionImpl();
        channels.addChannel(new Channel(98.5, ChannelType.ENGLISH));
        channels.addChannel(new Channel(99.5, ChannelType.HINDI));
        channels.addChannel(new Channel(100.5, ChannelType.FRENCH));
        channels.addChannel(new Channel(101.5, ChannelType.ENGLISH));
        channels.addChannel(new Channel(102.5, ChannelType.HINDI));
        channels.addChannel(new Channel(103.5, ChannelType.FRENCH));
        channels.addChannel(new Channel(104.5, ChannelType.ENGLISH));
        channels.addChannel(new Channel(105.5, ChannelType.HINDI));
        channels.addChannel(new Channel(106.5, ChannelType.FRENCH));
        return channels;
    }
}
