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
import lavahack.loader.Class1105;
import lavahack.loader.Class1159;
import lavahack.loader.Class1181;
import lavahack.loader.Class1236;
import lavahack.loader.Class1333;
import lavahack.loader.Class1550;
import lavahack.loader.Class1683;
import lavahack.loader.Class1691;
import lavahack.loader.Class1753;
import lavahack.loader.Class1926;
import lavahack.loader.Class1966;
import lavahack.loader.Class241;
import lavahack.loader.Class26;
import lavahack.loader.Class359;
import lavahack.loader.Class45;
import lavahack.loader.Class7;
import lavahack.loader.Class700;
import lavahack.loader.Class749;
import lavahack.loader.Class866;
import lavahack.loader.Class902;
import lavahack.loader.Class919;
import lavahack.loader.Class977;
import lavahack.loader.XlHSG3OW4gX2o45A9DNWLPF6GqZiJOrl;
import lavahack.loader.igCSMUHYGvjvsH9HAWyPsuyOKVVnilJK;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class1282
implements Class1966 {
    public static final int Field13829;
    public static final int Field13830;
    public static final int Field13831;
    private final Logger Field13832 = LogManager.getLogger(Class1282.class);
    public final BlockingQueue Field13833;
    public final BlockingQueue Field13834;
    private final Class977 Field13835;
    private SelectionKey Field13836;
    private ByteChannel Field13837;
    private igCSMUHYGvjvsH9HAWyPsuyOKVVnilJK.leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field13838;
    private boolean Field13839 = false;
    private Class866 Field13840 = Class866.Field11645;
    private List Field13841;
    private Class26 Field13842 = null;
    private Class700 Field13843;
    private ByteBuffer Field13844 = ByteBuffer.allocate(0);
    private Class359 Field13845 = null;
    private String Field13846 = null;
    private Integer Field13847 = null;
    private Boolean Field13848 = null;
    private String Field13849 = null;
    private long Field13850 = System.nanoTime();
    private final Object Field13851 = new Object();
    private Object Field13852;
    static final boolean Field13853;
    private String Field13854 = "TheKisDevs & LavaHack Development owns you";

    public Class1282(Class977 class977, List list) {
        this(class977, (Class26)null);
        this.Field13843 = Class700.Field10969;
        if (list != null && !list.isEmpty()) {
            this.Field13841 = list;
            return;
        }
        this.Field13841 = new ArrayList();
        this.Field13841.add(new Class749());
    }

    public Class1282(Class977 class977, Class26 class26) {
        if (class977 == null) throw new IllegalArgumentException("parameters must not be null");
        if (class26 == null && this.Field13843 == Class700.Field10969) {
            throw new IllegalArgumentException("parameters must not be null");
        }
        this.Field13833 = new LinkedBlockingQueue();
        this.Field13834 = new LinkedBlockingQueue();
        this.Field13835 = class977;
        this.Field13843 = Class700.Field10968;
        if (class26 == null) return;
        this.Field13842 = class26.Method217();
    }

    public void Method5194(ByteBuffer byteBuffer) {
        if (!Field13853 && !byteBuffer.hasRemaining()) {
            throw new AssertionError();
        }
        this.Field13832.trace("process({}): ({})", (Object)byteBuffer.remaining(), (Object)(byteBuffer.remaining() > 1000 ? "too big to display" : new String(byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining())));
        if (this.Field13840 != Class866.Field11645) {
            if (this.Field13840 != Class866.Field11646) return;
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
        Class1181 class1181;
        Class359 class359;
        Class26 class26;
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
        if (this.Field13843 == Class700.Field10969) {
            if (this.Field13842 != null) {
                Class1181 class11812 = this.Field13842.Method218(byteBuffer2);
                if (!(class11812 instanceof Class359)) {
                    this.Field13832.trace("Closing due to protocol error: wrong http function");
                    this.Method5204(1002, "wrong http function", false);
                    return false;
                }
                Class359 class3592 = (Class359)class11812;
                object = this.Field13842.Method201(class3592);
                if (object == Class1550.Field15233) {
                    this.Method5211(class3592);
                    return true;
                }
                this.Field13832.trace("Closing due to protocol error: the handshake did finally not match");
                this.Method3318(1002, "the handshake did finally not match");
                return false;
            }
        } else {
            if (this.Field13843 != Class700.Field10968) return false;
            this.Field13842.Method221(this.Field13843);
            Class1181 class11813 = this.Field13842.Method218(byteBuffer2);
            if (!(class11813 instanceof Class1236)) {
                this.Field13832.trace("Closing due to protocol error: wrong http function");
                this.Method5204(1002, "wrong http function", false);
                return false;
            }
            Class1236 class1236 = (Class1236)class11813;
            object = this.Field13842.Method200(this.Field13845, class1236);
            if (object == Class1550.Field15233) {
                this.Field13835.Method2660(this, this.Field13845, class1236);
                this.Method5211(class1236);
                return true;
            }
            this.Field13832.trace("Closing due to protocol error: draft {} refuses handshake", (Object)this.Field13842);
            this.Method3318(1002, "draft " + this.Field13842 + " refuses handshake");
            return false;
        }
        Iterator iterator = this.Field13841.iterator();
        do {
            if (!iterator.hasNext()) {
                if (this.Field13842 != null) return false;
                this.Field13832.trace("Closing due to protocol error: no draft matches");
                this.Method5197(new Class902(1002, "no draft matches"));
                return false;
            }
            class26 = (Class26)iterator.next();
            class26 = class26.Method217();
            class26.Method221(this.Field13843);
            byteBuffer2.reset();
            class1181 = class26.Method218(byteBuffer2);
            if (class1181 instanceof Class359) continue;
            this.Field13832.trace("Closing due to wrong handshake");
            this.Method5197(new Class902(1002, "wrong http function"));
            return false;
        } while ((object = class26.Method201(class359 = (Class359)class1181)) != Class1550.Field15233);
        this.Field13849 = class359.Method186();
        Class1333 class1333 = this.Field13835.Method2659(this, class26, class359);
        this.Method5210(class26.Method210(class26.Method214(class359, class1333)));
        this.Field13842 = class26;
        this.Method5211(class359);
        return true;
    }

    private void Method5196(ByteBuffer byteBuffer) {
        List list = this.Field13842.Method215(byteBuffer);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Class1926 class1926 = (Class1926)iterator.next();
            this.Field13832.trace("matched frame: {}", (Object)class1926);
            this.Field13842.Method206(this, class1926);
        }
    }

    private void Method5197(Class902 class902) {
        this.Method5209(this.Method5199(404));
        this.Method5204(class902.Method483(), class902.getMessage(), false);
    }

    private void Method5198(RuntimeException runtimeException) {
        this.Method5209(this.Method5199(500));
        this.Method5204(-1, runtimeException.getMessage(), false);
    }

    private ByteBuffer Method5199(int n) {
        String string;
        switch (n) {
            case 404: {
                string = "404 WebSocket Upgrade Failure";
                return ByteBuffer.wrap(Class1105.Method4526("HTTP/1.1 " + string + "\r\nContent-Type: text/html\r\nServer: TooTallNate Java-WebSocket\r\nContent-Length: " + (48 + string.length()) + "\r\n\r\n<html><head></head><body><h1>" + string + "</h1></body></html>"));
            }
        }
        string = "500 Internal Server Error";
        return ByteBuffer.wrap(Class1105.Method4526("HTTP/1.1 " + string + "\r\nContent-Type: text/html\r\nServer: TooTallNate Java-WebSocket\r\nContent-Length: " + (48 + string.length()) + "\r\n\r\n<html><head></head><body><h1>" + string + "</h1></body></html>"));
    }

    public synchronized void Method5200(int n, String string, boolean bl) {
        if (this.Field13840 == Class866.Field11647) return;
        if (this.Field13840 == Class866.Field11648) return;
        if (this.Field13840 == Class866.Field11646) {
            if (n == 1006) {
                if (!Field13853 && bl) {
                    throw new AssertionError();
                }
                this.Field13840 = Class866.Field11647;
                this.Method5204(n, string, false);
                return;
            }
            if (this.Field13842.Method216() != Class1159.Field13228) {
                if (!bl) {
                    this.Field13835.Method2667(this, n, string);
                }
                if (this.Method3332()) {
                    Class7 class7 = new Class7();
                    class7.Method94(string);
                    class7.Method93(n);
                    class7.Method84();
                    this.Method3325(class7);
                }
            }
            this.Method5204(n, string, bl);
        } else if (n == -3) {
            if (!Field13853 && !bl) {
                throw new AssertionError();
            }
            this.Method5204(-3, string, true);
        } else if (n == 1002) {
            this.Method5204(n, string, bl);
        } else {
            this.Method5204(-1, string, false);
        }
        this.Field13840 = Class866.Field11647;
        this.Field13844 = null;
    }

    @Override
    public void Method3318(int n, String string) {
        this.Method5200(n, string, false);
    }

    public synchronized void Method5201(int n, String string, boolean bl) {
        if (this.Field13840 == Class866.Field11648) {
            return;
        }
        if (this.Field13840 == Class866.Field11646 && n == 1006) {
            this.Field13840 = Class866.Field11647;
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
        this.Field13840 = Class866.Field11648;
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
        this.Method5201(n, string, false);
    }

    public synchronized void Method5204(int n, String string, boolean bl) {
        if (this.Field13839) {
            return;
        }
        this.Field13847 = n;
        this.Field13846 = string;
        this.Field13848 = bl;
        this.Field13839 = true;
        this.Field13835.Method2672(this);
        this.Field13835.Method2666(this, n, string, bl);
        if (this.Field13842 != null) {
            this.Field13842.Method208();
        }
        this.Field13845 = null;
    }

    public void Method5205() {
        if (this.Field13840 == Class866.Field11645) {
            this.Method5202(-1, true);
            return;
        }
        if (this.Field13839) {
            this.Method5201(this.Field13847, this.Field13846, this.Field13848);
            return;
        }
        if (this.Field13842.Method216() == Class1159.Field13228) {
            this.Method5202(1000, true);
            return;
        }
        if (this.Field13842.Method216() != Class1159.Field13229) {
            this.Method5202(1006, true);
            return;
        }
        if (this.Field13843 == Class700.Field10969) {
            this.Method5202(1006, true);
            return;
        }
        this.Method5202(1000, true);
    }

    @Override
    public void Method3319(int n) {
        this.Method5200(n, "", false);
    }

    public void Method5206(Class902 class902) {
        this.Method5200(class902.Method483(), class902.getMessage(), false);
    }

    @Override
    public void Method3322(String string) {
        if (string == null) {
            throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
        }
        this.Method5207(this.Field13842.Method205(string, this.Field13843 == Class700.Field10968));
    }

    @Override
    public void Method3323(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
        }
        this.Method5207(this.Field13842.Method204(byteBuffer, this.Field13843 == Class700.Field10968));
    }

    @Override
    public void Method3324(byte[] byArray) {
        this.Method3323(ByteBuffer.wrap(byArray));
    }

    private void Method5207(Collection collection) {
        if (!this.Method3332()) {
            throw new Class1691();
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
            Class1926 class1926 = (Class1926)iterator.next();
            this.Field13832.trace("send frame: {}", (Object)class1926);
            arrayList.add(this.Field13842.Method203(class1926));
        }
    }

    @Override
    public void Method3328(Class1753 class1753, ByteBuffer byteBuffer, boolean bl) {
        this.Method5207(this.Field13842.Method207(class1753, byteBuffer, bl));
    }

    @Override
    public void Method3326(Collection collection) {
        this.Method5207(collection);
    }

    @Override
    public void Method3325(Class1926 class1926) {
        this.Method5207(Collections.singletonList(class1926));
    }

    @Override
    public void Method3327() throws NullPointerException {
        Class1683 class1683 = this.Field13835.Method2670(this);
        if (class1683 == null) {
            throw new NullPointerException("onPreparePing(WebSocket) returned null. PingFrame to sent can't be null.");
        }
        this.Method3325(class1683);
    }

    @Override
    public boolean Method3329() {
        if (this.Field13833.isEmpty()) return false;
        return true;
    }

    public void Method5208(Class45 class45) throws Class241 {
        this.Field13845 = this.Field13842.Method213(class45);
        this.Field13849 = class45.Method186();
        if (!Field13853 && this.Field13849 == null) {
            throw new AssertionError();
        }
        this.Field13835.Method2661(this, this.Field13845);
        this.Method5210(this.Field13842.Method210(this.Field13845));
    }

    private void Method5209(ByteBuffer byteBuffer) {
        this.Field13832.trace("write({}): {}", (Object)byteBuffer.remaining(), (Object)(byteBuffer.remaining() > 1000 ? "too big to display" : new String(byteBuffer.array())));
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

    private void Method5211(Class1181 class1181) {
        this.Field13832.trace("open using draft: {}", (Object)this.Field13842);
        this.Field13840 = Class866.Field11646;
        this.Method5215();
        this.Field13835.Method2664(this, class1181);
    }

    @Override
    public boolean Method3332() {
        if (this.Field13840 != Class866.Field11646) return false;
        return true;
    }

    @Override
    public boolean Method3333() {
        if (this.Field13840 != Class866.Field11647) return false;
        return true;
    }

    @Override
    public boolean Method3334() {
        return this.Field13839;
    }

    @Override
    public boolean Method3335() {
        if (this.Field13840 != Class866.Field11648) return false;
        return true;
    }

    @Override
    public Class866 Method3337() {
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
    public Class26 Method3336() {
        return this.Field13842;
    }

    @Override
    public void Method3320() {
        this.Method3319(1000);
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

    public Class977 Method5216() {
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
    public Class919 Method3343() {
        if (this.Field13842 == null) {
            return null;
        }
        if (this.Field13842 instanceof Class749) return ((Class749)this.Field13842).Method3104();
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
        Field13831 = 16384;
        Field13830 = 443;
        Field13829 = 80;
        Field13853 = !Class1282.class.desiredAssertionStatus();
    }

    private static String Method5221(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 151;
            cArray2[n] = (char)(cArray[n] ^ (0x538C ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

