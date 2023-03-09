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
import lavahack.client.Class1088;
import lavahack.client.Class1187;
import lavahack.client.Class1234;
import lavahack.client.Class1260;
import lavahack.client.Class1418;
import lavahack.client.Class1597;
import lavahack.client.Class1609;
import lavahack.client.Class1692;
import lavahack.client.Class1715;
import lavahack.client.Class1728;
import lavahack.client.Class176;
import lavahack.client.Class1784;
import lavahack.client.Class1892;
import lavahack.client.Class2040;
import lavahack.client.Class2129;
import lavahack.client.Class23;
import lavahack.client.Class481;
import lavahack.client.Class482;
import lavahack.client.Class673;
import lavahack.client.Class71;
import lavahack.client.Class739;
import lavahack.client.Class803;
import lavahack.client.Class927;
import lavahack.client.Class966;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class1302
implements Class1728 {
    public static final int Field13939;
    public static final int Field13940;
    public static final int Field13941;
    private final Logger Field13942 = LogManager.getLogger(Class1302.class);
    public final BlockingQueue Field13943;
    public final BlockingQueue Field13944;
    private final Class1715 Field13945;
    private SelectionKey Field13946;
    private ByteChannel Field13947;
    private Class1187 Field13948;
    private boolean Field13949 = false;
    private Class1609 Field13950 = Class1609.Field15509;
    private List Field13951;
    private Class2129 Field13952 = null;
    private Class803 Field13953;
    private ByteBuffer Field13954 = ByteBuffer.allocate(0);
    private Class481 Field13955 = null;
    private String Field13956 = null;
    private Integer Field13957 = null;
    private Boolean Field13958 = null;
    private String Field13959 = null;
    private long Field13960 = System.nanoTime();
    private final Object Field13961 = new Object();
    private Object Field13962;
    static final boolean Field13963;
    private String Field13964 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1302(Class1715 class1715, List list) {
        this(class1715, (Class2129)null);
        this.Field13953 = Class803.Field11415;
        if (list != null && !list.isEmpty()) {
            this.Field13951 = list;
            return;
        }
        this.Field13951 = new ArrayList();
        this.Field13951.add(new Class1088());
    }

    public Class1302(Class1715 class1715, Class2129 class2129) {
        if (class1715 == null) throw new IllegalArgumentException("parameters must not be null");
        if (class2129 == null && this.Field13953 == Class803.Field11415) {
            throw new IllegalArgumentException("parameters must not be null");
        }
        this.Field13943 = new LinkedBlockingQueue();
        this.Field13944 = new LinkedBlockingQueue();
        this.Field13945 = class1715;
        this.Field13953 = Class803.Field11414;
        if (class2129 == null) return;
        this.Field13952 = class2129.Method4414();
    }

    public void Method5272(ByteBuffer byteBuffer) {
        if (!Field13963 && !byteBuffer.hasRemaining()) {
            throw new AssertionError();
        }
        this.Field13942.trace("process({}): ({})", (Object)byteBuffer.remaining(), (Object)(byteBuffer.remaining() > 1000 ? "too big to display" : new String(byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining())));
        if (this.Field13950 != Class1609.Field15509) {
            if (this.Field13950 != Class1609.Field15510) return;
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
        Class739 class739;
        Class481 class481;
        Class2129 class2129;
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
        if (this.Field13953 == Class803.Field11415) {
            if (this.Field13952 != null) {
                Class739 class7392 = this.Field13952.Method4415(byteBuffer2);
                if (!(class7392 instanceof Class481)) {
                    this.Field13942.trace("Closing due to protocol error: wrong http function");
                    this.Method5282(1002, "wrong http function", false);
                    return false;
                }
                Class481 class4812 = (Class481)class7392;
                object = this.Field13952.Method4398(class4812);
                if (object == Class1597.Field15474) {
                    this.Method5289(class4812);
                    return true;
                }
                this.Field13942.trace("Closing due to protocol error: the handshake did finally not match");
                this.Method537(1002, "the handshake did finally not match");
                return false;
            }
        } else {
            if (this.Field13953 != Class803.Field11414) return false;
            this.Field13952.Method4418(this.Field13953);
            Class739 class7393 = this.Field13952.Method4415(byteBuffer2);
            if (!(class7393 instanceof Class482)) {
                this.Field13942.trace("Closing due to protocol error: wrong http function");
                this.Method5282(1002, "wrong http function", false);
                return false;
            }
            Class482 class482 = (Class482)class7393;
            object = this.Field13952.Method4397(this.Field13955, class482);
            if (object == Class1597.Field15474) {
                this.Field13945.Method506(this, this.Field13955, class482);
                this.Method5289(class482);
                return true;
            }
            this.Field13942.trace("Closing due to protocol error: draft {} refuses handshake", (Object)this.Field13952);
            this.Method537(1002, "draft " + this.Field13952 + " refuses handshake");
            return false;
        }
        Iterator iterator = this.Field13951.iterator();
        do {
            if (!iterator.hasNext()) {
                if (this.Field13952 != null) return false;
                this.Field13942.trace("Closing due to protocol error: no draft matches");
                this.Method5275(new Class23(1002, "no draft matches"));
                return false;
            }
            class2129 = (Class2129)iterator.next();
            class2129 = class2129.Method4414();
            class2129.Method4418(this.Field13953);
            byteBuffer2.reset();
            class739 = class2129.Method4415(byteBuffer2);
            if (class739 instanceof Class481) continue;
            this.Field13942.trace("Closing due to wrong handshake");
            this.Method5275(new Class23(1002, "wrong http function"));
            return false;
        } while ((object = class2129.Method4398(class481 = (Class481)class739)) != Class1597.Field15474);
        this.Field13959 = class481.Method2233();
        Class1692 class1692 = this.Field13945.Method505(this, class2129, class481);
        this.Method5288(class2129.Method4407(class2129.Method4411(class481, class1692)));
        this.Field13952 = class2129;
        this.Method5289(class481);
        return true;
    }

    private void Method5274(ByteBuffer byteBuffer) {
        List list = this.Field13952.Method4412(byteBuffer);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Class1260 class1260 = (Class1260)iterator.next();
            this.Field13942.trace("matched frame: {}", (Object)class1260);
            this.Field13952.Method4403(this, class1260);
        }
    }

    private void Method5275(Class23 class23) {
        this.Method5287(this.Method5277(404));
        this.Method5282(class23.Method192(), class23.getMessage(), false);
    }

    private void Method5276(RuntimeException runtimeException) {
        this.Method5287(this.Method5277(500));
        this.Method5282(-1, runtimeException.getMessage(), false);
    }

    private ByteBuffer Method5277(int n) {
        String string;
        switch (n) {
            case 404: {
                string = "404 WebSocket Upgrade Failure";
                return ByteBuffer.wrap(Class176.Method1095("HTTP/1.1 " + string + "\r\nContent-Type: text/html\r\nServer: TooTallNate Java-WebSocket\r\nContent-Length: " + (48 + string.length()) + "\r\n\r\n<html><head></head><body><h1>" + string + "</h1></body></html>"));
            }
        }
        string = "500 Internal Server Error";
        return ByteBuffer.wrap(Class176.Method1095("HTTP/1.1 " + string + "\r\nContent-Type: text/html\r\nServer: TooTallNate Java-WebSocket\r\nContent-Length: " + (48 + string.length()) + "\r\n\r\n<html><head></head><body><h1>" + string + "</h1></body></html>"));
    }

    public synchronized void Method5278(int n, String string, boolean bl) {
        if (this.Field13950 == Class1609.Field15511) return;
        if (this.Field13950 == Class1609.Field15512) return;
        if (this.Field13950 == Class1609.Field15510) {
            if (n == 1006) {
                if (!Field13963 && bl) {
                    throw new AssertionError();
                }
                this.Field13950 = Class1609.Field15511;
                this.Method5282(n, string, false);
                return;
            }
            if (this.Field13952.Method4413() != Class673.Field10859) {
                if (!bl) {
                    this.Field13945.Method513(this, n, string);
                }
                if (this.Method551()) {
                    Class966 class966 = new Class966();
                    class966.Method3963(string);
                    class966.Method3962(n);
                    class966.Method1620();
                    this.Method544(class966);
                }
            }
            this.Method5282(n, string, bl);
        } else if (n == -3) {
            if (!Field13963 && !bl) {
                throw new AssertionError();
            }
            this.Method5282(-3, string, true);
        } else if (n == 1002) {
            this.Method5282(n, string, bl);
        } else {
            this.Method5282(-1, string, false);
        }
        this.Field13950 = Class1609.Field15511;
        this.Field13954 = null;
    }

    @Override
    public void Method537(int n, String string) {
        this.Method5278(n, string, false);
    }

    public synchronized void Method5279(int n, String string, boolean bl) {
        if (this.Field13950 == Class1609.Field15512) {
            return;
        }
        if (this.Field13950 == Class1609.Field15510 && n == 1006) {
            this.Field13950 = Class1609.Field15511;
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
        this.Field13950 = Class1609.Field15512;
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
        this.Method5279(n, string, false);
    }

    public synchronized void Method5282(int n, String string, boolean bl) {
        if (this.Field13949) {
            return;
        }
        this.Field13957 = n;
        this.Field13956 = string;
        this.Field13958 = bl;
        this.Field13949 = true;
        this.Field13945.Method518(this);
        this.Field13945.Method512(this, n, string, bl);
        if (this.Field13952 != null) {
            this.Field13952.Method4405();
        }
        this.Field13955 = null;
    }

    public void Method5283() {
        if (this.Field13950 == Class1609.Field15509) {
            this.Method5280(-1, true);
            return;
        }
        if (this.Field13949) {
            this.Method5279(this.Field13957, this.Field13956, this.Field13958);
            return;
        }
        if (this.Field13952.Method4413() == Class673.Field10859) {
            this.Method5280(1000, true);
            return;
        }
        if (this.Field13952.Method4413() != Class673.Field10860) {
            this.Method5280(1006, true);
            return;
        }
        if (this.Field13953 == Class803.Field11415) {
            this.Method5280(1006, true);
            return;
        }
        this.Method5280(1000, true);
    }

    @Override
    public void Method538(int n) {
        this.Method5278(n, "", false);
    }

    public void Method5284(Class23 class23) {
        this.Method5278(class23.Method192(), class23.getMessage(), false);
    }

    @Override
    public void Method541(String string) {
        if (string == null) {
            throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
        }
        this.Method5285(this.Field13952.Method4402(string, this.Field13953 == Class803.Field11414));
    }

    @Override
    public void Method542(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
        }
        this.Method5285(this.Field13952.Method4401(byteBuffer, this.Field13953 == Class803.Field11414));
    }

    @Override
    public void Method543(byte[] byArray) {
        this.Method542(ByteBuffer.wrap(byArray));
    }

    private void Method5285(Collection collection) {
        if (!this.Method551()) {
            throw new Class2040();
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
            Class1260 class1260 = (Class1260)iterator.next();
            this.Field13942.trace("send frame: {}", (Object)class1260);
            arrayList.add(this.Field13952.Method4400(class1260));
        }
    }

    @Override
    public void Method547(Class927 class927, ByteBuffer byteBuffer, boolean bl) {
        this.Method5285(this.Field13952.Method4404(class927, byteBuffer, bl));
    }

    @Override
    public void Method545(Collection collection) {
        this.Method5285(collection);
    }

    @Override
    public void Method544(Class1260 class1260) {
        this.Method5285(Collections.singletonList(class1260));
    }

    @Override
    public void Method546() throws NullPointerException {
        Class1418 class1418 = this.Field13945.Method516(this);
        if (class1418 == null) {
            throw new NullPointerException("onPreparePing(WebSocket) returned null. PingFrame to sent can't be null.");
        }
        this.Method544(class1418);
    }

    @Override
    public boolean Method548() {
        if (this.Field13943.isEmpty()) return false;
        return true;
    }

    public void Method5286(Class1892 class1892) throws Class71 {
        this.Field13955 = this.Field13952.Method4410(class1892);
        this.Field13959 = class1892.Method2233();
        if (!Field13963 && this.Field13959 == null) {
            throw new AssertionError();
        }
        this.Field13945.Method507(this, this.Field13955);
        this.Method5288(this.Field13952.Method4407(this.Field13955));
    }

    private void Method5287(ByteBuffer byteBuffer) {
        this.Field13942.trace("write({}): {}", (Object)byteBuffer.remaining(), (Object)(byteBuffer.remaining() > 1000 ? "too big to display" : new String(byteBuffer.array())));
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

    private void Method5289(Class739 class739) {
        this.Field13942.trace("open using draft: {}", (Object)this.Field13952);
        this.Field13950 = Class1609.Field15510;
        this.Method5293();
        this.Field13945.Method510(this, class739);
    }

    @Override
    public boolean Method551() {
        if (this.Field13950 != Class1609.Field15510) return false;
        return true;
    }

    @Override
    public boolean Method552() {
        if (this.Field13950 != Class1609.Field15511) return false;
        return true;
    }

    @Override
    public boolean Method553() {
        return this.Field13949;
    }

    @Override
    public boolean Method554() {
        if (this.Field13950 != Class1609.Field15512) return false;
        return true;
    }

    @Override
    public Class1609 Method556() {
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
    public Class2129 Method555() {
        return this.Field13952;
    }

    @Override
    public void Method539() {
        this.Method538(1000);
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

    public Class1715 Method5294() {
        return this.Field13945;
    }

    @Override
    public Object Method559() {
        return this.Field13962;
    }

    @Override
    public boolean Method560() {
        return this.Field13947 instanceof Class1784;
    }

    @Override
    public SSLSession Method561() {
        if (this.Method560()) return ((Class1784)((Object)this.Field13947)).Method2487().getSession();
        throw new IllegalArgumentException("This websocket uses ws instead of wss. No SSLSession available.");
    }

    @Override
    public Class1234 Method562() {
        if (this.Field13952 == null) {
            return null;
        }
        if (this.Field13952 instanceof Class1088) return ((Class1088)this.Field13952).Method4424();
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

    public Class1187 Method5297() {
        return this.Field13948;
    }

    public void Method5298(Class1187 class1187) {
        this.Field13948 = class1187;
    }

    static {
        Field13941 = 16384;
        Field13940 = 443;
        Field13939 = 80;
        Field13963 = !Class1302.class.desiredAssertionStatus();
    }

    private static String Method5299(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 30;
            cArray2[n] = (char)(cArray[n] ^ (0x61FC ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

