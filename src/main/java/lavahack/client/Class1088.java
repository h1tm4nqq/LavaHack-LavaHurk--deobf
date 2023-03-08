//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.nio.*;
import org.apache.logging.log4j.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.security.*;

public class Class1088 extends Class2129
{
    private static final String Field12858;
    private static final String Field12859;
    private static final String Field12860;
    private static final String Field12861;
    private static final String Field12862;
    private static final String Field12863;
    private final Logger Field12864;
    private Class899 Field12865;
    private Class899 Field12866;
    private List Field12867;
    private Class899 Field12868;
    private Class1234 Field12869;
    private List Field12870;
    private Class1260 Field12871;
    private final List Field12872;
    private ByteBuffer Field12873;
    private final SecureRandom Field12874;
    private int Field12875;
    static final boolean Field12876;
    private String Field12877 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1088() {
        this(Collections.emptyList());
    }
    
    public Class1088(final Class899 o) {
        this(Collections.singletonList(o));
    }
    
    public Class1088(final List list) {
        this(list, Collections.singletonList(new Class189("")));
    }
    
    public Class1088(final List list, final List list2) {
        this(list, list2, Integer.MAX_VALUE);
    }
    
    public Class1088(final List list, final int n) {
        this(list, Collections.singletonList(new Class189("")), n);
    }
    
