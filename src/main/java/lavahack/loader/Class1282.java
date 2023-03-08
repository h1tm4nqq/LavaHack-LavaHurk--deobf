//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.loader;

import java.nio.channels.*;
import java.nio.*;
import org.apache.logging.log4j.*;
import java.util.concurrent.*;
import java.util.*;
import java.net.*;
import javax.net.ssl.*;

public class Class1282 implements Class1966
{
    public static final int Field13829;
    public static final int Field13830;
    public static final int Field13831;
    private final Logger Field13832;
    public final BlockingQueue Field13833;
    public final BlockingQueue Field13834;
    private final Class977 Field13835;
    private SelectionKey Field13836;
    private ByteChannel Field13837;
    private igCSMUHYGvjvsH9HAWyPsuyOKVVnilJK$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field13838;
    private boolean Field13839;
    private Class866 Field13840;
    private List Field13841;
    private Class26 Field13842;
    private Class700 Field13843;
    private ByteBuffer Field13844;
    private Class359 Field13845;
    private String Field13846;
    private Integer Field13847;
    private Boolean Field13848;
    private String Field13849;
    private long Field13850;
    private final Object Field13851;
    private Object Field13852;
    static final boolean Field13853;
    private String Field13854 = "TheKisDevs & LavaHack Development owns you";
    
    public Class1282(final Class977 class977, final List field13841) {
        this(class977, (Class26)null);
        this.Field13843 = Class700.Field10969;
        if (field13841 == null || field13841.isEmpty()) {
            (this.Field13841 = new ArrayList()).add(new Class749());
        }
        else {
            this.Field13841 = field13841;
        }
    }
    
    public Class1282(final Class977 field13835, final Class26 class26) {
        this.Field13832 = LogManager.getLogger((Class)Class1282.class);
        this.Field13839 = false;
        this.Field13840 = Class866.Field11645;
        this.Field13842 = null;
        this.Field13844 = ByteBuffer.allocate(0);
        this.Field13845 = null;
        this.Field13846 = null;
        this.Field13847 = null;
        this.Field13848 = null;
        this.Field13849 = null;
        this.Field13850 = System.nanoTime();
        this.Field13851 = new Object();
        if (field13835 == null || (class26 == null && this.Field13843 == Class700.Field10969)) {
            throw new IllegalArgumentException("parameters must not be null");
        }
        this.Field13833 = new LinkedBlockingQueue();
        this.Field13834 = new LinkedBlockingQueue();
        this.Field13835 = field13835;
        this.Field13843 = Class700.Field10968;
        if (class26 != null) {
            this.Field13842 = class26.Method217();
        }
    }
    
    public void Method5194(final ByteBuffer byteBuffer) {
        if (!Class1282.Field13853 && !byteBuffer.hasRemaining()) {
            throw new AssertionError();
        }
        this.Field13832.trace("process({}): ({})", (Object)byteBuffer.remaining(), (Object)((byteBuffer.remaining() > 1000) ? "too big to display" : new String(byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining())));
        if (this.Field13840 != Class866.Field11645) {
            if (this.Field13840 == Class866.Field11646) {
                this.Method5196(byteBuffer);
            }
        }
        else if (this.Method5195(byteBuffer) && !this.Method3333() && !this.Method3335()) {
            if (!Class1282.Field13853 && this.Field13844.hasRemaining() == byteBuffer.hasRemaining() && byteBuffer.hasRemaining()) {
                throw new AssertionError();
            }
            if (byteBuffer.hasRemaining()) {
                this.Method5196(byteBuffer);
            }
            else if (this.Field13844.hasRemaining()) {
                this.Method5196(this.Field13844);
            }
        }
    }
    
