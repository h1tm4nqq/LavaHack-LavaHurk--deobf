/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import lavahack.client.Class1575;
import lavahack.client.Class1866;

public class Class1424 {
    private static final Map Field14622 = new ConcurrentHashMap();
    private static final Map Field14623 = new ConcurrentHashMap();
    private String Field14624 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static Class1866 Method5688(String string) {
        return (Class1866)Field14622.get(string);
    }

    public static Class1866 Method5689(Class clazz) {
        return (Class1866)Field14623.get(clazz);
    }

    static {
        Field14622.put("cmd", Class1575::new);
        Field14623.put(Class1575.class, Class1575::new);
    }

    private static String Method5690(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 6;
            cArray2[n] = (char)(cArray[n] ^ (0x3D75 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

