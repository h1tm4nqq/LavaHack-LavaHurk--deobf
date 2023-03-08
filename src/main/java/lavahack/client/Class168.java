//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import javax.net.*;
import java.util.concurrent.*;
import java.net.*;
import java.nio.*;
import java.security.*;
import java.io.*;
import java.util.*;
import javax.net.ssl.*;

public abstract class Class168 extends Class641 implements Runnable, Class1728
{
    protected URI Field8703;
    private Class1302 Field8704;
    private Socket Field8705;
    private SocketFactory Field8706;
    private OutputStream Field8707;
    private Proxy Field8708;
    private Thread Field8709;
    private Thread Field8710;
    private Class2129 Field8711;
    private Map Field8712;
    private CountDownLatch Field8713;
    private CountDownLatch Field8714;
    private int Field8715;
    private Class628 Field8716;
    private String Field8717 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class168(final URI uri) {
        this(uri, (Class2129)new Class1088());
    }
    
    public Class168(final URI uri, final Class2129 class2129) {
        this(uri, class2129, null, 0);
    }
    
    public Class168(final URI uri, final Map map) {
        this(uri, (Class2129)new Class1088(), map);
    }
    
    public Class168(final URI uri, final Class2129 class2129, final Map map) {
        this(uri, class2129, map, 0);
    }
    
