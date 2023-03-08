//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.nio.channels.*;
import java.nio.*;
import org.apache.logging.log4j.*;
import java.util.concurrent.*;
import java.util.*;
import java.net.*;
import javax.net.ssl.*;

public class Class1302 implements Class1728
{
    public static final int Field13939;
    public static final int Field13940;
    public static final int Field13941;
    private final Logger Field13942;
    public final BlockingQueue Field13943;
    public final BlockingQueue Field13944;
    private final Class1715 Field13945;
    private SelectionKey Field13946;
    private ByteChannel Field13947;
    private Class1187 Field13948;
    private boolean Field13949;
    private Class1609 Field13950;
    private List Field13951;
    private Class2129 Field13952;
    private Class803 Field13953;
    private ByteBuffer Field13954;
    private Class481 Field13955;
    private String Field13956;
    private Integer Field13957;
    private Boolean Field13958;
    private String Field13959;
    private long Field13960;
    private final Object Field13961;
    private Object Field13962;
    static final boolean Field13963;
    private String Field13964 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1302(final Class1715 class1715, final List field13951) {
        this(class1715, (Class2129)null);
        this.Field13953 = Class803.Field11415;
        if (field13951 == null || field13951.isEmpty()) {
            (this.Field13951 = new ArrayList()).add(new Class1088());
        }
        else {
            this.Field13951 = field13951;
        }
    }
    
    public Class1302(final Class1715 field13945, final Class2129 class2129) {
        this.Field13942 = LogManager.getLogger((Class)Class1302.class);
        this.Field13949 = false;
        this.Field13950 = Class1609.Field15509;
        this.Field13952 = null;
        this.Field13954 = ByteBuffer.allocate(0);
        this.Field13955 = null;
        this.Field13956 = null;
        this.Field13957 = null;
        this.Field13958 = null;
        this.Field13959 = null;
        this.Field13960 = System.nanoTime();
        this.Field13961 = new Object();
        if (field13945 == null || (class2129 == null && this.Field13953 == Class803.Field11415)) {
            throw new IllegalArgumentException("parameters must not be null");
        }
        this.Field13943 = new LinkedBlockingQueue();
        this.Field13944 = new LinkedBlockingQueue();
        this.Field13945 = field13945;
        this.Field13953 = Class803.Field11414;
        if (class2129 != null) {
            this.Field13952 = class2129.Method4414();
        }
    }
    
    public void Method5272(final ByteBuffer byteBuffer) {
        if (!Class1302.Field13963 && !byteBuffer.hasRemaining()) {
            throw new AssertionError();
        }
        this.Field13942.trace("process({}): ({})", (Object)byteBuffer.remaining(), (Object)((byteBuffer.remaining() > 1000) ? "too big to display" : new String(byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining())));
        if (this.Field13950 != Class1609.Field15509) {
            if (this.Field13950 == Class1609.Field15510) {
                this.Method5274(byteBuffer);
            }
        }
        else if (this.Method5273(byteBuffer) && !this.Method552() && !this.Method554()) {
            if (!Class1302.Field13963 && this.Field13954.hasRemaining() == byteBuffer.hasRemaining() && byteBuffer.hasRemaining()) {
                throw new AssertionError();
            }
            if (byteBuffer.hasRemaining()) {
                this.Method5274(byteBuffer);
            }
            else if (this.Field13954.hasRemaining()) {
                this.Method5274(this.Field13954);
            }
        }
    }
    