    private boolean Method5195(final ByteBuffer src) {
        ByteBuffer field13844;
        if (this.Field13844.capacity() == 0) {
            field13844 = src;
        }
        else {
            if (this.Field13844.remaining() < src.remaining()) {
                final ByteBuffer allocate = ByteBuffer.allocate(this.Field13844.capacity() + src.remaining());
                this.Field13844.flip();
                allocate.put(this.Field13844);
                this.Field13844 = allocate;
            }
            this.Field13844.put(src);
            this.Field13844.flip();
            field13844 = this.Field13844;
        }
        field13844.mark();
        if (this.Field13843 != Class700.Field10969) {
            if (this.Field13843 == Class700.Field10968) {
                this.Field13842.Method221(this.Field13843);
                final Class1181 method218 = this.Field13842.Method218(field13844);
                if (!(method218 instanceof Class1236)) {
                    this.Field13832.trace("Closing due to protocol error: wrong http function");
                    this.Method5204(1002, "wrong http function", false);
                    return false;
                }
                final Class1236 class1236 = (Class1236)method218;
                if (this.Field13842.Method200(this.Field13845, class1236) == Class1550.Field15233) {
                    this.Field13835.Method2660(this, this.Field13845, class1236);
                    this.Method5211((Class1181)class1236);
                    return true;
                }
                this.Field13832.trace("Closing due to protocol error: draft {} refuses handshake", (Object)this.Field13842);
                this.Method3318(1002, "draft " + this.Field13842 + " refuses handshake");
            }
            return false;
        }
        if (this.Field13842 == null) {
            final Iterator<Class26> iterator = this.Field13841.iterator();
            while (iterator.hasNext()) {
                final Class26 method219 = iterator.next().Method217();
                method219.Method221(this.Field13843);
                field13844.reset();
                final Class1181 method220 = method219.Method218(field13844);
                if (!(method220 instanceof Class359)) {
                    this.Field13832.trace("Closing due to wrong handshake");
                    this.Method5197(new Class902(1002, "wrong http function"));
                    return false;
                }
                final Class359 class1237 = (Class359)method220;
                if (method219.Method201(class1237) == Class1550.Field15233) {
                    this.Field13849 = class1237.Method186();
                    this.Method5210(method219.Method210((Class1181)method219.Method214(class1237, this.Field13835.Method2659(this, method219, class1237))));
                    this.Field13842 = method219;
                    this.Method5211((Class1181)class1237);
                    return true;
                }
            }
            if (this.Field13842 == null) {
                this.Field13832.trace("Closing due to protocol error: no draft matches");
                this.Method5197(new Class902(1002, "no draft matches"));
            }
            return false;
        }
        final Class1181 method221 = this.Field13842.Method218(field13844);
        if (!(method221 instanceof Class359)) {
            this.Field13832.trace("Closing due to protocol error: wrong http function");
            this.Method5204(1002, "wrong http function", false);
            return false;
        }
        final Class359 class1238 = (Class359)method221;
        if (this.Field13842.Method201(class1238) == Class1550.Field15233) {
            this.Method5211((Class1181)class1238);
            return true;
        }
        this.Field13832.trace("Closing due to protocol error: the handshake did finally not match");
        this.Method3318(1002, "the handshake did finally not match");
        return false;
    }
    
    private void Method5196(final ByteBuffer byteBuffer) {
        for (final Class1926 class1926 : this.Field13842.Method215(byteBuffer)) {
            this.Field13832.trace("matched frame: {}", (Object)class1926);
            this.Field13842.Method206(this, class1926);
        }
    }
    
    private void Method5197(final Class902 class902) {
        this.Method5209(this.Method5199(404));
        this.Method5204(class902.Method483(), class902.getMessage(), false);
    }
    
    private void Method5198(final RuntimeException ex) {
        this.Method5209(this.Method5199(500));
        this.Method5204(-1, ex.getMessage(), false);
    }
    
    private ByteBuffer Method5199(final int n) {
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
        return ByteBuffer.wrap(Class1105.Method4526("HTTP/1.1 " + s + "\r\nContent-Type: text/html\r\nServer: TooTallNate Java-WebSocket\r\nContent-Length: " + (48 + s.length()) + "\r\n\r\n<html><head></head><body><h1>" + s + "</h1></body></html>"));
    }
    
