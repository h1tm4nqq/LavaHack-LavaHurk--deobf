/*
 * Decompiled with CFR 0.152.
 */
package lavahack.loader;

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
import lavahack.loader.Class11;
import lavahack.loader.Class1181;
import lavahack.loader.Class1236;
import lavahack.loader.Class1282;
import lavahack.loader.Class1753;
import lavahack.loader.Class1849;
import lavahack.loader.Class19;
import lavahack.loader.Class1915;
import lavahack.loader.Class1926;
import lavahack.loader.Class1966;
import lavahack.loader.Class241;
import lavahack.loader.Class26;
import lavahack.loader.Class625;
import lavahack.loader.Class749;
import lavahack.loader.Class866;
import lavahack.loader.Class919;
import lavahack.loader.Class977;

public abstract class Class1654
extends Class625
implements Runnable,
Class1966 {
    protected URI Field15688 = null;
    private Class1282 Field15689 = null;
    private Socket Field15690 = null;
    private SocketFactory Field15691 = null;
    private OutputStream Field15692;
    private Proxy Field15693 = Proxy.NO_PROXY;
    private Thread Field15694;
    private Thread Field15695;
    private Class26 Field15696;
    private Map Field15697;
    private CountDownLatch Field15698 = new CountDownLatch(1);
    private CountDownLatch Field15699 = new CountDownLatch(1);
    private int Field15700 = 0;
    private Class11 Field15701 = null;
    private String Field15702 = "TheKisDevs & LavaHack Development owns you";

    public Class1654(URI uRI) {
        this(uRI, new Class749());
    }

    public Class1654(URI uRI, Class26 class26) {
        this(uRI, class26, null, 0);
    }

    public Class1654(URI uRI, Map map) {
        this(uRI, new Class749(), map);
    }

    public Class1654(URI uRI, Class26 class26, Map map) {
        this(uRI, class26, map, 0);
    }

    public Class1654(URI uRI, Class26 class26, Map map, int n) {
        if (uRI == null) {
            throw new IllegalArgumentException();
        }
        if (class26 == null) {
            throw new IllegalArgumentException("null as draft is permitted for `WebSocketServer` only!");
        }
        this.Field15688 = uRI;
        this.Field15696 = class26;
        this.Field15701 = new Class1849(this);
        if (map != null) {
            this.Field15697 = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            this.Field15697.putAll(map);
        }
        this.Field15700 = n;
        this.Method2684(false);
        this.Method2686(false);
        this.Field15689 = new Class1282((Class977)this, class26);
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

    public void Method3346(String string, String string2) {
        if (this.Field15697 == null) {
            this.Field15697 = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        }
        this.Field15697.put(string, string2);
    }

    public String Method3347(String string) {
        if (this.Field15697 != null) return (String)this.Field15697.remove(string);
        return null;
    }

    public void Method3348() {
        this.Field15697 = null;
    }

    public void Method3349(Class11 class11) {
        this.Field15701 = class11;
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
        Thread thread = Thread.currentThread();
        if (thread == this.Field15694) throw new IllegalStateException("You cannot initialize a reconnect out of the websocket thread. Use reconnect in another thread to ensure a successful cleanup.");
        if (thread == this.Field15695) {
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
        this.Field15695 = new Thread(this);
        this.Field15695.setName("WebSocketConnectReadThread-" + this.Field15695.getId());
        this.Field15695.start();
    }

    public boolean Method3353() throws InterruptedException {
        this.Method3352();
        this.Field15698.await();
        return this.Field15689.Method3332();
    }

    public boolean Method3354(long l, TimeUnit timeUnit) throws InterruptedException {
        this.Method3352();
        if (!this.Field15698.await(l, timeUnit)) return false;
        if (!this.Field15689.Method3332()) return false;
        return true;
    }

    @Override
    public void Method3320() {
        if (this.Field15694 == null) return;
        this.Field15689.Method3319(1000);
    }

    public void Method3355() throws InterruptedException {
        this.Method3320();
        this.Field15699.await();
    }

    @Override
    public void Method3322(String string) {
        this.Field15689.Method3322(string);
    }

    @Override
    public void Method3324(byte[] byArray) {
        this.Field15689.Method3324(byArray);
    }

    @Override
    public Object Method3340() {
        return this.Field15689.Method3340();
    }

    @Override
    public void Method3339(Object object) {
        this.Field15689.Method3339(object);
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
        int n;
        Object object;
        boolean bl = this.Method3357();
        this.Field15690.setTcpNoDelay(this.Method2683());
        this.Field15690.setReuseAddress(this.Method2685());
        if (!this.Field15690.isConnected()) {
            object = this.Field15701 == null ? InetSocketAddress.createUnresolved(this.Field15688.getHost(), this.Method3359()) : new InetSocketAddress(this.Field15701.Method141(this.Field15688), this.Method3359());
            this.Field15690.connect((SocketAddress)object, this.Field15700);
        }
        if (bl && "wss".equals(this.Field15688.getScheme())) {
            this.Method3356();
        }
        if (this.Field15690 instanceof SSLSocket) {
            object = (SSLSocket)this.Field15690;
            SSLParameters sSLParameters = ((SSLSocket)object).getSSLParameters();
            this.Method3358(sSLParameters);
            ((SSLSocket)object).setSSLParameters(sSLParameters);
        }
        InputStream inputStream = this.Field15690.getInputStream();
        this.Field15692 = this.Field15690.getOutputStream();
        this.Method3360();
        this.Field15694 = new Thread(new Class1915(this, this));
        this.Field15694.start();
        byte[] byArray = new byte[16384];
        while (!this.Method3333() && !this.Method3335() && (n = inputStream.read(byArray)) != -1) {
            this.Field15689.Method5194(ByteBuffer.wrap(byArray, 0, n));
        }
        this.Field15689.Method5205();
        this.Field15695 = null;
    }

    private void Method3356() throws NoSuchAlgorithmException, KeyManagementException, IOException {
        SSLSocketFactory sSLSocketFactory;
        if (this.Field15691 instanceof SSLSocketFactory) {
            sSLSocketFactory = (SSLSocketFactory)this.Field15691;
        } else {
            SSLContext sSLContext = SSLContext.getInstance("TLSv1.2");
            sSLContext.init(null, null, null);
            sSLSocketFactory = sSLContext.getSocketFactory();
        }
        this.Field15690 = sSLSocketFactory.createSocket(this.Field15690, this.Field15688.getHost(), this.Method3359(), true);
    }

    private boolean Method3357() throws IOException {
        boolean bl = false;
        if (this.Field15693 != Proxy.NO_PROXY) {
            this.Field15690 = new Socket(this.Field15693);
            return true;
        }
        if (this.Field15691 != null) {
            this.Field15690 = this.Field15691.createSocket();
            return bl;
        }
        if (this.Field15690 == null) {
            this.Field15690 = new Socket(this.Field15693);
            return true;
        }
        if (!this.Field15690.isClosed()) return bl;
        throw new IOException();
    }

    protected void Method3358(SSLParameters sSLParameters) {
        sSLParameters.setEndpointIdentificationAlgorithm("HTTPS");
    }

    private int Method3359() {
        int n = this.Field15688.getPort();
        String string = this.Field15688.getScheme();
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

    private void Method3360() throws Class241 {
        String string = this.Field15688.getRawPath();
        String string2 = this.Field15688.getRawQuery();
        String string3 = string == null || string.length() == 0 ? "/" : string;
        if (string2 != null) {
            string3 = string3 + '?' + string2;
        }
        int n = this.Method3359();
        String string4 = this.Field15688.getHost() + (n != 80 && n != 443 ? ":" + n : "");
        Class19 class19 = new Class19();
        class19.Method187(string3);
        class19.Method184("Host", string4);
        if (this.Field15697 != null) {
            for (Map.Entry entry : this.Field15697.entrySet()) {
                class19.Method184((String)entry.getKey(), (String)entry.getValue());
            }
        }
        this.Field15689.Method5208(class19);
    }

    @Override
    public Class866 Method3337() {
        return this.Field15689.Method3337();
    }

    @Override
    public final void Method2662(Class1966 class1966, String string) {
        this.Method3365(string);
    }

    @Override
    public final void Method2663(Class1966 class1966, ByteBuffer byteBuffer) {
        this.Method3368(byteBuffer);
    }

    @Override
    public final void Method2664(Class1966 class1966, Class1181 class1181) {
        this.Method2678();
        this.Method3364((Class1236)class1181);
        this.Field15698.countDown();
    }

    @Override
    public final void Method2665(Class1966 class1966, int n, String string, boolean bl) {
        this.Method2677();
        if (this.Field15694 != null) {
            this.Field15694.interrupt();
        }
        this.Method3366(n, string, bl);
        this.Field15698.countDown();
        this.Field15699.countDown();
    }

    @Override
    public final void Method2668(Class1966 class1966, Exception exception) {
        this.Method3367(exception);
    }

    @Override
    public final void Method2672(Class1966 class1966) {
    }

    @Override
    public void Method2667(Class1966 class1966, int n, String string) {
        this.Method3361(n, string);
    }

    @Override
    public void Method2666(Class1966 class1966, int n, String string, boolean bl) {
        this.Method3362(n, string, bl);
    }

    public void Method3361(int n, String string) {
    }

    public void Method3362(int n, String string, boolean bl) {
    }

    public Class1966 Method3363() {
        return this.Field15689;
    }

    @Override
    public InetSocketAddress Method2673(Class1966 class1966) {
        if (this.Field15690 == null) return null;
        return (InetSocketAddress)this.Field15690.getLocalSocketAddress();
    }

    @Override
    public InetSocketAddress Method2674(Class1966 class1966) {
        if (this.Field15690 == null) return null;
        return (InetSocketAddress)this.Field15690.getRemoteSocketAddress();
    }

    public abstract void Method3364(Class1236 var1);

    public abstract void Method3365(String var1);

    public abstract void Method3366(int var1, String var2, boolean var3);

    public abstract void Method3367(Exception var1);

    public void Method3368(ByteBuffer byteBuffer) {
    }

    public void Method3369(Proxy proxy) {
        if (proxy == null) {
            throw new IllegalArgumentException();
        }
        this.Field15693 = proxy;
    }

    @Deprecated
    @Deprecated
    public void Method3370(Socket socket) {
        if (this.Field15690 != null) {
            throw new IllegalStateException("socket has already been set");
        }
        this.Field15690 = socket;
    }

    public void Method3371(SocketFactory socketFactory) {
        this.Field15691 = socketFactory;
    }

    @Override
    public void Method3328(Class1753 class1753, ByteBuffer byteBuffer, boolean bl) {
        this.Field15689.Method3328(class1753, byteBuffer, bl);
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
    public void Method3319(int n) {
        this.Field15689.Method3319(n);
    }

    @Override
    public void Method3318(int n, String string) {
        this.Field15689.Method3318(n, string);
    }

    @Override
    public void Method3321(int n, String string) {
        this.Field15689.Method3321(n, string);
    }

    @Override
    public void Method3323(ByteBuffer byteBuffer) {
        this.Field15689.Method3323(byteBuffer);
    }

    @Override
    public void Method3325(Class1926 class1926) {
        this.Field15689.Method3325(class1926);
    }

    @Override
    public void Method3326(Collection collection) {
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
        if (this.Method3341()) return ((SSLSocket)this.Field15690).getSession();
        throw new IllegalArgumentException("This websocket uses ws instead of wss. No SSLSession available.");
    }

    @Override
    public Class919 Method3343() {
        return this.Field15689.Method3343();
    }

    private void Method3372(IOException iOException) {
        if (iOException instanceof SSLException) {
            this.Method3367(iOException);
        }
        this.Field15689.Method5205();
    }

    static void Method3373(Class1654 class1654, IOException iOException) {
        class1654.Method3372(iOException);
    }

    static Thread Method3374(Class1654 class1654, Thread thread) {
        class1654.Field15694 = thread;
        return class1654.Field15694;
    }

    static Class1282 Method3375(Class1654 class1654) {
        return class1654.Field15689;
    }

    static OutputStream Method3376(Class1654 class1654) {
        return class1654.Field15692;
    }

    static Socket Method3377(Class1654 class1654) {
        return class1654.Field15690;
    }

    private static String Method2690(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 59;
            cArray2[n] = (char)(cArray[n] ^ (0x392 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

