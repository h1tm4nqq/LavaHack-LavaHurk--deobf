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
import lavahack.client.C9MSz32V0EKndBPfEqNcwAnfZSHg376Q;
import lavahack.client.DkMZhn6HTXSMui7v30mYhxPkVEtejJaC;
import lavahack.client.IYRAvQCOnwZV7mgto0ownJdj7n804cPz;
import lavahack.client.ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA;
import lavahack.client.Zlk9e3kfSWGG6zqSbWF0nVPgAvKtrhFE;
import lavahack.client.rWOxkXahfy879ZWg1QDRw2hroxYTBucF;
import lavahack.client.uQKOoahkszGy7ruMVUluuBYlQ2nrh0lz;

public class PiJFf6a1dI6QrvLQD6Yf8hzX0KgFm5m9
implements C9MSz32V0EKndBPfEqNcwAnfZSHg376Q {
    protected SSLContext Field14042;
    protected ExecutorService Field14043;
    private int Field14044;

    public PiJFf6a1dI6QrvLQD6Yf8hzX0KgFm5m9(SSLContext sSLContext) {
        this(sSLContext, Executors.newSingleThreadScheduledExecutor());
    }

    public PiJFf6a1dI6QrvLQD6Yf8hzX0KgFm5m9(SSLContext sSLContext, ExecutorService executorService) {
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
        sSLEngine.setUseClientMode(((int)-1316781928L ^ 0xB1838098) != 0);
        return new uQKOoahkszGy7ruMVUluuBYlQ2nrh0lz(socketChannel, sSLEngine, this.Field14043, selectionKey);
    }

    @Override
    public rWOxkXahfy879ZWg1QDRw2hroxYTBucF Method1314(Zlk9e3kfSWGG6zqSbWF0nVPgAvKtrhFE zlk9e3kfSWGG6zqSbWF0nVPgAvKtrhFE, DkMZhn6HTXSMui7v30mYhxPkVEtejJaC dkMZhn6HTXSMui7v30mYhxPkVEtejJaC) {
        return new rWOxkXahfy879ZWg1QDRw2hroxYTBucF((IYRAvQCOnwZV7mgto0ownJdj7n804cPz)zlk9e3kfSWGG6zqSbWF0nVPgAvKtrhFE, dkMZhn6HTXSMui7v30mYhxPkVEtejJaC);
    }

    @Override
    public rWOxkXahfy879ZWg1QDRw2hroxYTBucF Method1315(Zlk9e3kfSWGG6zqSbWF0nVPgAvKtrhFE zlk9e3kfSWGG6zqSbWF0nVPgAvKtrhFE, List list) {
        return new rWOxkXahfy879ZWg1QDRw2hroxYTBucF((IYRAvQCOnwZV7mgto0ownJdj7n804cPz)zlk9e3kfSWGG6zqSbWF0nVPgAvKtrhFE, list);
    }

    @Override
    public void Method1317() {
        this.Field14043.shutdown();
    }

    @Override
    public ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA Method1313(Zlk9e3kfSWGG6zqSbWF0nVPgAvKtrhFE zlk9e3kfSWGG6zqSbWF0nVPgAvKtrhFE, List list) {
        return this.Method1315(zlk9e3kfSWGG6zqSbWF0nVPgAvKtrhFE, list);
    }

    @Override
    public ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA Method1312(Zlk9e3kfSWGG6zqSbWF0nVPgAvKtrhFE zlk9e3kfSWGG6zqSbWF0nVPgAvKtrhFE, DkMZhn6HTXSMui7v30mYhxPkVEtejJaC dkMZhn6HTXSMui7v30mYhxPkVEtejJaC) {
        return this.Method1314(zlk9e3kfSWGG6zqSbWF0nVPgAvKtrhFE, dkMZhn6HTXSMui7v30mYhxPkVEtejJaC);
    }

    private static String Method1318(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1791550449L ^ 0x95371C0F;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)554042320L ^ 0x2106032F);
            int n2 = (int)((long)1056337254 ^ (long)1056337191);
            cArray2[n] = (char)(cArray[n] ^ (((int)-1914927561L ^ 0x8DDC9444) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

