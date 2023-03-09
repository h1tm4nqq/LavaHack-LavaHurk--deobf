/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SocketChannel;
import lavahack.client.Class1608;

@Deprecated
public class Class1225
implements Class1608 {
    private final ByteChannel Field13564;
    private String Field13565 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Deprecated
    @Deprecated
    public Class1225(ByteChannel byteChannel) {
        this.Field13564 = byteChannel;
    }

    @Deprecated
    @Deprecated
    public Class1225(Class1608 class1608) {
        this.Field13564 = class1608;
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
        if (!(this.Field13564 instanceof Class1608)) return false;
        if (!((Class1608)this.Field13564).Method2482()) return false;
        return true;
    }

    @Override
    public void Method2483() throws IOException {
        if (!(this.Field13564 instanceof Class1608)) return;
        ((Class1608)this.Field13564).Method2483();
    }

    @Override
    public boolean Method2484() {
        if (!(this.Field13564 instanceof Class1608)) return false;
        if (!((Class1608)this.Field13564).Method2484()) return false;
        return true;
    }

    @Override
    public int Method2485(ByteBuffer byteBuffer) throws IOException {
        if (!(this.Field13564 instanceof Class1608)) return 0;
        int n = ((Class1608)this.Field13564).Method2485(byteBuffer);
        return n;
    }

    @Override
    public boolean Method2486() {
        if (this.Field13564 instanceof SocketChannel) {
            return ((SocketChannel)this.Field13564).isBlocking();
        }
        if (!(this.Field13564 instanceof Class1608)) return false;
        return ((Class1608)this.Field13564).Method2486();
    }
}

