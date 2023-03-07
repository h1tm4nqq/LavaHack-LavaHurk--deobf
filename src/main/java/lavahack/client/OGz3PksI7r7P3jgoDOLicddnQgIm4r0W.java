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
import lavahack.client.DkMZhn6HTXSMui7v30mYhxPkVEtejJaC;
import lavahack.client.GgPix2l2IhOV2YPNehltx3kYgn5Hae5d;
import lavahack.client.IYRAvQCOnwZV7mgto0ownJdj7n804cPz;
import lavahack.client.IfKpyavsJETZqLc0F93NzuLcQ7i5KCtC;
import lavahack.client.J0AgBpF0fbEfiQ22w0wSRAnqCswl7pUP;
import lavahack.client.LjrZhVJZgdYdOQjs8taUmhVG2ojE4ziG;
import lavahack.client.OGz3PksI7r7P3jgoDOLicddnQgIm4r0W$1;
import lavahack.client.OGz3PksI7r7P3jgoDOLicddnQgIm4r0W$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.U2LPCHfts7ZgDTS3HlHHmKpDfc5a3yYU;
import lavahack.client.ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA;
import lavahack.client.dLtfcAfLpVozije9AO0FW8DO22lwsDHm;
import lavahack.client.iAw6fzyHsyGtLDOJA3dj3zpMGGHs2rhv;
import lavahack.client.mPNKUHesROKSVtFpAZyhLqRAupt8dodO;
import lavahack.client.rWOxkXahfy879ZWg1QDRw2hroxYTBucF;
import lavahack.client.rumXUXXkGViPNvM3BgPEMGjC3BbdwLpv;
import lavahack.client.vpFCZT43VpbVNYAPEbuutOMSD0jwE5QC;
import lavahack.client.xWMjGh6LDEAFckei7iMGBzoXopXB3PJx;

