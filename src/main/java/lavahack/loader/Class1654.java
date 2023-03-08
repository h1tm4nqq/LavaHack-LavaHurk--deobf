//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.loader;

import javax.net.*;
import java.util.concurrent.*;
import java.net.*;
import java.nio.*;
import java.security.*;
import java.io.*;
import java.util.*;
import javax.net.ssl.*;

public abstract class Class1654 extends Class625 implements Runnable, Class1966
{
    protected URI Field15688;
    private Class1282 Field15689;
    private Socket Field15690;
    private SocketFactory Field15691;
    private OutputStream Field15692;
    private Proxy Field15693;
    private Thread Field15694;
    private Thread Field15695;
    private Class26 Field15696;
    private Map Field15697;
    private CountDownLatch Field15698;
    private CountDownLatch Field15699;
    private int Field15700;
    private Class11 Field15701;
    private String Field15702 = "TheKisDevs & LavaHack Development owns you";
    
    public Class1654(final URI uri) {
        this(uri, new Class749());
    }
    
    public Class1654(final URI uri, final Class26 class26) {
        this(uri, class26, null, 0);
    }
    
    public Class1654(final URI uri, final Map map) {
        this(uri, new Class749(), map);
    }
    
    public Class1654(final URI uri, final Class26 class26, final Map map) {
        this(uri, class26, map, 0);
    }
    
    public Class1654(final URI field15688, final Class26 field15689, final Map map, final int field15690) {
        this.Field15688 = null;
        this.Field15689 = null;
        this.Field15690 = null;
        this.Field15691 = null;
        this.Field15693 = Proxy.NO_PROXY;
        this.Field15698 = new CountDownLatch(1);
        this.Field15699 = new CountDownLatch(1);
        this.Field15700 = 0;
        this.Field15701 = null;
        if (field15688 == null) {
            throw new IllegalArgumentException();
        }
        if (field15689 == null) {
            throw new IllegalArgumentException("null as draft is permitted for `WebSocketServer` only!");
        }
        this.Field15688 = field15688;
        this.Field15696 = field15689;
        this.Field15701 = (Class11)new Class1849(this);
        if (map != null) {
            (this.Field15697 = new TreeMap(String.CASE_INSENSITIVE_ORDER)).putAll(map);
        }
        this.Field15700 = field15690;
        this.Method2684(false);
        this.Method2686(false);
        this.Field15689 = new Class1282((Class977)this, field15689);
    }
    
    public URI Method3344() {
        return this.Field15688;
    }
    
    @Override
    public Class26 Method3336() {
        return this.Field15696;
    }
    
    public Socket Method3345() {
        return this.Field15690;
    }
    
    public void Method3346(final String s, final String s2) {
        if (this.Field15697 == null) {
            this.Field15697 = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        }
        this.Field15697.put(s, s2);
    }
    
    public String Method3347(final String s) {
        if (this.Field15697 == null) {
            return null;
        }
        return this.Field15697.remove(s);
    }
    
    public void Method3348() {
        this.Field15697 = null;
    }
    
    public void Method3349(final Class11 field15701) {
        this.Field15701 = field15701;
    }
    
    public void Method3350() {
        this.Method2679();
        this.Method3352();
    }
    
    public boolean Method3351() throws InterruptedException {
        this.Method2679();
        return this.Method3353();
    }
    
    private void Method2679() {
        final Thread currentThread = Thread.currentThread();
        if (currentThread == this.Field15694 || currentThread == this.Field15695) {
            throw new IllegalStateException("You cannot initialize a reconnect out of the websocket thread. Use reconnect in another thread to ensure a successful cleanup.");
        }
        this.Method3355();
        if (this.Field15694 != null) {
            this.Field15694.interrupt();
            this.Field15694 = null;
        }
        if (this.Field15695 != null) {
            this.Field15695.interrupt();
            this.Field15695 = null;
        }
        this.Field15696.Method208();
        if (this.Field15690 != null) {
            this.Field15690.close();
            this.Field15690 = null;
        }
        this.Field15698 = new CountDownLatch(1);
        this.Field15699 = new CountDownLatch(1);
        this.Field15689 = new Class1282((Class977)this, this.Field15696);
    }
    
    public void Method3352() {
        if (this.Field15695 != null) {
            throw new IllegalStateException("WebSocketClient objects are not reuseable");
        }
        (this.Field15695 = new Thread(this)).setName("WebSocketConnectReadThread-" + this.Field15695.getId());
        this.Field15695.start();
    }
    
    public boolean Method3353() throws InterruptedException {
        this.Method3352();
        this.Field15698.await();
        return this.Field15689.Method3332();
    }
    
    public boolean Method3354(final long timeout, final TimeUnit unit) throws InterruptedException {
        this.Method3352();
        return this.Field15698.await(timeout, unit) && this.Field15689.Method3332();
    }
    
    @Override
    public void Method3320() {
        if (this.Field15694 != null) {
            this.Field15689.Method3319(1000);
        }
    }
    
    public void Method3355() throws InterruptedException {
        this.Method3320();
        this.Field15699.await();
    }
    