    public Class1088(final List list, final List list2, final int field12875) {
        this.Field12864 = LogManager.getLogger((Class)Class1088.class);
        this.Field12865 = new Class1357();
        this.Field12866 = new Class1357();
        this.Field12874 = new SecureRandom();
        if (list == null || list2 == null || field12875 < 1) {
            throw new IllegalArgumentException();
        }
        this.Field12867 = new ArrayList(list.size());
        this.Field12870 = new ArrayList(list2.size());
        this.Field12872 = new ArrayList();
        final Iterator<Class899> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getClass().equals(Class1357.class)) {
                continue;
            }
        }
        this.Field12867.addAll(list);
        this.Field12867.add(this.Field12867.size(), this.Field12865);
        this.Field12870.addAll(list2);
        this.Field12875 = field12875;
        this.Field12868 = null;
    }
    
    @Override
    public Class1597 Method4398(final Class481 class481) throws Class71 {
        if (this.Method4417(class481) != 13) {
            this.Field12864.trace("acceptHandshakeAsServer - Wrong websocket version.");
            return Class1597.Field15475;
        }
        Class1597 class482 = Class1597.Field15475;
        final String method2 = class481.Method2("Sec-WebSocket-Extensions");
        for (final Class899 field12865 : this.Field12867) {
            if (field12865.Method2868(method2)) {
                this.Field12865 = field12865;
                class482 = Class1597.Field15474;
                this.Field12864.trace("acceptHandshakeAsServer - Matching extension found: {}", (Object)this.Field12865);
                break;
            }
        }
        if (this.Method4421(class481.Method2("Sec-WebSocket-Protocol")) == Class1597.Field15474 && class482 == Class1597.Field15474) {
            return Class1597.Field15474;
        }
        this.Field12864.trace("acceptHandshakeAsServer - No matching extension or protocol found.");
        return Class1597.Field15475;
    }
    
    private Class1597 Method4421(final String s) {
        for (final Class1234 field12869 : this.Field12870) {
            if (field12869.Method1144(s)) {
                this.Field12869 = field12869;
                this.Field12864.trace("acceptHandshake - Matching protocol found: {}", (Object)this.Field12869);
                return Class1597.Field15474;
            }
        }
        return Class1597.Field15475;
    }
    
    @Override
    public Class1597 Method4397(final Class481 class481, final Class482 class482) throws Class71 {
        if (!this.Method4399(class482)) {
            this.Field12864.trace("acceptHandshakeAsClient - Missing/wrong upgrade or connection in handshake.");
            return Class1597.Field15475;
        }
        if (!class481.Method3("Sec-WebSocket-Key") || !class482.Method3("Sec-WebSocket-Accept")) {
            this.Field12864.trace("acceptHandshakeAsClient - Missing Sec-WebSocket-Key or Sec-WebSocket-Accept");
            return Class1597.Field15475;
        }
        if (!this.Method4436(class481.Method2("Sec-WebSocket-Key")).equals(class482.Method2("Sec-WebSocket-Accept"))) {
            this.Field12864.trace("acceptHandshakeAsClient - Wrong key for Sec-WebSocket-Key.");
            return Class1597.Field15475;
        }
        Class1597 class483 = Class1597.Field15475;
        final String method2 = class482.Method2("Sec-WebSocket-Extensions");
        for (final Class899 field12865 : this.Field12867) {
            if (field12865.Method2869(method2)) {
                this.Field12865 = field12865;
                class483 = Class1597.Field15474;
                this.Field12864.trace("acceptHandshakeAsClient - Matching extension found: {}", (Object)this.Field12865);
                break;
            }
        }
        if (this.Method4421(class482.Method2("Sec-WebSocket-Protocol")) == Class1597.Field15474 && class483 == Class1597.Field15474) {
            return Class1597.Field15474;
        }
        this.Field12864.trace("acceptHandshakeAsClient - No matching extension or protocol found.");
        return Class1597.Field15475;
    }
    
    public Class899 Method4422() {
        return this.Field12865;
    }
    
    public List Method4423() {
        return this.Field12867;
    }
    
    public Class1234 Method4424() {
        return this.Field12869;
    }
    
    public int Method4425() {
        return this.Field12875;
    }
    
    public List Method4426() {
        return this.Field12870;
    }
    
    @Override
    public Class1892 Method4410(final Class1892 class1892) {
        class1892.Method6("Upgrade", "websocket");
        class1892.Method6("Connection", "Upgrade");
        final byte[] bytes = new byte[16];
        this.Field12874.nextBytes(bytes);
        class1892.Method6("Sec-WebSocket-Key", Class705.Method2937(bytes));
        class1892.Method6("Sec-WebSocket-Version", "13");
        final StringBuilder sb = new StringBuilder();
        for (final Class899 class1893 : this.Field12867) {
            if (class1893.Method2871() != null && class1893.Method2871().length() != 0) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(class1893.Method2871());
            }
        }
        if (sb.length() != 0) {
            class1892.Method6("Sec-WebSocket-Extensions", sb.toString());
        }
        final StringBuilder sb2 = new StringBuilder();
        for (final Class1234 class1894 : this.Field12870) {
            if (class1894.Method1145().length() != 0) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(class1894.Method1145());
            }
        }
        if (sb2.length() != 0) {
            class1892.Method6("Sec-WebSocket-Protocol", sb2.toString());
        }
        return class1892;
    }
    
    @Override
    public Class172 Method4411(final Class481 class481, final Class1692 class482) throws Class71 {
        class482.Method6("Upgrade", "websocket");
        class482.Method6("Connection", class481.Method2("Connection"));
        final String method2 = class481.Method2("Sec-WebSocket-Key");
        if (method2 == null || "".equals(method2)) {
            throw new Class71("missing Sec-WebSocket-Key");
        }
        class482.Method6("Sec-WebSocket-Accept", this.Method4436(method2));
        if (this.Method4422().Method2872().length() != 0) {
            class482.Method6("Sec-WebSocket-Extensions", this.Method4422().Method2872());
        }
        if (this.Method4424() != null && this.Method4424().Method1145().length() != 0) {
            class482.Method6("Sec-WebSocket-Protocol", this.Method4424().Method1145());
        }
        class482.Method5672("Web Socket Protocol Handshake");
        class482.Method6("Server", "TooTallNate Java-WebSocket");
        class482.Method6("Date", this.Method4435());
        return class482;
    }
    
    @Override
    public Class2129 Method4414() {
        final ArrayList<Class899> list = new ArrayList<Class899>();
        final Iterator<Class899> iterator = this.Method4423().iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next().Method2873());
        }
        final ArrayList<Class1234> list2 = new ArrayList<Class1234>();
        final Iterator<Class1234> iterator2 = this.Method4426().iterator();
        while (iterator2.hasNext()) {
            list2.add(iterator2.next().Method1146());
        }
        return new Class1088(list, list2, this.Field12875);
    }
    
    @Override
    public ByteBuffer Method4400(final Class1260 class1260) {
        this.Method4422().Method2867(class1260);
        if (this.Field12864.isTraceEnabled()) {
            this.Field12864.trace("afterEnconding({}): {}", (Object)class1260.Method1618().remaining(), (Object)((class1260.Method1618().remaining() > 1000) ? "too big to display" : new String(class1260.Method1618().array())));
        }
        return this.Method4427(class1260);
    }
    
    private ByteBuffer Method4427(final Class1260 class1260) {
        final ByteBuffer method1618 = class1260.Method1618();
        final boolean b = this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi == Class803.Field11414;
        final int method1619 = this.Method4434(method1618);
        final ByteBuffer allocate = ByteBuffer.allocate(1 + ((method1619 > 1) ? (method1619 + 1) : method1619) + 0 + method1618.remaining());
        byte b2 = (byte)((byte)(class1260.Method1612() ? -128 : 0) | this.Method4438(class1260.Method1617()));
        if (class1260.Method1613()) {
            b2 |= this.Method4432(1);
        }
        if (class1260.Method1614()) {
            b2 |= this.Method4432(2);
        }
        if (class1260.Method1615()) {
            b2 |= this.Method4432(3);
        }
        allocate.put(b2);
        final byte[] method1620 = this.Method4437(method1618.remaining(), method1619);
        if (!Class1088.Field12876 && method1620.length != method1619) {
            throw new AssertionError();
        }
        if (method1619 == 1) {
            allocate.put((byte)(method1620[0] | this.Method4433(b)));
        }
        else if (method1619 == 2) {
            allocate.put((byte)(0x7E | this.Method4433(b)));
            allocate.put(method1620);
        }
        else {
            if (method1619 != 8) {
                throw new IllegalStateException("Size representation not supported/specified");
            }
            allocate.put((byte)(0x7F | this.Method4433(b)));
            allocate.put(method1620);
        }
        allocate.put(method1618);
        method1618.flip();
        if (!Class1088.Field12876 && allocate.remaining() != 0) {
            throw new AssertionError(allocate.remaining());
        }
        allocate.flip();
        return allocate;
    }
    
    private Class1260 Method4428(final ByteBuffer byteBuffer) throws Class1165, Class23 {
        if (byteBuffer == null) {
            throw new IllegalArgumentException();
        }
        final int remaining = byteBuffer.remaining();
        int method1817 = 2;
        this.Method4431(remaining, method1817);
        final byte value = byteBuffer.get();
        final boolean b = value >> 8 != 0;
        final boolean b2 = (value & 0x40) != 0x0;
        final boolean b3 = (value & 0x20) != 0x0;
        final boolean b4 = (value & 0x10) != 0x0;
        final byte value2 = byteBuffer.get();
        final boolean b5 = (value2 & 0xFFFFFF80) != 0x0;
        int method1818 = (byte)(value2 & 0x7F);
        final Class927 method1819 = this.Method4439((byte)(value & 0xF));
        if (method1818 < 0 || method1818 > 125) {
            final Class363 method1820 = this.Method4429(byteBuffer, method1819, method1818, remaining, method1817);
            method1818 = Class363.Method1816(method1820);
            method1817 = Class363.Method1817(method1820);
        }
        this.Method4430(method1818);
        this.Method4431(remaining, method1817 + 0 + method1818);
        final ByteBuffer allocate = ByteBuffer.allocate(this.Method4416(method1818));
        allocate.put(byteBuffer.array(), byteBuffer.position(), allocate.limit());
        byteBuffer.position(byteBuffer.position() + allocate.limit());
        final Class494 method1821 = Class494.Method1627(method1819);
        method1821.Method1622(b);
        method1821.Method1623(b2);
        method1821.Method1624(b3);
        method1821.Method1625(b4);
        allocate.flip();
        method1821.Method1621(allocate);
        if (method1821.Method1617() != Class927.Field11926) {
            if (method1821.Method1613() || method1821.Method1614() || method1821.Method1615()) {
                this.Field12868 = this.Method4422();
            }
            else {
                this.Field12868 = this.Field12866;
            }
        }
        if (this.Field12868 == null) {
            this.Field12868 = this.Field12866;
        }
        this.Field12868.Method2870(method1821);
        this.Field12868.Method2866(method1821);
        if (this.Field12864.isTraceEnabled()) {
            this.Field12864.trace("afterDecoding({}): {}", (Object)method1821.Method1618().remaining(), (Object)((method1821.Method1618().remaining() > 1000) ? "too big to display" : new String(method1821.Method1618().array())));
        }
        method1821.Method1620();
        return method1821;
    }
    
    private Class363 Method4429(final ByteBuffer byteBuffer, final Class927 class927, final int n, final int n2, final int n3) throws Class475, Class1165, Class531 {
        int n4 = n3;
        if (class927 == Class927.Field11929 || class927 == Class927.Field11930 || class927 == Class927.Field11931) {
            this.Field12864.trace("Invalid frame: more than 125 octets");
            throw new Class475("more than 125 octets");
        }
        if (n == 126) {
            n4 += 2;
            this.Method4431(n2, n4);
            return new Class363(this, new BigInteger(new byte[] { 0, byteBuffer.get(), byteBuffer.get() }).intValue(), n4);
        }
        n4 += 8;
        this.Method4431(n2, n4);
        final byte[] array = new byte[8];
        int n5 = 0;
        while (true) {
            array[n5] = byteBuffer.get();
            ++n5;
        }
    }
    
    private void Method4430(final long l) throws Class531 {
        if (l > 2147483647L) {
            this.Field12864.trace("Limit exedeed: Payloadsize is to big...");
            throw new Class531("Payloadsize is to big...");
        }
        if (l > this.Field12875) {
            this.Field12864.trace("Payload limit reached. Allowed: {} Current: {}", (Object)this.Field12875, (Object)l);
            throw new Class531("Payload limit reached.", this.Field12875);
        }
        if (l < 0L) {
            this.Field12864.trace("Limit underflow: Payloadsize is to little...");
            throw new Class531("Payloadsize is to little...");
        }
    }
    
    private void Method4431(final int n, final int n2) throws Class1165 {
        if (n < n2) {
            this.Field12864.trace("Incomplete frame: maxpacketsize < realpacketsize");
            throw new Class1165(n2);
        }
    }
    
    private byte Method4432(final int n) {
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
    
    private byte Method4433(final boolean b) {
        return (byte)(b ? -128 : 0);
    }
    
    private int Method4434(final ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() <= 125) {
            return 1;
        }
        if (byteBuffer.remaining() <= 65535) {
            return 2;
        }
        return 8;
    }
    
    @Override
    public List Method4412(final ByteBuffer byteBuffer) throws Class23 {
        final LinkedList<Class1260> list = new LinkedList<Class1260>();
        if (this.Field12873 != null) {
            byteBuffer.mark();
            final int remaining = byteBuffer.remaining();
            final int remaining2 = this.Field12873.remaining();
            if (remaining2 > remaining) {
                this.Field12873.put(byteBuffer.array(), byteBuffer.position(), remaining);
                byteBuffer.position(byteBuffer.position() + remaining);
                return Collections.emptyList();
            }
            this.Field12873.put(byteBuffer.array(), byteBuffer.position(), remaining2);
            byteBuffer.position(byteBuffer.position() + remaining2);
            list.add(this.Method4428((ByteBuffer)this.Field12873.duplicate().position(0)));
            this.Field12873 = null;
        }
        while (byteBuffer.hasRemaining()) {
            byteBuffer.mark();
            list.add(this.Method4428(byteBuffer));
        }
        return list;
    }
    
    @Override
    public List Method4401(final ByteBuffer byteBuffer, final boolean b) {
        final Class1275 o = new Class1275();
        o.Method1621(byteBuffer);
        o.Method1626(b);
        o.Method1620();
        return Collections.singletonList(o);
    }
    
    @Override
    public List Method4402(final String s, final boolean b) {
        final Class370 o = new Class370();
        o.Method1621(ByteBuffer.wrap(Class176.Method1094(s)));
        o.Method1626(b);
        o.Method1620();
        return Collections.singletonList(o);
    }
    
    @Override
    public void Method4405() {
        this.Field12873 = null;
        if (this.Field12865 != null) {
            this.Field12865.Method2874();
        }
        this.Field12865 = new Class1357();
        this.Field12869 = null;
    }
    
    private String Method4435() {
        final Calendar instance = Calendar.getInstance();
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat.format(instance.getTime());
    }
    
    private String Method4436(final String s) {
        return Class705.Method2937(MessageDigest.getInstance("SHA1").digest((s.trim() + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").getBytes()));
    }
    
    private byte[] Method4437(final long n, final int n2) {
        final byte[] array = new byte[n2];
        final int n3 = 8 * n2 - 8;
        for (int i = 0; i < n2; ++i) {
            array[i] = (byte)(n >>> n3 - 8 * i);
        }
        return array;
    }
    
    private byte Method4438(final Class927 class927) {
        if (class927 == Class927.Field11926) {
            return 0;
        }
        if (class927 == Class927.Field11927) {
            return 1;
        }
        if (class927 == Class927.Field11928) {
            return 2;
        }
        if (class927 == Class927.Field11931) {
            return 8;
        }
        if (class927 == Class927.Field11929) {
            return 9;
        }
        if (class927 == Class927.Field11930) {
            return 10;
        }
        throw new IllegalArgumentException("Don't know how to handle " + class927.toString());
    }
    
    private Class927 Method4439(final byte b) throws Class475 {
        switch (b) {
            case 0: {
                return Class927.Field11926;
            }
            case 1: {
                return Class927.Field11927;
            }
            case 2: {
                return Class927.Field11928;
            }
            case 8: {
                return Class927.Field11931;
            }
            case 9: {
                return Class927.Field11929;
            }
            case 10: {
                return Class927.Field11930;
            }
            default: {
                throw new Class475("Unknown opcode " + b);
            }
        }
    }
    
    @Override
    public void Method4403(final Class1302 class1302, final Class1260 class1303) throws Class23 {
        final Class927 method1617 = class1303.Method1617();
        if (method1617 == Class927.Field11931) {
            this.Method4446(class1302, class1303);
        }
        else if (method1617 == Class927.Field11929) {
            class1302.Method5294().Method515(class1302, class1303);
        }
        else if (method1617 == Class927.Field11930) {
            class1302.Method5293();
            class1302.Method5294().Method517(class1302, class1303);
        }
        else if (!class1303.Method1612() || method1617 == Class927.Field11926) {
            this.Method4440(class1302, class1303, method1617);
        }
        else {
            if (this.Field12871 != null) {
                this.Field12864.error("Protocol error: Continuous frame sequence not completed.");
                throw new Class23(1002, "Continuous frame sequence not completed.");
            }
            if (method1617 == Class927.Field11927) {
                this.Method4443(class1302, class1303);
            }
            else {
                if (method1617 != Class927.Field11928) {
                    this.Field12864.error("non control or continious frame expected");
                    throw new Class23(1002, "non control or continious frame expected");
                }
                this.Method4441(class1302, class1303);
            }
        }
    }
    
    private void Method4440(final Class1302 class1302, final Class1260 class1303, final Class927 class1304) throws Class23 {
        if (class1304 != Class927.Field11926) {
            this.Method4445(class1303);
        }
        else if (class1303.Method1612()) {
            this.Method4444(class1302, class1303);
        }
        else if (this.Field12871 == null) {
            this.Field12864.error("Protocol error: Continuous frame sequence was not started.");
            throw new Class23(1002, "Continuous frame sequence was not started.");
        }
        if (class1304 == Class927.Field11927 && !Class176.Method1101(class1303.Method1618())) {
            this.Field12864.error("Protocol error: Payload is not UTF8");
            throw new Class23(1007);
        }
        if (class1304 == Class927.Field11926 && this.Field12871 != null) {
            this.Method4448(class1303.Method1618());
        }
    }
    
    private void Method4441(final Class1302 class1302, final Class1260 class1303) {
        class1302.Method5294().Method509(class1302, class1303.Method1618());
    }
    
    private void Method4442(final Class1302 class1302, final RuntimeException ex) {
        this.Field12864.error("Runtime exception during onWebsocketMessage", (Throwable)ex);
        class1302.Method5294().Method514(class1302, ex);
    }
    
    private void Method4443(final Class1302 class1302, final Class1260 class1303) throws Class23 {
        class1302.Method5294().Method508(class1302, Class176.Method1099(class1303.Method1618()));
    }
    
    private void Method4444(final Class1302 class1302, final Class1260 class1303) throws Class23 {
        if (this.Field12871 == null) {
            this.Field12864.trace("Protocol error: Previous continuous frame sequence not completed.");
            throw new Class23(1002, "Continuous frame sequence was not started.");
        }
        this.Method4448(class1303.Method1618());
        this.Method4449();
        if (this.Field12871.Method1617() == Class927.Field11927) {
            ((Class494)this.Field12871).Method1621(this.Method4450());
            ((Class494)this.Field12871).Method1620();
            class1302.Method5294().Method508(class1302, Class176.Method1099(this.Field12871.Method1618()));
        }
        else if (this.Field12871.Method1617() == Class927.Field11928) {
            ((Class494)this.Field12871).Method1621(this.Method4450());
            ((Class494)this.Field12871).Method1620();
            class1302.Method5294().Method509(class1302, this.Field12871.Method1618());
        }
        this.Field12871 = null;
        this.Method4447();
    }
    
    private void Method4445(final Class1260 field12871) throws Class23 {
        if (this.Field12871 != null) {
            this.Field12864.trace("Protocol error: Previous continuous frame sequence not completed.");
            throw new Class23(1002, "Previous continuous frame sequence not completed.");
        }
        this.Field12871 = field12871;
        this.Method4448(field12871.Method1618());
        this.Method4449();
    }
    
    private void Method4446(final Class1302 class1302, final Class1260 class1303) {
        int method3964 = 1005;
        String method3965 = "";
        if (class1303 instanceof Class966) {
            final Class966 class1304 = (Class966)class1303;
            method3964 = class1304.Method3964();
            method3965 = class1304.Method3965();
        }
        if (class1302.Method556() == Class1609.Field15511) {
            class1302.Method5279(method3964, method3965, true);
        }
        else if (this.Method4413() == Class673.Field10861) {
            class1302.Method5278(method3964, method3965, true);
        }
        else {
            class1302.Method5282(method3964, method3965, false);
        }
    }
    
    private void Method4447() {
        final List field12872 = this.Field12872;
        this.Field12872.clear();
    }
    
    private void Method4448(final ByteBuffer byteBuffer) {
        final List field12872 = this.Field12872;
        this.Field12872.add(byteBuffer);
    }
    
    private void Method4449() throws Class531 {
        final long method4451 = this.Method4451();
        if (method4451 > this.Field12875) {
            this.Method4447();
            this.Field12864.trace("Payload limit reached. Allowed: {} Current: {}", (Object)this.Field12875, (Object)method4451);
            throw new Class531(this.Field12875);
        }
    }
    
    @Override
    public Class673 Method4413() {
        return Class673.Field10861;
    }
    
    @Override
    public String toString() {
        String str = super.toString();
        if (this.Method4422() != null) {
            str = str + " extension: " + this.Method4422().toString();
        }
        if (this.Method4424() != null) {
            str = str + " protocol: " + this.Method4424().toString();
        }
        return str + " max frame size: " + this.Field12875;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final Class1088 class1088 = (Class1088)o;
        if (this.Field12875 != class1088.Method4425()) {
            return false;
        }
        if (this.Field12865 != null) {
            if (this.Field12865.equals(class1088.Method4422())) {
                return (this.Field12869 != null) ? this.Field12869.equals(class1088.Method4424()) : (class1088.Method4424() == null);
            }
        }
        else if (class1088.Method4422() == null) {
            return (this.Field12869 != null) ? this.Field12869.equals(class1088.Method4424()) : (class1088.Method4424() == null);
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * ((this.Field12865 != null) ? this.Field12865.hashCode() : 0) + ((this.Field12869 != null) ? this.Field12869.hashCode() : 0)) + (this.Field12875 ^ this.Field12875 >>> 32);
    }
    
    private ByteBuffer Method4450() throws Class531 {
        long n = 0L;
        final List field12872 = this.Field12872;
        final Iterator<ByteBuffer> iterator = this.Field12872.iterator();
        while (iterator.hasNext()) {
            n += iterator.next().limit();
        }
        this.Method4449();
        final ByteBuffer allocate = ByteBuffer.allocate((int)n);
        final Iterator<ByteBuffer> iterator2 = this.Field12872.iterator();
        while (iterator2.hasNext()) {
            allocate.put(iterator2.next());
        }
        allocate.flip();
        return allocate;
    }
    
    private long Method4451() {
        long n = 0L;
        final List field12872 = this.Field12872;
        final Iterator<ByteBuffer> iterator = this.Field12872.iterator();
        while (iterator.hasNext()) {
            n += iterator.next().limit();
        }
        return n;
    }
    
    static {
        Field12863 = "Connection";
        Field12862 = "Upgrade";
        Field12861 = "Sec-WebSocket-Accept";
        Field12860 = "Sec-WebSocket-Extensions";
        Field12859 = "Sec-WebSocket-Protocol";
        Field12858 = "Sec-WebSocket-Key";
        Field12876 = !Class1088.class.desiredAssertionStatus();
    }
    
    private static String Method4420(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x44AC ^ 0x8C));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
