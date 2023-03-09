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
import lavahack.client.Class1313;
import lavahack.client.Class566;

public class Class1899
extends Class1313 {
    private final String[] Field16737;
    private final String[] Field16738;
    private String Field16739 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1899(SSLContext sSLContext, String[] stringArray, String[] stringArray2) {
        this(sSLContext, Executors.newSingleThreadScheduledExecutor(), stringArray, stringArray2);
    }

    public Class1899(SSLContext sSLContext, ExecutorService executorService, String[] stringArray, String[] stringArray2) {
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
        sSLEngine.setUseClientMode(false);
        return new Class566(socketChannel, sSLEngine, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, selectionKey);
    }
}

