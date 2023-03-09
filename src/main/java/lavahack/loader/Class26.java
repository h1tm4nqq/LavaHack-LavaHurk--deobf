/*
 * Decompiled with CFR 0.152.
 */
package lavahack.loader;

import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import lavahack.loader.Class1105;
import lavahack.loader.Class1159;
import lavahack.loader.Class1181;
import lavahack.loader.Class1213;
import lavahack.loader.Class1230;
import lavahack.loader.Class1236;
import lavahack.loader.Class1282;
import lavahack.loader.Class1333;
import lavahack.loader.Class1462;
import lavahack.loader.Class1550;
import lavahack.loader.Class1753;
import lavahack.loader.Class1864;
import lavahack.loader.Class19;
import lavahack.loader.Class1926;
import lavahack.loader.Class213;
import lavahack.loader.Class241;
import lavahack.loader.Class359;
import lavahack.loader.Class45;
import lavahack.loader.Class609;
import lavahack.loader.Class678;
import lavahack.loader.Class700;
import lavahack.loader.Class902;

public abstract class Class26 {
    protected Class700 Field7916 = null;
    protected Class1753 Field7917 = null;
    private String Field7918 = "TheKisDevs & LavaHack Development owns you";

    public static ByteBuffer Method195(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = ByteBuffer.allocate(byteBuffer.remaining());
        byte by = 48;
        while (true) {
            if (!byteBuffer.hasRemaining()) {
                byteBuffer.position(byteBuffer.position() - byteBuffer2.position());
                return null;
            }
            byte by2 = by;
            by = byteBuffer.get();
            byteBuffer2.put(by);
        }
    }

    public static String Method196(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = Class26.Method195(byteBuffer);
        if (byteBuffer2 == null) {
            return null;
        }
        String string = Class1105.Method4528(byteBuffer2.array(), 0, byteBuffer2.limit());
        return string;
    }

    public static Class1213 Method197(ByteBuffer byteBuffer, Class700 class700) throws Class241 {
        String string = Class26.Method196(byteBuffer);
        if (string == null) {
            throw new Class678(byteBuffer.capacity() + 128);
        }
        String[] stringArray = string.split(" ", 3);
        if (stringArray.length != 3) {
            throw new Class241();
        }
        Class1213 class1213 = class700 == Class700.Field10968 ? Class26.Method199(stringArray, string) : Class26.Method198(stringArray, string);
        string = Class26.Method196(byteBuffer);
        while (string != null && string.length() > 0) {
            String[] stringArray2 = string.split(":", 2);
            if (stringArray2.length != 2) {
                throw new Class241("not an http header");
            }
            if (class1213.Method181(stringArray2[0])) {
                class1213.Method184(stringArray2[0], class1213.Method180(stringArray2[0]) + "; " + stringArray2[1].replaceFirst("^ +", ""));
            } else {
                class1213.Method184(stringArray2[0], stringArray2[1].replaceFirst("^ +", ""));
            }
            string = Class26.Method196(byteBuffer);
        }
        if (string != null) return class1213;
        throw new Class678();
    }

    private static Class1213 Method198(String[] stringArray, String string) throws Class241 {
        if (!"GET".equalsIgnoreCase(stringArray[0])) {
            throw new Class241(String.format("Invalid request method received: %s Status line: %s", stringArray[0], string));
        }
        if (!"HTTP/1.1".equalsIgnoreCase(stringArray[2])) {
            throw new Class241(String.format("Invalid status line received: %s Status line: %s", stringArray[2], string));
        }
        Class19 class19 = new Class19();
        class19.Method187(stringArray[1]);
        return class19;
    }

    private static Class1213 Method199(String[] stringArray, String string) throws Class241 {
        if (!"101".equals(stringArray[1])) {
            throw new Class241(String.format("Invalid status code received: %s Status line: %s", stringArray[1], string));
        }
        if (!"HTTP/1.1".equalsIgnoreCase(stringArray[0])) {
            throw new Class241(String.format("Invalid status line received: %s Status line: %s", stringArray[0], string));
        }
        Class1230 class1230 = new Class1230();
        Class1333 class1333 = class1230;
        class1333.Method4951(Short.parseShort(stringArray[1]));
        class1333.Method4952(stringArray[2]);
        return class1230;
    }

    public abstract Class1550 Method200(Class359 var1, Class1236 var2) throws Class241;

    public abstract Class1550 Method201(Class359 var1) throws Class241;

