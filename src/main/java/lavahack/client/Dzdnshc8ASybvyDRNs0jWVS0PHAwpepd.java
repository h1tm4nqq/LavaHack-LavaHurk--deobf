/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import lavahack.client.WDdAATNF21EFdmq7ko4aGKREIiIEJJic;
import lavahack.client.aVhQcqd4Hc1pL4UEBC6g8vsoe8wyJ8uY;

public class Dzdnshc8ASybvyDRNs0jWVS0PHAwpepd {
    private static final Map Field14622 = new ConcurrentHashMap();
    private static final Map Field14623 = new ConcurrentHashMap();
    private String Field14624 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static aVhQcqd4Hc1pL4UEBC6g8vsoe8wyJ8uY Method5688(String string) {
        return (aVhQcqd4Hc1pL4UEBC6g8vsoe8wyJ8uY)Field14622.get(string);
    }

    public static aVhQcqd4Hc1pL4UEBC6g8vsoe8wyJ8uY Method5689(Class clazz) {
        return (aVhQcqd4Hc1pL4UEBC6g8vsoe8wyJ8uY)Field14623.get(clazz);
    }

    static {
        Field14622.put("cmd", WDdAATNF21EFdmq7ko4aGKREIiIEJJic::new);
        Field14623.put(WDdAATNF21EFdmq7ko4aGKREIiIEJJic.class, WDdAATNF21EFdmq7ko4aGKREIiIEJJic::new);
    }

    private static String Method5690(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1264546324 ^ (long)1264546324);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1396550084 ^ (long)1396549947);
            int n2 = ((int)1558339948L ^ 0x5CE2616F) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)-2025271792L ^ 0x8748F365 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

