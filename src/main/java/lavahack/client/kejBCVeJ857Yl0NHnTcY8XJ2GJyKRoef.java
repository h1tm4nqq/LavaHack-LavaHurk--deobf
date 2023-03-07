/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.io.IOException;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import lavahack.client.PiJFf6a1dI6QrvLQD6Yf8hzX0KgFm5m9;
import lavahack.client.uQKOoahkszGy7ruMVUluuBYlQ2nrh0lz;

public class kejBCVeJ857Yl0NHnTcY8XJ2GJyKRoef
extends PiJFf6a1dI6QrvLQD6Yf8hzX0KgFm5m9 {
    private final String[] Field16737;
    private final String[] Field16738;
    private String Field16739 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public kejBCVeJ857Yl0NHnTcY8XJ2GJyKRoef(SSLContext sSLContext, String[] stringArray, String[] stringArray2) {
        this(sSLContext, Executors.newSingleThreadScheduledExecutor(), stringArray, stringArray2);
    }

    public kejBCVeJ857Yl0NHnTcY8XJ2GJyKRoef(SSLContext sSLContext, ExecutorService executorService, String[] stringArray, String[] stringArray2) {
        super(sSLContext, executorService);
        this.Field16737 = stringArray;
        this.Field16738 = stringArray2;
    }

    @Override
    public ByteChannel Method1316(SocketChannel socketChannel, SelectionKey selectionKey) throws IOException {
        SSLEngine sSLEngine = this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.createSSLEngine();
        if (this.Field16737 != null) {
            sSLEngine.setEnabledProtocols(this.Field16737);
        }
        if (this.Field16738 != null) {
            sSLEngine.setEnabledCipherSuites(this.Field16738);
        }
        sSLEngine.setUseClientMode(((int)-1452173491L ^ 0xA971974D) != 0);
        return new uQKOoahkszGy7ruMVUluuBYlQ2nrh0lz(socketChannel, sSLEngine, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, selectionKey);
    }
}

