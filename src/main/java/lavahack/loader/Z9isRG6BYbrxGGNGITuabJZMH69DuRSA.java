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
import lavahack.loader.ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy;
import lavahack.loader.BrWsHdiLAwYGSB35z3ypQAx8eRulUOBh;
import lavahack.loader.D2A33i4puy3VG87sLGopuKBa7759W0RD;
import lavahack.loader.DitR6vZ79qQrTZ031J7xzQQWKdUckNea;
import lavahack.loader.OvvNFVp1prZcFYv57XGirjG11JCXathw;
import lavahack.loader.Z9isRG6BYbrxGGNGITuabJZMH69DuRSA$1;
import lavahack.loader.Z9isRG6BYbrxGGNGITuabJZMH69DuRSA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.loader.ZzCthbNQzHwe8k28Qcjjz6P4pBYX3BqZ;
import lavahack.loader.fTSdQpXXUsy7b26dtudQpgyKwlcDU58e;
import lavahack.loader.iDprz50yBrPJ6StAk1hDYgq1aL04tvSb;
import lavahack.loader.jNiJm0uQgY2wVhFel4twUsWMig1Nujvc;
import lavahack.loader.p1m9hwT5not8BMS2OW9GOk1ndmd1Dtl5;
import lavahack.loader.u5CRioThdnglBh9lVJeSNzNoUAZImAg0;
import lavahack.loader.uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x;
import lavahack.loader.v6PMxpLOwdKzm5lyTOYOSMZqaaZxcM13;
import lavahack.loader.vbUsByat2W2VqvGVC3VWwk5FtcMDE72H;
import lavahack.loader.zsqTSDg6cRzyFIjIJ0gsVaemPQdSwDx6;

