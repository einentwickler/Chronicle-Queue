package net.openhft.chronicle.queue.impl;

import net.openhft.chronicle.queue.Chronicle;
import net.openhft.chronicle.queue.ExcerptAppender;
import net.openhft.chronicle.wire.WireOut;
import net.openhft.lang.io.Bytes;

/**
 * Created by peter.lawrey on 30/01/15.
 */
public class SingleAppender implements ExcerptAppender {

    @Override
    public WireOut wire() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Bytes bytes() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void startExcerpt() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void startExcerpt(long capacity) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean nextSynchronous() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nextSynchronous(boolean nextSynchronous) {
        throw new UnsupportedOperationException();
    }

    @Override
    public long lastWrittenIndex() {
        throw new UnsupportedOperationException();
    }

    @Override
    public long index() {
        throw new UnsupportedOperationException();
    }

    @Override
    public long size() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Chronicle chronicle() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void finish() {
        throw new UnsupportedOperationException();
    }
}