    public synchronized void Method5200(final int n, final String s, final boolean b) {
        if (this.Field13840 != Class866.Field11647 && this.Field13840 != Class866.Field11648) {
            if (this.Field13840 == Class866.Field11646) {
                if (n == 1006) {
                    if (!Class1282.Field13853 && b) {
                        throw new AssertionError();
                    }
                    this.Field13840 = Class866.Field11647;
                    this.Method5204(n, s, false);
                    return;
                }
                else {
                    if (this.Field13842.Method216() != Class1159.Field13228) {
                        if (!b) {
                            this.Field13835.Method2667(this, n, s);
                        }
                        if (this.Method3332()) {
                            final Class7 class7 = new Class7();
                            class7.Method94(s);
                            class7.Method93(n);
                            class7.Method84();
                            this.Method3325(class7);
                        }
                    }
                    this.Method5204(n, s, b);
                }
            }
            else if (n == -3) {
                if (!Class1282.Field13853 && !b) {
                    throw new AssertionError();
                }
                this.Method5204(-3, s, true);
            }
            else if (n == 1002) {
                this.Method5204(n, s, b);
            }
            else {
                this.Method5204(-1, s, false);
            }
            this.Field13840 = Class866.Field11647;
            this.Field13844 = null;
        }
    }
    
    @Override
    public void Method3318(final int n, final String s) {
        this.Method5200(n, s, false);
    }
    
    public synchronized void Method5201(final int n, final String s, final boolean b) {
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
        this.Field13835.Method2665(this, n, s, b);
        if (this.Field13842 != null) {
            this.Field13842.Method208();
        }
        this.Field13845 = null;
        this.Field13840 = Class866.Field11648;
    }
    
    protected void Method5202(final int n, final boolean b) {
        this.Method5201(n, "", b);
    }
    
    public void Method5203() {
        if (this.Field13848 == null) {
            throw new IllegalStateException("this method must be used in conjunction with flushAndClose");
        }
        this.Method5201(this.Field13847, this.Field13846, this.Field13848);
    }
    
    @Override
    public void Method3321(final int n, final String s) {
        this.Method5201(n, s, false);
    }
    
    public synchronized void Method5204(final int i, final String field13846, final boolean b) {
        if (this.Field13839) {
            return;
        }
        this.Field13847 = i;
        this.Field13846 = field13846;
        this.Field13848 = b;
        this.Field13839 = true;
        this.Field13835.Method2672(this);
        this.Field13835.Method2666(this, i, field13846, b);
        if (this.Field13842 != null) {
            this.Field13842.Method208();
        }
        this.Field13845 = null;
    }
    
    public void Method5205() {
        if (this.Field13840 == Class866.Field11645) {
            this.Method5202(-1, true);
        }
        else if (this.Field13839) {
            this.Method5201(this.Field13847, this.Field13846, this.Field13848);
        }
        else if (this.Field13842.Method216() == Class1159.Field13228) {
            this.Method5202(1000, true);
        }
        else if (this.Field13842.Method216() == Class1159.Field13229) {
            if (this.Field13843 == Class700.Field10969) {
                this.Method5202(1006, true);
            }
            else {
                this.Method5202(1000, true);
            }
        }
        else {
            this.Method5202(1006, true);
        }
    }
    
    @Override
    public void Method3319(final int n) {
        this.Method5200(n, "", false);
    }
    
    public void Method5206(final Class902 class902) {
        this.Method5200(class902.Method483(), class902.getMessage(), false);
    }
    
    @Override
    public void Method3322(final String s) {
        if (s == null) {
            throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
        }
        this.Method5207(this.Field13842.Method205(s, this.Field13843 == Class700.Field10968));
    }
    
