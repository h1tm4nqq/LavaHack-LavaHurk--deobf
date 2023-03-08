//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.loader;

import java.nio.*;
import org.apache.logging.log4j.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.security.*;

public class Class749 extends Class26
{
    private static final String Field11180;
    private static final String Field11181;
    private static final String Field11182;
    private static final String Field11183;
    private static final String Field11184;
    private static final String Field11185;
    private final Logger Field11186;
    private Class1720 Field11187;
    private Class1720 Field11188;
    private List Field11189;
    private Class1720 Field11190;
    private Class919 Field11191;
    private List Field11192;
    private Class1926 Field11193;
    private final List Field11194;
    private ByteBuffer Field11195;
    private final SecureRandom Field11196;
    private int Field11197;
    static final boolean Field11198;
    private String Field11199 = "TheKisDevs & LavaHack Development owns you";
    
    public Class749() {
        this(Collections.emptyList());
    }
    
    public Class749(final Class1720 o) {
        this(Collections.singletonList(o));
    }
    
    public Class749(final List list) {
        this(list, Collections.singletonList(new Class924("")));
    }
    
    public Class749(final List list, final List list2) {
        this(list, list2, Integer.MAX_VALUE);
    }
    
    public Class749(final List list, final int n) {
        this(list, Collections.singletonList(new Class924("")), n);
    }
    