public abstract class OGz3PksI7r7P3jgoDOLicddnQgIm4r0W
extends LjrZhVJZgdYdOQjs8taUmhVG2ojE4ziG
implements Runnable,
ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA {
    protected URI Field8703 = null;
    private rWOxkXahfy879ZWg1QDRw2hroxYTBucF Field8704 = null;
    private Socket Field8705 = null;
    private SocketFactory Field8706 = null;
    private OutputStream Field8707;
    private Proxy Field8708 = Proxy.NO_PROXY;
    private Thread Field8709;
    private Thread Field8710;
    private DkMZhn6HTXSMui7v30mYhxPkVEtejJaC Field8711;
    private Map Field8712;
    private CountDownLatch Field8713 = new CountDownLatch((int)1947216051L ^ 0x741028B2);
    private CountDownLatch Field8714 = new CountDownLatch((int)((long)1727505445 ^ (long)1727505444));
    private int Field8715 = (int)2078143651L ^ 0x7BDDF4A3;
    private IfKpyavsJETZqLc0F93NzuLcQ7i5KCtC Field8716 = null;
    private String Field8717 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public OGz3PksI7r7P3jgoDOLicddnQgIm4r0W(URI uRI) {
        this(uRI, new xWMjGh6LDEAFckei7iMGBzoXopXB3PJx());
    }

    public OGz3PksI7r7P3jgoDOLicddnQgIm4r0W(URI uRI, DkMZhn6HTXSMui7v30mYhxPkVEtejJaC dkMZhn6HTXSMui7v30mYhxPkVEtejJaC) {
        this(uRI, dkMZhn6HTXSMui7v30mYhxPkVEtejJaC, null, (int)((long)-298123206 ^ (long)-298123206));
    }

    public OGz3PksI7r7P3jgoDOLicddnQgIm4r0W(URI uRI, Map map) {
        this(uRI, new xWMjGh6LDEAFckei7iMGBzoXopXB3PJx(), map);
    }

    public OGz3PksI7r7P3jgoDOLicddnQgIm4r0W(URI uRI, DkMZhn6HTXSMui7v30mYhxPkVEtejJaC dkMZhn6HTXSMui7v30mYhxPkVEtejJaC, Map map) {
        this(uRI, dkMZhn6HTXSMui7v30mYhxPkVEtejJaC, map, (int)((long)879353766 ^ (long)879353766));
    }

    public OGz3PksI7r7P3jgoDOLicddnQgIm4r0W(URI uRI, DkMZhn6HTXSMui7v30mYhxPkVEtejJaC dkMZhn6HTXSMui7v30mYhxPkVEtejJaC, Map map, int n) {
        if (uRI == null) {
            throw new IllegalArgumentException();
        }
        if (dkMZhn6HTXSMui7v30mYhxPkVEtejJaC == null) {
            throw new IllegalArgumentException("null as draft is permitted for `WebSocketServer` only!");
        }
        this.Field8703 = uRI;
        this.Field8711 = dkMZhn6HTXSMui7v30mYhxPkVEtejJaC;
        this.Field8716 = new OGz3PksI7r7P3jgoDOLicddnQgIm4r0W$1(this);
        if (map != null) {
            this.Field8712 = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            this.Field8712.putAll(map);
        }
        this.Field8715 = n;
        this.Method530(((int)386699042L ^ 0x170C8F22) != 0);
        this.Method532((boolean)((long)57532917 ^ (long)57532917));
        this.Field8704 = new rWOxkXahfy879ZWg1QDRw2hroxYTBucF((IYRAvQCOnwZV7mgto0ownJdj7n804cPz)this, dkMZhn6HTXSMui7v30mYhxPkVEtejJaC);
    }

    public URI Method563() {
        return this.Field8703;
    }

    @Override
    public DkMZhn6HTXSMui7v30mYhxPkVEtejJaC Method555() {
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

    public void Method568(IfKpyavsJETZqLc0F93NzuLcQ7i5KCtC ifKpyavsJETZqLc0F93NzuLcQ7i5KCtC) {
        this.Field8716 = ifKpyavsJETZqLc0F93NzuLcQ7i5KCtC;
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
        this.Field8713 = new CountDownLatch((int)((long)803568130 ^ (long)803568131));
        this.Field8714 = new CountDownLatch((int)-19477529L ^ 0xFED6CBE6);
        this.Field8704 = new rWOxkXahfy879ZWg1QDRw2hroxYTBucF((IYRAvQCOnwZV7mgto0ownJdj7n804cPz)this, this.Field8711);
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
        int n;
        this.Method571();
        if (this.Field8713.await(l, timeUnit) && this.Field8704.Method551()) {
            n = (int)((long)1571453562 ^ (long)1571453563);
            return n != 0;
        }
        n = (int)1603736777L ^ 0x5F9714C9;
        return n != 0;
    }

    @Override
    public void Method539() {
        if (this.Field8709 == null) return;
        this.Field8704.Method538(((int)38021615L ^ 0x2442992) << 3);
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
        this.Field8709 = new Thread(new OGz3PksI7r7P3jgoDOLicddnQgIm4r0W$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(this, this));
        this.Field8709.start();
        byte[] byArray = new byte[((int)-1905672450L ^ 0x8E69BEFF) << 14];
        while (!this.Method552() && !this.Method554() && (n = inputStream.read(byArray)) != ((int)303159361L ^ 0xEDEE27BE)) {
            this.Field8704.Method5272(ByteBuffer.wrap(byArray, (int)1744680957L ^ 0x67FDB7FD, n));
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
        this.Field8705 = sSLSocketFactory.createSocket(this.Field8705, this.Field8703.getHost(), this.Method578(), (boolean)((long)125938087 ^ (long)125938086));
    }

    private boolean Method576() throws IOException {
        int n = (int)290177943L ^ 0x114BC397;
        if (this.Field8708 != Proxy.NO_PROXY) {
            this.Field8705 = new Socket(this.Field8708);
            return (int)((long)-1480808243 ^ (long)-1480808244) != 0;
        }
        if (this.Field8706 != null) {
            this.Field8705 = this.Field8706.createSocket();
            return n != 0;
        }
        if (this.Field8705 == null) {
            this.Field8705 = new Socket(this.Field8708);
            return (int)((long)-890375514 ^ (long)-890375513) != 0;
        }
        if (!this.Field8705.isClosed()) return n != 0;
        throw new IOException();
    }

    protected void Method577(SSLParameters sSLParameters) {
        sSLParameters.setEndpointIdentificationAlgorithm("HTTPS");
    }

    private int Method578() {
        int n;
        int n2 = this.Field8703.getPort();
        String string = this.Field8703.getScheme();
        if ("wss".equals(string)) {
            int n3;
            if (n2 == ((int)-1271524581L ^ 0x4BC9ECE4)) {
                n3 = (int)((long)-325181952 ^ (long)-325181509);
                return n3;
            }
            n3 = n2;
            return n3;
        }
        if (!"ws".equals(string)) throw new IllegalArgumentException("unknown scheme: " + string);
        if (n2 == (int)((long)857617366 ^ (long)-857617367)) {
            n = (int)((long)-234920387 ^ (long)-234920392) << 4;
            return n;
        }
        n = n2;
        return n;
    }

    private void Method579() throws J0AgBpF0fbEfiQ22w0wSRAnqCswl7pUP {
        String string = this.Field8703.getRawPath();
        String string2 = this.Field8703.getRawQuery();
        String string3 = string == null || string.length() == 0 ? "/" : string;
        if (string2 != null) {
            string3 = string3 + (char)((long)115008713 ^ (long)115008758) + string2;
        }
        int n = this.Method578();
        String string4 = this.Field8703.getHost() + (n != (int)((long)1899805826 ^ (long)1899805831) << 4 && n != ((int)-1437013826L ^ 0xAA58E905) ? ":" + n : "");
        rumXUXXkGViPNvM3BgPEMGjC3BbdwLpv rumXUXXkGViPNvM3BgPEMGjC3BbdwLpv2 = new rumXUXXkGViPNvM3BgPEMGjC3BbdwLpv();
        rumXUXXkGViPNvM3BgPEMGjC3BbdwLpv2.Method7008(string3);
        rumXUXXkGViPNvM3BgPEMGjC3BbdwLpv2.Method6("Host", string4);
        if (this.Field8712 != null) {
            for (Map.Entry entry : this.Field8712.entrySet()) {
                rumXUXXkGViPNvM3BgPEMGjC3BbdwLpv2.Method6((String)entry.getKey(), (String)entry.getValue());
            }
        }
        this.Field8704.Method5286(rumXUXXkGViPNvM3BgPEMGjC3BbdwLpv2);
    }

    @Override
    public U2LPCHfts7ZgDTS3HlHHmKpDfc5a3yYU Method556() {
        return this.Field8704.Method556();
    }

    @Override
    public final void Method508(ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA, String string) {
        this.Method584(string);
    }

    @Override
    public final void Method509(ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA, ByteBuffer byteBuffer) {
        this.Method587(byteBuffer);
    }

    @Override
    public final void Method510(ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA, iAw6fzyHsyGtLDOJA3dj3zpMGGHs2rhv iAw6fzyHsyGtLDOJA3dj3zpMGGHs2rhv2) {
        this.Method524();
        this.Method583((vpFCZT43VpbVNYAPEbuutOMSD0jwE5QC)iAw6fzyHsyGtLDOJA3dj3zpMGGHs2rhv2);
        this.Field8713.countDown();
    }

    @Override
    public final void Method511(ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA, int n, String string, boolean bl) {
        this.Method523();
        if (this.Field8709 != null) {
            this.Field8709.interrupt();
        }
        this.Method585(n, string, bl);
        this.Field8713.countDown();
        this.Field8714.countDown();
    }

    @Override
    public final void Method514(ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA, Exception exception) {
        this.Method586(exception);
    }

    @Override
    public final void Method518(ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA) {
    }

    @Override
    public void Method513(ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA, int n, String string) {
        this.Method580(n, string);
    }

    @Override
    public void Method512(ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA, int n, String string, boolean bl) {
        this.Method581(n, string, bl);
    }

    public void Method580(int n, String string) {
    }

    public void Method581(int n, String string, boolean bl) {
    }

    public ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA Method582() {
        return this.Field8704;
    }

    @Override
    public InetSocketAddress Method519(ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA) {
        if (this.Field8705 == null) return null;
        return (InetSocketAddress)this.Field8705.getLocalSocketAddress();
    }

    @Override
    public InetSocketAddress Method520(ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA zJ0rgChafnBW8bL000CqsHF7n9Wv4YDA) {
        if (this.Field8705 == null) return null;
        return (InetSocketAddress)this.Field8705.getRemoteSocketAddress();
    }

    public abstract void Method583(vpFCZT43VpbVNYAPEbuutOMSD0jwE5QC var1);

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
    public void Method547(mPNKUHesROKSVtFpAZyhLqRAupt8dodO mPNKUHesROKSVtFpAZyhLqRAupt8dodO2, ByteBuffer byteBuffer, boolean bl) {
        this.Field8704.Method547(mPNKUHesROKSVtFpAZyhLqRAupt8dodO2, byteBuffer, bl);
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
    public void Method544(GgPix2l2IhOV2YPNehltx3kYgn5Hae5d ggPix2l2IhOV2YPNehltx3kYgn5Hae5d) {
        this.Field8704.Method544(ggPix2l2IhOV2YPNehltx3kYgn5Hae5d);
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
    public dLtfcAfLpVozije9AO0FW8DO22lwsDHm Method562() {
        return this.Field8704.Method562();
    }

    private void Method591(IOException iOException) {
        if (iOException instanceof SSLException) {
            this.Method586(iOException);
        }
        this.Field8704.Method5283();
    }

    static void Method592(OGz3PksI7r7P3jgoDOLicddnQgIm4r0W oGz3PksI7r7P3jgoDOLicddnQgIm4r0W, IOException iOException) {
        oGz3PksI7r7P3jgoDOLicddnQgIm4r0W.Method591(iOException);
    }

    static Thread Method593(OGz3PksI7r7P3jgoDOLicddnQgIm4r0W oGz3PksI7r7P3jgoDOLicddnQgIm4r0W, Thread thread) {
        oGz3PksI7r7P3jgoDOLicddnQgIm4r0W.Field8709 = thread;
        return oGz3PksI7r7P3jgoDOLicddnQgIm4r0W.Field8709;
    }

    static rWOxkXahfy879ZWg1QDRw2hroxYTBucF Method594(OGz3PksI7r7P3jgoDOLicddnQgIm4r0W oGz3PksI7r7P3jgoDOLicddnQgIm4r0W) {
        return oGz3PksI7r7P3jgoDOLicddnQgIm4r0W.Field8704;
    }

    static OutputStream Method595(OGz3PksI7r7P3jgoDOLicddnQgIm4r0W oGz3PksI7r7P3jgoDOLicddnQgIm4r0W) {
        return oGz3PksI7r7P3jgoDOLicddnQgIm4r0W.Field8707;
    }

    static Socket Method596(OGz3PksI7r7P3jgoDOLicddnQgIm4r0W oGz3PksI7r7P3jgoDOLicddnQgIm4r0W) {
        return oGz3PksI7r7P3jgoDOLicddnQgIm4r0W.Field8705;
    }

    private static String Method536(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-969482184 ^ (long)-969482184);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1940932142L ^ 0x73B046D1);
            int n2 = (int)((long)-234692713 ^ (long)-234692670) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)407272405 ^ (long)407257486) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

