/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.URI;
import java.nio.ByteBuffer;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import lavahack.client.Class1088;
import lavahack.client.Class1234;
import lavahack.client.Class1260;
import lavahack.client.Class1302;
import lavahack.client.Class1436;
import lavahack.client.Class1609;
import lavahack.client.Class1690;
import lavahack.client.Class1715;
import lavahack.client.Class1728;
import lavahack.client.Class2049;
import lavahack.client.Class2129;
import lavahack.client.Class482;
import lavahack.client.Class628;
import lavahack.client.Class641;
import lavahack.client.Class71;
import lavahack.client.Class739;
import lavahack.client.Class927;

public abstract class Class168
extends Class641
implements Runnable,
Class1728 {
    protected URI Field8703 = null;
    private Class1302 Field8704 = null;
    private Socket Field8705 = null;
    private SocketFactory Field8706 = null;
    private OutputStream Field8707;
    private Proxy Field8708 = Proxy.NO_PROXY;
    private Thread Field8709;
    private Thread Field8710;
    private Class2129 Field8711;
    private Map Field8712;
    private CountDownLatch Field8713 = new CountDownLatch(1);
    private CountDownLatch Field8714 = new CountDownLatch(1);
    private int Field8715 = 0;
    private Class628 Field8716 = null;
    private String Field8717 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class168(URI uRI) {
        this(uRI, new Class1088());
    }

    public Class168(URI uRI, Class2129 class2129) {
        this(uRI, class2129, null, 0);
    }

    public Class168(URI uRI, Map map) {
        this(uRI, new Class1088(), map);
    }

    public Class168(URI uRI, Class2129 class2129, Map map) {
        this(uRI, class2129, map, 0);
    }

    public Class168(URI uRI, Class2129 class2129, Map map, int n) {
        if (uRI == null) {
            throw new IllegalArgumentException();
        }
        if (class2129 == null) {
            throw new IllegalArgumentException("null as draft is permitted for `WebSocketServer` only!");
        }
        this.Field8703 = uRI;
        this.Field8711 = class2129;
        this.Field8716 = new Class1436(this);
        if (map != null) {
            this.Field8712 = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            this.Field8712.putAll(map);
        }
        this.Field8715 = n;
        this.Method530(false);
        this.Method532(false);
        this.Field8704 = new Class1302((Class1715)this, class2129);
    }

    public URI Method563() {
        return this.Field8703;
    }

    @Override
    public Class2129 Method555() {
        return this.Field8711;
    }

    public Socket Method564() {
        return this.Field8705;
    }

    public void Method565(String string, String string2) {
        if (this.Field8712 == null) {
            this.Field8712 = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        }
        this.Field8712.put(string, string2);
    }

    public String Method566(String string) {
        if (this.Field8712 != null) return (String)this.Field8712.remove(string);
        return null;
    }

    public void Method567() {
        this.Field8712 = null;
    }

    public void Method568(Class628 class628) {
        this.Field8716 = class628;
    }

    public void Method569() {
        this.Method525();
        this.Method571();
    }

    public boolean Method570() throws InterruptedException {
        this.Method525();
        return this.Method572();
    }

    private void Method525() {
        Thread thread = Thread.currentThread();
        if (thread == this.Field8709) throw new IllegalStateException("You cannot initialize a reconnect out of the websocket thread. Use reconnect in another thread to ensure a successful cleanup.");
        if (thread == this.Field8710) {
            throw new IllegalStateException("You cannot initialize a reconnect out of the websocket thread. Use reconnect in another thread to ensure a successful cleanup.");
        }
        this.Method574();
        if (this.Field8709 != null) {
            this.Field8709.interrupt();
            this.Field8709 = null;
        }
        if (this.Field8710 != null) {
            this.Field8710.interrupt();
            this.Field8710 = null;
        }
        this.Field8711.Method4405();
        if (this.Field8705 != null) {
            this.Field8705.close();
            this.Field8705 = null;
        }
        this.Field8713 = new CountDownLatch(1);
        this.Field8714 = new CountDownLatch(1);
        this.Field8704 = new Class1302((Class1715)this, this.Field8711);
    }

    public void Method571() {
        if (this.Field8710 != null) {
            throw new IllegalStateException("WebSocketClient objects are not reuseable");
        }
        this.Field8710 = new Thread(this);
        this.Field8710.setName("WebSocketConnectReadThread-" + this.Field8710.getId());
        this.Field8710.start();
    }

    public boolean Method572() throws InterruptedException {
        this.Method571();
        this.Field8713.await();
        return this.Field8704.Method551();
    }

    public boolean Method573(long l, TimeUnit timeUnit) throws InterruptedException {
        this.Method571();
        if (!this.Field8713.await(l, timeUnit)) return false;
        if (!this.Field8704.Method551()) return false;
        return true;
    }

    @Override
    public void Method539() {
        if (this.Field8709 == null) return;
        this.Field8704.Method538(1000);
    }

    public void Method574() throws InterruptedException {
        this.Method539();
        this.Field8714.await();
    }

    @Override
    public void Method541(String string) {
        this.Field8704.Method541(string);
    }

    @Override
    public void Method543(byte[] byArray) {
        this.Field8704.Method543(byArray);
    }

    @Override
    public Object Method559() {
        return this.Field8704.Method559();
    }

    @Override
    public void Method558(Object object) {
        this.Field8704.Method558(object);
    }

    @Override
    protected Collection Method527() {
        return Collections.singletonList(this.Field8704);
    }

    @Override
    public void Method546() {
        this.Field8704.Method546();
    }

    @Override
    public void run() {
        int n;
        Object object;
        boolean bl = this.Method576();
        this.Field8705.setTcpNoDelay(this.Method529());
        this.Field8705.setReuseAddress(this.Method531());
        if (!this.Field8705.isConnected()) {
            object = this.Field8716 == null ? InetSocketAddress.createUnresolved(this.Field8703.getHost(), this.Method578()) : new InetSocketAddress(this.Field8716.Method2724(this.Field8703), this.Method578());
            this.Field8705.connect((SocketAddress)object, this.Field8715);
        }
        if (bl && "wss".equals(this.Field8703.getScheme())) {
            this.Method575();
        }
        if (this.Field8705 instanceof SSLSocket) {
            object = (SSLSocket)this.Field8705;
            SSLParameters sSLParameters = ((SSLSocket)object).getSSLParameters();
            this.Method577(sSLParameters);
            ((SSLSocket)object).setSSLParameters(sSLParameters);
        }
        InputStream inputStream = this.Field8705.getInputStream();
        this.Field8707 = this.Field8705.getOutputStream();
        this.Method579();
        this.Field8709 = new Thread(new Class1690(this, this));
        this.Field8709.start();
        byte[] byArray = new byte[16384];
        while (!this.Method552() && !this.Method554() && (n = inputStream.read(byArray)) != -1) {
            this.Field8704.Method5272(ByteBuffer.wrap(byArray, 0, n));
        }
        this.Field8704.Method5283();
        this.Field8710 = null;
    }

    private void Method575() throws NoSuchAlgorithmException, KeyManagementException, IOException {
        SSLSocketFactory sSLSocketFactory;
        if (this.Field8706 instanceof SSLSocketFactory) {
            sSLSocketFactory = (SSLSocketFactory)this.Field8706;
        } else {
            SSLContext sSLContext = SSLContext.getInstance("TLSv1.2");
            sSLContext.init(null, null, null);
            sSLSocketFactory = sSLContext.getSocketFactory();
        }
        this.Field8705 = sSLSocketFactory.createSocket(this.Field8705, this.Field8703.getHost(), this.Method578(), true);
    }

    private boolean Method576() throws IOException {
        boolean bl = false;
        if (this.Field8708 != Proxy.NO_PROXY) {
            this.Field8705 = new Socket(this.Field8708);
            return true;
        }
        if (this.Field8706 != null) {
            this.Field8705 = this.Field8706.createSocket();
            return bl;
        }
        if (this.Field8705 == null) {
            this.Field8705 = new Socket(this.Field8708);
            return true;
        }
        if (!this.Field8705.isClosed()) return bl;
        throw new IOException();
    }

    protected void Method577(SSLParameters sSLParameters) {
        sSLParameters.setEndpointIdentificationAlgorithm("HTTPS");
    }

    private int Method578() {
        int n = this.Field8703.getPort();
        String string = this.Field8703.getScheme();
        if ("wss".equals(string)) {
            if (n == -1) {
                return 443;
            }
            int n2 = n;
            return n2;
        }
        if (!"ws".equals(string)) throw new IllegalArgumentException("unknown scheme: " + string);
        if (n == -1) {
            return 80;
        }
        int n3 = n;
        return n3;
    }

    private void Method579() throws Class71 {
        String string = this.Field8703.getRawPath();
        String string2 = this.Field8703.getRawQuery();
        String string3 = string == null || string.length() == 0 ? "/" : string;
        if (string2 != null) {
            string3 = string3 + '?' + string2;
        }
        int n = this.Method578();
        String string4 = this.Field8703.getHost() + (n != 80 && n != 443 ? ":" + n : "");
        Class2049 class2049 = new Class2049();
        class2049.Method7008(string3);
        class2049.Method6("Host", string4);
        if (this.Field8712 != null) {
            for (Map.Entry entry : this.Field8712.entrySet()) {
                class2049.Method6((String)entry.getKey(), (String)entry.getValue());
            }
        }
        this.Field8704.Method5286(class2049);
    }

    @Override
    public Class1609 Method556() {
        return this.Field8704.Method556();
    }

    @Override
    public final void Method508(Class1728 class1728, String string) {
        this.Method584(string);
    }

    @Override
    public final void Method509(Class1728 class1728, ByteBuffer byteBuffer) {
        this.Method587(byteBuffer);
    }

    @Override
    public final void Method510(Class1728 class1728, Class739 class739) {
        this.Method524();
        this.Method583((Class482)class739);
        this.Field8713.countDown();
    }

    @Override
    public final void Method511(Class1728 class1728, int n, String string, boolean bl) {
        this.Method523();
        if (this.Field8709 != null) {
            this.Field8709.interrupt();
        }
        this.Method585(n, string, bl);
        this.Field8713.countDown();
        this.Field8714.countDown();
    }

    @Override
    public final void Method514(Class1728 class1728, Exception exception) {
        this.Method586(exception);
    }

    @Override
    public final void Method518(Class1728 class1728) {
    }

    @Override
    public void Method513(Class1728 class1728, int n, String string) {
        this.Method580(n, string);
    }

    @Override
    public void Method512(Class1728 class1728, int n, String string, boolean bl) {
        this.Method581(n, string, bl);
    }

    public void Method580(int n, String string) {
    }

    public void Method581(int n, String string, boolean bl) {
    }

    public Class1728 Method582() {
        return this.Field8704;
    }

    @Override
    public InetSocketAddress Method519(Class1728 class1728) {
        if (this.Field8705 == null) return null;
        return (InetSocketAddress)this.Field8705.getLocalSocketAddress();
    }

    @Override
    public InetSocketAddress Method520(Class1728 class1728) {
        if (this.Field8705 == null) return null;
        return (InetSocketAddress)this.Field8705.getRemoteSocketAddress();
    }

    public abstract void Method583(Class482 var1);

    public abstract void Method584(String var1);

    public abstract void Method585(int var1, String var2, boolean var3);

    public abstract void Method586(Exception var1);

    public void Method587(ByteBuffer byteBuffer) {
    }

    public void Method588(Proxy proxy) {
        if (proxy == null) {
            throw new IllegalArgumentException();
        }
        this.Field8708 = proxy;
    }

    @Deprecated
    @Deprecated
    public void Method589(Socket socket) {
        if (this.Field8705 != null) {
            throw new IllegalStateException("socket has already been set");
        }
        this.Field8705 = socket;
    }

    public void Method590(SocketFactory socketFactory) {
        this.Field8706 = socketFactory;
    }

    @Override
    public void Method547(Class927 class927, ByteBuffer byteBuffer, boolean bl) {
        this.Field8704.Method547(class927, byteBuffer, bl);
    }

    @Override
    public boolean Method551() {
        return this.Field8704.Method551();
    }

    @Override
    public boolean Method553() {
        return this.Field8704.Method553();
    }

    @Override
    public boolean Method554() {
        return this.Field8704.Method554();
    }

    @Override
    public boolean Method552() {
        return this.Field8704.Method552();
    }

    @Override
    public boolean Method548() {
        return this.Field8704.Method548();
    }

    @Override
    public void Method538(int n) {
        this.Field8704.Method538(n);
    }

    @Override
    public void Method537(int n, String string) {
        this.Field8704.Method537(n, string);
    }

    @Override
    public void Method540(int n, String string) {
        this.Field8704.Method540(n, string);
    }

    @Override
    public void Method542(ByteBuffer byteBuffer) {
        this.Field8704.Method542(byteBuffer);
    }

    @Override
    public void Method544(Class1260 class1260) {
        this.Field8704.Method544(class1260);
    }

    @Override
    public void Method545(Collection collection) {
        this.Field8704.Method545(collection);
    }

    @Override
    public InetSocketAddress Method550() {
        return this.Field8704.Method550();
    }

    @Override
    public InetSocketAddress Method549() {
        return this.Field8704.Method549();
    }

    @Override
    public String Method557() {
        return this.Field8703.getPath();
    }

    @Override
    public boolean Method560() {
        return this.Field8705 instanceof SSLSocket;
    }

    @Override
    public SSLSession Method561() {
        if (this.Method560()) return ((SSLSocket)this.Field8705).getSession();
        throw new IllegalArgumentException("This websocket uses ws instead of wss. No SSLSession available.");
    }

    @Override
    public Class1234 Method562() {
        return this.Field8704.Method562();
    }

    private void Method591(IOException iOException) {
        if (iOException instanceof SSLException) {
            this.Method586(iOException);
        }
        this.Field8704.Method5283();
    }

    static void Method592(Class168 class168, IOException iOException) {
        class168.Method591(iOException);
    }

    static Thread Method593(Class168 class168, Thread thread) {
        class168.Field8709 = thread;
        return class168.Field8709;
    }

    static Class1302 Method594(Class168 class168) {
        return class168.Field8704;
    }

    static OutputStream Method595(Class168 class168) {
        return class168.Field8707;
    }

    static Socket Method596(Class168 class168) {
        return class168.Field8705;
    }

    private static String Method536(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 170;
            cArray2[n] = (char)(cArray[n] ^ (0x74B6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