    @Override
    public void Method3322(final String s) {
        this.Field15689.Method3322(s);
    }
    
    @Override
    public void Method3324(final byte[] array) {
        this.Field15689.Method3324(array);
    }
    
    @Override
    public Object Method3340() {
        return this.Field15689.Method3340();
    }
    
    @Override
    public void Method3339(final Object o) {
        this.Field15689.Method3339(o);
    }
    
    @Override
    protected Collection Method2681() {
        return Collections.singletonList(this.Field15689);
    }
    
    @Override
    public void Method3327() {
        this.Field15689.Method3327();
    }
    
    @Override
    public void run() {
        final boolean method3357 = this.Method3357();
        this.Field15690.setTcpNoDelay(this.Method2683());
        this.Field15690.setReuseAddress(this.Method2685());
        if (!this.Field15690.isConnected()) {
            this.Field15690.connect((this.Field15701 == null) ? InetSocketAddress.createUnresolved(this.Field15688.getHost(), this.Method3359()) : new InetSocketAddress(this.Field15701.Method141(this.Field15688), this.Method3359()), this.Field15700);
        }
        if (method3357 && "wss".equals(this.Field15688.getScheme())) {
            this.Method3356();
        }
        if (this.Field15690 instanceof SSLSocket) {
            final SSLSocket sslSocket = (SSLSocket)this.Field15690;
            final SSLParameters sslParameters = sslSocket.getSSLParameters();
            this.Method3358(sslParameters);
            sslSocket.setSSLParameters(sslParameters);
        }
        final InputStream inputStream = this.Field15690.getInputStream();
        this.Field15692 = this.Field15690.getOutputStream();
        this.Method3360();
        (this.Field15694 = new Thread(new Class1915(this, this))).start();
        final byte[] array = new byte[16384];
        int read;
        while (!this.Method3333() && !this.Method3335() && (read = inputStream.read(array)) != -1) {
            this.Field15689.Method5194(ByteBuffer.wrap(array, 0, read));
        }
        this.Field15689.Method5205();
        this.Field15695 = null;
    }
    
    private void Method3356() throws NoSuchAlgorithmException, KeyManagementException, IOException {
        SSLSocketFactory socketFactory;
        if (this.Field15691 instanceof SSLSocketFactory) {
            socketFactory = (SSLSocketFactory)this.Field15691;
        }
        else {
            final SSLContext instance = SSLContext.getInstance("TLSv1.2");
            instance.init(null, null, null);
            socketFactory = instance.getSocketFactory();
        }
        this.Field15690 = socketFactory.createSocket(this.Field15690, this.Field15688.getHost(), this.Method3359(), true);
    }
    
    private boolean Method3357() throws IOException {
        boolean b = false;
        if (this.Field15693 != Proxy.NO_PROXY) {
            this.Field15690 = new Socket(this.Field15693);
            b = true;
        }
        else if (this.Field15691 != null) {
            this.Field15690 = this.Field15691.createSocket();
        }
        else if (this.Field15690 == null) {
            this.Field15690 = new Socket(this.Field15693);
            b = true;
        }
        else if (this.Field15690.isClosed()) {
            throw new IOException();
        }
        return b;
    }
    
    protected void Method3358(final SSLParameters sslParameters) {
        sslParameters.setEndpointIdentificationAlgorithm("HTTPS");
    }
    
    private int Method3359() {
        final int port = this.Field15688.getPort();
        final String scheme = this.Field15688.getScheme();
        if ("wss".equals(scheme)) {
            return (port == -1) ? 443 : port;
        }
        if ("ws".equals(scheme)) {
            return (port == -1) ? 80 : port;
        }
        throw new IllegalArgumentException("unknown scheme: " + scheme);
    }
    
    private void Method3360() throws Class241 {
        final String rawPath = this.Field15688.getRawPath();
        final String rawQuery = this.Field15688.getRawQuery();
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
        final int method3359 = this.Method3359();
        final String string2 = this.Field15688.getHost() + ((method3359 != 80 && method3359 != 443) ? (":" + method3359) : "");
        final Class19 class19 = new Class19();
        class19.Method187(string);
        class19.Method184("Host", string2);
        if (this.Field15697 != null) {
            for (final Map.Entry<String, V> entry : this.Field15697.entrySet()) {
                class19.Method184(entry.getKey(), (String)entry.getValue());
            }
        }
        this.Field15689.Method5208((Class45)class19);
    }
    
    @Override
    public Class866 Method3337() {
        return this.Field15689.Method3337();
    }
    
    public final void Method2662(final Class1966 class1966, final String s) {
        this.Method3365(s);
    }
    
    public final void Method2663(final Class1966 class1966, final ByteBuffer byteBuffer) {
        this.Method3368(byteBuffer);
    }
    
    public final void Method2664(final Class1966 class1966, final Class1181 class1967) {
        this.Method2678();
        this.Method3364((Class1236)class1967);
        this.Field15698.countDown();
    }
    
