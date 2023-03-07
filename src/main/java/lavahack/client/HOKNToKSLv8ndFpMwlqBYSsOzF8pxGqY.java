/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import lavahack.client.R083HYbSLuZlFf8tfFxQMe46xBRA6QlP;
import lavahack.client.nNkPle7w34lMi0rtTNBkV7SXBXo02JDb;

public final class HOKNToKSLv8ndFpMwlqBYSsOzF8pxGqY {
    private static final Map Field13121 = new ConcurrentHashMap();
    private static final Map Field13122 = new ConcurrentHashMap();
    private String Field13123 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static nNkPle7w34lMi0rtTNBkV7SXBXo02JDb Method4617(String string) {
        return (nNkPle7w34lMi0rtTNBkV7SXBXo02JDb)Field13121.get(string);
    }

    public static nNkPle7w34lMi0rtTNBkV7SXBXo02JDb Method4618(Class clazz) {
        return (nNkPle7w34lMi0rtTNBkV7SXBXo02JDb)Field13122.get(clazz);
    }

    static {
        Field13121.put("key", R083HYbSLuZlFf8tfFxQMe46xBRA6QlP::new);
        Field13122.put(R083HYbSLuZlFf8tfFxQMe46xBRA6QlP.class, R083HYbSLuZlFf8tfFxQMe46xBRA6QlP::new);
    }

    private static String Method4619(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1008801111L ^ 0xC3DEEAA9;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1964295298 ^ (long)-1964295295);
            int n2 = ((int)539045853L ^ 0x20212F86) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)1736270549L ^ 0x677D6B62) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

