/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import lavahack.client.Class1698;
import lavahack.client.Class2099;

public final class Class1127 {
    private static final Map Field13121 = new ConcurrentHashMap();
    private static final Map Field13122 = new ConcurrentHashMap();
    private String Field13123 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static Class2099 Method4617(String string) {
        return (Class2099)Field13121.get(string);
    }

    public static Class2099 Method4618(Class clazz) {
        return (Class2099)Field13122.get(clazz);
    }

    static {
        Field13121.put("key", Class1698::new);
        Field13122.put(Class1698.class, Class1698::new);
    }

    private static String Method4619(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 182;
            cArray2[n] = (char)(cArray[n] ^ (0x4DB8 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