    public Class168(final URI field8703, final Class2129 field8704, final Map map, final int field8705) {
        this.Field8703 = null;
        this.Field8704 = null;
        this.Field8705 = null;
        this.Field8706 = null;
        this.Field8708 = Proxy.NO_PROXY;
        this.Field8713 = new CountDownLatch(1);
        this.Field8714 = new CountDownLatch(1);
        this.Field8715 = 0;
        this.Field8716 = null;
        if (field8703 == null) {
            throw new IllegalArgumentException();
        }
        if (field8704 == null) {
            throw new IllegalArgumentException("null as draft is permitted for `WebSocketServer` only!");
        }
        this.Field8703 = field8703;
        this.Field8711 = field8704;
        this.Field8716 = (Class628)new Class1436(this);
        if (map != null) {
            (this.Field8712 = new TreeMap(String.CASE_INSENSITIVE_ORDER)).putAll(map);
        }
        this.Field8715 = field8705;
        this.Method530(false);
        this.Method532(false);
        this.Field8704 = new Class1302((Class1715)this, field8704);
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
    
    public void Method565(final String s, final String s2) {
        if (this.Field8712 == null) {
            this.Field8712 = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        }
        this.Field8712.put(s, s2);
    }
    
    public String Method566(final String s) {
        if (this.Field8712 == null) {
            return null;
        }
        return this.Field8712.remove(s);
    }
    
    public void Method567() {
        this.Field8712 = null;
    }
    
    public void Method568(final Class628 field8716) {
        this.Field8716 = field8716;
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
        final Thread currentThread = Thread.currentThread();
        if (currentThread == this.Field8709 || currentThread == this.Field8710) {
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
        (this.Field8710 = new Thread(this)).setName("WebSocketConnectReadThread-" + this.Field8710.getId());
        this.Field8710.start();
    }
    
    public boolean Method572() throws InterruptedException {
        this.Method571();
        this.Field8713.await();
        return this.Field8704.Method551();
    }
    
    public boolean Method573(final long timeout, final TimeUnit unit) throws InterruptedException {
        this.Method571();
        return this.Field8713.await(timeout, unit) && this.Field8704.Method551();
    }
    
    @Override
    public void Method539() {
        if (this.Field8709 != null) {
            this.Field8704.Method538(1000);
        }
    }
    
    public void Method574() throws InterruptedException {
        this.Method539();
        this.Field8714.await();
    }
    
    @Override
    public void Method541(final String s) {
        this.Field8704.Method541(s);
    }
    
    @Override
    public void Method543(final byte[] array) {
        this.Field8704.Method543(array);
    }
    
    @Override
    public Object Method559() {
        return this.Field8704.Method559();
    }
    
    @Override
    public void Method558(final Object o) {
        this.Field8704.Method558(o);
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
        final boolean method576 = this.Method576();
        this.Field8705.setTcpNoDelay(this.Method529());
        this.Field8705.setReuseAddress(this.Method531());
        if (!this.Field8705.isConnected()) {
            this.Field8705.connect((this.Field8716 == null) ? InetSocketAddress.createUnresolved(this.Field8703.getHost(), this.Method578()) : new InetSocketAddress(this.Field8716.Method2724(this.Field8703), this.Method578()), this.Field8715);
        }
        if (method576 && "wss".equals(this.Field8703.getScheme())) {
            this.Method575();
        }
        if (this.Field8705 instanceof SSLSocket) {
            final SSLSocket sslSocket = (SSLSocket)this.Field8705;
            final SSLParameters sslParameters = sslSocket.getSSLParameters();
            this.Method577(sslParameters);
            sslSocket.setSSLParameters(sslParameters);
        }
        final InputStream inputStream = this.Field8705.getInputStream();
        this.Field8707 = this.Field8705.getOutputStream();
        this.Method579();
        (this.Field8709 = new Thread(new Class1690(this, this))).start();
        final byte[] array = new byte[16384];
        int read;
        while (!this.Method552() && !this.Method554() && (read = inputStream.read(array)) != -1) {
            this.Field8704.Method5272(ByteBuffer.wrap(array, 0, read));
        }
        this.Field8704.Method5283();
        this.Field8710 = null;
    }
    
    private void Method575() throws NoSuchAlgorithmException, KeyManagementException, IOException {
        SSLSocketFactory socketFactory;
        if (this.Field8706 instanceof SSLSocketFactory) {
            socketFactory = (SSLSocketFactory)this.Field8706;
        }
        else {
            final SSLContext instance = SSLContext.getInstance("TLSv1.2");
            instance.init(null, null, null);
            socketFactory = instance.getSocketFactory();
        }
        this.Field8705 = socketFactory.createSocket(this.Field8705, this.Field8703.getHost(), this.Method578(), true);
    }
    
    private boolean Method576() throws IOException {
        boolean b = false;
        if (this.Field8708 != Proxy.NO_PROXY) {
            this.Field8705 = new Socket(this.Field8708);
            b = true;
        }
        else if (this.Field8706 != null) {
            this.Field8705 = this.Field8706.createSocket();
        }
        else if (this.Field8705 == null) {
            this.Field8705 = new Socket(this.Field8708);
            b = true;
        }
        else if (this.Field8705.isClosed()) {
            throw new IOException();
        }
        return b;
    }
    
    protected void Method577(final SSLParameters sslParameters) {
        sslParameters.setEndpointIdentificationAlgorithm("HTTPS");
    }
    
    private int Method578() {
        final int port = this.Field8703.getPort();
        final String scheme = this.Field8703.getScheme();
        if ("wss".equals(scheme)) {
            return (port == -1) ? 443 : port;
        }
        if ("ws".equals(scheme)) {
            return (port == -1) ? 80 : port;
        }
        throw new IllegalArgumentException("unknown scheme: " + scheme);
    }
    
    private void Method579() throws Class71 {
        final String rawPath = this.Field8703.getRawPath();
        final String rawQuery = this.Field8703.getRawQuery();
        String string;
        if (rawPath == null || rawPath.length() == 0) {
            string = "/";
        }
        else {
            string = rawPath;
        }
        if (rawQuery != null) {
            string = string + '?' + rawQuery;
        }
        final int method578 = this.Method578();
        final String string2 = this.Field8703.getHost() + ((method578 != 80 && method578 != 443) ? (":" + method578) : "");
        final Class2049 class2049 = new Class2049();
        class2049.Method7008(string);
        class2049.Method6("Host", string2);
        if (this.Field8712 != null) {
            for (final Map.Entry<String, V> entry : this.Field8712.entrySet()) {
                class2049.Method6(entry.getKey(), (String)entry.getValue());
            }
        }
        this.Field8704.Method5286((Class1892)class2049);
    }
    
    @Override
    public Class1609 Method556() {
        return this.Field8704.Method556();
    }
    
    @Override
    public final void Method508(final Class1728 class1728, final String s) {
        this.Method584(s);
    }
    
    @Override
    public final void Method509(final Class1728 class1728, final ByteBuffer byteBuffer) {
        this.Method587(byteBuffer);
    }
    
    @Override
    public final void Method510(final Class1728 class1728, final Class739 class1729) {
        this.Method524();
        this.Method583((Class482)class1729);
        this.Field8713.countDown();
    }
    
    @Override
    public final void Method511(final Class1728 class1728, final int n, final String s, final boolean b) {
        this.Method523();
        if (this.Field8709 != null) {
            this.Field8709.interrupt();
        }
        this.Method585(n, s, b);
        this.Field8713.countDown();
        this.Field8714.countDown();
    }
    
    @Override
    public final void Method514(final Class1728 class1728, final Exception ex) {
        this.Method586(ex);
    }
    
    @Override
    public final void Method518(final Class1728 class1728) {
    }
    
    @Override
    public void Method513(final Class1728 class1728, final int n, final String s) {
        this.Method580(n, s);
    }
    
    @Override
    public void Method512(final Class1728 class1728, final int n, final String s, final boolean b) {
        this.Method581(n, s, b);
    }
    
    public void Method580(final int n, final String s) {
    }
    
    public void Method581(final int n, final String s, final boolean b) {
    }
    
    public Class1728 Method582() {
        return (Class1728)this.Field8704;
    }
    
    @Override
    public InetSocketAddress Method519(final Class1728 class1728) {
        if (this.Field8705 != null) {
            return (InetSocketAddress)this.Field8705.getLocalSocketAddress();
        }
        return null;
    }
    
    @Override
    public InetSocketAddress Method520(final Class1728 class1728) {
        if (this.Field8705 != null) {
            return (InetSocketAddress)this.Field8705.getRemoteSocketAddress();
        }
        return null;
    }
    
    public abstract void Method583(final Class482 p0);
    
    public abstract void Method584(final String p0);
    
    public abstract void Method585(final int p0, final String p1, final boolean p2);
    
    public abstract void Method586(final Exception p0);
    
    public void Method587(final ByteBuffer byteBuffer) {
    }
    
    public void Method588(final Proxy field8708) {
        if (field8708 == null) {
            throw new IllegalArgumentException();
        }
        this.Field8708 = field8708;
    }
    
    @Deprecated
    @Deprecated
    public void Method589(final Socket field8705) {
        if (this.Field8705 != null) {
            throw new IllegalStateException("socket has already been set");
        }
        this.Field8705 = field8705;
    }
    
    public void Method590(final SocketFactory field8706) {
        this.Field8706 = field8706;
    }
    
    @Override
    public void Method547(final Class927 class927, final ByteBuffer byteBuffer, final boolean b) {
        this.Field8704.Method547(class927, byteBuffer, b);
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
    public void Method538(final int n) {
        this.Field8704.Method538(n);
    }
    
    @Override
    public void Method537(final int n, final String s) {
        this.Field8704.Method537(n, s);
    }
    
    @Override
    public void Method540(final int n, final String s) {
        this.Field8704.Method540(n, s);
    }
    
    @Override
    public void Method542(final ByteBuffer byteBuffer) {
        this.Field8704.Method542(byteBuffer);
    }
    
    @Override
    public void Method544(final Class1260 class1260) {
        this.Field8704.Method544(class1260);
    }
    
    @Override
    public void Method545(final Collection collection) {
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
        if (!this.Method560()) {
            throw new IllegalArgumentException("This websocket uses ws instead of wss. No SSLSession available.");
        }
        return ((SSLSocket)this.Field8705).getSession();
    }
    
    @Override
    public Class1234 Method562() {
        return this.Field8704.Method562();
    }
    
    private void Method591(final IOException ex) {
        if (ex instanceof SSLException) {
            this.Method586(ex);
        }
        this.Field8704.Method5283();
    }
    
    static void Method592(final Class168 class168, final IOException ex) {
        class168.Method591(ex);
    }
    
    static Thread Method593(final Class168 class168, final Thread field8709) {
        return class168.Field8709 = field8709;
    }
    
    static Class1302 Method594(final Class168 class168) {
        return class168.Field8704;
    }
    
    static OutputStream Method595(final Class168 class168) {
        return class168.Field8707;
    }
    
    static Socket Method596(final Class168 class168) {
        return class168.Field8705;
    }
    
    private static String Method536(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x74B6 ^ 0xAA));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