    private boolean Method5273(final ByteBuffer src) {
        ByteBuffer field13954;
        if (this.Field13954.capacity() == 0) {
            field13954 = src;
        }
        else {
            if (this.Field13954.remaining() < src.remaining()) {
                final ByteBuffer allocate = ByteBuffer.allocate(this.Field13954.capacity() + src.remaining());
                this.Field13954.flip();
                allocate.put(this.Field13954);
                this.Field13954 = allocate;
            }
            this.Field13954.put(src);
            this.Field13954.flip();
            field13954 = this.Field13954;
        }
        field13954.mark();
        if (this.Field13953 != Class803.Field11415) {
            if (this.Field13953 == Class803.Field11414) {
                this.Field13952.Method4418(this.Field13953);
                final Class739 method4415 = this.Field13952.Method4415(field13954);
                if (!(method4415 instanceof Class482)) {
                    this.Field13942.trace("Closing due to protocol error: wrong http function");
                    this.Method5282(1002, "wrong http function", false);
                    return false;
                }
                final Class482 class482 = (Class482)method4415;
                if (this.Field13952.Method4397(this.Field13955, class482) == Class1597.Field15474) {
                    this.Field13945.Method506(this, this.Field13955, class482);
                    this.Method5289(class482);
                    return true;
                }
                this.Field13942.trace("Closing due to protocol error: draft {} refuses handshake", (Object)this.Field13952);
                this.Method537(1002, "draft " + this.Field13952 + " refuses handshake");
            }
            return false;
        }
        if (this.Field13952 == null) {
            final Iterator<Class2129> iterator = this.Field13951.iterator();
            while (iterator.hasNext()) {
                final Class2129 method4416 = iterator.next().Method4414();
                method4416.Method4418(this.Field13953);
                field13954.reset();
                final Class739 method4417 = method4416.Method4415(field13954);
                if (!(method4417 instanceof Class481)) {
                    this.Field13942.trace("Closing due to wrong handshake");
                    this.Method5275(new Class23(1002, "wrong http function"));
                    return false;
                }
                final Class481 class483 = (Class481)method4417;
                if (method4416.Method4398(class483) == Class1597.Field15474) {
                    this.Field13959 = class483.Method2233();
                    this.Method5288(method4416.Method4407(method4416.Method4411(class483, this.Field13945.Method505(this, method4416, class483))));
                    this.Field13952 = method4416;
                    this.Method5289(class483);
                    return true;
                }
            }
            if (this.Field13952 == null) {
                this.Field13942.trace("Closing due to protocol error: no draft matches");
                this.Method5275(new Class23(1002, "no draft matches"));
            }
            return false;
        }
        final Class739 method4418 = this.Field13952.Method4415(field13954);
        if (!(method4418 instanceof Class481)) {
            this.Field13942.trace("Closing due to protocol error: wrong http function");
            this.Method5282(1002, "wrong http function", false);
            return false;
        }
        final Class481 class484 = (Class481)method4418;
        if (this.Field13952.Method4398(class484) == Class1597.Field15474) {
            this.Method5289(class484);
            return true;
        }
        this.Field13942.trace("Closing due to protocol error: the handshake did finally not match");
        this.Method537(1002, "the handshake did finally not match");
        return false;
    }
    
    private void Method5274(final ByteBuffer byteBuffer) {
        for (final Class1260 class1260 : this.Field13952.Method4412(byteBuffer)) {
            this.Field13942.trace("matched frame: {}", (Object)class1260);
            this.Field13952.Method4403(this, class1260);
        }
    }
    
    private void Method5275(final Class23 class23) {
        this.Method5287(this.Method5277(404));
        this.Method5282(class23.Method192(), class23.getMessage(), false);
    }
    
    private void Method5276(final RuntimeException ex) {
        this.Method5287(this.Method5277(500));
        this.Method5282(-1, ex.getMessage(), false);
    }
    
    private ByteBuffer Method5277(final int n) {
        String s = null;
        switch (n) {
            case 404: {
                s = "404 WebSocket Upgrade Failure";
                break;
            }
            default: {
                s = "500 Internal Server Error";
                break;
            }
        }
        return ByteBuffer.wrap(Class176.Method1095("HTTP/1.1 " + s + "\r\nContent-Type: text/html\r\nServer: TooTallNate Java-WebSocket\r\nContent-Length: " + (48 + s.length()) + "\r\n\r\n<html><head></head><body><h1>" + s + "</h1></body></html>"));
    }
    
