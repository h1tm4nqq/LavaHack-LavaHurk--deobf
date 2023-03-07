/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lavahack.loader.XlHSG3OW4gX2o45A9DNWLPF6GqZiJOrl
 *  lavahack.loader.igCSMUHYGvjvsH9HAWyPsuyOKVVnilJK$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package lavahack.loader;

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
import lavahack.loader.ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy;
import lavahack.loader.BrWsHdiLAwYGSB35z3ypQAx8eRulUOBh;
import lavahack.loader.D2A33i4puy3VG87sLGopuKBa7759W0RD;
import lavahack.loader.MjqPPsIgrrFE8smKJhGdj08A51foRyqE;
import lavahack.loader.NTNHCzPmoJl8G1Q0nyEeA4NVvUvnoqKF;
import lavahack.loader.OvvNFVp1prZcFYv57XGirjG11JCXathw;
import lavahack.loader.QmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR;
import lavahack.loader.XlHSG3OW4gX2o45A9DNWLPF6GqZiJOrl;
import lavahack.loader.bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO5;
import lavahack.loader.cZ4bypSRWV3YzaQMwmpKCiS4RsRbKd08;
import lavahack.loader.eVUYg1GWgiUOrS8NdVHqZkr5dmjNAgoA;
import lavahack.loader.fTSdQpXXUsy7b26dtudQpgyKwlcDU58e;
import lavahack.loader.g2MHw5IDmmZCmUau6MlAGt3iyRVkrrNh;
import lavahack.loader.iDprz50yBrPJ6StAk1hDYgq1aL04tvSb;
import lavahack.loader.igCSMUHYGvjvsH9HAWyPsuyOKVVnilJK;
import lavahack.loader.jNiJm0uQgY2wVhFel4twUsWMig1Nujvc;
import lavahack.loader.l6yKOMt7SVcyIzts9W2dZyllrA36dUBL;
import lavahack.loader.lDgX8dul2aWNBQmCTcuuerubKmsg9XQq;
import lavahack.loader.p1m9hwT5not8BMS2OW9GOk1ndmd1Dtl5;
import lavahack.loader.pkFsFgiZykGBET8wx0XXygS5258qy2Bd;
import lavahack.loader.rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC;
import lavahack.loader.u5CRioThdnglBh9lVJeSNzNoUAZImAg0;
import lavahack.loader.v6PMxpLOwdKzm5lyTOYOSMZqaaZxcM13;
import lavahack.loader.vbUsByat2W2VqvGVC3VWwk5FtcMDE72H;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x
implements ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy {
    public static final int Field13829;
    public static final int Field13830;
    public static final int Field13831;
    private final Logger Field13832 = LogManager.getLogger(uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x.class);
    public final BlockingQueue Field13833;
    public final BlockingQueue Field13834;
    private final jNiJm0uQgY2wVhFel4twUsWMig1Nujvc Field13835;
    private SelectionKey Field13836;
    private ByteChannel Field13837;
    private igCSMUHYGvjvsH9HAWyPsuyOKVVnilJK.leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field13838;
    private boolean Field13839 = (int)-1571581179L ^ 0xA2539305;
    private OvvNFVp1prZcFYv57XGirjG11JCXathw Field13840 = OvvNFVp1prZcFYv57XGirjG11JCXathw.Field11645;
    private List Field13841;
    private v6PMxpLOwdKzm5lyTOYOSMZqaaZxcM13 Field13842 = null;
    private QmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR Field13843;
    private ByteBuffer Field13844 = ByteBuffer.allocate((int)-578492482L ^ 0xDD84E7BE);
    private bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO5 Field13845 = null;
    private String Field13846 = null;
    private Integer Field13847 = null;
    private Boolean Field13848 = null;
    private String Field13849 = null;
    private long Field13850 = System.nanoTime();
    private final Object Field13851 = new Object();
    private Object Field13852;
    static final boolean Field13853;
    private String Field13854 = "TheKisDevs & LavaHack Development owns you";

    public uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x(jNiJm0uQgY2wVhFel4twUsWMig1Nujvc jNiJm0uQgY2wVhFel4twUsWMig1Nujvc2, List list) {
        this(jNiJm0uQgY2wVhFel4twUsWMig1Nujvc2, (v6PMxpLOwdKzm5lyTOYOSMZqaaZxcM13)null);
        this.Field13843 = QmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR.Field10969;
        if (list != null && !list.isEmpty()) {
            this.Field13841 = list;
            return;
        }
        this.Field13841 = new ArrayList();
        this.Field13841.add(new p1m9hwT5not8BMS2OW9GOk1ndmd1Dtl5());
    }

    public uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x(jNiJm0uQgY2wVhFel4twUsWMig1Nujvc jNiJm0uQgY2wVhFel4twUsWMig1Nujvc2, v6PMxpLOwdKzm5lyTOYOSMZqaaZxcM13 v6PMxpLOwdKzm5lyTOYOSMZqaaZxcM132) {
        if (jNiJm0uQgY2wVhFel4twUsWMig1Nujvc2 == null) throw new IllegalArgumentException("parameters must not be null");
        if (v6PMxpLOwdKzm5lyTOYOSMZqaaZxcM132 == null && this.Field13843 == QmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR.Field10969) {
            throw new IllegalArgumentException("parameters must not be null");
        }
        this.Field13833 = new LinkedBlockingQueue();
        this.Field13834 = new LinkedBlockingQueue();
        this.Field13835 = jNiJm0uQgY2wVhFel4twUsWMig1Nujvc2;
        this.Field13843 = QmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR.Field10968;
        if (v6PMxpLOwdKzm5lyTOYOSMZqaaZxcM132 == null) return;
        this.Field13842 = v6PMxpLOwdKzm5lyTOYOSMZqaaZxcM132.Method217();
    }

    public void Method5194(ByteBuffer byteBuffer) {
        if (!Field13853 && !byteBuffer.hasRemaining()) {
            throw new AssertionError();
        }
        this.Field13832.trace("process({}): ({})", (Object)byteBuffer.remaining(), (Object)(byteBuffer.remaining() > (int)((long)-212008475 ^ (long)-212008552) << 3 ? "too big to display" : new String(byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining())));
        if (this.Field13840 != OvvNFVp1prZcFYv57XGirjG11JCXathw.Field11645) {
            if (this.Field13840 != OvvNFVp1prZcFYv57XGirjG11JCXathw.Field11646) return;
            this.Method5196(byteBuffer);
            return;
        }
        if (!this.Method5195(byteBuffer)) return;
        if (this.Method3333()) return;
        if (this.Method3335()) return;
        if (!Field13853 && this.Field13844.hasRemaining() == byteBuffer.hasRemaining() && byteBuffer.hasRemaining()) {
            throw new AssertionError();
        }
        if (byteBuffer.hasRemaining()) {
            this.Method5196(byteBuffer);
            return;
        }
        if (!this.Field13844.hasRemaining()) return;
        this.Method5196(this.Field13844);
    }

    private boolean Method5195(ByteBuffer byteBuffer) {
        u5CRioThdnglBh9lVJeSNzNoUAZImAg0 u5CRioThdnglBh9lVJeSNzNoUAZImAg02;
        bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO5 bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO52;
        v6PMxpLOwdKzm5lyTOYOSMZqaaZxcM13 v6PMxpLOwdKzm5lyTOYOSMZqaaZxcM132;
        Object object;
        ByteBuffer byteBuffer2;
        if (this.Field13844.capacity() == 0) {
            byteBuffer2 = byteBuffer;
        } else {
            if (this.Field13844.remaining() < byteBuffer.remaining()) {
                object = ByteBuffer.allocate(this.Field13844.capacity() + byteBuffer.remaining());
                this.Field13844.flip();
                object.put(this.Field13844);
                this.Field13844 = object;
            }
            this.Field13844.put(byteBuffer);
            this.Field13844.flip();
            byteBuffer2 = this.Field13844;
        }
        byteBuffer2.mark();
        if (this.Field13843 == QmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR.Field10969) {
            if (this.Field13842 != null) {
                u5CRioThdnglBh9lVJeSNzNoUAZImAg0 u5CRioThdnglBh9lVJeSNzNoUAZImAg03 = this.Field13842.Method218(byteBuffer2);
                if (!(u5CRioThdnglBh9lVJeSNzNoUAZImAg03 instanceof bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO5)) {
                    this.Field13832.trace("Closing due to protocol error: wrong http function");
                    this.Method5204((int)((long)-736834472 ^ (long)-736834131) << 1, "wrong http function", (boolean)((long)1570015127 ^ (long)1570015127));
                    return ((int)-1995750630L ^ 0x890B431A) != 0;
                }
                bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO5 bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO53 = (bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO5)u5CRioThdnglBh9lVJeSNzNoUAZImAg03;
                object = this.Field13842.Method201(bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO53);
                if (object == l6yKOMt7SVcyIzts9W2dZyllrA36dUBL.Field15233) {
                    this.Method5211(bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO53);
                    return (int)((long)-132450917 ^ (long)-132450918) != 0;
                }
                this.Field13832.trace("Closing due to protocol error: the handshake did finally not match");
                this.Method3318(((int)587501333L ^ 0x23048EE0) << 1, "the handshake did finally not match");
                return (int)((long)-1963554912 ^ (long)-1963554912) != 0;
            }
        } else {
            if (this.Field13843 != QmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR.Field10968) return (int)((long)-1218294031 ^ (long)-1218294031) != 0;
            this.Field13842.Method221(this.Field13843);
            u5CRioThdnglBh9lVJeSNzNoUAZImAg0 u5CRioThdnglBh9lVJeSNzNoUAZImAg04 = this.Field13842.Method218(byteBuffer2);
            if (!(u5CRioThdnglBh9lVJeSNzNoUAZImAg04 instanceof BrWsHdiLAwYGSB35z3ypQAx8eRulUOBh)) {
                this.Field13832.trace("Closing due to protocol error: wrong http function");
                this.Method5204((int)((long)176235443 ^ (long)176235078) << 1, "wrong http function", (boolean)((long)-215842538 ^ (long)-215842538));
                return (int)((long)1510874291 ^ (long)1510874291) != 0;
            }
            BrWsHdiLAwYGSB35z3ypQAx8eRulUOBh brWsHdiLAwYGSB35z3ypQAx8eRulUOBh = (BrWsHdiLAwYGSB35z3ypQAx8eRulUOBh)u5CRioThdnglBh9lVJeSNzNoUAZImAg04;
            object = this.Field13842.Method200(this.Field13845, brWsHdiLAwYGSB35z3ypQAx8eRulUOBh);
            if (object == l6yKOMt7SVcyIzts9W2dZyllrA36dUBL.Field15233) {
                this.Field13835.Method2660(this, this.Field13845, brWsHdiLAwYGSB35z3ypQAx8eRulUOBh);
                this.Method5211(brWsHdiLAwYGSB35z3ypQAx8eRulUOBh);
                return (int)((long)1999574227 ^ (long)1999574226) != 0;
            }
            this.Field13832.trace("Closing due to protocol error: draft {} refuses handshake", (Object)this.Field13842);
            this.Method3318((int)((long)-238772610 ^ (long)-238772341) << 1, "draft " + this.Field13842 + " refuses handshake");
            return (int)((long)-1218294031 ^ (long)-1218294031) != 0;
        }
        Iterator iterator = this.Field13841.iterator();
        do {
            if (!iterator.hasNext()) {
                if (this.Field13842 != null) return ((int)-692813696L ^ 0xD6B48080) != 0;
                this.Field13832.trace("Closing due to protocol error: no draft matches");
                this.Method5197(new rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC(((int)931275120L ^ 0x37822085) << 1, "no draft matches"));
                return ((int)-692813696L ^ 0xD6B48080) != 0;
            }
            v6PMxpLOwdKzm5lyTOYOSMZqaaZxcM132 = (v6PMxpLOwdKzm5lyTOYOSMZqaaZxcM13)iterator.next();
            v6PMxpLOwdKzm5lyTOYOSMZqaaZxcM132 = v6PMxpLOwdKzm5lyTOYOSMZqaaZxcM132.Method217();
            v6PMxpLOwdKzm5lyTOYOSMZqaaZxcM132.Method221(this.Field13843);
            byteBuffer2.reset();
            u5CRioThdnglBh9lVJeSNzNoUAZImAg02 = v6PMxpLOwdKzm5lyTOYOSMZqaaZxcM132.Method218(byteBuffer2);
            if (u5CRioThdnglBh9lVJeSNzNoUAZImAg02 instanceof bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO5) continue;
            this.Field13832.trace("Closing due to wrong handshake");
            this.Method5197(new rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC((int)((long)-1387930759 ^ (long)-1387930996) << 1, "wrong http function"));
            return (int)((long)151978670 ^ (long)151978670) != 0;
        } while ((object = v6PMxpLOwdKzm5lyTOYOSMZqaaZxcM132.Method201(bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO52 = (bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO5)u5CRioThdnglBh9lVJeSNzNoUAZImAg02)) != l6yKOMt7SVcyIzts9W2dZyllrA36dUBL.Field15233);
        this.Field13849 = bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO52.Method186();
        g2MHw5IDmmZCmUau6MlAGt3iyRVkrrNh g2MHw5IDmmZCmUau6MlAGt3iyRVkrrNh2 = this.Field13835.Method2659(this, v6PMxpLOwdKzm5lyTOYOSMZqaaZxcM132, bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO52);
        this.Method5210(v6PMxpLOwdKzm5lyTOYOSMZqaaZxcM132.Method210(v6PMxpLOwdKzm5lyTOYOSMZqaaZxcM132.Method214(bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO52, g2MHw5IDmmZCmUau6MlAGt3iyRVkrrNh2)));
        this.Field13842 = v6PMxpLOwdKzm5lyTOYOSMZqaaZxcM132;
        this.Method5211(bfMVfBX3KhU6JtXvUuYyaLTiwBiVBTO52);
        return (int)((long)537910439 ^ (long)537910438) != 0;
    }

    private void Method5196(ByteBuffer byteBuffer) {
        List list = this.Field13842.Method215(byteBuffer);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            vbUsByat2W2VqvGVC3VWwk5FtcMDE72H vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2 = (vbUsByat2W2VqvGVC3VWwk5FtcMDE72H)iterator.next();
            this.Field13832.trace("matched frame: {}", (Object)vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2);
            this.Field13842.Method206(this, vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2);
        }
    }

    private void Method5197(rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC2) {
        this.Method5209(this.Method5199((int)((long)108603918 ^ (long)108604011) << 2));
        this.Method5204(rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC2.Method483(), rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC2.getMessage(), ((int)-799369240L ^ 0xD05A97E8) != 0);
    }

    private void Method5198(RuntimeException runtimeException) {
        this.Method5209(this.Method5199((int)((long)1898293585 ^ (long)1898293548) << 2));
        this.Method5204((int)((long)962991902 ^ (long)-962991903), runtimeException.getMessage(), ((int)-1219035836L ^ 0xB756FD44) != 0);
    }

    private ByteBuffer Method5199(int n) {
        String string;
        switch (n) {
            case 404: {
                string = "404 WebSocket Upgrade Failure";
                return ByteBuffer.wrap(eVUYg1GWgiUOrS8NdVHqZkr5dmjNAgoA.Method4526("HTTP/1.1 " + string + "\r\nContent-Type: text/html\r\nServer: TooTallNate Java-WebSocket\r\nContent-Length: " + ((((int)1063364109L ^ 0x3F61A60E) << 4) + string.length()) + "\r\n\r\n<html><head></head><body><h1>" + string + "</h1></body></html>"));
            }
        }
        string = "500 Internal Server Error";
        return ByteBuffer.wrap(eVUYg1GWgiUOrS8NdVHqZkr5dmjNAgoA.Method4526("HTTP/1.1 " + string + "\r\nContent-Type: text/html\r\nServer: TooTallNate Java-WebSocket\r\nContent-Length: " + ((((int)1063364109L ^ 0x3F61A60E) << 4) + string.length()) + "\r\n\r\n<html><head></head><body><h1>" + string + "</h1></body></html>"));
    }

    public synchronized void Method5200(int n, String string, boolean bl) {
        if (this.Field13840 == OvvNFVp1prZcFYv57XGirjG11JCXathw.Field11647) return;
        if (this.Field13840 == OvvNFVp1prZcFYv57XGirjG11JCXathw.Field11648) return;
        if (this.Field13840 == OvvNFVp1prZcFYv57XGirjG11JCXathw.Field11646) {
            if (n == (int)((long)201132171 ^ (long)201132412) << 1) {
                if (!Field13853 && bl) {
                    throw new AssertionError();
                }
                this.Field13840 = OvvNFVp1prZcFYv57XGirjG11JCXathw.Field11647;
                this.Method5204(n, string, (boolean)((long)457811349 ^ (long)457811349));
                return;
            }
            if (this.Field13842.Method216() != pkFsFgiZykGBET8wx0XXygS5258qy2Bd.Field13228) {
                if (!bl) {
                    this.Field13835.Method2667(this, n, string);
                }
                if (this.Method3332()) {
                    MjqPPsIgrrFE8smKJhGdj08A51foRyqE mjqPPsIgrrFE8smKJhGdj08A51foRyqE = new MjqPPsIgrrFE8smKJhGdj08A51foRyqE();
                    mjqPPsIgrrFE8smKJhGdj08A51foRyqE.Method94(string);
                    mjqPPsIgrrFE8smKJhGdj08A51foRyqE.Method93(n);
                    mjqPPsIgrrFE8smKJhGdj08A51foRyqE.Method84();
                    this.Method3325(mjqPPsIgrrFE8smKJhGdj08A51foRyqE);
                }
            }
            this.Method5204(n, string, bl);
        } else if (n == (int)((long)-1968300156 ^ (long)1968300153)) {
            if (!Field13853 && !bl) {
                throw new AssertionError();
            }
            this.Method5204((int)1625960485L ^ 0x9F15CFD8, string, (boolean)((long)256371124 ^ (long)256371125));
        } else if (n == ((int)-339427305L ^ 0xEBC4C1E2) << 1) {
            this.Method5204(n, string, bl);
        } else {
            this.Method5204((int)((long)-1987701104 ^ (long)1987701103), string, ((int)689486900L ^ 0x2918BC34) != 0);
        }
        this.Field13840 = OvvNFVp1prZcFYv57XGirjG11JCXathw.Field11647;
        this.Field13844 = null;
    }

    @Override
    public void Method3318(int n, String string) {
        this.Method5200(n, string, ((int)1620044003L ^ 0x608FE8E3) != 0);
    }

    public synchronized void Method5201(int n, String string, boolean bl) {
        if (this.Field13840 == OvvNFVp1prZcFYv57XGirjG11JCXathw.Field11648) {
            return;
        }
        if (this.Field13840 == OvvNFVp1prZcFYv57XGirjG11JCXathw.Field11646 && n == (int)((long)-1242249360 ^ (long)-1242249593) << 1) {
            this.Field13840 = OvvNFVp1prZcFYv57XGirjG11JCXathw.Field11647;
        }
        if (this.Field13836 != null) {
            this.Field13836.cancel();
        }
        if (this.Field13837 != null) {
            this.Field13837.close();
        }
        this.Field13835.Method2665(this, n, string, bl);
        if (this.Field13842 != null) {
            this.Field13842.Method208();
        }
        this.Field13845 = null;
        this.Field13840 = OvvNFVp1prZcFYv57XGirjG11JCXathw.Field11648;
    }

    protected void Method5202(int n, boolean bl) {
        this.Method5201(n, "", bl);
    }

    public void Method5203() {
        if (this.Field13848 == null) {
            throw new IllegalStateException("this method must be used in conjunction with flushAndClose");
        }
        this.Method5201(this.Field13847, this.Field13846, this.Field13848);
    }

    @Override
    public void Method3321(int n, String string) {
        this.Method5201(n, string, ((int)1979432790L ^ 0x75FBBF56) != 0);
    }

    public synchronized void Method5204(int n, String string, boolean bl) {
        if (this.Field13839) {
            return;
        }
        this.Field13847 = n;
        this.Field13846 = string;
        this.Field13848 = bl;
        this.Field13839 = (int)1248388171L ^ 0x4A68E44A;
        this.Field13835.Method2672(this);
        this.Field13835.Method2666(this, n, string, bl);
        if (this.Field13842 != null) {
            this.Field13842.Method208();
        }
        this.Field13845 = null;
    }

    public void Method5205() {
        if (this.Field13840 == OvvNFVp1prZcFYv57XGirjG11JCXathw.Field11645) {
            this.Method5202((int)((long)-745132920 ^ (long)745132919), ((int)-2069529706L ^ 0x84A57B97) != 0);
            return;
        }
        if (this.Field13839) {
            this.Method5201(this.Field13847, this.Field13846, this.Field13848);
            return;
        }
        if (this.Field13842.Method216() == pkFsFgiZykGBET8wx0XXygS5258qy2Bd.Field13228) {
            this.Method5202((int)((long)615695325 ^ (long)615695264) << 3, ((int)-545694982L ^ 0xDF795AFB) != 0);
            return;
        }
        if (this.Field13842.Method216() != pkFsFgiZykGBET8wx0XXygS5258qy2Bd.Field13229) {
            this.Method5202((int)((long)-1769235983 ^ (long)-1769236474) << 1, (boolean)((long)-714140787 ^ (long)-714140788));
            return;
        }
        if (this.Field13843 == QmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR.Field10969) {
            this.Method5202((int)((long)-604712989 ^ (long)-604713452) << 1, ((int)300454140L ^ 0x11E890FD) != 0);
            return;
        }
        this.Method5202(((int)1682006779L ^ 0x64416286) << 3, (boolean)((long)-1830416506 ^ (long)-1830416505));
    }

    @Override
    public void Method3319(int n) {
        this.Method5200(n, "", ((int)1738593276L ^ 0x67A0D3FC) != 0);
    }

    public void Method5206(rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC2) {
        this.Method5200(rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC2.Method483(), rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC2.getMessage(), (boolean)((long)-456083002 ^ (long)-456083002));
    }

    @Override
    public void Method3322(String string) {
        if (string == null) {
            throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
        }
        this.Method5207(this.Field13842.Method205(string, (this.Field13843 == QmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR.Field10968 ? (int)((long)-324726061 ^ (long)-324726062) : (int)1060521333L ^ 0x3F364575) != 0));
    }

    @Override
    public void Method3323(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
        }
        this.Method5207(this.Field13842.Method204(byteBuffer, (this.Field13843 == QmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR.Field10968 ? (int)978220086L ^ 0x3A4E7437 : (int)((long)1960324619 ^ (long)1960324619)) != 0));
    }

    @Override
    public void Method3324(byte[] byArray) {
        this.Method3323(ByteBuffer.wrap(byArray));
    }

    private void Method5207(Collection collection) {
        if (!this.Method3332()) {
            throw new NTNHCzPmoJl8G1Q0nyEeA4NVvUvnoqKF();
        }
        if (collection == null) {
            throw new IllegalArgumentException();
        }
        ArrayList<ByteBuffer> arrayList = new ArrayList<ByteBuffer>();
        Iterator iterator = collection.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                this.Method5210(arrayList);
                return;
            }
            vbUsByat2W2VqvGVC3VWwk5FtcMDE72H vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2 = (vbUsByat2W2VqvGVC3VWwk5FtcMDE72H)iterator.next();
            this.Field13832.trace("send frame: {}", (Object)vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2);
            arrayList.add(this.Field13842.Method203(vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2));
        }
    }

    @Override
    public void Method3328(D2A33i4puy3VG87sLGopuKBa7759W0RD d2A33i4puy3VG87sLGopuKBa7759W0RD, ByteBuffer byteBuffer, boolean bl) {
        this.Method5207(this.Field13842.Method207(d2A33i4puy3VG87sLGopuKBa7759W0RD, byteBuffer, bl));
    }

    @Override
    public void Method3326(Collection collection) {
        this.Method5207(collection);
    }

    @Override
    public void Method3325(vbUsByat2W2VqvGVC3VWwk5FtcMDE72H vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2) {
        this.Method5207(Collections.singletonList(vbUsByat2W2VqvGVC3VWwk5FtcMDE72H2));
    }

    @Override
    public void Method3327() throws NullPointerException {
        cZ4bypSRWV3YzaQMwmpKCiS4RsRbKd08 cZ4bypSRWV3YzaQMwmpKCiS4RsRbKd082 = this.Field13835.Method2670(this);
        if (cZ4bypSRWV3YzaQMwmpKCiS4RsRbKd082 == null) {
            throw new NullPointerException("onPreparePing(WebSocket) returned null. PingFrame to sent can't be null.");
        }
        this.Method3325(cZ4bypSRWV3YzaQMwmpKCiS4RsRbKd082);
    }

    @Override
    public boolean Method3329() {
        int n;
        if (!this.Field13833.isEmpty()) {
            n = (int)((long)911819520 ^ (long)911819521);
            return n != 0;
        }
        n = (int)((long)-1568621126 ^ (long)-1568621126);
        return n != 0;
    }

    public void Method5208(lDgX8dul2aWNBQmCTcuuerubKmsg9XQq lDgX8dul2aWNBQmCTcuuerubKmsg9XQq2) throws fTSdQpXXUsy7b26dtudQpgyKwlcDU58e {
        this.Field13845 = this.Field13842.Method213(lDgX8dul2aWNBQmCTcuuerubKmsg9XQq2);
        this.Field13849 = lDgX8dul2aWNBQmCTcuuerubKmsg9XQq2.Method186();
        if (!Field13853 && this.Field13849 == null) {
            throw new AssertionError();
        }
        this.Field13835.Method2661(this, this.Field13845);
        this.Method5210(this.Field13842.Method210(this.Field13845));
    }

    private void Method5209(ByteBuffer byteBuffer) {
        this.Field13832.trace("write({}): {}", (Object)byteBuffer.remaining(), (Object)(byteBuffer.remaining() > (int)((long)-561905899 ^ (long)-561905816) << 3 ? "too big to display" : new String(byteBuffer.array())));
        this.Field13833.add(byteBuffer);
        this.Field13835.Method2672(this);
    }

    private void Method5210(List list) {
        Object object = this.Field13851;
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer)iterator.next();
            this.Method5209(byteBuffer);
        }
    }

    private void Method5211(u5CRioThdnglBh9lVJeSNzNoUAZImAg0 u5CRioThdnglBh9lVJeSNzNoUAZImAg02) {
        this.Field13832.trace("open using draft: {}", (Object)this.Field13842);
        this.Field13840 = OvvNFVp1prZcFYv57XGirjG11JCXathw.Field11646;
        this.Method5215();
        this.Field13835.Method2664(this, u5CRioThdnglBh9lVJeSNzNoUAZImAg02);
    }

    @Override
    public boolean Method3332() {
        int n;
        if (this.Field13840 == OvvNFVp1prZcFYv57XGirjG11JCXathw.Field11646) {
            n = (int)((long)-815797041 ^ (long)-815797042);
            return n != 0;
        }
        n = (int)125942442L ^ 0x781BAAA;
        return n != 0;
    }

    @Override
    public boolean Method3333() {
        int n;
        if (this.Field13840 == OvvNFVp1prZcFYv57XGirjG11JCXathw.Field11647) {
            n = (int)1137553839L ^ 0x43CDB1AE;
            return n != 0;
        }
        n = (int)((long)-653598897 ^ (long)-653598897);
        return n != 0;
    }

    @Override
    public boolean Method3334() {
        return this.Field13839;
    }

    @Override
    public boolean Method3335() {
        int n;
        if (this.Field13840 == OvvNFVp1prZcFYv57XGirjG11JCXathw.Field11648) {
            n = (int)((long)2727525 ^ (long)2727524);
            return n != 0;
        }
        n = (int)((long)1673871971 ^ (long)1673871971);
        return n != 0;
    }

    @Override
    public OvvNFVp1prZcFYv57XGirjG11JCXathw Method3337() {
        return this.Field13840;
    }

    public void Method5212(SelectionKey selectionKey) {
        this.Field13836 = selectionKey;
    }

    public SelectionKey Method5213() {
        return this.Field13836;
    }

    public String toString() {
        return super.toString();
    }

    @Override
    public InetSocketAddress Method3330() {
        return this.Field13835.Method2674(this);
    }

    @Override
    public InetSocketAddress Method3331() {
        return this.Field13835.Method2673(this);
    }

    @Override
    public v6PMxpLOwdKzm5lyTOYOSMZqaaZxcM13 Method3336() {
        return this.Field13842;
    }

    @Override
    public void Method3320() {
        this.Method3319(((int)-80954619L ^ 0xFB2CBB78) << 3);
    }

    @Override
    public String Method3338() {
        return this.Field13849;
    }

    long Method5214() {
        return this.Field13850;
    }

    public void Method5215() {
        this.Field13850 = System.nanoTime();
    }

    public jNiJm0uQgY2wVhFel4twUsWMig1Nujvc Method5216() {
        return this.Field13835;
    }

    @Override
    public Object Method3340() {
        return this.Field13852;
    }

    @Override
    public boolean Method3341() {
        return this.Field13837 instanceof XlHSG3OW4gX2o45A9DNWLPF6GqZiJOrl;
    }

    @Override
    public SSLSession Method3342() {
        if (this.Method3341()) return ((XlHSG3OW4gX2o45A9DNWLPF6GqZiJOrl)this.Field13837).ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS().getSession();
        throw new IllegalArgumentException("This websocket uses ws instead of wss. No SSLSession available.");
    }

    @Override
    public iDprz50yBrPJ6StAk1hDYgq1aL04tvSb Method3343() {
        if (this.Field13842 == null) {
            return null;
        }
        if (this.Field13842 instanceof p1m9hwT5not8BMS2OW9GOk1ndmd1Dtl5) return ((p1m9hwT5not8BMS2OW9GOk1ndmd1Dtl5)this.Field13842).Method3104();
        throw new IllegalArgumentException("This draft does not support Sec-WebSocket-Protocol");
    }

    @Override
    public void Method3339(Object object) {
        this.Field13852 = object;
    }

    public ByteChannel Method5217() {
        return this.Field13837;
    }

    public void Method5218(ByteChannel byteChannel) {
        this.Field13837 = byteChannel;
    }

    public igCSMUHYGvjvsH9HAWyPsuyOKVVnilJK.leqS0IyKEB621E1SrHdAcHHAUjScjmKi Method5219() {
        return this.Field13838;
    }

    public void Method5220(igCSMUHYGvjvsH9HAWyPsuyOKVVnilJK.leqS0IyKEB621E1SrHdAcHHAUjScjmKi leqS0IyKEB621E1SrHdAcHHAUjScjmKi2) {
        this.Field13838 = leqS0IyKEB621E1SrHdAcHHAUjScjmKi2;
    }

    static {
        Field13831 = (int)((long)-1860677915 ^ (long)-1860677916) << 14;
        Field13830 = (int)-1903053460L ^ 0x8E91B4D7;
        Field13829 = ((int)2025426888L ^ 0x78B98FCD) << 4;
        Field13853 = !uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x.class.desiredAssertionStatus() ? (int)((long)-169845897 ^ (long)-169845898) : (int)((long)662016732 ^ (long)662016732);
    }

    private static String Method5221(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)894279372L ^ 0x354D9ECC;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-726277205 ^ (long)-726277292);
            int n2 = (int)((long)110773057 ^ (long)110773206);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-830776596 ^ (long)-830779889) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

