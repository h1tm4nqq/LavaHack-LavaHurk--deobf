//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.concurrent.*;
import java.nio.channels.*;
import javax.net.ssl.*;
import java.io.*;
import java.util.*;

public class Class1313 implements Class1588
{
    protected SSLContext Field14042;
    protected ExecutorService Field14043;
    private int Field14044;
    
    public Class1313(final SSLContext sslContext) {
        this(sslContext, Executors.newSingleThreadScheduledExecutor());
    }
    
    public Class1313(final SSLContext field14042, final ExecutorService field14043) {
        if (field14042 == null || field14043 == null) {
            throw new IllegalArgumentException();
        }
        this.Field14042 = field14042;
        this.Field14043 = field14043;
    }
    
    @Override
    public ByteChannel Method1316(final SocketChannel socketChannel, final SelectionKey selectionKey) throws IOException {
        final SSLEngine sslEngine = this.Field14042.createSSLEngine();
        final ArrayList list = new ArrayList(Arrays.asList(sslEngine.getEnabledCipherSuites()));
        list.remove("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
        sslEngine.setEnabledCipherSuites((String[])list.toArray((Object[])new String[list.size()]));
        sslEngine.setUseClientMode(false);
        return new Class566(socketChannel, sslEngine, this.Field14043, selectionKey);
    }
    
    @Override
    public Class1302 Method1314(final Class630 class630, final Class2129 class631) {
        return new Class1302((Class1715)class630, class631);
    }
    
    @Override
    public Class1302 Method1315(final Class630 class630, final List list) {
        return new Class1302((Class1715)class630, list);
    }
    
    @Override
    public void Method1317() {
        this.Field14043.shutdown();
    }
    
    @Override
    public Class1728 Method1313(final Class630 class630, final List list) {
        return (Class1728)this.Method1315(class630, list);
    }
    
    @Override
    public Class1728 Method1312(final Class630 class630, final Class2129 class631) {
        return (Class1728)this.Method1314(class630, class631);
    }
    
    private static String Method1318(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x49CC ^ 0x41));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
