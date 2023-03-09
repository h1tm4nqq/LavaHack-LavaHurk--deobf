/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import lavahack.client.Class1260;
import lavahack.client.Class1275;
import lavahack.client.Class1302;
import lavahack.client.Class1417;
import lavahack.client.Class1446;
import lavahack.client.Class1597;
import lavahack.client.Class1598;
import lavahack.client.Class1692;
import lavahack.client.Class172;
import lavahack.client.Class1749;
import lavahack.client.Class176;
import lavahack.client.Class1892;
import lavahack.client.Class2049;
import lavahack.client.Class23;
import lavahack.client.Class370;
import lavahack.client.Class481;
import lavahack.client.Class482;
import lavahack.client.Class673;
import lavahack.client.Class71;
import lavahack.client.Class739;
import lavahack.client.Class803;
import lavahack.client.Class927;

public abstract class Class2129 {
    protected Class803 Field17682 = null;
    protected Class927 Field17683 = null;
    private String Field17684 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static ByteBuffer Method4392(ByteBuffer byteBuffer) {
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

    public static String Method4393(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = Class2129.Method4392(byteBuffer);
        if (byteBuffer2 == null) {
            return null;
        }
        String string = Class176.Method1097(byteBuffer2.array(), 0, byteBuffer2.limit());
        return string;
    }

    public static Class172 Method4394(ByteBuffer byteBuffer, Class803 class803) throws Class71 {
        String string = Class2129.Method4393(byteBuffer);
        if (string == null) {
            throw new Class1598(byteBuffer.capacity() + 128);
        }
        String[] stringArray = string.split(" ", 3);
        if (stringArray.length != 3) {
            throw new Class71();
        }
        Class172 class172 = class803 == Class803.Field11414 ? Class2129.Method4396(stringArray, string) : Class2129.Method4395(stringArray, string);
        string = Class2129.Method4393(byteBuffer);
        while (string != null && string.length() > 0) {
            String[] stringArray2 = string.split(":", 2);
            if (stringArray2.length != 2) {
                throw new Class71("not an http header");
            }
            if (class172.Method3(stringArray2[0])) {
                class172.Method6(stringArray2[0], class172.Method2(stringArray2[0]) + "; " + stringArray2[1].replaceFirst("^ +", ""));
            } else {
                class172.Method6(stringArray2[0], stringArray2[1].replaceFirst("^ +", ""));
            }
            string = Class2129.Method4393(byteBuffer);
        }
        if (string != null) return class172;
        throw new Class1598();
    }

    private static Class172 Method4395(String[] stringArray, String string) throws Class71 {
        if (!"GET".equalsIgnoreCase(stringArray[0])) {
            throw new Class71(String.format("Invalid request method received: %s Status line: %s", stringArray[0], string));
        }
        if (!"HTTP/1.1".equalsIgnoreCase(stringArray[2])) {
            throw new Class71(String.format("Invalid status line received: %s Status line: %s", stringArray[2], string));
        }
        Class2049 class2049 = new Class2049();
        class2049.Method7008(stringArray[1]);
        return class2049;
    }

    private static Class172 Method4396(String[] stringArray, String string) throws Class71 {
        if (!"101".equals(stringArray[1])) {
            throw new Class71(String.format("Invalid status code received: %s Status line: %s", stringArray[1], string));
        }
        if (!"HTTP/1.1".equalsIgnoreCase(stringArray[0])) {
            throw new Class71(String.format("Invalid status line received: %s Status line: %s", stringArray[0], string));
        }
        Class1417 class1417 = new Class1417();
        Class1692 class1692 = class1417;
        class1692.Method5671(Short.parseShort(stringArray[1]));
        class1692.Method5672(stringArray[2]);
        return class1417;
    }

    public abstract Class1597 Method4397(Class481 var1, Class482 var2) throws Class71;

    public abstract Class1597 Method4398(Class481 var1) throws Class71;

    protected boolean Method4399(Class739 class739) {
        if (!class739.Method2("Upgrade").equalsIgnoreCase("websocket")) return false;
        if (!class739.Method2("Connection").toLowerCase(Locale.ENGLISH).contains("upgrade")) return false;
        return true;
    }

    public abstract ByteBuffer Method4400(Class1260 var1);

    public abstract List Method4401(ByteBuffer var1, boolean var2);

    public abstract List Method4402(String var1, boolean var2);

    public abstract void Method4403(Class1302 var1, Class1260 var2) throws Class23;

    public List Method4404(Class927 class927, ByteBuffer byteBuffer, boolean bl) {
        if (class927 != Class927.Field11928 && class927 != Class927.Field11927) {
            throw new IllegalArgumentException("Only Opcode.BINARY or  Opcode.TEXT are allowed");
        }
        Class1446 class1446 = null;
        if (this.Field17683 != null) {
            class1446 = new Class1749();
        } else {
            this.Field17683 = class927;
            if (class927 == Class927.Field11928) {
                class1446 = new Class1275();
            } else if (class927 == Class927.Field11927) {
                class1446 = new Class370();
            }
        }
        class1446.Method1621(byteBuffer);
        class1446.Method1622(bl);
        class1446.Method1620();
        if (bl) {
            this.Field17683 = null;
            return Collections.singletonList(class1446);
        }
        this.Field17683 = class927;
        return Collections.singletonList(class1446);
    }

    public abstract void Method4405();

    @Deprecated
    @Deprecated
    public List Method4406(Class739 class739, Class803 class803) {
        return this.Method4407(class739);
    }

    public List Method4407(Class739 class739) {
        return this.Method4409(class739, true);
    }

    @Deprecated
    @Deprecated
    public List Method4408(Class739 class739, Class803 class803, boolean bl) {
        return this.Method4409(class739, bl);
    }

    public List Method4409(Class739 class739, boolean bl) {
        Object object;
        Object object2;
        StringBuilder stringBuilder = new StringBuilder(100);
        if (class739 instanceof Class481) {
            stringBuilder.append("GET ").append(((Class481)class739).Method2233()).append(" HTTP/1.1");
        } else {
            if (!(class739 instanceof Class482)) throw new IllegalArgumentException("unknown role");
            stringBuilder.append("HTTP/1.1 101 ").append(((Class482)class739).Method2235());
        }
        stringBuilder.append("\r\n");
        Iterator iterator = class739.Method1();
        while (iterator.hasNext()) {
            object2 = (String)iterator.next();
            object = class739.Method2((String)object2);
            stringBuilder.append((String)object2);
            stringBuilder.append(": ");
            stringBuilder.append((String)object);
            stringBuilder.append("\r\n");
        }
        stringBuilder.append("\r\n");
        object2 = Class176.Method1095(stringBuilder.toString());
        object = bl ? class739.Method4() : null;
        ByteBuffer byteBuffer = ByteBuffer.allocate((object == null ? 0 : ((Object)object).length) + ((Object)object2).length);
        byteBuffer.put((byte[])object2);
        if (object != null) {
            byteBuffer.put((byte[])object);
        }
        byteBuffer.flip();
        return Collections.singletonList(byteBuffer);
    }

    public abstract Class1892 Method4410(Class1892 var1) throws Class71;

    public abstract Class172 Method4411(Class481 var1, Class1692 var2) throws Class71;

    public abstract List Method4412(ByteBuffer var1) throws Class23;

    public abstract Class673 Method4413();

    public abstract Class2129 Method4414();

    public Class739 Method4415(ByteBuffer byteBuffer) throws Class71 {
        return Class2129.Method4394(byteBuffer, this.Field17682);
    }

    public int Method4416(int n) throws Class23 {
        if (n >= 0) return n;
        throw new Class23(1002, "Negative count");
    }

    int Method4417(Class739 class739) {
        String string = class739.Method2("Sec-WebSocket-Version");
        if (string.length() <= 0) return -1;
        return Integer.parseInt(string.trim());
    }

    public void Method4418(Class803 class803) {
        this.Field17682 = class803;
    }

    public Class803 Method4419() {
        return this.Field17682;
    }

    public String toString() {
        return this.getClass().getSimpleName();
    }

    private static String Method4420(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 48;
            cArray2[n] = (char)(cArray[n] ^ (0x593D ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