    @Override
    public void Method3323(final ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
        }
        this.Method5207(this.Field13842.Method204(byteBuffer, this.Field13843 == Class700.Field10968));
    }
    
    @Override
    public void Method3324(final byte[] array) {
        this.Method3323(ByteBuffer.wrap(array));
    }
    
    private void Method5207(final Collection collection) {
        if (!this.Method3332()) {
            throw new Class1691();
        }
        if (collection == null) {
            throw new IllegalArgumentException();
        }
        final ArrayList<ByteBuffer> list = new ArrayList<ByteBuffer>();
        for (final Class1926 class1926 : collection) {
            this.Field13832.trace("send frame: {}", (Object)class1926);
            list.add(this.Field13842.Method203(class1926));
        }
        this.Method5210(list);
    }
    
    @Override
    public void Method3328(final Class1753 class1753, final ByteBuffer byteBuffer, final boolean b) {
        this.Method5207(this.Field13842.Method207(class1753, byteBuffer, b));
    }
    
    @Override
    public void Method3326(final Collection collection) {
        this.Method5207(collection);
    }
    
    @Override
    public void Method3325(final Class1926 o) {
        this.Method5207(Collections.singletonList(o));
    }
    
    @Override
    public void Method3327() throws NullPointerException {
        final Class1683 method2670 = this.Field13835.Method2670(this);
        if (method2670 == null) {
            throw new NullPointerException("onPreparePing(WebSocket) returned null. PingFrame to sent can't be null.");
        }
        this.Method3325(method2670);
    }
    
    @Override
    public boolean Method3329() {
        return !this.Field13833.isEmpty();
    }
    
    public void Method5208(final Class45 class45) throws Class241 {
        this.Field13845 = this.Field13842.Method213(class45);
        this.Field13849 = class45.Method186();
        if (!Class1282.Field13853 && this.Field13849 == null) {
            throw new AssertionError();
        }
        this.Field13835.Method2661(this, this.Field13845);
        this.Method5210(this.Field13842.Method210((Class1181)this.Field13845));
    }
    
    private void Method5209(final ByteBuffer byteBuffer) {
        this.Field13832.trace("write({}): {}", (Object)byteBuffer.remaining(), (Object)((byteBuffer.remaining() > 1000) ? "too big to display" : new String(byteBuffer.array())));
        this.Field13833.add(byteBuffer);
        this.Field13835.Method2672(this);
    }
    
    private void Method5210(final List list) {
        final Object field13851 = this.Field13851;
        final Iterator<ByteBuffer> iterator = list.iterator();
        while (iterator.hasNext()) {
            this.Method5209(iterator.next());
        }
    }
    
    private void Method5211(final Class1181 class1181) {
        this.Field13832.trace("open using draft: {}", (Object)this.Field13842);
        this.Field13840 = Class866.Field11646;
        this.Method5215();
        this.Field13835.Method2664(this, class1181);
    }
    
    @Override
    public boolean Method3332() {
        return this.Field13840 == Class866.Field11646;
    }
    
    @Override
    public boolean Method3333() {
        return this.Field13840 == Class866.Field11647;
    }
    
    @Override
    public boolean Method3334() {
        return this.Field13839;
    }
    
    @Override
    public boolean Method3335() {
        return this.Field13840 == Class866.Field11648;
    }
    
    @Override
    public Class866 Method3337() {
        return this.Field13840;
    }
    
    public void Method5212(final SelectionKey field13836) {
        this.Field13836 = field13836;
    }
    
    public SelectionKey Method5213() {
        return this.Field13836;
    }
    
    @Override
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
        if (!this.Method3341()) {
            throw new IllegalArgumentException("This websocket uses ws instead of wss. No SSLSession available.");
        }
        return ((XlHSG3OW4gX2o45A9DNWLPF6GqZiJOrl)this.Field13837).ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS().getSession();
    }
    
    @Override
    public Class919 Method3343() {
        if (this.Field13842 == null) {
            return null;
        }
        if (!(this.Field13842 instanceof Class749)) {
            throw new IllegalArgumentException("This draft does not support Sec-WebSocket-Protocol");
        }
        return ((Class749)this.Field13842).Method3104();
    }
    
    @Override
    public void Method3339(final Object field13852) {
        this.Field13852 = field13852;
    }
    
    public ByteChannel Method5217() {
        return this.Field13837;
    }
    
    public void Method5218(final ByteChannel field13837) {
        this.Field13837 = field13837;
    }
    
    public igCSMUHYGvjvsH9HAWyPsuyOKVVnilJK$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Method5219() {
        return this.Field13838;
    }
    
    public void Method5220(final igCSMUHYGvjvsH9HAWyPsuyOKVVnilJK$leqS0IyKEB621E1SrHdAcHHAUjScjmKi field13838) {
        this.Field13838 = field13838;
    }
    
    static {
        Field13831 = 16384;
        Field13830 = 443;
        Field13829 = 80;
        Field13853 = !Class1282.class.desiredAssertionStatus();
    }
    
    private static String Method5221(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x538C ^ 0x97));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
