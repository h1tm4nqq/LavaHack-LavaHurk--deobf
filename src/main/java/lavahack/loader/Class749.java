/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package lavahack.loader;

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
import lavahack.loader.Class1105;
import lavahack.loader.Class1159;
import lavahack.loader.Class1213;
import lavahack.loader.Class1236;
import lavahack.loader.Class1282;
import lavahack.loader.Class1327;
import lavahack.loader.Class1333;
import lavahack.loader.Class1550;
import lavahack.loader.Class1602;
import lavahack.loader.Class1720;
import lavahack.loader.Class1726;
import lavahack.loader.Class1753;
import lavahack.loader.Class1864;
import lavahack.loader.Class1926;
import lavahack.loader.Class213;
import lavahack.loader.Class241;
import lavahack.loader.Class26;
import lavahack.loader.Class359;
import lavahack.loader.Class45;
import lavahack.loader.Class528;
import lavahack.loader.Class53;
import lavahack.loader.Class636;
import lavahack.loader.Class7;
import lavahack.loader.Class700;
import lavahack.loader.Class866;
import lavahack.loader.Class902;
import lavahack.loader.Class919;
import lavahack.loader.Class924;
import lavahack.loader.Class939;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class749
extends Class26 {
    private static final String Field11180;
    private static final String Field11181;
    private static final String Field11182;
    private static final String Field11183;
    private static final String Field11184;
    private static final String Field11185;
    private final Logger Field11186 = LogManager.getLogger(Class749.class);
    private Class1720 Field11187 = new Class1726();
    private Class1720 Field11188 = new Class1726();
    private List Field11189;
    private Class1720 Field11190;
    private Class919 Field11191;
    private List Field11192;
    private Class1926 Field11193;
    private final List Field11194;
    private ByteBuffer Field11195;
    private final SecureRandom Field11196 = new SecureRandom();
    private int Field11197;
    static final boolean Field11198;
    private String Field11199 = "TheKisDevs & LavaHack Development owns you";

    public Class749() {
        this(Collections.emptyList());
    }

    public Class749(Class1720 class1720) {
        this(Collections.singletonList(class1720));
    }

    public Class749(List list) {
        this(list, Collections.singletonList(new Class924("")));
    }

    public Class749(List list, List list2) {
        this(list, list2, Integer.MAX_VALUE);
    }

    public Class749(List list, int n) {
        this(list, Collections.singletonList(new Class924("")), n);
    }

    public Class749(List list, List list2, int n) {
        if (list == null) throw new IllegalArgumentException();
        if (list2 == null) throw new IllegalArgumentException();
        if (n < 1) {
            throw new IllegalArgumentException();
        }
        this.Field11189 = new ArrayList(list.size());
        this.Field11192 = new ArrayList(list2.size());
        boolean bl = false;
        this.Field11194 = new ArrayList();
        Iterator iterator = list.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                this.Field11189.addAll(list);
                this.Field11189.add(this.Field11189.size(), this.Field11187);
                this.Field11192.addAll(list2);
                this.Field11197 = n;
                this.Field11190 = null;
                return;
            }
            Class1720 class1720 = (Class1720)iterator.next();
            if (!class1720.getClass().equals(Class1726.class)) continue;
            bl = true;
        }
    }

    @Override
    public Class1550 Method201(Class359 class359) throws Class241 {
        int n = this.Method220(class359);
        if (n != 13) {
            this.Field11186.trace("acceptHandshakeAsServer - Wrong websocket version.");
            return Class1550.Field15234;
        }
        Class1550 class1550 = Class1550.Field15234;
        String string = class359.Method180("Sec-WebSocket-Extensions");
        Object object = this.Field11189.iterator();
        while (object.hasNext()) {
            Class1720 class1720 = (Class1720)object.next();
            if (!class1720.Method6573(string)) continue;
            this.Field11187 = class1720;
            class1550 = Class1550.Field15233;
            this.Field11186.trace("acceptHandshakeAsServer - Matching extension found: {}", (Object)this.Field11187);
            break;
        }
        if ((object = this.Method3101(class359.Method180("Sec-WebSocket-Protocol"))) == Class1550.Field15233 && class1550 == Class1550.Field15233) {
            return Class1550.Field15233;
        }
        this.Field11186.trace("acceptHandshakeAsServer - No matching extension or protocol found.");
        return Class1550.Field15234;
    }

    private Class1550 Method3101(String string) {
        Class919 class919;
        Iterator iterator = this.Field11192.iterator();
        do {
            if (!iterator.hasNext()) return Class1550.Field15234;
        } while (!(class919 = (Class919)iterator.next()).Method3832(string));
        this.Field11191 = class919;
        this.Field11186.trace("acceptHandshake - Matching protocol found: {}", (Object)this.Field11191);
        return Class1550.Field15233;
    }

    @Override
    public Class1550 Method200(Class359 class359, Class1236 class1236) throws Class241 {
        if (!this.Method202(class1236)) {
            this.Field11186.trace("acceptHandshakeAsClient - Missing/wrong upgrade or connection in handshake.");
            return Class1550.Field15234;
        }
        if (!class359.Method181("Sec-WebSocket-Key") || !class1236.Method181("Sec-WebSocket-Accept")) {
            this.Field11186.trace("acceptHandshakeAsClient - Missing Sec-WebSocket-Key or Sec-WebSocket-Accept");
            return Class1550.Field15234;
        }
        String string = class1236.Method180("Sec-WebSocket-Accept");
        String string2 = class359.Method180("Sec-WebSocket-Key");
        if (!(string2 = this.Method3116(string2)).equals(string)) {
            this.Field11186.trace("acceptHandshakeAsClient - Wrong key for Sec-WebSocket-Key.");
            return Class1550.Field15234;
        }
        Class1550 class1550 = Class1550.Field15234;
        String string3 = class1236.Method180("Sec-WebSocket-Extensions");
        Object object = this.Field11189.iterator();
        while (object.hasNext()) {
            Class1720 class1720 = (Class1720)object.next();
            if (!class1720.Method6574(string3)) continue;
            this.Field11187 = class1720;
            class1550 = Class1550.Field15233;
            this.Field11186.trace("acceptHandshakeAsClient - Matching extension found: {}", (Object)this.Field11187);
            break;
        }
        if ((object = this.Method3101(class1236.Method180("Sec-WebSocket-Protocol"))) == Class1550.Field15233 && class1550 == Class1550.Field15233) {
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

    @Override
    public Class45 Method213(Class45 class45) {
        Object object2;
        class45.Method184("Upgrade", "websocket");
        class45.Method184("Connection", "Upgrade");
        byte[] byArray = new byte[16];
        this.Field11196.nextBytes(byArray);
        class45.Method184("Sec-WebSocket-Key", Class636.Method2758(byArray));
        class45.Method184("Sec-WebSocket-Version", "13");
        StringBuilder stringBuilder = new StringBuilder();
        for (Object object2 : this.Field11189) {
            if (object2.Method6576() == null || object2.Method6576().length() == 0) continue;
            if (stringBuilder.length() > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(object2.Method6576());
        }
        if (stringBuilder.length() != 0) {
            class45.Method184("Sec-WebSocket-Extensions", stringBuilder.toString());
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        object2 = this.Field11192.iterator();
        while (true) {
            if (!object2.hasNext()) {
                if (stringBuilder2.length() == 0) return class45;
                class45.Method184("Sec-WebSocket-Protocol", stringBuilder2.toString());
                return class45;
            }
            Class919 class919 = (Class919)object2.next();
            if (class919.Method3833().length() == 0) continue;
            if (stringBuilder2.length() > 0) {
                stringBuilder2.append(", ");
            }
            stringBuilder2.append(class919.Method3833());
        }
    }

    @Override
    public Class1213 Method214(Class359 class359, Class1333 class1333) throws Class241 {
        class1333.Method184("Upgrade", "websocket");
        class1333.Method184("Connection", class359.Method180("Connection"));
        String string = class359.Method180("Sec-WebSocket-Key");
        if (string == null) throw new Class241("missing Sec-WebSocket-Key");
        if ("".equals(string)) {
            throw new Class241("missing Sec-WebSocket-Key");
        }
        class1333.Method184("Sec-WebSocket-Accept", this.Method3116(string));
        if (this.Method3102().Method6577().length() != 0) {
            class1333.Method184("Sec-WebSocket-Extensions", this.Method3102().Method6577());
        }
        if (this.Method3104() != null && this.Method3104().Method3833().length() != 0) {
            class1333.Method184("Sec-WebSocket-Protocol", this.Method3104().Method3833());
        }
        class1333.Method4952("Web Socket Protocol Handshake");
        class1333.Method184("Server", "TooTallNate Java-WebSocket");
        class1333.Method184("Date", this.Method3115());
        return class1333;
    }

    @Override
    public Class26 Method217() {
        Object object2;
        ArrayList<Class1720> arrayList = new ArrayList<Class1720>();
        for (Object object2 : this.Method3103()) {
            arrayList.add(object2.Method6578());
        }
        ArrayList arrayList2 = new ArrayList();
        object2 = this.Method3106().iterator();
        while (object2.hasNext()) {
            Class919 class919 = (Class919)object2.next();
            arrayList2.add(class919.Method3834());
        }
        return new Class749(arrayList, arrayList2, this.Field11197);
    }

    @Override
    public ByteBuffer Method203(Class1926 class1926) {
        this.Method3102().Method6572(class1926);
        if (!this.Field11186.isTraceEnabled()) return this.Method3107(class1926);
        this.Field11186.trace("afterEnconding({}): {}", (Object)class1926.Method82().remaining(), (Object)(class1926.Method82().remaining() > 1000 ? "too big to display" : new String(class1926.Method82().array())));
        return this.Method3107(class1926);
    }

    private ByteBuffer Method3107(Class1926 class1926) {
        ByteBuffer byteBuffer = class1926.Method82();
        boolean bl = this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi == Class700.Field10968;
        int n = this.Method3114(byteBuffer);
        ByteBuffer byteBuffer2 = ByteBuffer.allocate(1 + (n > 1 ? n + 1 : n) + 0 + byteBuffer.remaining());
        byte by = this.Method3118(class1926.Method81());
        byte by2 = (byte)(class1926.Method76() ? -128 : 0);
        by2 = (byte)(by2 | by);
        if (class1926.Method77()) {
            by2 = (byte)(by2 | this.Method3112(1));
        }
        if (class1926.Method78()) {
            by2 = (byte)(by2 | this.Method3112(2));
        }
        if (class1926.Method79()) {
            by2 = (byte)(by2 | this.Method3112(3));
        }
        byteBuffer2.put(by2);
        byte[] byArray = this.Method3117(byteBuffer.remaining(), n);
        if (!Field11198 && byArray.length != n) {
            throw new AssertionError();
        }
        if (n == 1) {
            byteBuffer2.put((byte)(byArray[0] | this.Method3113(bl)));
        } else if (n == 2) {
            byteBuffer2.put((byte)(0x7E | this.Method3113(bl)));
            byteBuffer2.put(byArray);
        } else {
            if (n != 8) throw new IllegalStateException("Size representation not supported/specified");
            byteBuffer2.put((byte)(0x7F | this.Method3113(bl)));
            byteBuffer2.put(byArray);
        }
        byteBuffer2.put(byteBuffer);
        byteBuffer.flip();
        if (!Field11198 && byteBuffer2.remaining() != 0) {
            throw new AssertionError(byteBuffer2.remaining());
        }
        byteBuffer2.flip();
        return byteBuffer2;
    }

    private Class1926 Method3108(ByteBuffer byteBuffer) throws Class528, Class902 {
        Object object;
        if (byteBuffer == null) {
            throw new IllegalArgumentException();
        }
        int n = byteBuffer.remaining();
        int n2 = 2;
        this.Method3111(n, n2);
        byte by = byteBuffer.get();
        boolean bl = by >> 8 != 0;
        boolean bl2 = (by & 0x40) != 0;
        boolean bl3 = (by & 0x20) != 0;
        boolean bl4 = (by & 0x10) != 0;
        byte by2 = byteBuffer.get();
        boolean bl5 = (by2 & 0xFFFFFF80) != 0;
        int n3 = by2 & 0x7F;
        Class1753 class1753 = this.Method3119((byte)(by & 0xF));
        if (n3 < 0 || n3 > 125) {
            object = this.Method3109(byteBuffer, class1753, n3, n, n2);
            n3 = Class1602.Method6262((Class1602)object);
            n2 = Class1602.Method6263((Class1602)object);
        }
        this.Method3110(n3);
        n2 += 0;
        this.Method3111(n, n2 += n3);
        object = ByteBuffer.allocate(this.Method219(n3));
        ((ByteBuffer)object).put(byteBuffer.array(), byteBuffer.position(), ((Buffer)object).limit());
        byteBuffer.position(byteBuffer.position() + ((Buffer)object).limit());
        Class1327 class1327 = Class1327.Method91(class1753);
        class1327.Method86(bl);
        class1327.Method87(bl2);
        class1327.Method88(bl3);
        class1327.Method89(bl4);
        ((ByteBuffer)object).flip();
        class1327.Method85((ByteBuffer)object);
        if (class1327.Method81() != Class1753.Field16033) {
            this.Field11190 = class1327.Method77() || class1327.Method78() || class1327.Method79() ? this.Method3102() : this.Field11188;
        }
        if (this.Field11190 == null) {
            this.Field11190 = this.Field11188;
        }
        this.Field11190.Method6575(class1327);
        this.Field11190.Method6571(class1327);
        if (this.Field11186.isTraceEnabled()) {
            this.Field11186.trace("afterDecoding({}): {}", (Object)class1327.Method82().remaining(), (Object)(class1327.Method82().remaining() > 1000 ? "too big to display" : new String(class1327.Method82().array())));
        }
        class1327.Method84();
        return class1327;
    }

    private Class1602 Method3109(ByteBuffer byteBuffer, Class1753 class1753, int n, int n2, int n3) throws Class939, Class528, Class53 {
        int n4 = n;
        int n5 = n3;
        if (class1753 == Class1753.Field16036 || class1753 == Class1753.Field16037 || class1753 == Class1753.Field16038) {
            this.Field11186.trace("Invalid frame: more than 125 octets");
            throw new Class939("more than 125 octets");
        }
        if (n4 == 126) {
            this.Method3111(n2, n5 += 2);
            byte[] byArray = new byte[3];
            byArray[1] = byteBuffer.get();
            byArray[2] = byteBuffer.get();
            n4 = new BigInteger(byArray).intValue();
            return new Class1602(this, n4, n5);
        }
        this.Method3111(n2, n5 += 8);
        byte[] byArray = new byte[8];
        int n6 = 0;
        while (true) {
            byArray[n6] = byteBuffer.get();
            ++n6;
        }
    }

    private void Method3110(long l) throws Class53 {
        if (l > Integer.MAX_VALUE) {
            this.Field11186.trace("Limit exedeed: Payloadsize is to big...");
            throw new Class53("Payloadsize is to big...");
        }
        if (l > (long)this.Field11197) {
            this.Field11186.trace("Payload limit reached. Allowed: {} Current: {}", (Object)this.Field11197, (Object)l);
            throw new Class53("Payload limit reached.", this.Field11197);
        }
        if (l >= 0L) return;
        this.Field11186.trace("Limit underflow: Payloadsize is to little...");
        throw new Class53("Payloadsize is to little...");
    }

    private void Method3111(int n, int n2) throws Class528 {
        if (n >= n2) return;
        this.Field11186.trace("Incomplete frame: maxpacketsize < realpacketsize");
        throw new Class528(n2);
    }

    private byte Method3112(int n) {
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

    private byte Method3113(boolean bl) {
        if (!bl) return 0;
        return -128;
    }

    private int Method3114(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() <= 125) {
            return 1;
        }
        if (byteBuffer.remaining() > 65535) return 8;
        return 2;
    }

    @Override
    public List Method215(ByteBuffer byteBuffer) throws Class902 {
        Class1926 class1926;
        LinkedList<Class1926> linkedList = new LinkedList<Class1926>();
        if (this.Field11195 != null) {
            byteBuffer.mark();
            int n = byteBuffer.remaining();
            int n2 = this.Field11195.remaining();
            if (n2 > n) {
                this.Field11195.put(byteBuffer.array(), byteBuffer.position(), n);
                byteBuffer.position(byteBuffer.position() + n);
                return Collections.emptyList();
            }
            this.Field11195.put(byteBuffer.array(), byteBuffer.position(), n2);
            byteBuffer.position(byteBuffer.position() + n2);
            class1926 = this.Method3108((ByteBuffer)this.Field11195.duplicate().position(0));
            linkedList.add(class1926);
            this.Field11195 = null;
        }
        while (byteBuffer.hasRemaining()) {
            byteBuffer.mark();
            class1926 = this.Method3108(byteBuffer);
            linkedList.add(class1926);
        }
        return linkedList;
    }

    @Override
    public List Method204(ByteBuffer byteBuffer, boolean bl) {
        Class1864 class1864 = new Class1864();
        class1864.Method85(byteBuffer);
        class1864.Method90(bl);
        class1864.Method84();
        return Collections.singletonList(class1864);
    }

    @Override
    public List Method205(String string, boolean bl) {
        Class213 class213 = new Class213();
        class213.Method85(ByteBuffer.wrap(Class1105.Method4525(string)));
        class213.Method90(bl);
        class213.Method84();
        return Collections.singletonList(class213);
    }

    @Override
    public void Method208() {
        this.Field11195 = null;
        if (this.Field11187 != null) {
            this.Field11187.Method6579();
        }
        this.Field11187 = new Class1726();
        this.Field11191 = null;
    }

    private String Method3115() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat.format(calendar.getTime());
    }

    private String Method3116(String string) {
        String string2 = string.trim();
        String string3 = string2 + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
        MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
        return Class636.Method2758(messageDigest.digest(string3.getBytes()));
    }

    private byte[] Method3117(long l, int n) {
        byte[] byArray = new byte[n];
        int n2 = 8 * n - 8;
        int n3 = 0;
        while (n3 < n) {
            byArray[n3] = (byte)(l >>> n2 - 8 * n3);
            ++n3;
        }
        return byArray;
    }

    private byte Method3118(Class1753 class1753) {
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
        if (class1753 != Class1753.Field16037) throw new IllegalArgumentException("Don't know how to handle " + class1753.toString());
        return 10;
    }

    private Class1753 Method3119(byte by) throws Class939 {
        switch (by) {
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
        }
        throw new Class939("Unknown opcode " + (short)by);
    }

    @Override
    public void Method206(Class1282 class1282, Class1926 class1926) throws Class902 {
        Class1753 class1753 = class1926.Method81();
        if (class1753 == Class1753.Field16038) {
            this.Method3126(class1282, class1926);
            return;
        }
        if (class1753 == Class1753.Field16036) {
            class1282.Method5216().Method2669(class1282, class1926);
            return;
        }
        if (class1753 == Class1753.Field16037) {
            class1282.Method5215();
            class1282.Method5216().Method2671(class1282, class1926);
            return;
        }
        if (!class1926.Method76() || class1753 == Class1753.Field16033) {
            this.Method3120(class1282, class1926, class1753);
            return;
        }
        if (this.Field11193 != null) {
            this.Field11186.error("Protocol error: Continuous frame sequence not completed.");
            throw new Class902(1002, "Continuous frame sequence not completed.");
        }
        if (class1753 == Class1753.Field16034) {
            this.Method3123(class1282, class1926);
            return;
        }
        if (class1753 == Class1753.Field16035) {
            this.Method3121(class1282, class1926);
            return;
        }
        this.Field11186.error("non control or continious frame expected");
        throw new Class902(1002, "non control or continious frame expected");
    }

    private void Method3120(Class1282 class1282, Class1926 class1926, Class1753 class1753) throws Class902 {
        if (class1753 != Class1753.Field16033) {
            this.Method3125(class1926);
        } else if (class1926.Method76()) {
            this.Method3124(class1282, class1926);
        } else if (this.Field11193 == null) {
            this.Field11186.error("Protocol error: Continuous frame sequence was not started.");
            throw new Class902(1002, "Continuous frame sequence was not started.");
        }
        if (class1753 == Class1753.Field16034 && !Class1105.Method4532(class1926.Method82())) {
            this.Field11186.error("Protocol error: Payload is not UTF8");
            throw new Class902(1007);
        }
        if (class1753 != Class1753.Field16033) return;
        if (this.Field11193 == null) return;
        this.Method3128(class1926.Method82());
    }

    private void Method3121(Class1282 class1282, Class1926 class1926) {
        class1282.Method5216().Method2663(class1282, class1926.Method82());
    }

    private void Method3122(Class1282 class1282, RuntimeException runtimeException) {
        this.Field11186.error("Runtime exception during onWebsocketMessage", (Throwable)runtimeException);
        class1282.Method5216().Method2668(class1282, runtimeException);
    }

    private void Method3123(Class1282 class1282, Class1926 class1926) throws Class902 {
        class1282.Method5216().Method2662(class1282, Class1105.Method4530(class1926.Method82()));
    }

    private void Method3124(Class1282 class1282, Class1926 class1926) throws Class902 {
        if (this.Field11193 == null) {
            this.Field11186.trace("Protocol error: Previous continuous frame sequence not completed.");
            throw new Class902(1002, "Continuous frame sequence was not started.");
        }
        this.Method3128(class1926.Method82());
        this.Method3129();
        if (this.Field11193.Method81() == Class1753.Field16034) {
            ((Class1327)this.Field11193).Method85(this.Method3130());
            ((Class1327)this.Field11193).Method84();
            class1282.Method5216().Method2662(class1282, Class1105.Method4530(this.Field11193.Method82()));
        } else if (this.Field11193.Method81() == Class1753.Field16035) {
            ((Class1327)this.Field11193).Method85(this.Method3130());
            ((Class1327)this.Field11193).Method84();
            class1282.Method5216().Method2663(class1282, this.Field11193.Method82());
        }
        this.Field11193 = null;
        this.Method3127();
    }

    private void Method3125(Class1926 class1926) throws Class902 {
        if (this.Field11193 != null) {
            this.Field11186.trace("Protocol error: Previous continuous frame sequence not completed.");
            throw new Class902(1002, "Previous continuous frame sequence not completed.");
        }
        this.Field11193 = class1926;
        this.Method3128(class1926.Method82());
        this.Method3129();
    }

    private void Method3126(Class1282 class1282, Class1926 class1926) {
        int n = 1005;
        String string = "";
        if (class1926 instanceof Class7) {
            Class7 class7 = (Class7)class1926;
            n = class7.Method95();
            string = class7.Method96();
        }
        if (class1282.Method3337() == Class866.Field11647) {
            class1282.Method5201(n, string, true);
            return;
        }
        if (this.Method216() == Class1159.Field13230) {
            class1282.Method5200(n, string, true);
            return;
        }
        class1282.Method5204(n, string, false);
    }

    private void Method3127() {
        List list = this.Field11194;
        this.Field11194.clear();
    }

    private void Method3128(ByteBuffer byteBuffer) {
        List list = this.Field11194;
        this.Field11194.add(byteBuffer);
    }

    private void Method3129() throws Class53 {
        long l = this.Method3131();
        if (l <= (long)this.Field11197) return;
        this.Method3127();
        this.Field11186.trace("Payload limit reached. Allowed: {} Current: {}", (Object)this.Field11197, (Object)l);
        throw new Class53(this.Field11197);
    }

    @Override
    public Class1159 Method216() {
        return Class1159.Field13230;
    }

    @Override
    public String toString() {
        String string = super.toString();
        if (this.Method3102() != null) {
            string = string + " extension: " + this.Method3102().toString();
        }
        if (this.Method3104() == null) return string + " max frame size: " + this.Field11197;
        string = string + " protocol: " + this.Method3104().toString();
        return string + " max frame size: " + this.Field11197;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) return false;
        if (this.getClass() != object.getClass()) {
            return false;
        }
        Class749 class749 = (Class749)object;
        if (this.Field11197 != class749.Method3105()) {
            return false;
        }
        if (this.Field11187 != null ? !this.Field11187.equals(class749.Method3102()) : class749.Method3102() != null) {
            return false;
        }
        if (this.Field11191 != null) {
            boolean bl = this.Field11191.equals(class749.Method3104());
            return bl;
        }
        if (class749.Method3104() != null) return false;
        return true;
    }

    public int hashCode() {
        int n = this.Field11187 != null ? this.Field11187.hashCode() : 0;
        n = 31 * n + (this.Field11191 != null ? this.Field11191.hashCode() : 0);
        return 31 * n + (this.Field11197 ^ this.Field11197 >>> 32);
    }

    private ByteBuffer Method3130() throws Class53 {
        long l = 0L;
        List list = this.Field11194;
        for (ByteBuffer byteBuffer2 : this.Field11194) {
            l += (long)byteBuffer2.limit();
        }
        this.Method3129();
        ByteBuffer byteBuffer = ByteBuffer.allocate((int)l);
        Iterator iterator = this.Field11194.iterator();
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

    private long Method3131() {
        long l = 0L;
        List list = this.Field11194;
        Iterator iterator = this.Field11194.iterator();
        while (iterator.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer)iterator.next();
            l += (long)byteBuffer.limit();
        }
        return l;
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

    private static String Method223(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 95;
            cArray2[n] = (char)(cArray[n] ^ (0x5C59 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