    public final void Method2665(final Class1966 class1966, final int n, final String s, final boolean b) {
        this.Method2677();
        if (this.Field15694 != null) {
            this.Field15694.interrupt();
        }
        this.Method3366(n, s, b);
        this.Field15698.countDown();
        this.Field15699.countDown();
    }
    
    public final void Method2668(final Class1966 class1966, final Exception ex) {
        this.Method3367(ex);
    }
    
    public final void Method2672(final Class1966 class1966) {
    }
    
    public void Method2667(final Class1966 class1966, final int n, final String s) {
        this.Method3361(n, s);
    }
    
    public void Method2666(final Class1966 class1966, final int n, final String s, final boolean b) {
        this.Method3362(n, s, b);
    }
    
    public void Method3361(final int n, final String s) {
    }
    
    public void Method3362(final int n, final String s, final boolean b) {
    }
    
    public Class1966 Method3363() {
        return (Class1966)this.Field15689;
    }
    
    public InetSocketAddress Method2673(final Class1966 class1966) {
        if (this.Field15690 != null) {
            return (InetSocketAddress)this.Field15690.getLocalSocketAddress();
        }
        return null;
    }
    
    public InetSocketAddress Method2674(final Class1966 class1966) {
        if (this.Field15690 != null) {
            return (InetSocketAddress)this.Field15690.getRemoteSocketAddress();
        }
        return null;
    }
    
    public abstract void Method3364(final Class1236 p0);
    
    public abstract void Method3365(final String p0);
    
    public abstract void Method3366(final int p0, final String p1, final boolean p2);
    
    public abstract void Method3367(final Exception p0);
    
    public void Method3368(final ByteBuffer byteBuffer) {
    }
    
    public void Method3369(final Proxy field15693) {
        if (field15693 == null) {
            throw new IllegalArgumentException();
        }
        this.Field15693 = field15693;
    }
    
    @Deprecated
    @Deprecated
    public void Method3370(final Socket field15690) {
        if (this.Field15690 != null) {
            throw new IllegalStateException("socket has already been set");
        }
        this.Field15690 = field15690;
    }
    
    public void Method3371(final SocketFactory field15691) {
        this.Field15691 = field15691;
    }
    
    @Override
    public void Method3328(final Class1753 class1753, final ByteBuffer byteBuffer, final boolean b) {
        this.Field15689.Method3328(class1753, byteBuffer, b);
    }
    
    @Override
    public boolean Method3332() {
        return this.Field15689.Method3332();
    }
    
    @Override
    public boolean Method3334() {
        return this.Field15689.Method3334();
    }
    
    @Override
    public boolean Method3335() {
        return this.Field15689.Method3335();
    }
    
    @Override
    public boolean Method3333() {
        return this.Field15689.Method3333();
    }
    
    @Override
    public boolean Method3329() {
        return this.Field15689.Method3329();
    }
    
    @Override
    public void Method3319(final int n) {
        this.Field15689.Method3319(n);
    }
    
    @Override
    public void Method3318(final int n, final String s) {
        this.Field15689.Method3318(n, s);
    }
    
    @Override
    public void Method3321(final int n, final String s) {
        this.Field15689.Method3321(n, s);
    }
    
    @Override
    public void Method3323(final ByteBuffer byteBuffer) {
        this.Field15689.Method3323(byteBuffer);
    }
    
    @Override
    public void Method3325(final Class1926 class1926) {
        this.Field15689.Method3325(class1926);
    }
    
    @Override
    public void Method3326(final Collection collection) {
        this.Field15689.Method3326(collection);
    }
    
    @Override
    public InetSocketAddress Method3331() {
        return this.Field15689.Method3331();
    }
    
    @Override
    public InetSocketAddress Method3330() {
        return this.Field15689.Method3330();
    }
    
    @Override
    public String Method3338() {
        return this.Field15688.getPath();
    }
    
    @Override
    public boolean Method3341() {
        return this.Field15690 instanceof SSLSocket;
    }
    
    @Override
    public SSLSession Method3342() {
        if (!this.Method3341()) {
            throw new IllegalArgumentException("This websocket uses ws instead of wss. No SSLSession available.");
        }
        return ((SSLSocket)this.Field15690).getSession();
    }
    
    @Override
    public Class919 Method3343() {
        return this.Field15689.Method3343();
    }
    
    private void Method3372(final IOException ex) {
        if (ex instanceof SSLException) {
            this.Method3367(ex);
        }
        this.Field15689.Method5205();
    }
    
    static void Method3373(final Class1654 class1654, final IOException ex) {
        class1654.Method3372(ex);
    }
    
    static Thread Method3374(final Class1654 class1654, final Thread field15694) {
        return class1654.Field15694 = field15694;
    }
    
    static Class1282 Method3375(final Class1654 class1654) {
        return class1654.Field15689;
    }
    
    static OutputStream Method3376(final Class1654 class1654) {
        return class1654.Field15692;
    }
    
    static Socket Method3377(final Class1654 class1654) {
        return class1654.Field15690;
    }
    
    private static String Method2690(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x392 ^ 0x3B));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
