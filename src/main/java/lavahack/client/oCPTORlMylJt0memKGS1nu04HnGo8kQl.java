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
import lavahack.client.PiJFf6a1dI6QrvLQD6Yf8hzX0KgFm5m9;
import lavahack.client.uQKOoahkszGy7ruMVUluuBYlQ2nrh0lz;

public class oCPTORlMylJt0memKGS1nu04HnGo8kQl
extends PiJFf6a1dI6QrvLQD6Yf8hzX0KgFm5m9 {
    private final SSLParameters Field9038;
    private String Field9039 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public oCPTORlMylJt0memKGS1nu04HnGo8kQl(SSLContext sSLContext, SSLParameters sSLParameters) {
        this(sSLContext, Executors.newSingleThreadScheduledExecutor(), sSLParameters);
    }

    public oCPTORlMylJt0memKGS1nu04HnGo8kQl(SSLContext sSLContext, ExecutorService executorService, SSLParameters sSLParameters) {
        super(sSLContext, executorService);
        if (sSLParameters == null) {
            throw new IllegalArgumentException();
        }
        this.Field9038 = sSLParameters;
    }

    @Override
    public ByteChannel Method1316(SocketChannel socketChannel, SelectionKey selectionKey) throws IOException {
        SSLEngine sSLEngine = this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.createSSLEngine();
        sSLEngine.setUseClientMode(((int)-883070659L ^ 0xCB5D693D) != 0);
        sSLEngine.setSSLParameters(this.Field9038);
        return new uQKOoahkszGy7ruMVUluuBYlQ2nrh0lz(socketChannel, sSLEngine, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, selectionKey);
    }
}

