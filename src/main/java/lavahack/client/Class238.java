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
import javax.net.ssl.SSLParameters;
import lavahack.client.Class1313;
import lavahack.client.Class566;

public class Class238
extends Class1313 {
    private final SSLParameters Field9038;
    private String Field9039 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class238(SSLContext sSLContext, SSLParameters sSLParameters) {
        this(sSLContext, Executors.newSingleThreadScheduledExecutor(), sSLParameters);
    }

    public Class238(SSLContext sSLContext, ExecutorService executorService, SSLParameters sSLParameters) {
        super(sSLContext, executorService);
        if (sSLParameters == null) {
            throw new IllegalArgumentException();
        }
        this.Field9038 = sSLParameters;
    }

    @Override
    public ByteChannel Method1316(SocketChannel socketChannel, SelectionKey selectionKey) throws IOException {
        SSLEngine sSLEngine = this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.createSSLEngine();
        sSLEngine.setUseClientMode(false);
        sSLEngine.setSSLParameters(this.Field9038);
        return new Class566(socketChannel, sSLEngine, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, selectionKey);
    }
}

