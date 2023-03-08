//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.concurrent.*;
import java.nio.channels.*;
import javax.net.ssl.*;
import java.io.*;

public class Class1899 extends Class1313
{
    private final String[] Field16737;
    private final String[] Field16738;
    private String Field16739 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1899(final SSLContext sslContext, final String[] array, final String[] array2) {
        this(sslContext, Executors.newSingleThreadScheduledExecutor(), array, array2);
    }
    
    public Class1899(final SSLContext sslContext, final ExecutorService executorService, final String[] field16737, final String[] field16738) {
        super(sslContext, executorService);
        this.Field16737 = field16737;
        this.Field16738 = field16738;
    }
    
    public ByteChannel Method1316(final SocketChannel socketChannel, final SelectionKey selectionKey) throws IOException {
        final SSLEngine sslEngine = this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.createSSLEngine();
        if (this.Field16737 != null) {
            sslEngine.setEnabledProtocols(this.Field16737);
        }
        if (this.Field16738 != null) {
            sslEngine.setEnabledCipherSuites(this.Field16738);
        }
        sslEngine.setUseClientMode(false);
        return new Class566(socketChannel, sslEngine, this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, selectionKey);
    }
}