    public synchronized void Method5278(final int n, final String s, final boolean b) {
        if (this.Field13950 != Class1609.Field15511 && this.Field13950 != Class1609.Field15512) {
            if (this.Field13950 == Class1609.Field15510) {
                if (n == 1006) {
                    if (!Class1302.Field13963 && b) {
                        throw new AssertionError();
                    }
                    this.Field13950 = Class1609.Field15511;
                    this.Method5282(n, s, false);
                    return;
                }
                else {
                    if (this.Field13952.Method4413() != Class673.Field10859) {
                        if (!b) {
                            this.Field13945.Method513(this, n, s);
                        }
                        if (this.Method551()) {
                            final Class966 class966 = new Class966();
                            class966.Method3963(s);
                            class966.Method3962(n);
                            class966.Method1620();
                            this.Method544((Class1260)class966);
                        }
                    }
                    this.Method5282(n, s, b);
                }
            }
            else if (n == -3) {
                if (!Class1302.Field13963 && !b) {
                    throw new AssertionError();
                }
                this.Method5282(-3, s, true);
            }
            else if (n == 1002) {
                this.Method5282(n, s, b);
            }
            else {
                this.Method5282(-1, s, false);
            }
            this.Field13950 = Class1609.Field15511;
            this.Field13954 = null;
        }
    }
    
    @Override
    public void Method537(final int n, final String s) {
        this.Method5278(n, s, false);
    }
    
    public synchronized void Method5279(final int n, final String s, final boolean b) {
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
        this.Field13945.Method511(this, n, s, b);
        if (this.Field13952 != null) {
            this.Field13952.Method4405();
        }
        this.Field13955 = null;
        this.Field13950 = Class1609.Field15512;
    }
    
    protected void Method5280(final int n, final boolean b) {
        this.Method5279(n, "", b);
    }
    
    public void Method5281() {
        if (this.Field13958 == null) {
            throw new IllegalStateException("this method must be used in conjunction with flushAndClose");
        }
        this.Method5279(this.Field13957, this.Field13956, this.Field13958);
    }
    
    @Override
    public void Method540(final int n, final String s) {
        this.Method5279(n, s, false);
    }
    
    public synchronized void Method5282(final int i, final String field13956, final boolean b) {
        if (this.Field13949) {
            return;
        }
        this.Field13957 = i;
        this.Field13956 = field13956;
        this.Field13958 = b;
        this.Field13949 = true;
        this.Field13945.Method518(this);
        this.Field13945.Method512(this, i, field13956, b);
        if (this.Field13952 != null) {
            this.Field13952.Method4405();
        }
        this.Field13955 = null;
    }
    
    public void Method5283() {
        if (this.Field13950 == Class1609.Field15509) {
            this.Method5280(-1, true);
        }
        else if (this.Field13949) {
            this.Method5279(this.Field13957, this.Field13956, this.Field13958);
        }
        else if (this.Field13952.Method4413() == Class673.Field10859) {
            this.Method5280(1000, true);
        }
        else if (this.Field13952.Method4413() == Class673.Field10860) {
            if (this.Field13953 == Class803.Field11415) {
                this.Method5280(1006, true);
            }
            else {
                this.Method5280(1000, true);
            }
        }
        else {
            this.Method5280(1006, true);
        }
    }
    
    @Override
    public void Method538(final int n) {
        this.Method5278(n, "", false);
    }
    
    public void Method5284(final Class23 class23) {
        this.Method5278(class23.Method192(), class23.getMessage(), false);
    }
    
    @Override
    public void Method541(final String s) {
        if (s == null) {
            throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
        }
        this.Method5285(this.Field13952.Method4402(s, this.Field13953 == Class803.Field11414));
    }
    
