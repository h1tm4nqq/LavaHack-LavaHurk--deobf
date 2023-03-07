/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package lavahack.client;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import javax.net.ssl.SSLSession;
import lavahack.client.DkMZhn6HTXSMui7v30mYhxPkVEtejJaC;
import lavahack.client.GKUxZmIddU5QpnnBzzPOthFWj7xOlXhc;
import lavahack.client.GgPix2l2IhOV2YPNehltx3kYgn5Hae5d;
import lavahack.client.IYRAvQCOnwZV7mgto0ownJdj7n804cPz;
import lavahack.client.J0AgBpF0fbEfiQ22w0wSRAnqCswl7pUP;
import lavahack.client.QH3uGSQfBc0ruOc2z4SmsFs6BmMxsKDx;
import lavahack.client.U2LPCHfts7ZgDTS3HlHHmKpDfc5a3yYU;
import lavahack.client.VA2stDq1KcAOab9vdgjUTrUWlqRjSFJa;
import lavahack.client.YZ4mfV5LFAyRaH8EvRmw03wALftTjEeL;
import lavahack.client.ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA;
import lavahack.client.bk6bPVZUqGM9n7Ej5sO6Hy7J1GimyoOE;
import lavahack.client.dLtfcAfLpVozije9AO0FW8DO22lwsDHm;
import lavahack.client.eOzfLK9AJmts1SDoM2MkHzTMR3OjWXRL;
import lavahack.client.iAw6fzyHsyGtLDOJA3dj3zpMGGHs2rhv;
import lavahack.client.k6qfAI2dl0YQZ6l1TQGutG7w1UXZhj58;
import lavahack.client.kNuY0BY4czM9ovYHzLoYCid0yPUj6xjF;
import lavahack.client.klPBJiYIPRrdqJN2sk9YixrCzUuop5PC;
import lavahack.client.kz9yBy5IcUjlF6qU5Go6qNMG7DtYXetX;
import lavahack.client.mPNKUHesROKSVtFpAZyhLqRAupt8dodO;
import lavahack.client.qcN6GMzSxw5IRGtqQaLaxz5Iw1NKZzsc;
import lavahack.client.slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.vpFCZT43VpbVNYAPEbuutOMSD0jwE5QC;
import lavahack.client.wVrpt4geN1bZiIzz3Cg8ao4ARNJY2Ej1;
import lavahack.client.xWMjGh6LDEAFckei7iMGBzoXopXB3PJx;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rWOxkXahfy879ZWg1QDRw2hroxYTBucF
implements ZJ0rgChafnBW8bL000CqsHF7n9Wv4YDA {
    public static final int Field13939;
    public static final int Field13940;
    public static final int Field13941;
    private final Logger Field13942 = LogManager.getLogger(rWOxkXahfy879ZWg1QDRw2hroxYTBucF.class);
    public final BlockingQueue Field13943;
    public final BlockingQueue Field13944;
    private final IYRAvQCOnwZV7mgto0ownJdj7n804cPz Field13945;
    private SelectionKey Field13946;
    private ByteChannel Field13947;
    private slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX.leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field13948;
    private boolean Field13949 = (int)-1726564713L ^ 0x9916B697;
    private U2LPCHfts7ZgDTS3HlHHmKpDfc5a3yYU Field13950 = U2LPCHfts7ZgDTS3HlHHmKpDfc5a3yYU.Field15509;
    private List Field13951;
    private DkMZhn6HTXSMui7v30mYhxPkVEtejJaC Field13952 = null;
    private YZ4mfV5LFAyRaH8EvRmw03wALftTjEeL Field13953;
    private ByteBuffer Field13954 = ByteBuffer.allocate((int)((long)-1077048463 ^ (long)-1077048463));
    private QH3uGSQfBc0ruOc2z4SmsFs6BmMxsKDx Field13955 = null;
    private String Field13956 = null;
    private Integer Field13957 = null;
    private Boolean Field13958 = null;
    private String Field13959 = null;
    private long Field13960 = System.nanoTime();
    private final Object Field13961 = new Object();
    private Object Field13962;
    static final boolean Field13963;
    private String Field13964 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public rWOxkXahfy879ZWg1QDRw2hroxYTBucF(IYRAvQCOnwZV7mgto0ownJdj7n804cPz iYRAvQCOnwZV7mgto0ownJdj7n804cPz, List list) {
        this(iYRAvQCOnwZV7mgto0ownJdj7n804cPz, (DkMZhn6HTXSMui7v30mYhxPkVEtejJaC)null);
        this.Field13953 = YZ4mfV5LFAyRaH8EvRmw03wALftTjEeL.Field11415;
        if (list != null && !list.isEmpty()) {
            this.Field13951 = list;
            return;
        }
        this.Field13951 = new ArrayList();
        this.Field13951.add(new xWMjGh6LDEAFckei7iMGBzoXopXB3PJx());
    }

    public rWOxkXahfy879ZWg1QDRw2hroxYTBucF(IYRAvQCOnwZV7mgto0ownJdj7n804cPz iYRAvQCOnwZV7mgto0ownJdj7n804cPz, DkMZhn6HTXSMui7v30mYhxPkVEtejJaC dkMZhn6HTXSMui7v30mYhxPkVEtejJaC) {
        if (iYRAvQCOnwZV7mgto0ownJdj7n804cPz == null) throw new IllegalArgumentException("parameters must not be null");
        if (dkMZhn6HTXSMui7v30mYhxPkVEtejJaC == null && this.Field13953 == YZ4mfV5LFAyRaH8EvRmw03wALftTjEeL.Field11415) {
            throw new IllegalArgumentException("parameters must not be null");
        }
        this.Field13943 = new LinkedBlockingQueue();
        this.Field13944 = new LinkedBlockingQueue();
        this.Field13945 = iYRAvQCOnwZV7mgto0ownJdj7n804cPz;
        this.Field13953 = YZ4mfV5LFAyRaH8EvRmw03wALftTjEeL.Field11414;
        if (dkMZhn6HTXSMui7v30mYhxPkVEtejJaC == null) return;
        this.Field13952 = dkMZhn6HTXSMui7v30mYhxPkVEtejJaC.Method4414();
    }

    public void Method5272(ByteBuffer byteBuffer) {
        if (!Field13963 && !byteBuffer.hasRemaining()) {
            throw new AssertionError();
        }
        this.Field13942.trace("process({}): ({})", (Object)byteBuffer.remaining(), (Object)(byteBuffer.remaining() > (int)((long)-1962610944 ^ (long)-1962610819) << 3 ? "too big to display" : new String(byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining())));
        if (this.Field13950 != U2LPCHfts7ZgDTS3HlHHmKpDfc5a3yYU.Field15509) {
            if (this.Field13950 != U2LPCHfts7ZgDTS3HlHHmKpDfc5a3yYU.Field15510) return;
            this.Method5274(byteBuffer);
            return;
        }
        if (!this.Method5273(byteBuffer)) return;
        if (this.Method552()) return;
        if (this.Method554()) return;
        if (!Field13963 && this.Field13954.hasRemaining() == byteBuffer.hasRemaining() && byteBuffer.hasRemaining()) {
            throw new AssertionError();
        }
        if (byteBuffer.hasRemaining()) {
            this.Method5274(byteBuffer);
            return;
        }
        if (!this.Field13954.hasRemaining()) return;
        this.Method5274(this.Field13954);
    }

    private boolean Method5273(ByteBuffer byteBuffer) {
        iAw6fzyHsyGtLDOJA3dj3zpMGGHs2rhv iAw6fzyHsyGtLDOJA3dj3zpMGGHs2rhv2;
        QH3uGSQfBc0ruOc2z4SmsFs6BmMxsKDx qH3uGSQfBc0ruOc2z4SmsFs6BmMxsKDx;
        DkMZhn6HTXSMui7v30mYhxPkVEtejJaC dkMZhn6HTXSMui7v30mYhxPkVEtejJaC;
        Object object;
        ByteBuffer byteBuffer2;
        if (this.Field13954.capacity() == 0) {
            byteBuffer2 = byteBuffer;
        } else {
            if (this.Field13954.remaining() < byteBuffer.remaining()) {
                object = ByteBuffer.allocate(this.Field13954.capacity() + byteBuffer.remaining());
                this.Field13954.flip();
                object.put(this.Field13954);
                this.Field13954 = object;
            }
            this.Field13954.put(byteBuffer);
            this.Field13954.flip();
            byteBuffer2 = this.Field13954;
        }
        byteBuffer2.mark();
        if (this.Field13953 == YZ4mfV5LFAyRaH8EvRmw03wALftTjEeL.Field11415) {
            if (this.Field13952 != null) {
                iAw6fzyHsyGtLDOJA3dj3zpMGGHs2rhv iAw6fzyHsyGtLDOJA3dj3zpMGGHs2rhv3 = this.Field13952.Method4415(byteBuffer2);
                if (!(iAw6fzyHsyGtLDOJA3dj3zpMGGHs2rhv3 instanceof QH3uGSQfBc0ruOc2z4SmsFs6BmMxsKDx)) {
                    this.Field13942.trace("Closing due to protocol error: wrong http function");
                    this.Method5282((int)((long)1568213805 ^ (long)1568213720) << 1, "wrong http function", (boolean)((long)1166565190 ^ (long)1166565190));
                    return (int)((long)-190780295 ^ (long)-190780295) != 0;
                }
                QH3uGSQfBc0ruOc2z4SmsFs6BmMxsKDx qH3uGSQfBc0ruOc2z4SmsFs6BmMxsKDx2 = (QH3uGSQfBc0ruOc2z4SmsFs6BmMxsKDx)iAw6fzyHsyGtLDOJA3dj3zpMGGHs2rhv3;
                object = this.Field13952.Method4398(qH3uGSQfBc0ruOc2z4SmsFs6BmMxsKDx2);
                if (object == bk6bPVZUqGM9n7Ej5sO6Hy7J1GimyoOE.Field15474) {
                    this.Method5289(qH3uGSQfBc0ruOc2z4SmsFs6BmMxsKDx2);
                    return ((int)-1851078374L ^ 0x91AAC91B) != 0;
                }
                this.Field13942.trace("Closing due to protocol error: the handshake did finally not match");
                this.Method537(((int)-1898301387L ^ 0x8EDA39C0) << 1, "the handshake did finally not match");
                return (int)((long)1821677972 ^ (long)1821677972) != 0;
            }
        } else {
            if (this.Field13953 != YZ4mfV5LFAyRaH8EvRmw03wALftTjEeL.Field11414) return ((int)221055183L ^ 0xD2D08CF) != 0;
            this.Field13952.Method4418(this.Field13953);
            iAw6fzyHsyGtLDOJA3dj3zpMGGHs2rhv iAw6fzyHsyGtLDOJA3dj3zpMGGHs2rhv4 = this.Field13952.Method4415(byteBuffer2);
            if (!(iAw6fzyHsyGtLDOJA3dj3zpMGGHs2rhv4 instanceof vpFCZT43VpbVNYAPEbuutOMSD0jwE5QC)) {
                this.Field13942.trace("Closing due to protocol error: wrong http function");
                this.Method5282(((int)-519430987L ^ 0xE10A1D40) << 1, "wrong http function", ((int)-1075657982L ^ 0xBFE2C302) != 0);
                return (int)((long)2114400547 ^ (long)2114400547) != 0;
            }
            vpFCZT43VpbVNYAPEbuutOMSD0jwE5QC vpFCZT43VpbVNYAPEbuutOMSD0jwE5QC2 = (vpFCZT43VpbVNYAPEbuutOMSD0jwE5QC)iAw6fzyHsyGtLDOJA3dj3zpMGGHs2rhv4;
            object = this.Field13952.Method4397(this.Field13955, vpFCZT43VpbVNYAPEbuutOMSD0jwE5QC2);
            if (object == bk6bPVZUqGM9n7Ej5sO6Hy7J1GimyoOE.Field15474) {
                this.Field13945.Method506(this, this.Field13955, vpFCZT43VpbVNYAPEbuutOMSD0jwE5QC2);
                this.Method5289(vpFCZT43VpbVNYAPEbuutOMSD0jwE5QC2);
                return ((int)-304733597L ^ 0xEDD62262) != 0;
            }
            this.Field13942.trace("Closing due to protocol error: draft {} refuses handshake", (Object)this.Field13952);
            this.Method537((int)((long)802709851 ^ (long)802709678) << 1, "draft " + this.Field13952 + " refuses handshake");
            return ((int)221055183L ^ 0xD2D08CF) != 0;
        }
        Iterator iterator = this.Field13951.iterator();
        do {
            if (!iterator.hasNext()) {
                if (this.Field13952 != null) return (int)((long)487307583 ^ (long)487307583) != 0;
                this.Field13942.trace("Closing due to protocol error: no draft matches");
                this.Method5275(new eOzfLK9AJmts1SDoM2MkHzTMR3OjWXRL(((int)1424778807L ^ 0x54EC67C2) << 1, "no draft matches"));
                return (int)((long)487307583 ^ (long)487307583) != 0;
            }
            dkMZhn6HTXSMui7v30mYhxPkVEtejJaC = (DkMZhn6HTXSMui7v30mYhxPkVEtejJaC)iterator.next();
            dkMZhn6HTXSMui7v30mYhxPkVEtejJaC = dkMZhn6HTXSMui7v30mYhxPkVEtejJaC.Method4414();
            dkMZhn6HTXSMui7v30mYhxPkVEtejJaC.Method4418(this.Field13953);
            byteBuffer2.reset();
            iAw6fzyHsyGtLDOJA3dj3zpMGGHs2rhv2 = dkMZhn6HTXSMui7v30mYhxPkVEtejJaC.Method4415(byteBuffer2);
            if (iAw6fzyHsyGtLDOJA3dj3zpMGGHs2rhv2 instanceof QH3uGSQfBc0ruOc2z4SmsFs6BmMxsKDx) continue;
            this.Field13942.trace("Closing due to wrong handshake");
            this.Method5275(new eOzfLK9AJmts1SDoM2MkHzTMR3OjWXRL(((int)-763702332L ^ 0xD27AD231) << 1, "wrong http function"));
            return (int)((long)-1068240961 ^ (long)-1068240961) != 0;
        } while ((object = dkMZhn6HTXSMui7v30mYhxPkVEtejJaC.Method4398(qH3uGSQfBc0ruOc2z4SmsFs6BmMxsKDx = (QH3uGSQfBc0ruOc2z4SmsFs6BmMxsKDx)iAw6fzyHsyGtLDOJA3dj3zpMGGHs2rhv2)) != bk6bPVZUqGM9n7Ej5sO6Hy7J1GimyoOE.Field15474);
        this.Field13959 = qH3uGSQfBc0ruOc2z4SmsFs6BmMxsKDx.Method2233();
        VA2stDq1KcAOab9vdgjUTrUWlqRjSFJa vA2stDq1KcAOab9vdgjUTrUWlqRjSFJa = this.Field13945.Method505(this, dkMZhn6HTXSMui7v30mYhxPkVEtejJaC, qH3uGSQfBc0ruOc2z4SmsFs6BmMxsKDx);
        this.Method5288(dkMZhn6HTXSMui7v30mYhxPkVEtejJaC.Method4407(dkMZhn6HTXSMui7v30mYhxPkVEtejJaC.Method4411(qH3uGSQfBc0ruOc2z4SmsFs6BmMxsKDx, vA2stDq1KcAOab9vdgjUTrUWlqRjSFJa)));
        this.Field13952 = dkMZhn6HTXSMui7v30mYhxPkVEtejJaC;
        this.Method5289(qH3uGSQfBc0ruOc2z4SmsFs6BmMxsKDx);
        return (int)((long)-2047677785 ^ (long)-2047677786) != 0;
    }

    private void Method5274(ByteBuffer byteBuffer) {
        List list = this.Field13952.Method4412(byteBuffer);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            GgPix2l2IhOV2YPNehltx3kYgn5Hae5d ggPix2l2IhOV2YPNehltx3kYgn5Hae5d = (GgPix2l2IhOV2YPNehltx3kYgn5Hae5d)iterator.next();
            this.Field13942.trace("matched frame: {}", (Object)ggPix2l2IhOV2YPNehltx3kYgn5Hae5d);
            this.Field13952.Method4403(this, ggPix2l2IhOV2YPNehltx3kYgn5Hae5d);
        }
    }

    private void Method5275(eOzfLK9AJmts1SDoM2MkHzTMR3OjWXRL eOzfLK9AJmts1SDoM2MkHzTMR3OjWXRL2) {
        this.Method5287(this.Method5277((int)((long)628826716 ^ (long)628826681) << 2));
        this.Method5282(eOzfLK9AJmts1SDoM2MkHzTMR3OjWXRL2.Method192(), eOzfLK9AJmts1SDoM2MkHzTMR3OjWXRL2.getMessage(), (boolean)((long)1145098276 ^ (long)1145098276));
    }

    private void Method5276(RuntimeException runtimeException) {
        this.Method5287(this.Method5277((int)((long)-2003327200 ^ (long)-2003327139) << 2));
        this.Method5282((int)1717286777L ^ 0x99A44886, runtimeException.getMessage(), (boolean)((long)-1938382808 ^ (long)-1938382808));
    }

    private ByteBuffer Method5277(int n) {
        String string;
        switch (n) {
            case 404: {
                string = "404 WebSocket Upgrade Failure";
                return ByteBuffer.wrap(k6qfAI2dl0YQZ6l1TQGutG7w1UXZhj58.Method1095("HTTP/1.1 " + string + "\r\nContent-Type: text/html\r\nServer: TooTallNate Java-WebSocket\r\nContent-Length: " + ((((int)-2002464480L ^ 0x88A4D123) << 4) + string.length()) + "\r\n\r\n<html><head></head><body><h1>" + string + "</h1></body></html>"));
            }
        }
        string = "500 Internal Server Error";
        return ByteBuffer.wrap(k6qfAI2dl0YQZ6l1TQGutG7w1UXZhj58.Method1095("HTTP/1.1 " + string + "\r\nContent-Type: text/html\r\nServer: TooTallNate Java-WebSocket\r\nContent-Length: " + ((((int)-2002464480L ^ 0x88A4D123) << 4) + string.length()) + "\r\n\r\n<html><head></head><body><h1>" + string + "</h1></body></html>"));
    }

    public synchronized void Method5278(int n, String string, boolean bl) {
        if (this.Field13950 == U2LPCHfts7ZgDTS3HlHHmKpDfc5a3yYU.Field15511) return;
        if (this.Field13950 == U2LPCHfts7ZgDTS3HlHHmKpDfc5a3yYU.Field15512) return;
        if (this.Field13950 == U2LPCHfts7ZgDTS3HlHHmKpDfc5a3yYU.Field15510) {
            if (n == (int)((long)1608996183 ^ (long)1608996000) << 1) {
                if (!Field13963 && bl) {
                    throw new AssertionError();
                }
                this.Field13950 = U2LPCHfts7ZgDTS3HlHHmKpDfc5a3yYU.Field15511;
                this.Method5282(n, string, (boolean)((long)880996221 ^ (long)880996221));
                return;
            }
            if (this.Field13952.Method4413() != kNuY0BY4czM9ovYHzLoYCid0yPUj6xjF.Field10859) {
                if (!bl) {
                    this.Field13945.Method513(this, n, string);
                }
                if (this.Method551()) {
                    kz9yBy5IcUjlF6qU5Go6qNMG7DtYXetX kz9yBy5IcUjlF6qU5Go6qNMG7DtYXetX2 = new kz9yBy5IcUjlF6qU5Go6qNMG7DtYXetX();
                    kz9yBy5IcUjlF6qU5Go6qNMG7DtYXetX2.Method3963(string);
                    kz9yBy5IcUjlF6qU5Go6qNMG7DtYXetX2.Method3962(n);
                    kz9yBy5IcUjlF6qU5Go6qNMG7DtYXetX2.Method1620();
                    this.Method544(kz9yBy5IcUjlF6qU5Go6qNMG7DtYXetX2);
                }
            }
            this.Method5282(n, string, bl);
        } else if (n == ((int)964510320L ^ 0xC682BD8D)) {
            if (!Field13963 && !bl) {
                throw new AssertionError();
            }
            this.Method5282((int)((long)1847245967 ^ (long)-1847245966), string, (boolean)((long)-652059458 ^ (long)-652059457));
        } else if (n == (int)((long)267262629 ^ (long)267262800) << 1) {
            this.Method5282(n, string, bl);
        } else {
            this.Method5282((int)759713133L ^ 0xD2B7B292, string, (boolean)((long)-962158478 ^ (long)-962158478));
        }
        this.Field13950 = U2LPCHfts7ZgDTS3HlHHmKpDfc5a3yYU.Field15511;
        this.Field13954 = null;
    }

    @Override
    public void Method537(int n, String string) {
        this.Method5278(n, string, ((int)958456323L ^ 0x3920E203) != 0);
    }

    public synchronized void Method5279(int n, String string, boolean bl) {
        if (this.Field13950 == U2LPCHfts7ZgDTS3HlHHmKpDfc5a3yYU.Field15512) {
            return;
        }
        if (this.Field13950 == U2LPCHfts7ZgDTS3HlHHmKpDfc5a3yYU.Field15510 && n == ((int)-1764578667L ^ 0x96D2AB62) << 1) {
            this.Field13950 = U2LPCHfts7ZgDTS3HlHHmKpDfc5a3yYU.Field15511;
        }
        if (this.Field13946 != null) {
            this.Field13946.cancel();
        }
        if (this.Field13947 != null) {
            this.Field13947.close();
        }
        this.Field13945.Method511(this, n, string, bl);
        if (this.Field13952 != null) {
            this.Field13952.Method4405();
        }
        this.Field13955 = null;
        this.Field13950 = U2LPCHfts7ZgDTS3HlHHmKpDfc5a3yYU.Field15512;
    }

    protected void Method5280(int n, boolean bl) {
        this.Method5279(n, "", bl);
    }

    public void Method5281() {
        if (this.Field13958 == null) {
            throw new IllegalStateException("this method must be used in conjunction with flushAndClose");
        }
        this.Method5279(this.Field13957, this.Field13956, this.Field13958);
    }

    @Override
    public void Method540(int n, String string) {
        this.Method5279(n, string, ((int)2076787801L ^ 0x7BC94459) != 0);
    }

    public synchronized void Method5282(int n, String string, boolean bl) {
        if (this.Field13949) {
            return;
        }
        this.Field13957 = n;
        this.Field13956 = string;
        this.Field13958 = bl;
        this.Field13949 = (int)((long)430302473 ^ (long)430302472);
        this.Field13945.Method518(this);
        this.Field13945.Method512(this, n, string, bl);
        if (this.Field13952 != null) {
            this.Field13952.Method4405();
        }
        this.Field13955 = null;
    }

    public void Method5283() {
        if (this.Field13950 == U2LPCHfts7ZgDTS3HlHHmKpDfc5a3yYU.Field15509) {
            this.Method5280((int)((long)235921883 ^ (long)-235921884), (boolean)((long)348455970 ^ (long)348455971));
            return;
        }
        if (this.Field13949) {
            this.Method5279(this.Field13957, this.Field13956, this.Field13958);
            return;
        }
        if (this.Field13952.Method4413() == kNuY0BY4czM9ovYHzLoYCid0yPUj6xjF.Field10859) {
            this.Method5280(((int)-97741434L ^ 0xFA2C95FB) << 3, (boolean)((long)398660544 ^ (long)398660545));
            return;
        }
        if (this.Field13952.Method4413() != kNuY0BY4czM9ovYHzLoYCid0yPUj6xjF.Field10860) {
            this.Method5280(((int)119095004L ^ 0x7193F2B) << 1, (boolean)((long)-1915980765 ^ (long)-1915980766));
            return;
        }
        if (this.Field13953 == YZ4mfV5LFAyRaH8EvRmw03wALftTjEeL.Field11415) {
            this.Method5280(((int)-1184822835L ^ 0xB961083A) << 1, (boolean)((long)1964844837 ^ (long)1964844836));
            return;
        }
        this.Method5280(((int)-907386232L ^ 0xC9EA62F5) << 3, ((int)1242164769L ^ 0x4A09EE20) != 0);
    }

    @Override
    public void Method538(int n) {
        this.Method5278(n, "", (boolean)((long)1419759797 ^ (long)1419759797));
    }

    public void Method5284(eOzfLK9AJmts1SDoM2MkHzTMR3OjWXRL eOzfLK9AJmts1SDoM2MkHzTMR3OjWXRL2) {
        this.Method5278(eOzfLK9AJmts1SDoM2MkHzTMR3OjWXRL2.Method192(), eOzfLK9AJmts1SDoM2MkHzTMR3OjWXRL2.getMessage(), ((int)371809515L ^ 0x16295CEB) != 0);
    }

    @Override
    public void Method541(String string) {
        if (string == null) {
            throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
        }
        this.Method5285(this.Field13952.Method4402(string, (this.Field13953 == YZ4mfV5LFAyRaH8EvRmw03wALftTjEeL.Field11414 ? (int)1791445506L ^ 0x6AC74A03 : (int)((long)-1219561081 ^ (long)-1219561081)) != 0));
    }

    @Override
    public void Method542(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
        }
        this.Method5285(this.Field13952.Method4401(byteBuffer, (this.Field13953 == YZ4mfV5LFAyRaH8EvRmw03wALftTjEeL.Field11414 ? (int)((long)-246907331 ^ (long)-246907332) : (int)((long)-634173693 ^ (long)-634173693)) != 0));
    }

    @Override
    public void Method543(byte[] byArray) {
        this.Method542(ByteBuffer.wrap(byArray));
    }

    private void Method5285(Collection collection) {
        if (!this.Method551()) {
            throw new GKUxZmIddU5QpnnBzzPOthFWj7xOlXhc();
        }
        if (collection == null) {
            throw new IllegalArgumentException();
        }
        ArrayList<ByteBuffer> arrayList = new ArrayList<ByteBuffer>();
        Iterator iterator = collection.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                this.Method5288(arrayList);
                return;
            }
            GgPix2l2IhOV2YPNehltx3kYgn5Hae5d ggPix2l2IhOV2YPNehltx3kYgn5Hae5d = (GgPix2l2IhOV2YPNehltx3kYgn5Hae5d)iterator.next();
            this.Field13942.trace("send frame: {}", (Object)ggPix2l2IhOV2YPNehltx3kYgn5Hae5d);
            arrayList.add(this.Field13952.Method4400(ggPix2l2IhOV2YPNehltx3kYgn5Hae5d));
        }
    }

    @Override
    public void Method547(mPNKUHesROKSVtFpAZyhLqRAupt8dodO mPNKUHesROKSVtFpAZyhLqRAupt8dodO2, ByteBuffer byteBuffer, boolean bl) {
        this.Method5285(this.Field13952.Method4404(mPNKUHesROKSVtFpAZyhLqRAupt8dodO2, byteBuffer, bl));
    }

    @Override
    public void Method545(Collection collection) {
        this.Method5285(collection);
    }

    @Override
    public void Method544(GgPix2l2IhOV2YPNehltx3kYgn5Hae5d ggPix2l2IhOV2YPNehltx3kYgn5Hae5d) {
        this.Method5285(Collections.singletonList(ggPix2l2IhOV2YPNehltx3kYgn5Hae5d));
    }

    @Override
    public void Method546() throws NullPointerException {
        wVrpt4geN1bZiIzz3Cg8ao4ARNJY2Ej1 wVrpt4geN1bZiIzz3Cg8ao4ARNJY2Ej12 = this.Field13945.Method516(this);
        if (wVrpt4geN1bZiIzz3Cg8ao4ARNJY2Ej12 == null) {
            throw new NullPointerException("onPreparePing(WebSocket) returned null. PingFrame to sent can't be null.");
        }
        this.Method544(wVrpt4geN1bZiIzz3Cg8ao4ARNJY2Ej12);
    }

    @Override
    public boolean Method548() {
        int n;
        if (!this.Field13943.isEmpty()) {
            n = (int)((long)249969770 ^ (long)249969771);
            return n != 0;
        }
        n = (int)((long)-2000396132 ^ (long)-2000396132);
        return n != 0;
    }

    public void Method5286(klPBJiYIPRrdqJN2sk9YixrCzUuop5PC klPBJiYIPRrdqJN2sk9YixrCzUuop5PC2) throws J0AgBpF0fbEfiQ22w0wSRAnqCswl7pUP {
        this.Field13955 = this.Field13952.Method4410(klPBJiYIPRrdqJN2sk9YixrCzUuop5PC2);
        this.Field13959 = klPBJiYIPRrdqJN2sk9YixrCzUuop5PC2.Method2233();
        if (!Field13963 && this.Field13959 == null) {
            throw new AssertionError();
        }
        this.Field13945.Method507(this, this.Field13955);
        this.Method5288(this.Field13952.Method4407(this.Field13955));
    }

    private void Method5287(ByteBuffer byteBuffer) {
        this.Field13942.trace("write({}): {}", (Object)byteBuffer.remaining(), (Object)(byteBuffer.remaining() > (int)((long)-489382751 ^ (long)-489382692) << 3 ? "too big to display" : new String(byteBuffer.array())));
        this.Field13943.add(byteBuffer);
        this.Field13945.Method518(this);
    }

    private void Method5288(List list) {
        Object object = this.Field13961;
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer)iterator.next();
            this.Method5287(byteBuffer);
        }
    }

    private void Method5289(iAw6fzyHsyGtLDOJA3dj3zpMGGHs2rhv iAw6fzyHsyGtLDOJA3dj3zpMGGHs2rhv2) {
        this.Field13942.trace("open using draft: {}", (Object)this.Field13952);
        this.Field13950 = U2LPCHfts7ZgDTS3HlHHmKpDfc5a3yYU.Field15510;
        this.Method5293();
        this.Field13945.Method510(this, iAw6fzyHsyGtLDOJA3dj3zpMGGHs2rhv2);
    }

    @Override
    public boolean Method551() {
        boolean bl;
        if (this.Field13950 == U2LPCHfts7ZgDTS3HlHHmKpDfc5a3yYU.Field15510) {
            bl = (int)-2109540912L ^ 0x8242F5D1;
            return bl;
        }
        bl = (int)609043616L ^ 0x244D44A0;
        return bl;
    }

    @Override
    public boolean Method552() {
        int n;
        if (this.Field13950 == U2LPCHfts7ZgDTS3HlHHmKpDfc5a3yYU.Field15511) {
            n = (int)((long)-1198181134 ^ (long)-1198181133);
            return n != 0;
        }
        n = (int)((long)516037023 ^ (long)516037023);
        return n != 0;
    }

    @Override
    public boolean Method553() {
        return this.Field13949;
    }

    @Override
    public boolean Method554() {
        int n;
        if (this.Field13950 == U2LPCHfts7ZgDTS3HlHHmKpDfc5a3yYU.Field15512) {
            n = (int)-11071847L ^ 0xFF570E98;
            return n != 0;
        }
        n = (int)((long)-137278717 ^ (long)-137278717);
        return n != 0;
    }

    @Override
    public U2LPCHfts7ZgDTS3HlHHmKpDfc5a3yYU Method556() {
        return this.Field13950;
    }

    public void Method5290(SelectionKey selectionKey) {
        this.Field13946 = selectionKey;
    }

    public SelectionKey Method5291() {
        return this.Field13946;
    }

    public String toString() {
        return super.toString();
    }

    @Override
    public InetSocketAddress Method549() {
        return this.Field13945.Method520(this);
    }

    @Override
    public InetSocketAddress Method550() {
        return this.Field13945.Method519(this);
    }

    @Override
    public DkMZhn6HTXSMui7v30mYhxPkVEtejJaC Method555() {
        return this.Field13952;
    }

    @Override
    public void Method539() {
        this.Method538((int)((long)-1905914691 ^ (long)-1905914688) << 3);
    }

    @Override
    public String Method557() {
        return this.Field13959;
    }

    long Method5292() {
        return this.Field13960;
    }

    public void Method5293() {
        this.Field13960 = System.nanoTime();
    }

    public IYRAvQCOnwZV7mgto0ownJdj7n804cPz Method5294() {
        return this.Field13945;
    }

    @Override
    public Object Method559() {
        return this.Field13962;
    }

    @Override
    public boolean Method560() {
        return this.Field13947 instanceof qcN6GMzSxw5IRGtqQaLaxz5Iw1NKZzsc;
    }

    @Override
    public SSLSession Method561() {
        if (this.Method560()) return ((qcN6GMzSxw5IRGtqQaLaxz5Iw1NKZzsc)((Object)this.Field13947)).Method2487().getSession();
        throw new IllegalArgumentException("This websocket uses ws instead of wss. No SSLSession available.");
    }

    @Override
    public dLtfcAfLpVozije9AO0FW8DO22lwsDHm Method562() {
        if (this.Field13952 == null) {
            return null;
        }
        if (this.Field13952 instanceof xWMjGh6LDEAFckei7iMGBzoXopXB3PJx) return ((xWMjGh6LDEAFckei7iMGBzoXopXB3PJx)this.Field13952).Method4424();
        throw new IllegalArgumentException("This draft does not support Sec-WebSocket-Protocol");
    }

    @Override
    public void Method558(Object object) {
        this.Field13962 = object;
    }

    public ByteChannel Method5295() {
        return this.Field13947;
    }

    public void Method5296(ByteChannel byteChannel) {
        this.Field13947 = byteChannel;
    }

    public slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX.leqS0IyKEB621E1SrHdAcHHAUjScjmKi Method5297() {
        return this.Field13948;
    }

    public void Method5298(slwIpTHKCjrDjeTmNdqcVKtZWzEyqYrX.leqS0IyKEB621E1SrHdAcHHAUjScjmKi leqS0IyKEB621E1SrHdAcHHAUjScjmKi2) {
        this.Field13948 = leqS0IyKEB621E1SrHdAcHHAUjScjmKi2;
    }

    static {
        Field13941 = (int)((long)-2113503704 ^ (long)-2113503703) << 14;
        Field13940 = (int)((long)-1725780470 ^ (long)-1725780047);
        Field13939 = (int)((long)-170793860 ^ (long)-170793863) << 4;
        Field13963 = !rWOxkXahfy879ZWg1QDRw2hroxYTBucF.class.desiredAssertionStatus() ? (int)((long)-2130885508 ^ (long)-2130885507) : (int)((long)431207032 ^ (long)431207032);
    }

    private static String Method5299(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1945959562 ^ (long)-1945959562);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-70227072 ^ (long)-70227073);
            int n2 = ((int)606829664L ^ 0x242B7C6F) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1875942926 ^ (long)1875936881) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