public abstract class Z9isRG6BYbrxGGNGITuabJZMH69DuRSA
extends DitR6vZ79qQrTZ031J7xzQQWKdUckNea
implements Runnable,
ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy {
    protected URI Field15688 = null;
    private uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x Field15689 = null;
    private Socket Field15690 = null;
    private SocketFactory Field15691 = null;
    private OutputStream Field15692;
    private Proxy Field15693 = Proxy.NO_PROXY;
    private Thread Field15694;
    private Thread Field15695;
    private v6PMxpLOwdKzm5lyTOYOSMZqaaZxcM13 Field15696;
    private Map Field15697;
    private CountDownLatch Field15698 = new CountDownLatch((int)((long)360330827 ^ (long)360330826));
    private CountDownLatch Field15699 = new CountDownLatch((int)1525051548L ^ 0x5AE6709D);
    private int Field15700 = (int)((long)1135265140 ^ (long)1135265140);
    private ZzCthbNQzHwe8k28Qcjjz6P4pBYX3BqZ Field15701 = null;
    private String Field15702 = "TheKisDevs & LavaHack Development owns you";

    public Z9isRG6BYbrxGGNGITuabJZMH69DuRSA(URI uRI) {
        this(uRI, new p1m9hwT5not8BMS2OW9GOk1ndmd1Dtl5());
    }

    public Z9isRG6BYbrxGGNGITuabJZMH69DuRSA(URI uRI, v6PMxpLOwdKzm5lyTOYOSMZqaaZxcM13 v6PMxpLOwdKzm5lyTOYOSMZqaaZxcM132) {
        this(uRI, v6PMxpLOwdKzm5lyTOYOSMZqaaZxcM132, null, (int)((long)-844819851 ^ (long)-844819851));
    }

    public Z9isRG6BYbrxGGNGITuabJZMH69DuRSA(URI uRI, Map map) {
        this(uRI, new p1m9hwT5not8BMS2OW9GOk1ndmd1Dtl5(), map);
    }

    public Z9isRG6BYbrxGGNGITuabJZMH69DuRSA(URI uRI, v6PMxpLOwdKzm5lyTOYOSMZqaaZxcM13 v6PMxpLOwdKzm5lyTOYOSMZqaaZxcM132, Map map) {
        this(uRI, v6PMxpLOwdKzm5lyTOYOSMZqaaZxcM132, map, (int)-43133694L ^ 0xFD6DD502);
    }

    public Z9isRG6BYbrxGGNGITuabJZMH69DuRSA(URI uRI, v6PMxpLOwdKzm5lyTOYOSMZqaaZxcM13 v6PMxpLOwdKzm5lyTOYOSMZqaaZxcM132, Map map, int n) {
        if (uRI == null) {
            throw new IllegalArgumentException();
        }
        if (v6PMxpLOwdKzm5lyTOYOSMZqaaZxcM132 == null) {
            throw new IllegalArgumentException("null as draft is permitted for `WebSocketServer` only!");
        }
        this.Field15688 = uRI;
        this.Field15696 = v6PMxpLOwdKzm5lyTOYOSMZqaaZxcM132;
        this.Field15701 = new Z9isRG6BYbrxGGNGITuabJZMH69DuRSA$1(this);
        if (map != null) {
            this.Field15697 = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            this.Field15697.putAll(map);
        }
        this.Field15700 = n;
        this.Method2684((boolean)((long)702000812 ^ (long)702000812));
        this.Method2686(((int)-1420385917L ^ 0xAB56A183) != 0);
        this.Field15689 = new uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x((jNiJm0uQgY2wVhFel4twUsWMig1Nujvc)this, v6PMxpLOwdKzm5lyTOYOSMZqaaZxcM132);
    }

    public URI Method3344() {
        return this.Field15688;
    }

    @Override
    public v6PMxpLOwdKzm5lyTOYOSMZqaaZxcM13 Method3336() {
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

    public void Method3349(ZzCthbNQzHwe8k28Qcjjz6P4pBYX3BqZ zzCthbNQzHwe8k28Qcjjz6P4pBYX3BqZ) {
        this.Field15701 = zzCthbNQzHwe8k28Qcjjz6P4pBYX3BqZ;
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
        this.Field15698 = new CountDownLatch((int)-631252124L ^ 0xDA5FDB65);
        this.Field15699 = new CountDownLatch((int)((long)1678706500 ^ (long)1678706501));
        this.Field15689 = new uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x((jNiJm0uQgY2wVhFel4twUsWMig1Nujvc)this, this.Field15696);
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
        int n;
        this.Method3352();
        if (this.Field15698.await(l, timeUnit) && this.Field15689.Method3332()) {
            n = (int)26620396L ^ 0x19631ED;
            return n != 0;
        }
        n = (int)874494882L ^ 0x341FBBA2;
        return n != 0;
    }

    @Override
    public void Method3320() {
        if (this.Field15694 == null) return;
        this.Field15689.Method3319((int)((long)-492456643 ^ (long)-492456640) << 3);
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
        this.Field15694 = new Thread(new Z9isRG6BYbrxGGNGITuabJZMH69DuRSA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(this, this));
        this.Field15694.start();
        byte[] byArray = new byte[((int)-248505942L ^ 0xF13019AB) << 14];
        while (!this.Method3333() && !this.Method3335() && (n = inputStream.read(byArray)) != (int)((long)-1820421207 ^ (long)1820421206)) {
            this.Field15689.Method5194(ByteBuffer.wrap(byArray, (int)-1973894499L ^ 0x8A58C29D, n));
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
        this.Field15690 = sSLSocketFactory.createSocket(this.Field15690, this.Field15688.getHost(), this.Method3359(), ((int)1180713712L ^ 0x466042F1) != 0);
    }

    private boolean Method3357() throws IOException {
        int n = (int)549825338L ^ 0x20C5AB3A;
        if (this.Field15693 != Proxy.NO_PROXY) {
            this.Field15690 = new Socket(this.Field15693);
            return ((int)1140631223L ^ 0x43FCA6B6) != 0;
        }
        if (this.Field15691 != null) {
            this.Field15690 = this.Field15691.createSocket();
            return n != 0;
        }
        if (this.Field15690 == null) {
            this.Field15690 = new Socket(this.Field15693);
            return (int)((long)-756499346 ^ (long)-756499345) != 0;
        }
        if (!this.Field15690.isClosed()) return n != 0;
        throw new IOException();
    }

    protected void Method3358(SSLParameters sSLParameters) {
        sSLParameters.setEndpointIdentificationAlgorithm("HTTPS");
    }

    private int Method3359() {
        int n;
        int n2 = this.Field15688.getPort();
        String string = this.Field15688.getScheme();
        if ("wss".equals(string)) {
            int n3;
            if (n2 == (int)((long)2108860113 ^ (long)-2108860114)) {
                n3 = (int)-1167361720L ^ 0xBA6B78F3;
                return n3;
            }
            n3 = n2;
            return n3;
        }
        if (!"ws".equals(string)) throw new IllegalArgumentException("unknown scheme: " + string);
        if (n2 == (int)((long)1928260321 ^ (long)-1928260322)) {
            n = (int)((long)1767217385 ^ (long)1767217388) << 4;
            return n;
        }
        n = n2;
        return n;
    }

    private void Method3360() throws fTSdQpXXUsy7b26dtudQpgyKwlcDU58e {
        String string = this.Field15688.getRawPath();
        String string2 = this.Field15688.getRawQuery();
        String string3 = string == null || string.length() == 0 ? "/" : string;
        if (string2 != null) {
            string3 = string3 + (char)((int)1071617453L ^ 0x3FDF9592) + string2;
        }
        int n = this.Method3359();
        String string4 = this.Field15688.getHost() + (n != (int)((long)1803785117 ^ (long)1803785112) << 4 && n != ((int)2133483353L ^ 0x7F2A5EE2) ? ":" + n : "");
        zsqTSDg6cRzyFIjIJ0gsVaemPQdSwDx6 zsqTSDg6cRzyFIjIJ0gsVaemPQdSwDx62 = new zsqTSDg6cRzyFIjIJ0gsVaemPQdSwDx6();
        zsqTSDg6cRzyFIjIJ0gsVaemPQdSwDx62.Method187(string3);
        zsqTSDg6cRzyFIjIJ0gsVaemPQdSwDx62.Method184("Host", string4);
        if (this.Field15697 != null) {
            for (Map.Entry entry : this.Field15697.entrySet()) {
                zsqTSDg6cRzyFIjIJ0gsVaemPQdSwDx62.Method184((String)entry.getKey(), (String)entry.getValue());
            }
        }
        this.Field15689.Method5208(zsqTSDg6cRzyFIjIJ0gsVaemPQdSwDx62);
    }

    @Override
    public OvvNFVp1prZcFYv57XGirjG11JCXathw Method3337() {
        return this.Field15689.Method3337();
    }

    @Override
    public final void Method2662(ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy aRQmBQvY5BCKjQHAEtWILloZwAOUZwhy, String string) {
        this.Method3365(string);
    }

    @Override
    public final void Method2663(ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy aRQmBQvY5BCKjQHAEtWILloZwAOUZwhy, ByteBuffer byteBuffer) {
        this.Method3368(byteBuffer);
    }

    @Override
    public final void Method2664(ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy aRQmBQvY5BCKjQHAEtWILloZwAOUZwhy, u5CRioThdnglBh9lVJeSNzNoUAZImAg0 u5CRioThdnglBh9lVJeSNzNoUAZImAg02) {
        this.Method2678();
        this.Method3364((BrWsHdiLAwYGSB35z3ypQAx8eRulUOBh)u5CRioThdnglBh9lVJeSNzNoUAZImAg02);
        this.Field15698.countDown();
    }

    @Override
    public final void Method2665(ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy aRQmBQvY5BCKjQHAEtWILloZwAOUZwhy, int n, String string, boolean bl) {
        this.Method2677();
        if (this.Field15694 != null) {
            this.Field15694.interrupt();
        }
        this.Method3366(n, string, bl);
        this.Field15698.countDown();
        this.Field15699.countDown();
    }

    @Override
    public final void Method2668(ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy aRQmBQvY5BCKjQHAEtWILloZwAOUZwhy, Exception exception) {
        this.Method3367(exception);
    }

    @Override
    public final void Method2672(ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy aRQmBQvY5BCKjQHAEtWILloZwAOUZwhy) {
    }

    @Override
    public void Method2667(ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy aRQmBQvY5BCKjQHAEtWILloZwAOUZwhy, int n, String string) {
        this.Method3361(n, string);
    }

    @Override
    public void Method2666(ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy aRQmBQvY5BCKjQHAEtWILloZwAOUZwhy, int n, String string, boolean bl) {
        this.Method3362(n, string, bl);
    }

    public void Method3361(int n, String string) {
    }

    public void Method3362(int n, String string, boolean bl) {
    }

    public ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy Method3363() {
        return this.Field15689;
    }

    @Override
    public InetSocketAddress Method2673(ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy aRQmBQvY5BCKjQHAEtWILloZwAOUZwhy) {
        if (this.Field15690 == null) return null;
        return (InetSocketAddress)this.Field15690.getLocalSocketAddress();
    }

    @Override
    public InetSocketAddress Method2674(ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy aRQmBQvY5BCKjQHAEtWILloZwAOUZwhy) {
        if (this.Field15690 == null) return null;
        return (InetSocketAddress)this.Field15690.getRemoteSocketAddress();
    }

    public abstract void Method3364(BrWsHdiLAwYGSB35z3ypQAx8eRulUOBh var1);

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
    public void Method3328(D2A33i4puy3VG87sLGopuKBa7759W0RD d2A33i4puy3VG87sLGopuKBa7759W0RD, ByteBuffer byteBuffer, boolean bl) {
        this.Field15689.Method3328(d2A33i4puy3VG87sLGopuKBa7759W0RD, byteBuffer, bl);
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
    public void Method3325(vbUsByat2W2VqvGVC3VWwk5FtcMDE72H vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2) {
        this.Field15689.Method3325(vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2);
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
    public iDprz50yBrPJ6StAk1hDYgq1aL04tvSb Method3343() {
        return this.Field15689.Method3343();
    }

    private void Method3372(IOException iOException) {
        if (iOException instanceof SSLException) {
            this.Method3367(iOException);
        }
        this.Field15689.Method5205();
    }

    static void Method3373(Z9isRG6BYbrxGGNGITuabJZMH69DuRSA z9isRG6BYbrxGGNGITuabJZMH69DuRSA, IOException iOException) {
        z9isRG6BYbrxGGNGITuabJZMH69DuRSA.Method3372(iOException);
    }

    static Thread Method3374(Z9isRG6BYbrxGGNGITuabJZMH69DuRSA z9isRG6BYbrxGGNGITuabJZMH69DuRSA, Thread thread) {
        z9isRG6BYbrxGGNGITuabJZMH69DuRSA.Field15694 = thread;
        return z9isRG6BYbrxGGNGITuabJZMH69DuRSA.Field15694;
    }

    static uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x Method3375(Z9isRG6BYbrxGGNGITuabJZMH69DuRSA z9isRG6BYbrxGGNGITuabJZMH69DuRSA) {
        return z9isRG6BYbrxGGNGITuabJZMH69DuRSA.Field15689;
    }

    static OutputStream Method3376(Z9isRG6BYbrxGGNGITuabJZMH69DuRSA z9isRG6BYbrxGGNGITuabJZMH69DuRSA) {
        return z9isRG6BYbrxGGNGITuabJZMH69DuRSA.Field15692;
    }

    static Socket Method3377(Z9isRG6BYbrxGGNGITuabJZMH69DuRSA z9isRG6BYbrxGGNGITuabJZMH69DuRSA) {
        return z9isRG6BYbrxGGNGITuabJZMH69DuRSA.Field15690;
    }

    private static String Method2690(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1176521202 ^ (long)-1176521202);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1403310560L ^ 0xAC5B2EDF);
            int n2 = (int)((long)2123847824 ^ (long)2123847851);
            cArray2[n] = (char)(cArray[n] ^ (((int)-1092019541L ^ 0xBEE91B62) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

