/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SocketChannel;
import lavahack.client.DFErp9T9eeNlJpVC6NLojB02MDiAMZoy;

@Deprecated
public class eJ0sijXfKF0a8y0lX4HJUpzQCTepJiBD
implements DFErp9T9eeNlJpVC6NLojB02MDiAMZoy {
    private final ByteChannel Field13564;
    private String Field13565 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Deprecated
    @Deprecated
    public eJ0sijXfKF0a8y0lX4HJUpzQCTepJiBD(ByteChannel byteChannel) {
        this.Field13564 = byteChannel;
    }

    @Deprecated
    @Deprecated
    public eJ0sijXfKF0a8y0lX4HJUpzQCTepJiBD(DFErp9T9eeNlJpVC6NLojB02MDiAMZoy dFErp9T9eeNlJpVC6NLojB02MDiAMZoy) {
        this.Field13564 = dFErp9T9eeNlJpVC6NLojB02MDiAMZoy;
    }

    @Override
    public int read(ByteBuffer byteBuffer) throws IOException {
        return this.Field13564.read(byteBuffer);
    }

    @Override
    public boolean isOpen() {
        return this.Field13564.isOpen();
    }

    @Override
    public void close() throws IOException {
        this.Field13564.close();
    }

    @Override
    public int write(ByteBuffer byteBuffer) throws IOException {
        return this.Field13564.write(byteBuffer);
    }

    @Override
    public boolean Method2482() {
        int n;
        if (this.Field13564 instanceof DFErp9T9eeNlJpVC6NLojB02MDiAMZoy && ((DFErp9T9eeNlJpVC6NLojB02MDiAMZoy)this.Field13564).Method2482()) {
            n = (int)-1381978138L ^ 0xADA0AFE7;
            return n != 0;
        }
        n = (int)((long)-1890623825 ^ (long)-1890623825);
        return n != 0;
    }

    @Override
    public void Method2483() throws IOException {
        if (!(this.Field13564 instanceof DFErp9T9eeNlJpVC6NLojB02MDiAMZoy)) return;
        ((DFErp9T9eeNlJpVC6NLojB02MDiAMZoy)this.Field13564).Method2483();
    }

    @Override
    public boolean Method2484() {
        int n;
        if (this.Field13564 instanceof DFErp9T9eeNlJpVC6NLojB02MDiAMZoy && ((DFErp9T9eeNlJpVC6NLojB02MDiAMZoy)this.Field13564).Method2484()) {
            n = (int)((long)792605212 ^ (long)792605213);
            return n != 0;
        }
        n = (int)((long)946677926 ^ (long)946677926);
        return n != 0;
    }

    @Override
    public int Method2485(ByteBuffer byteBuffer) throws IOException {
        int n;
        if (this.Field13564 instanceof DFErp9T9eeNlJpVC6NLojB02MDiAMZoy) {
            n = ((DFErp9T9eeNlJpVC6NLojB02MDiAMZoy)this.Field13564).Method2485(byteBuffer);
            return n;
        }
        n = (int)((long)1161213382 ^ (long)1161213382);
        return n;
    }

    @Override
    public boolean Method2486() {
        if (this.Field13564 instanceof SocketChannel) {
            return ((SocketChannel)this.Field13564).isBlocking();
        }
        if (!(this.Field13564 instanceof DFErp9T9eeNlJpVC6NLojB02MDiAMZoy)) return ((int)732697723L ^ 0x2BAC147B) != 0;
        return ((DFErp9T9eeNlJpVC6NLojB02MDiAMZoy)this.Field13564).Method2486();
    }
}

