//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.concurrent.*;
import java.nio.channels.*;
import javax.net.ssl.*;
import java.io.*;

public class Class238 extends Class1313
{
    private final SSLParameters Field9038;
    private String Field9039 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class238(final SSLContext sslContext, final SSLParameters sslParameters) {
        this(sslContext, Executors.newSingleThreadScheduledExecutor(), sslParameters);
    }
    
    public Class238(final SSLContext sslContext, final ExecutorService executorService, final SSLParameters field9038) {
        super(sslContext, executorService);
        if (field9038 == null) {
            throw new IllegalArgumentException();
        }
        this.Field9038 = field9038;
    }
    
    public ByteChannel Method1316(final SocketChannel socketChannel, final SelectionKey selectionKey) throws IOException {
        final SSLEngine sslEngine = this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.createSSLEngine();
        sslEngine.setUseClientMode(false);
        sslEngine.setSSLParameters(this.Field9038);
        return new Class566(socketChannel, sslEngine, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, selectionKey);
    }
}