    @Override
    public void Method542(final ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
        }
        this.Method5285(this.Field13952.Method4401(byteBuffer, this.Field13953 == Class803.Field11414));
    }
    
    @Override
    public void Method543(final byte[] array) {
        this.Method542(ByteBuffer.wrap(array));
    }
    
    private void Method5285(final Collection collection) {
        if (!this.Method551()) {
            throw new Class2040();
        }
        if (collection == null) {
            throw new IllegalArgumentException();
        }
        final ArrayList<ByteBuffer> list = new ArrayList<ByteBuffer>();
        for (final Class1260 class1260 : collection) {
            this.Field13942.trace("send frame: {}", (Object)class1260);
            list.add(this.Field13952.Method4400(class1260));
        }
        this.Method5288(list);
    }
    
    @Override
    public void Method547(final Class927 class927, final ByteBuffer byteBuffer, final boolean b) {
        this.Method5285(this.Field13952.Method4404(class927, byteBuffer, b));
    }
    
    @Override
    public void Method545(final Collection collection) {
        this.Method5285(collection);
    }
    
    @Override
    public void Method544(final Class1260 o) {
        this.Method5285(Collections.singletonList(o));
    }
    
    @Override
    public void Method546() throws NullPointerException {
        final Class1418 method516 = this.Field13945.Method516(this);
        if (method516 == null) {
            throw new NullPointerException("onPreparePing(WebSocket) returned null. PingFrame to sent can't be null.");
        }
        this.Method544((Class1260)method516);
    }
    
    @Override
    public boolean Method548() {
        return !this.Field13943.isEmpty();
    }
    
    public void Method5286(final Class1892 class1892) throws Class71 {
        this.Field13955 = this.Field13952.Method4410(class1892);
        this.Field13959 = class1892.Method2233();
        if (!Class1302.Field13963 && this.Field13959 == null) {
            throw new AssertionError();
        }
        this.Field13945.Method507(this, this.Field13955);
        this.Method5288(this.Field13952.Method4407(this.Field13955));
    }
    
    private void Method5287(final ByteBuffer byteBuffer) {
        this.Field13942.trace("write({}): {}", (Object)byteBuffer.remaining(), (Object)((byteBuffer.remaining() > 1000) ? "too big to display" : new String(byteBuffer.array())));
        this.Field13943.add(byteBuffer);
        this.Field13945.Method518(this);
    }
    
    private void Method5288(final List list) {
        final Object field13961 = this.Field13961;
        final Iterator<ByteBuffer> iterator = list.iterator();
        while (iterator.hasNext()) {
            this.Method5287(iterator.next());
        }
    }
    
    private void Method5289(final Class739 class739) {
        this.Field13942.trace("open using draft: {}", (Object)this.Field13952);
        this.Field13950 = Class1609.Field15510;
        this.Method5293();
        this.Field13945.Method510(this, class739);
    }
    
    @Override
    public boolean Method551() {
        return this.Field13950 == Class1609.Field15510;
    }
    
    @Override
    public boolean Method552() {
        return this.Field13950 == Class1609.Field15511;
    }
    
    @Override
    public boolean Method553() {
        return this.Field13949;
    }
    
    @Override
    public boolean Method554() {
        return this.Field13950 == Class1609.Field15512;
    }
    
    @Override
    public Class1609 Method556() {
        return this.Field13950;
    }
    
    public void Method5290(final SelectionKey field13946) {
        this.Field13946 = field13946;
    }
    
    public SelectionKey Method5291() {
        return this.Field13946;
    }
    
    @Override
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
        if (!this.Method560()) {
            throw new IllegalArgumentException("This websocket uses ws instead of wss. No SSLSession available.");
        }
        return ((Class1784)this.Field13947).Method2487().getSession();
    }
    
    @Override
    public Class1234 Method562() {
        if (this.Field13952 == null) {
            return null;
        }
        if (!(this.Field13952 instanceof Class1088)) {
            throw new IllegalArgumentException("This draft does not support Sec-WebSocket-Protocol");
        }
        return ((Class1088)this.Field13952).Method4424();
    }
    
    @Override
    public void Method558(final Object field13962) {
        this.Field13962 = field13962;
    }
    
    public ByteChannel Method5295() {
        return this.Field13947;
    }
    
    public void Method5296(final ByteChannel field13947) {
        this.Field13947 = field13947;
    }
    
    public Class1187 Method5297() {
        return this.Field13948;
    }
    
    public void Method5298(final Class1187 field13948) {
        this.Field13948 = field13948;
    }
    
    static {
        Field13941 = 16384;
        Field13940 = 443;
        Field13939 = 80;
        Field13963 = !Class1302.class.desiredAssertionStatus();
    }
    
    private static String Method5299(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x61FC ^ 0x1E));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
