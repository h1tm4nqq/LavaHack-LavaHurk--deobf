/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.io.IOException;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import lavahack.client.Class1302;
import lavahack.client.Class1588;
import lavahack.client.Class1715;
import lavahack.client.Class1728;
import lavahack.client.Class2129;
import lavahack.client.Class566;
import lavahack.client.Class630;

public class Class1313
implements Class1588 {
    protected SSLContext Field14042;
    protected ExecutorService Field14043;
    private int Field14044;

    public Class1313(SSLContext sSLContext) {
        this(sSLContext, Executors.newSingleThreadScheduledExecutor());
    }

    public Class1313(SSLContext sSLContext, ExecutorService executorService) {
        if (sSLContext == null) throw new IllegalArgumentException();
        if (executorService == null) {
            throw new IllegalArgumentException();
        }
        this.Field14042 = sSLContext;
        this.Field14043 = executorService;
    }

    @Override
    public ByteChannel Method1316(SocketChannel socketChannel, SelectionKey selectionKey) throws IOException {
        SSLEngine sSLEngine = this.Field14042.createSSLEngine();
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(sSLEngine.getEnabledCipherSuites()));
        arrayList.remove("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
        sSLEngine.setEnabledCipherSuites(arrayList.toArray(new String[arrayList.size()]));
        sSLEngine.setUseClientMode(false);
        return new Class566(socketChannel, sSLEngine, this.Field14043, selectionKey);
    }

    @Override
    public Class1302 Method1314(Class630 class630, Class2129 class2129) {
        return new Class1302((Class1715)class630, class2129);
    }

    @Override
    public Class1302 Method1315(Class630 class630, List list) {
        return new Class1302((Class1715)class630, list);
    }

    @Override
    public void Method1317() {
        this.Field14043.shutdown();
    }

    @Override
    public Class1728 Method1313(Class630 class630, List list) {
        return this.Method1315(class630, list);
    }

    @Override
    public Class1728 Method1312(Class630 class630, Class2129 class2129) {
        return this.Method1314(class630, class2129);
    }

    private static String Method1318(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 65;
            cArray2[n] = (char)(cArray[n] ^ (0x49CC ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