    public Class749(final List list, final List list2, final int field11197) {
        this.Field11186 = LogManager.getLogger((Class)Class749.class);
        this.Field11187 = (Class1720)new Class1726();
        this.Field11188 = (Class1720)new Class1726();
        this.Field11196 = new SecureRandom();
        if (list == null || list2 == null || field11197 < 1) {
            throw new IllegalArgumentException();
        }
        this.Field11189 = new ArrayList(list.size());
        this.Field11192 = new ArrayList(list2.size());
        this.Field11194 = new ArrayList();
        final Iterator<Class1720> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getClass().equals(Class1726.class)) {
                continue;
            }
        }
        this.Field11189.addAll(list);
        this.Field11189.add(this.Field11189.size(), this.Field11187);
        this.Field11192.addAll(list2);
        this.Field11197 = field11197;
        this.Field11190 = null;
    }
    
    public Class1550 Method201(final Class359 class359) throws Class241 {
        if (this.Method220((Class1181)class359) != 13) {
            this.Field11186.trace("acceptHandshakeAsServer - Wrong websocket version.");
            return Class1550.Field15234;
        }
        Class1550 class360 = Class1550.Field15234;
        final String method180 = class359.Method180("Sec-WebSocket-Extensions");
        for (final Class1720 field11187 : this.Field11189) {
            if (field11187.Method6573(method180)) {
                this.Field11187 = field11187;
                class360 = Class1550.Field15233;
                this.Field11186.trace("acceptHandshakeAsServer - Matching extension found: {}", (Object)this.Field11187);
                break;
            }
        }
        if (this.Method3101(class359.Method180("Sec-WebSocket-Protocol")) == Class1550.Field15233 && class360 == Class1550.Field15233) {
            return Class1550.Field15233;
        }
        this.Field11186.trace("acceptHandshakeAsServer - No matching extension or protocol found.");
        return Class1550.Field15234;
    }
    
    private Class1550 Method3101(final String s) {
        for (final Class919 field11191 : this.Field11192) {
            if (field11191.Method3832(s)) {
                this.Field11191 = field11191;
                this.Field11186.trace("acceptHandshake - Matching protocol found: {}", (Object)this.Field11191);
                return Class1550.Field15233;
            }
        }
        return Class1550.Field15234;
    }
    
    public Class1550 Method200(final Class359 class359, final Class1236 class360) throws Class241 {
        if (!this.Method202((Class1181)class360)) {
            this.Field11186.trace("acceptHandshakeAsClient - Missing/wrong upgrade or connection in handshake.");
            return Class1550.Field15234;
        }
        if (!class359.Method181("Sec-WebSocket-Key") || !class360.Method181("Sec-WebSocket-Accept")) {
            this.Field11186.trace("acceptHandshakeAsClient - Missing Sec-WebSocket-Key or Sec-WebSocket-Accept");
            return Class1550.Field15234;
        }
        if (!this.Method3116(class359.Method180("Sec-WebSocket-Key")).equals(class360.Method180("Sec-WebSocket-Accept"))) {
            this.Field11186.trace("acceptHandshakeAsClient - Wrong key for Sec-WebSocket-Key.");
            return Class1550.Field15234;
        }
        Class1550 class361 = Class1550.Field15234;
        final String method180 = class360.Method180("Sec-WebSocket-Extensions");
        for (final Class1720 field11187 : this.Field11189) {
            if (field11187.Method6574(method180)) {
                this.Field11187 = field11187;
                class361 = Class1550.Field15233;
                this.Field11186.trace("acceptHandshakeAsClient - Matching extension found: {}", (Object)this.Field11187);
                break;
            }
        }
        if (this.Method3101(class360.Method180("Sec-WebSocket-Protocol")) == Class1550.Field15233 && class361 == Class1550.Field15233) {
            return Class1550.Field15233;
        }
        this.Field11186.trace("acceptHandshakeAsClient - No matching extension or protocol found.");
        return Class1550.Field15234;
    }
    
    public Class1720 Method3102() {
        return this.Field11187;
    }
    
    public List Method3103() {
        return this.Field11189;
    }
    
    public Class919 Method3104() {
        return this.Field11191;
    }
    
    public int Method3105() {
        return this.Field11197;
    }
    
    public List Method3106() {
        return this.Field11192;
    }
    
    public Class45 Method213(final Class45 class45) {
        class45.Method184("Upgrade", "websocket");
        class45.Method184("Connection", "Upgrade");
        final byte[] bytes = new byte[16];
        this.Field11196.nextBytes(bytes);
        class45.Method184("Sec-WebSocket-Key", Class636.Method2758(bytes));
        class45.Method184("Sec-WebSocket-Version", "13");
        final StringBuilder sb = new StringBuilder();
        for (final Class1720 class46 : this.Field11189) {
            if (class46.Method6576() != null && class46.Method6576().length() != 0) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(class46.Method6576());
            }
        }
        if (sb.length() != 0) {
            class45.Method184("Sec-WebSocket-Extensions", sb.toString());
        }
        final StringBuilder sb2 = new StringBuilder();
        for (final Class919 class47 : this.Field11192) {
            if (class47.Method3833().length() != 0) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(class47.Method3833());
            }
        }
        if (sb2.length() != 0) {
            class45.Method184("Sec-WebSocket-Protocol", sb2.toString());
        }
        return class45;
    }
    
    public Class1213 Method214(final Class359 class359, final Class1333 class360) throws Class241 {
        class360.Method184("Upgrade", "websocket");
        class360.Method184("Connection", class359.Method180("Connection"));
        final String method180 = class359.Method180("Sec-WebSocket-Key");
        if (method180 == null || "".equals(method180)) {
            throw new Class241("missing Sec-WebSocket-Key");
        }
        class360.Method184("Sec-WebSocket-Accept", this.Method3116(method180));
        if (this.Method3102().Method6577().length() != 0) {
            class360.Method184("Sec-WebSocket-Extensions", this.Method3102().Method6577());
        }
        if (this.Method3104() != null && this.Method3104().Method3833().length() != 0) {
            class360.Method184("Sec-WebSocket-Protocol", this.Method3104().Method3833());
        }
        class360.Method4952("Web Socket Protocol Handshake");
        class360.Method184("Server", "TooTallNate Java-WebSocket");
        class360.Method184("Date", this.Method3115());
        return (Class1213)class360;
    }
    
    public Class26 Method217() {
        final ArrayList<Class1720> list = new ArrayList<Class1720>();
        final Iterator<Class1720> iterator = this.Method3103().iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next().Method6578());
        }
        final ArrayList<Class919> list2 = new ArrayList<Class919>();
        final Iterator<Class919> iterator2 = this.Method3106().iterator();
        while (iterator2.hasNext()) {
            list2.add(iterator2.next().Method3834());
        }
        return new Class749(list, list2, this.Field11197);
    }
    
    public ByteBuffer Method203(final Class1926 class1926) {
        this.Method3102().Method6572(class1926);
        if (this.Field11186.isTraceEnabled()) {
            this.Field11186.trace("afterEnconding({}): {}", (Object)class1926.Method82().remaining(), (Object)((class1926.Method82().remaining() > 1000) ? "too big to display" : new String(class1926.Method82().array())));
        }
        return this.Method3107(class1926);
    }
    
    private ByteBuffer Method3107(final Class1926 class1926) {
        final ByteBuffer method82 = class1926.Method82();
        final boolean b = this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi == Class700.Field10968;
        final int method83 = this.Method3114(method82);
        final ByteBuffer allocate = ByteBuffer.allocate(1 + ((method83 > 1) ? (method83 + 1) : method83) + 0 + method82.remaining());
        byte b2 = (byte)((byte)(class1926.Method76() ? -128 : 0) | this.Method3118(class1926.Method81()));
        if (class1926.Method77()) {
            b2 |= this.Method3112(1);
        }
        if (class1926.Method78()) {
            b2 |= this.Method3112(2);
        }
        if (class1926.Method79()) {
            b2 |= this.Method3112(3);
        }
        allocate.put(b2);
        final byte[] method84 = this.Method3117(method82.remaining(), method83);
        if (!Class749.Field11198 && method84.length != method83) {
            throw new AssertionError();
        }
        if (method83 == 1) {
            allocate.put((byte)(method84[0] | this.Method3113(b)));
        }
        else if (method83 == 2) {
            allocate.put((byte)(0x7E | this.Method3113(b)));
            allocate.put(method84);
        }
        else {
            if (method83 != 8) {
                throw new IllegalStateException("Size representation not supported/specified");
            }
            allocate.put((byte)(0x7F | this.Method3113(b)));
            allocate.put(method84);
        }
        allocate.put(method82);
        method82.flip();
        if (!Class749.Field11198 && allocate.remaining() != 0) {
            throw new AssertionError(allocate.remaining());
        }
        allocate.flip();
        return allocate;
    }
    
    private Class1926 Method3108(final ByteBuffer byteBuffer) throws Class528, Class902 {
        if (byteBuffer == null) {
            throw new IllegalArgumentException();
        }
        final int remaining = byteBuffer.remaining();
        int method6263 = 2;
        this.Method3111(remaining, method6263);
        final byte value = byteBuffer.get();
        final boolean b = value >> 8 != 0;
        final boolean b2 = (value & 0x40) != 0x0;
        final boolean b3 = (value & 0x20) != 0x0;
        final boolean b4 = (value & 0x10) != 0x0;
        final byte value2 = byteBuffer.get();
        final boolean b5 = (value2 & 0xFFFFFF80) != 0x0;
        int method6264 = (byte)(value2 & 0x7F);
        final Class1753 method6265 = this.Method3119((byte)(value & 0xF));
        if (method6264 < 0 || method6264 > 125) {
            final Class1602 method6266 = this.Method3109(byteBuffer, method6265, method6264, remaining, method6263);
            method6264 = Class1602.Method6262(method6266);
            method6263 = Class1602.Method6263(method6266);
        }
        this.Method3110(method6264);
        this.Method3111(remaining, method6263 + 0 + method6264);
        final ByteBuffer allocate = ByteBuffer.allocate(this.Method219(method6264));
        allocate.put(byteBuffer.array(), byteBuffer.position(), allocate.limit());
        byteBuffer.position(byteBuffer.position() + allocate.limit());
        final Class1327 method6267 = Class1327.Method91(method6265);
        method6267.Method86(b);
        method6267.Method87(b2);
        method6267.Method88(b3);
        method6267.Method89(b4);
        allocate.flip();
        method6267.Method85(allocate);
        if (method6267.Method81() != Class1753.Field16033) {
            if (method6267.Method77() || method6267.Method78() || method6267.Method79()) {
                this.Field11190 = this.Method3102();
            }
            else {
                this.Field11190 = this.Field11188;
            }
        }
        if (this.Field11190 == null) {
            this.Field11190 = this.Field11188;
        }
        this.Field11190.Method6575((Class1926)method6267);
        this.Field11190.Method6571((Class1926)method6267);
        if (this.Field11186.isTraceEnabled()) {
            this.Field11186.trace("afterDecoding({}): {}", (Object)method6267.Method82().remaining(), (Object)((method6267.Method82().remaining() > 1000) ? "too big to display" : new String(method6267.Method82().array())));
        }
        method6267.Method84();
        return (Class1926)method6267;
    }
    
    private Class1602 Method3109(final ByteBuffer byteBuffer, final Class1753 class1753, final int n, final int n2, final int n3) throws Class939, Class528, Class53 {
        int n4 = n3;
        if (class1753 == Class1753.Field16036 || class1753 == Class1753.Field16037 || class1753 == Class1753.Field16038) {
            this.Field11186.trace("Invalid frame: more than 125 octets");
            throw new Class939("more than 125 octets");
        }
        if (n == 126) {
            n4 += 2;
            this.Method3111(n2, n4);
            return new Class1602(this, new BigInteger(new byte[] { 0, byteBuffer.get(), byteBuffer.get() }).intValue(), n4);
        }
        n4 += 8;
        this.Method3111(n2, n4);
        final byte[] array = new byte[8];
        int n5 = 0;
        while (true) {
            array[n5] = byteBuffer.get();
            ++n5;
        }
    }
    
    private void Method3110(final long l) throws Class53 {
        if (l > 2147483647L) {
            this.Field11186.trace("Limit exedeed: Payloadsize is to big...");
            throw new Class53("Payloadsize is to big...");
        }
        if (l > this.Field11197) {
            this.Field11186.trace("Payload limit reached. Allowed: {} Current: {}", (Object)this.Field11197, (Object)l);
            throw new Class53("Payload limit reached.", this.Field11197);
        }
        if (l < 0L) {
            this.Field11186.trace("Limit underflow: Payloadsize is to little...");
            throw new Class53("Payloadsize is to little...");
        }
    }
    
    private void Method3111(final int n, final int n2) throws Class528 {
        if (n < n2) {
            this.Field11186.trace("Incomplete frame: maxpacketsize < realpacketsize");
            throw new Class528(n2);
        }
    }
    
    private byte Method3112(final int n) {
        switch (n) {
            case 1: {
                return 64;
            }
            case 2: {
                return 32;
            }
            case 3: {
                return 16;
            }
            default: {
                return 0;
            }
        }
    }
    
    private byte Method3113(final boolean b) {
        return (byte)(b ? -128 : 0);
    }
    
    private int Method3114(final ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() <= 125) {
            return 1;
        }
        if (byteBuffer.remaining() <= 65535) {
            return 2;
        }
        return 8;
    }
    
    public List Method215(final ByteBuffer byteBuffer) throws Class902 {
        final LinkedList<Class1926> list = new LinkedList<Class1926>();
        if (this.Field11195 != null) {
            byteBuffer.mark();
            final int remaining = byteBuffer.remaining();
            final int remaining2 = this.Field11195.remaining();
            if (remaining2 > remaining) {
                this.Field11195.put(byteBuffer.array(), byteBuffer.position(), remaining);
                byteBuffer.position(byteBuffer.position() + remaining);
                return Collections.emptyList();
            }
            this.Field11195.put(byteBuffer.array(), byteBuffer.position(), remaining2);
            byteBuffer.position(byteBuffer.position() + remaining2);
            list.add(this.Method3108((ByteBuffer)this.Field11195.duplicate().position(0)));
            this.Field11195 = null;
        }
        while (byteBuffer.hasRemaining()) {
            byteBuffer.mark();
            list.add(this.Method3108(byteBuffer));
        }
        return list;
    }
    
    public List Method204(final ByteBuffer byteBuffer, final boolean b) {
        final Class1864 o = new Class1864();
        o.Method85(byteBuffer);
        o.Method90(b);
        o.Method84();
        return Collections.singletonList(o);
    }
    
    public List Method205(final String s, final boolean b) {
        final Class213 o = new Class213();
        o.Method85(ByteBuffer.wrap(Class1105.Method4525(s)));
        o.Method90(b);
        o.Method84();
        return Collections.singletonList(o);
    }
    
    public void Method208() {
        this.Field11195 = null;
        if (this.Field11187 != null) {
            this.Field11187.Method6579();
        }
        this.Field11187 = (Class1720)new Class1726();
        this.Field11191 = null;
    }
    
    private String Method3115() {
        final Calendar instance = Calendar.getInstance();
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat.format(instance.getTime());
    }
    
    private String Method3116(final String s) {
        return Class636.Method2758(MessageDigest.getInstance("SHA1").digest((s.trim() + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").getBytes()));
    }
    
    private byte[] Method3117(final long n, final int n2) {
        final byte[] array = new byte[n2];
        final int n3 = 8 * n2 - 8;
        for (int i = 0; i < n2; ++i) {
            array[i] = (byte)(n >>> n3 - 8 * i);
        }
        return array;
    }
    
    private byte Method3118(final Class1753 class1753) {
        if (class1753 == Class1753.Field16033) {
            return 0;
        }
        if (class1753 == Class1753.Field16034) {
            return 1;
        }
        if (class1753 == Class1753.Field16035) {
            return 2;
        }
        if (class1753 == Class1753.Field16038) {
            return 8;
        }
        if (class1753 == Class1753.Field16036) {
            return 9;
        }
        if (class1753 == Class1753.Field16037) {
            return 10;
        }
        throw new IllegalArgumentException("Don't know how to handle " + class1753.toString());
    }
    
    private Class1753 Method3119(final byte b) throws Class939 {
        switch (b) {
            case 0: {
                return Class1753.Field16033;
            }
            case 1: {
                return Class1753.Field16034;
            }
            case 2: {
                return Class1753.Field16035;
            }
            case 8: {
                return Class1753.Field16038;
            }
            case 9: {
                return Class1753.Field16036;
            }
            case 10: {
                return Class1753.Field16037;
            }
            default: {
                throw new Class939("Unknown opcode " + b);
            }
        }
    }
    
    public void Method206(final Class1282 class1282, final Class1926 class1283) throws Class902 {
        final Class1753 method81 = class1283.Method81();
        if (method81 == Class1753.Field16038) {
            this.Method3126(class1282, class1283);
        }
        else if (method81 == Class1753.Field16036) {
            class1282.Method5216().Method2669((Class1966)class1282, class1283);
        }
        else if (method81 == Class1753.Field16037) {
            class1282.Method5215();
            class1282.Method5216().Method2671((Class1966)class1282, class1283);
        }
        else if (!class1283.Method76() || method81 == Class1753.Field16033) {
            this.Method3120(class1282, class1283, method81);
        }
        else {
            if (this.Field11193 != null) {
                this.Field11186.error("Protocol error: Continuous frame sequence not completed.");
                throw new Class902(1002, "Continuous frame sequence not completed.");
            }
            if (method81 == Class1753.Field16034) {
                this.Method3123(class1282, class1283);
            }
            else {
                if (method81 != Class1753.Field16035) {
                    this.Field11186.error("non control or continious frame expected");
                    throw new Class902(1002, "non control or continious frame expected");
                }
                this.Method3121(class1282, class1283);
            }
        }
    }
    
    private void Method3120(final Class1282 class1282, final Class1926 class1283, final Class1753 class1284) throws Class902 {
        if (class1284 != Class1753.Field16033) {
            this.Method3125(class1283);
        }
        else if (class1283.Method76()) {
            this.Method3124(class1282, class1283);
        }
        else if (this.Field11193 == null) {
            this.Field11186.error("Protocol error: Continuous frame sequence was not started.");
            throw new Class902(1002, "Continuous frame sequence was not started.");
        }
        if (class1284 == Class1753.Field16034 && !Class1105.Method4532(class1283.Method82())) {
            this.Field11186.error("Protocol error: Payload is not UTF8");
            throw new Class902(1007);
        }
        if (class1284 == Class1753.Field16033 && this.Field11193 != null) {
            this.Method3128(class1283.Method82());
        }
    }
    
    private void Method3121(final Class1282 class1282, final Class1926 class1283) {
        class1282.Method5216().Method2663((Class1966)class1282, class1283.Method82());
    }
    
    private void Method3122(final Class1282 class1282, final RuntimeException ex) {
        this.Field11186.error("Runtime exception during onWebsocketMessage", (Throwable)ex);
        class1282.Method5216().Method2668((Class1966)class1282, ex);
    }
    
    private void Method3123(final Class1282 class1282, final Class1926 class1283) throws Class902 {
        class1282.Method5216().Method2662((Class1966)class1282, Class1105.Method4530(class1283.Method82()));
    }
    
    private void Method3124(final Class1282 class1282, final Class1926 class1283) throws Class902 {
        if (this.Field11193 == null) {
            this.Field11186.trace("Protocol error: Previous continuous frame sequence not completed.");
            throw new Class902(1002, "Continuous frame sequence was not started.");
        }
        this.Method3128(class1283.Method82());
        this.Method3129();
        if (this.Field11193.Method81() == Class1753.Field16034) {
            ((Class1327)this.Field11193).Method85(this.Method3130());
            ((Class1327)this.Field11193).Method84();
            class1282.Method5216().Method2662((Class1966)class1282, Class1105.Method4530(this.Field11193.Method82()));
        }
        else if (this.Field11193.Method81() == Class1753.Field16035) {
            ((Class1327)this.Field11193).Method85(this.Method3130());
            ((Class1327)this.Field11193).Method84();
            class1282.Method5216().Method2663((Class1966)class1282, this.Field11193.Method82());
        }
        this.Field11193 = null;
        this.Method3127();
    }
    
    private void Method3125(final Class1926 field11193) throws Class902 {
        if (this.Field11193 != null) {
            this.Field11186.trace("Protocol error: Previous continuous frame sequence not completed.");
            throw new Class902(1002, "Previous continuous frame sequence not completed.");
        }
        this.Field11193 = field11193;
        this.Method3128(field11193.Method82());
        this.Method3129();
    }
    
    private void Method3126(final Class1282 class1282, final Class1926 class1283) {
        int method95 = 1005;
        String method96 = "";
        if (class1283 instanceof Class7) {
            final Class7 class1284 = (Class7)class1283;
            method95 = class1284.Method95();
            method96 = class1284.Method96();
        }
        if (class1282.Method3337() == Class866.Field11647) {
            class1282.Method5201(method95, method96, true);
        }
        else if (this.Method216() == Class1159.Field13230) {
            class1282.Method5200(method95, method96, true);
        }
        else {
            class1282.Method5204(method95, method96, false);
        }
    }
    
    private void Method3127() {
        final List field11194 = this.Field11194;
        this.Field11194.clear();
    }
    
    private void Method3128(final ByteBuffer byteBuffer) {
        final List field11194 = this.Field11194;
        this.Field11194.add(byteBuffer);
    }
    
    private void Method3129() throws Class53 {
        final long method3131 = this.Method3131();
        if (method3131 > this.Field11197) {
            this.Method3127();
            this.Field11186.trace("Payload limit reached. Allowed: {} Current: {}", (Object)this.Field11197, (Object)method3131);
            throw new Class53(this.Field11197);
        }
    }
    
    public Class1159 Method216() {
        return Class1159.Field13230;
    }
    
    public String toString() {
        String str = super.toString();
        if (this.Method3102() != null) {
            str = str + " extension: " + this.Method3102().toString();
        }
        if (this.Method3104() != null) {
            str = str + " protocol: " + this.Method3104().toString();
        }
        return str + " max frame size: " + this.Field11197;
    }
    
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final Class749 class749 = (Class749)o;
        if (this.Field11197 != class749.Method3105()) {
            return false;
        }
        if (this.Field11187 != null) {
            if (this.Field11187.equals(class749.Method3102())) {
                return (this.Field11191 != null) ? this.Field11191.equals(class749.Method3104()) : (class749.Method3104() == null);
            }
        }
        else if (class749.Method3102() == null) {
            return (this.Field11191 != null) ? this.Field11191.equals(class749.Method3104()) : (class749.Method3104() == null);
        }
        return false;
    }
    
    public int hashCode() {
        return 31 * (31 * ((this.Field11187 != null) ? this.Field11187.hashCode() : 0) + ((this.Field11191 != null) ? this.Field11191.hashCode() : 0)) + (this.Field11197 ^ this.Field11197 >>> 32);
    }
    
    private ByteBuffer Method3130() throws Class53 {
        long n = 0L;
        final List field11194 = this.Field11194;
        final Iterator<ByteBuffer> iterator = this.Field11194.iterator();
        while (iterator.hasNext()) {
            n += iterator.next().limit();
        }
        this.Method3129();
        final ByteBuffer allocate = ByteBuffer.allocate((int)n);
        final Iterator<ByteBuffer> iterator2 = this.Field11194.iterator();
        while (iterator2.hasNext()) {
            allocate.put(iterator2.next());
        }
        allocate.flip();
        return allocate;
    }
    
    private long Method3131() {
        long n = 0L;
        final List field11194 = this.Field11194;
        final Iterator<ByteBuffer> iterator = this.Field11194.iterator();
        while (iterator.hasNext()) {
            n += iterator.next().limit();
        }
        return n;
    }
    
    static {
        Field11185 = "Connection";
        Field11184 = "Upgrade";
        Field11183 = "Sec-WebSocket-Accept";
        Field11182 = "Sec-WebSocket-Extensions";
        Field11181 = "Sec-WebSocket-Protocol";
        Field11180 = "Sec-WebSocket-Key";
        Field11198 = !Class749.class.desiredAssertionStatus();
    }
    
    private static String Method223(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5C59 ^ 0x5F));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
