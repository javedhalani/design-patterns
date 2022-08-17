package com.javedhalani.iterator;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollectionImpl implements ChannelCollection {

    private List<Channel> channelList;

    public ChannelCollectionImpl() {
        channelList = new ArrayList<>();
    }

    public ChannelCollectionImpl(List<Channel> channelList) {
        this.channelList = channelList;
    }

    @Override
    public void addChannel(Channel c) {
        this.channelList.add(c);
    }

    @Override
    public void removeChannel(Channel c) {
        this.channelList.remove(c);

    }

    @Override
    public ChannelIterator iterator(ChannelType type) {
        return new ChannelIteratorImpl(type, this.channelList);
    }

    private class ChannelIteratorImpl implements ChannelIterator {

        private final ChannelType type;
        private final List<Channel> channels;
        private int position;

        public ChannelIteratorImpl(ChannelType type, List<Channel> channels) {
            this.type = type;
            this.channels = channels;
        }

        @Override
        public boolean hasNext() {
            while (position < channels.size()) {
                Channel c = channels.get(position);
                if (c.getChannelType().equals(this.type) || type.equals(ChannelType.ALL)) {
                    return true;
                } else {
                    position++;
                }
            }
            return false;
        }

        @Override
        public Channel next() {
            Channel c = channels.get(position);
            position++;
            return c;
        }
    }
}