    protected boolean Method202(Class1181 class1181) {
        if (!class1181.Method180("Upgrade").equalsIgnoreCase("websocket")) return false;
        if (!class1181.Method180("Connection").toLowerCase(Locale.ENGLISH).contains("upgrade")) return false;
        return true;
    }

    public abstract ByteBuffer Method203(Class1926 var1);

    public abstract List Method204(ByteBuffer var1, boolean var2);

    public abstract List Method205(String var1, boolean var2);

    public abstract void Method206(Class1282 var1, Class1926 var2) throws Class902;

    public List Method207(Class1753 class1753, ByteBuffer byteBuffer, boolean bl) {
        if (class1753 != Class1753.Field16035 && class1753 != Class1753.Field16034) {
            throw new IllegalArgumentException("Only Opcode.BINARY or  Opcode.TEXT are allowed");
        }
        Class609 class609 = null;
        if (this.Field7917 != null) {
            class609 = new Class1462();
        } else {
            this.Field7917 = class1753;
            if (class1753 == Class1753.Field16035) {
                class609 = new Class1864();
            } else if (class1753 == Class1753.Field16034) {
                class609 = new Class213();
            }
        }
        class609.Method85(byteBuffer);
        class609.Method86(bl);
        class609.Method84();
        if (bl) {
            this.Field7917 = null;
            return Collections.singletonList(class609);
        }
        this.Field7917 = class1753;
        return Collections.singletonList(class609);
    }

    public abstract void Method208();

    @Deprecated
    @Deprecated
    public List Method209(Class1181 class1181, Class700 class700) {
        return this.Method210(class1181);
    }

    public List Method210(Class1181 class1181) {
        return this.Method212(class1181, true);
    }

    @Deprecated
    @Deprecated
    public List Method211(Class1181 class1181, Class700 class700, boolean bl) {
        return this.Method212(class1181, bl);
    }

    public List Method212(Class1181 class1181, boolean bl) {
        Object object;
        Object object2;
        StringBuilder stringBuilder = new StringBuilder(100);
        if (class1181 instanceof Class359) {
            stringBuilder.append("GET ").append(((Class359)class1181).Method186()).append(" HTTP/1.1");
        } else {
            if (!(class1181 instanceof Class1236)) throw new IllegalArgumentException("unknown role");
            stringBuilder.append("HTTP/1.1 101 ").append(((Class1236)class1181).Method4950());
        }
        stringBuilder.append("\r\n");
        Iterator iterator = class1181.Method179();
        while (iterator.hasNext()) {
            object2 = (String)iterator.next();
            object = class1181.Method180((String)object2);
            stringBuilder.append((String)object2);
            stringBuilder.append(": ");
            stringBuilder.append((String)object);
            stringBuilder.append("\r\n");
        }
        stringBuilder.append("\r\n");
        object2 = Class1105.Method4526(stringBuilder.toString());
        object = bl ? class1181.Method182() : null;
        ByteBuffer byteBuffer = ByteBuffer.allocate((object == null ? 0 : ((Object)object).length) + ((Object)object2).length);
        byteBuffer.put((byte[])object2);
        if (object != null) {
            byteBuffer.put((byte[])object);
        }
        byteBuffer.flip();
        return Collections.singletonList(byteBuffer);
    }

    public abstract Class45 Method213(Class45 var1) throws Class241;

    public abstract Class1213 Method214(Class359 var1, Class1333 var2) throws Class241;

    public abstract List Method215(ByteBuffer var1) throws Class902;

    public abstract Class1159 Method216();

    public abstract Class26 Method217();

    public Class1181 Method218(ByteBuffer byteBuffer) throws Class241 {
        return Class26.Method197(byteBuffer, this.Field7916);
    }

    public int Method219(int n) throws Class902 {
        if (n >= 0) return n;
        throw new Class902(1002, "Negative count");
    }

    int Method220(Class1181 class1181) {
        String string = class1181.Method180("Sec-WebSocket-Version");
        if (string.length() <= 0) return -1;
        return Integer.parseInt(string.trim());
    }

    public void Method221(Class700 class700) {
        this.Field7916 = class700;
    }

    public Class700 Method222() {
        return this.Field7916;
    }

    public String toString() {
        return this.getClass().getSimpleName();
    }

    private static String Method223(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 14;
            cArray2[n] = (char)(cArray[n] ^ (0x1ED2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

