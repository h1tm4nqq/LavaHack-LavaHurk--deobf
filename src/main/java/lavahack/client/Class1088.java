/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package lavahack.client;

import java.math.BigInteger;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import lavahack.client.Class1165;
import lavahack.client.Class1234;
import lavahack.client.Class1260;
import lavahack.client.Class1275;
import lavahack.client.Class1302;
import lavahack.client.Class1357;
import lavahack.client.Class1597;
import lavahack.client.Class1609;
import lavahack.client.Class1692;
import lavahack.client.Class172;
import lavahack.client.Class176;
import lavahack.client.Class189;
import lavahack.client.Class1892;
import lavahack.client.Class2129;
import lavahack.client.Class23;
import lavahack.client.Class363;
import lavahack.client.Class370;
import lavahack.client.Class475;
import lavahack.client.Class481;
import lavahack.client.Class482;
import lavahack.client.Class494;
import lavahack.client.Class531;
import lavahack.client.Class673;
import lavahack.client.Class705;
import lavahack.client.Class71;
import lavahack.client.Class803;
import lavahack.client.Class899;
import lavahack.client.Class927;
import lavahack.client.Class966;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class1088
extends Class2129 {
    private static final String Field12858;
    private static final String Field12859;
    private static final String Field12860;
    private static final String Field12861;
    private static final String Field12862;
    private static final String Field12863;
    private final Logger Field12864 = LogManager.getLogger(Class1088.class);
    private Class899 Field12865 = new Class1357();
    private Class899 Field12866 = new Class1357();
    private List Field12867;
    private Class899 Field12868;
    private Class1234 Field12869;
    private List Field12870;
    private Class1260 Field12871;
    private final List Field12872;
    private ByteBuffer Field12873;
    private final SecureRandom Field12874 = new SecureRandom();
    private int Field12875;
    static final boolean Field12876;
    private String Field12877 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1088() {
        this(Collections.emptyList());
    }

    public Class1088(Class899 class899) {
        this(Collections.singletonList(class899));
    }

    public Class1088(List list) {
        this(list, Collections.singletonList(new Class189("")));
    }

    public Class1088(List list, List list2) {
        this(list, list2, Integer.MAX_VALUE);
    }

    public Class1088(List list, int n) {
        this(list, Collections.singletonList(new Class189("")), n);
    }

    public Class1088(List list, List list2, int n) {
        if (list == null) throw new IllegalArgumentException();
        if (list2 == null) throw new IllegalArgumentException();
        if (n < 1) {
            throw new IllegalArgumentException();
        }
        this.Field12867 = new ArrayList(list.size());
        this.Field12870 = new ArrayList(list2.size());
        boolean bl = false;
        this.Field12872 = new ArrayList();
        Iterator iterator = list.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                this.Field12867.addAll(list);
                this.Field12867.add(this.Field12867.size(), this.Field12865);
                this.Field12870.addAll(list2);
                this.Field12875 = n;
                this.Field12868 = null;
                return;
            }
            Class899 class899 = (Class899)iterator.next();
            if (!class899.getClass().equals(Class1357.class)) continue;
            bl = true;
        }
    }

    @Override
    public Class1597 Method4398(Class481 class481) throws Class71 {
        int n = this.Method4417(class481);
        if (n != 13) {
            this.Field12864.trace("acceptHandshakeAsServer - Wrong websocket version.");
            return Class1597.Field15475;
        }
        Class1597 class1597 = Class1597.Field15475;
        String string = class481.Method2("Sec-WebSocket-Extensions");
        Object object = this.Field12867.iterator();
        while (object.hasNext()) {
            Class899 class899 = (Class899)object.next();
            if (!class899.Method2868(string)) continue;
            this.Field12865 = class899;
            class1597 = Class1597.Field15474;
            this.Field12864.trace("acceptHandshakeAsServer - Matching extension found: {}", (Object)this.Field12865);
            break;
        }
        if ((object = this.Method4421(class481.Method2("Sec-WebSocket-Protocol"))) == Class1597.Field15474 && class1597 == Class1597.Field15474) {
            return Class1597.Field15474;
        }
        this.Field12864.trace("acceptHandshakeAsServer - No matching extension or protocol found.");
        return Class1597.Field15475;
    }

    private Class1597 Method4421(String string) {
        Class1234 class1234;
        Iterator iterator = this.Field12870.iterator();
        do {
            if (!iterator.hasNext()) return Class1597.Field15475;
        } while (!(class1234 = (Class1234)iterator.next()).Method1144(string));
        this.Field12869 = class1234;
        this.Field12864.trace("acceptHandshake - Matching protocol found: {}", (Object)this.Field12869);
        return Class1597.Field15474;
    }

    @Override
    public Class1597 Method4397(Class481 class481, Class482 class482) throws Class71 {
        if (!this.Method4399(class482)) {
            this.Field12864.trace("acceptHandshakeAsClient - Missing/wrong upgrade or connection in handshake.");
            return Class1597.Field15475;
        }
        if (!class481.Method3("Sec-WebSocket-Key") || !class482.Method3("Sec-WebSocket-Accept")) {
            this.Field12864.trace("acceptHandshakeAsClient - Missing Sec-WebSocket-Key or Sec-WebSocket-Accept");
            return Class1597.Field15475;
        }
        String string = class482.Method2("Sec-WebSocket-Accept");
        String string2 = class481.Method2("Sec-WebSocket-Key");
        if (!(string2 = this.Method4436(string2)).equals(string)) {
            this.Field12864.trace("acceptHandshakeAsClient - Wrong key for Sec-WebSocket-Key.");
            return Class1597.Field15475;
        }
        Class1597 class1597 = Class1597.Field15475;
        String string3 = class482.Method2("Sec-WebSocket-Extensions");
        Object object = this.Field12867.iterator();
        while (object.hasNext()) {
            Class899 class899 = (Class899)object.next();
            if (!class899.Method2869(string3)) continue;
            this.Field12865 = class899;
            class1597 = Class1597.Field15474;
            this.Field12864.trace("acceptHandshakeAsClient - Matching extension found: {}", (Object)this.Field12865);
            break;
        }
        if ((object = this.Method4421(class482.Method2("Sec-WebSocket-Protocol"))) == Class1597.Field15474 && class1597 == Class1597.Field15474) {
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
    public Class1892 Method4410(Class1892 class1892) {
        Object object2;
        class1892.Method6("Upgrade", "websocket");
        class1892.Method6("Connection", "Upgrade");
        byte[] byArray = new byte[16];
        this.Field12874.nextBytes(byArray);
        class1892.Method6("Sec-WebSocket-Key", Class705.Method2937(byArray));
        class1892.Method6("Sec-WebSocket-Version", "13");
        StringBuilder stringBuilder = new StringBuilder();
        for (Object object2 : this.Field12867) {
            if (object2.Method2871() == null || object2.Method2871().length() == 0) continue;
            if (stringBuilder.length() > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(object2.Method2871());
        }
        if (stringBuilder.length() != 0) {
            class1892.Method6("Sec-WebSocket-Extensions", stringBuilder.toString());
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        object2 = this.Field12870.iterator();
        while (true) {
            if (!object2.hasNext()) {
                if (stringBuilder2.length() == 0) return class1892;
                class1892.Method6("Sec-WebSocket-Protocol", stringBuilder2.toString());
                return class1892;
            }
            Class1234 class1234 = (Class1234)object2.next();
            if (class1234.Method1145().length() == 0) continue;
            if (stringBuilder2.length() > 0) {
                stringBuilder2.append(", ");
            }
            stringBuilder2.append(class1234.Method1145());
        }
    }

    @Override
    public Class172 Method4411(Class481 class481, Class1692 class1692) throws Class71 {
        class1692.Method6("Upgrade", "websocket");
        class1692.Method6("Connection", class481.Method2("Connection"));
        String string = class481.Method2("Sec-WebSocket-Key");
        if (string == null) throw new Class71("missing Sec-WebSocket-Key");
        if ("".equals(string)) {
            throw new Class71("missing Sec-WebSocket-Key");
        }
        class1692.Method6("Sec-WebSocket-Accept", this.Method4436(string));
        if (this.Method4422().Method2872().length() != 0) {
            class1692.Method6("Sec-WebSocket-Extensions", this.Method4422().Method2872());
        }
        if (this.Method4424() != null && this.Method4424().Method1145().length() != 0) {
            class1692.Method6("Sec-WebSocket-Protocol", this.Method4424().Method1145());
        }
        class1692.Method5672("Web Socket Protocol Handshake");
        class1692.Method6("Server", "TooTallNate Java-WebSocket");
        class1692.Method6("Date", this.Method4435());
        return class1692;
    }

    @Override
    public Class2129 Method4414() {
        Object object2;
        ArrayList<Class899> arrayList = new ArrayList<Class899>();
        for (Object object2 : this.Method4423()) {
            arrayList.add(object2.Method2873());
        }
        ArrayList arrayList2 = new ArrayList();
        object2 = this.Method4426().iterator();
        while (object2.hasNext()) {
            Class1234 class1234 = (Class1234)object2.next();
            arrayList2.add(class1234.Method1146());
        }
        return new Class1088(arrayList, arrayList2, this.Field12875);
    }

    @Override
    public ByteBuffer Method4400(Class1260 class1260) {
        this.Method4422().Method2867(class1260);
        if (!this.Field12864.isTraceEnabled()) return this.Method4427(class1260);
        this.Field12864.trace("afterEnconding({}): {}", (Object)class1260.Method1618().remaining(), (Object)(class1260.Method1618().remaining() > 1000 ? "too big to display" : new String(class1260.Method1618().array())));
        return this.Method4427(class1260);
    }

    private ByteBuffer Method4427(Class1260 class1260) {
        ByteBuffer byteBuffer = class1260.Method1618();
        boolean bl = this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi == Class803.Field11414;
        int n = this.Method4434(byteBuffer);
        ByteBuffer byteBuffer2 = ByteBuffer.allocate(1 + (n > 1 ? n + 1 : n) + 0 + byteBuffer.remaining());
        byte by = this.Method4438(class1260.Method1617());
        byte by2 = (byte)(class1260.Method1612() ? -128 : 0);
        by2 = (byte)(by2 | by);
        if (class1260.Method1613()) {
            by2 = (byte)(by2 | this.Method4432(1));
        }
        if (class1260.Method1614()) {
            by2 = (byte)(by2 | this.Method4432(2));
        }
        if (class1260.Method1615()) {
            by2 = (byte)(by2 | this.Method4432(3));
        }
        byteBuffer2.put(by2);
        byte[] byArray = this.Method4437(byteBuffer.remaining(), n);
        if (!Field12876 && byArray.length != n) {
            throw new AssertionError();
        }
        if (n == 1) {
            byteBuffer2.put((byte)(byArray[0] | this.Method4433(bl)));
        } else if (n == 2) {
            byteBuffer2.put((byte)(0x7E | this.Method4433(bl)));
            byteBuffer2.put(byArray);
        } else {
            if (n != 8) throw new IllegalStateException("Size representation not supported/specified");
            byteBuffer2.put((byte)(0x7F | this.Method4433(bl)));
            byteBuffer2.put(byArray);
        }
        byteBuffer2.put(byteBuffer);
        byteBuffer.flip();
        if (!Field12876 && byteBuffer2.remaining() != 0) {
            throw new AssertionError(byteBuffer2.remaining());
        }
        byteBuffer2.flip();
        return byteBuffer2;
    }

    private Class1260 Method4428(ByteBuffer byteBuffer) throws Class1165, Class23 {
        Object object;
        if (byteBuffer == null) {
            throw new IllegalArgumentException();
        }
        int n = byteBuffer.remaining();
        int n2 = 2;
        this.Method4431(n, n2);
        byte by = byteBuffer.get();
        boolean bl = by >> 8 != 0;
        boolean bl2 = (by & 0x40) != 0;
        boolean bl3 = (by & 0x20) != 0;
        boolean bl4 = (by & 0x10) != 0;
        byte by2 = byteBuffer.get();
        boolean bl5 = (by2 & 0xFFFFFF80) != 0;
        int n3 = by2 & 0x7F;
        Class927 class927 = this.Method4439((byte)(by & 0xF));
        if (n3 < 0 || n3 > 125) {
            object = this.Method4429(byteBuffer, class927, n3, n, n2);
            n3 = Class363.Method1816((Class363)object);
            n2 = Class363.Method1817((Class363)object);
        }
        this.Method4430(n3);
        n2 += 0;
        this.Method4431(n, n2 += n3);
        object = ByteBuffer.allocate(this.Method4416(n3));
        ((ByteBuffer)object).put(byteBuffer.array(), byteBuffer.position(), ((Buffer)object).limit());
        byteBuffer.position(byteBuffer.position() + ((Buffer)object).limit());
        Class494 class494 = Class494.Method1627(class927);
        class494.Method1622(bl);
        class494.Method1623(bl2);
        class494.Method1624(bl3);
        class494.Method1625(bl4);
        ((ByteBuffer)object).flip();
        class494.Method1621((ByteBuffer)object);
        if (class494.Method1617() != Class927.Field11926) {
            this.Field12868 = class494.Method1613() || class494.Method1614() || class494.Method1615() ? this.Method4422() : this.Field12866;
        }
        if (this.Field12868 == null) {
            this.Field12868 = this.Field12866;
        }
        this.Field12868.Method2870(class494);
        this.Field12868.Method2866(class494);
        if (this.Field12864.isTraceEnabled()) {
            this.Field12864.trace("afterDecoding({}): {}", (Object)class494.Method1618().remaining(), (Object)(class494.Method1618().remaining() > 1000 ? "too big to display" : new String(class494.Method1618().array())));
        }
        class494.Method1620();
        return class494;
    }

    private Class363 Method4429(ByteBuffer byteBuffer, Class927 class927, int n, int n2, int n3) throws Class475, Class1165, Class531 {
        int n4 = n;
        int n5 = n3;
        if (class927 == Class927.Field11929 || class927 == Class927.Field11930 || class927 == Class927.Field11931) {
            this.Field12864.trace("Invalid frame: more than 125 octets");
            throw new Class475("more than 125 octets");
        }
        if (n4 == 126) {
            this.Method4431(n2, n5 += 2);
            byte[] byArray = new byte[3];
            byArray[1] = byteBuffer.get();
            byArray[2] = byteBuffer.get();
            n4 = new BigInteger(byArray).intValue();
            return new Class363(this, n4, n5);
        }
        this.Method4431(n2, n5 += 8);
        byte[] byArray = new byte[8];
        int n6 = 0;
        while (true) {
            byArray[n6] = byteBuffer.get();
            ++n6;
        }
    }

    private void Method4430(long l) throws Class531 {
        if (l > Integer.MAX_VALUE) {
            this.Field12864.trace("Limit exedeed: Payloadsize is to big...");
            throw new Class531("Payloadsize is to big...");
        }
        if (l > (long)this.Field12875) {
            this.Field12864.trace("Payload limit reached. Allowed: {} Current: {}", (Object)this.Field12875, (Object)l);
            throw new Class531("Payload limit reached.", this.Field12875);
        }
        if (l >= 0L) return;
        this.Field12864.trace("Limit underflow: Payloadsize is to little...");
        throw new Class531("Payloadsize is to little...");
    }

    private void Method4431(int n, int n2) throws Class1165 {
        if (n >= n2) return;
        this.Field12864.trace("Incomplete frame: maxpacketsize < realpacketsize");
        throw new Class1165(n2);
    }

    private byte Method4432(int n) {
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
        }
        return 0;
    }

    private byte Method4433(boolean bl) {
        if (!bl) return 0;
        return -128;
    }

    private int Method4434(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() <= 125) {
            return 1;
        }
        if (byteBuffer.remaining() > 65535) return 8;
        return 2;
    }

    @Override
    public List Method4412(ByteBuffer byteBuffer) throws Class23 {
        Class1260 class1260;
        LinkedList<Class1260> linkedList = new LinkedList<Class1260>();
        if (this.Field12873 != null) {
            byteBuffer.mark();
            int n = byteBuffer.remaining();
            int n2 = this.Field12873.remaining();
            if (n2 > n) {
                this.Field12873.put(byteBuffer.array(), byteBuffer.position(), n);
                byteBuffer.position(byteBuffer.position() + n);
                return Collections.emptyList();
            }
            this.Field12873.put(byteBuffer.array(), byteBuffer.position(), n2);
            byteBuffer.position(byteBuffer.position() + n2);
            class1260 = this.Method4428((ByteBuffer)this.Field12873.duplicate().position(0));
            linkedList.add(class1260);
            this.Field12873 = null;
        }
        while (byteBuffer.hasRemaining()) {
            byteBuffer.mark();
            class1260 = this.Method4428(byteBuffer);
            linkedList.add(class1260);
        }
        return linkedList;
    }

    @Override
    public List Method4401(ByteBuffer byteBuffer, boolean bl) {
        Class1275 class1275 = new Class1275();
        class1275.Method1621(byteBuffer);
        class1275.Method1626(bl);
        class1275.Method1620();
        return Collections.singletonList(class1275);
    }

    @Override
    public List Method4402(String string, boolean bl) {
        Class370 class370 = new Class370();
        class370.Method1621(ByteBuffer.wrap(Class176.Method1094(string)));
        class370.Method1626(bl);
        class370.Method1620();
        return Collections.singletonList(class370);
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
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat.format(calendar.getTime());
    }

    private String Method4436(String string) {
        String string2 = string.trim();
        String string3 = string2 + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
        MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
        return Class705.Method2937(messageDigest.digest(string3.getBytes()));
    }

    private byte[] Method4437(long l, int n) {
        byte[] byArray = new byte[n];
        int n2 = 8 * n - 8;
        int n3 = 0;
        while (n3 < n) {
            byArray[n3] = (byte)(l >>> n2 - 8 * n3);
            ++n3;
        }
        return byArray;
    }

    private byte Method4438(Class927 class927) {
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
        if (class927 != Class927.Field11930) throw new IllegalArgumentException("Don't know how to handle " + class927.toString());
        return 10;
    }

    private Class927 Method4439(byte by) throws Class475 {
        switch (by) {
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
        }
        throw new Class475("Unknown opcode " + (short)by);
    }

    @Override
    public void Method4403(Class1302 class1302, Class1260 class1260) throws Class23 {
        Class927 class927 = class1260.Method1617();
        if (class927 == Class927.Field11931) {
            this.Method4446(class1302, class1260);
            return;
        }
        if (class927 == Class927.Field11929) {
            class1302.Method5294().Method515(class1302, class1260);
            return;
        }
        if (class927 == Class927.Field11930) {
            class1302.Method5293();
            class1302.Method5294().Method517(class1302, class1260);
            return;
        }
        if (!class1260.Method1612() || class927 == Class927.Field11926) {
            this.Method4440(class1302, class1260, class927);
            return;
        }
        if (this.Field12871 != null) {
            this.Field12864.error("Protocol error: Continuous frame sequence not completed.");
            throw new Class23(1002, "Continuous frame sequence not completed.");
        }
        if (class927 == Class927.Field11927) {
            this.Method4443(class1302, class1260);
            return;
        }
        if (class927 == Class927.Field11928) {
            this.Method4441(class1302, class1260);
            return;
        }
        this.Field12864.error("non control or continious frame expected");
        throw new Class23(1002, "non control or continious frame expected");
    }

    private void Method4440(Class1302 class1302, Class1260 class1260, Class927 class927) throws Class23 {
        if (class927 != Class927.Field11926) {
            this.Method4445(class1260);
        } else if (class1260.Method1612()) {
            this.Method4444(class1302, class1260);
        } else if (this.Field12871 == null) {
            this.Field12864.error("Protocol error: Continuous frame sequence was not started.");
            throw new Class23(1002, "Continuous frame sequence was not started.");
        }
        if (class927 == Class927.Field11927 && !Class176.Method1101(class1260.Method1618())) {
            this.Field12864.error("Protocol error: Payload is not UTF8");
            throw new Class23(1007);
        }
        if (class927 != Class927.Field11926) return;
        if (this.Field12871 == null) return;
        this.Method4448(class1260.Method1618());
    }

    private void Method4441(Class1302 class1302, Class1260 class1260) {
        class1302.Method5294().Method509(class1302, class1260.Method1618());
    }

    private void Method4442(Class1302 class1302, RuntimeException runtimeException) {
        this.Field12864.error("Runtime exception during onWebsocketMessage", (Throwable)runtimeException);
        class1302.Method5294().Method514(class1302, runtimeException);
    }

    private void Method4443(Class1302 class1302, Class1260 class1260) throws Class23 {
        class1302.Method5294().Method508(class1302, Class176.Method1099(class1260.Method1618()));
    }

    private void Method4444(Class1302 class1302, Class1260 class1260) throws Class23 {
        if (this.Field12871 == null) {
            this.Field12864.trace("Protocol error: Previous continuous frame sequence not completed.");
            throw new Class23(1002, "Continuous frame sequence was not started.");
        }
        this.Method4448(class1260.Method1618());
        this.Method4449();
        if (this.Field12871.Method1617() == Class927.Field11927) {
            ((Class494)this.Field12871).Method1621(this.Method4450());
            ((Class494)this.Field12871).Method1620();
            class1302.Method5294().Method508(class1302, Class176.Method1099(this.Field12871.Method1618()));
        } else if (this.Field12871.Method1617() == Class927.Field11928) {
            ((Class494)this.Field12871).Method1621(this.Method4450());
            ((Class494)this.Field12871).Method1620();
            class1302.Method5294().Method509(class1302, this.Field12871.Method1618());
        }
        this.Field12871 = null;
        this.Method4447();
    }

    private void Method4445(Class1260 class1260) throws Class23 {
        if (this.Field12871 != null) {
            this.Field12864.trace("Protocol error: Previous continuous frame sequence not completed.");
            throw new Class23(1002, "Previous continuous frame sequence not completed.");
        }
        this.Field12871 = class1260;
        this.Method4448(class1260.Method1618());
        this.Method4449();
    }

    private void Method4446(Class1302 class1302, Class1260 class1260) {
        int n = 1005;
        String string = "";
        if (class1260 instanceof Class966) {
            Class966 class966 = (Class966)class1260;
            n = class966.Method3964();
            string = class966.Method3965();
        }
        if (class1302.Method556() == Class1609.Field15511) {
            class1302.Method5279(n, string, true);
            return;
        }
        if (this.Method4413() == Class673.Field10861) {
            class1302.Method5278(n, string, true);
            return;
        }
        class1302.Method5282(n, string, false);
    }

    private void Method4447() {
        List list = this.Field12872;
        this.Field12872.clear();
    }

    private void Method4448(ByteBuffer byteBuffer) {
        List list = this.Field12872;
        this.Field12872.add(byteBuffer);
    }

    private void Method4449() throws Class531 {
        long l = this.Method4451();
        if (l <= (long)this.Field12875) return;
        this.Method4447();
        this.Field12864.trace("Payload limit reached. Allowed: {} Current: {}", (Object)this.Field12875, (Object)l);
        throw new Class531(this.Field12875);
    }

    @Override
    public Class673 Method4413() {
        return Class673.Field10861;
    }

    @Override
    public String toString() {
        String string = super.toString();
        if (this.Method4422() != null) {
            string = string + " extension: " + this.Method4422().toString();
        }
        if (this.Method4424() == null) return string + " max frame size: " + this.Field12875;
        string = string + " protocol: " + this.Method4424().toString();
        return string + " max frame size: " + this.Field12875;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) return false;
        if (this.getClass() != object.getClass()) {
            return false;
        }
        Class1088 class1088 = (Class1088)object;
        if (this.Field12875 != class1088.Method4425()) {
            return false;
        }
        if (this.Field12865 != null ? !this.Field12865.equals(class1088.Method4422()) : class1088.Method4422() != null) {
            return false;
        }
        if (this.Field12869 != null) {
            boolean bl = this.Field12869.equals(class1088.Method4424());
            return bl;
        }
        if (class1088.Method4424() != null) return false;
        return true;
    }

    public int hashCode() {
        int n = this.Field12865 != null ? this.Field12865.hashCode() : 0;
        n = 31 * n + (this.Field12869 != null ? this.Field12869.hashCode() : 0);
        return 31 * n + (this.Field12875 ^ this.Field12875 >>> 32);
    }

    private ByteBuffer Method4450() throws Class531 {
        long l = 0L;
        List list = this.Field12872;
        for (ByteBuffer byteBuffer2 : this.Field12872) {
            l += (long)byteBuffer2.limit();
        }
        this.Method4449();
        ByteBuffer byteBuffer = ByteBuffer.allocate((int)l);
        Iterator iterator = this.Field12872.iterator();
        while (true) {
            ByteBuffer byteBuffer2;
            if (!iterator.hasNext()) {
                byteBuffer.flip();
                return byteBuffer;
            }
            byteBuffer2 = (ByteBuffer)iterator.next();
            byteBuffer.put(byteBuffer2);
        }
    }

    private long Method4451() {
        long l = 0L;
        List list = this.Field12872;
        Iterator iterator = this.Field12872.iterator();
        while (iterator.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer)iterator.next();
            l += (long)byteBuffer.limit();
        }
        return l;
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

    private static String Method4420(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 140;
            cArray2[n] = (char)(cArray[n] ^ (0x44AC ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

