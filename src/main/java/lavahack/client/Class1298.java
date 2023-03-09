/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.io.IOException;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.List;
import lavahack.client.Class1302;
import lavahack.client.Class1588;
import lavahack.client.Class1715;
import lavahack.client.Class1728;
import lavahack.client.Class2129;
import lavahack.client.Class630;

public class Class1298
implements Class1588 {
    private String Field13931 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public Class1302 Method1314(Class630 class630, Class2129 class2129) {
        return new Class1302((Class1715)class630, class2129);
    }

    @Override
    public Class1302 Method1315(Class630 class630, List list) {
        return new Class1302((Class1715)class630, list);
    }

    public SocketChannel Method5266(SocketChannel socketChannel, SelectionKey selectionKey) {
        return socketChannel;
    }

    @Override
    public void Method1317() {
    }

    @Override
    public ByteChannel Method1316(SocketChannel socketChannel, SelectionKey selectionKey) throws IOException {
        return this.Method5266(socketChannel, selectionKey);
    }

    @Override
    public Class1728 Method1313(Class630 class630, List list) {
        return this.Method1315(class630, list);
    }

    @Override
    public Class1728 Method1312(Class630 class630, Class2129 class2129) {
        return this.Method1314(class630, class2129);
    }
}

