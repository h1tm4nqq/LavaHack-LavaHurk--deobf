/*
 * Decompiled with CFR 0.152.
 */
package lavahack.loader;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;
import lavahack.loader.VxtGBIxlzwZB81UrEE9PRzCsi9pMS1Ao;

public class ASuMcgM5AEARMUacGCCzRjLlcqrqV9ji
implements VxtGBIxlzwZB81UrEE9PRzCsi9pMS1Ao {
    private byte[] Field10491;
    private TreeMap Field10492 = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    private String Field10493 = "TheKisDevs & LavaHack Development owns you";

    @Override
    public Iterator Method179() {
        return Collections.unmodifiableSet(this.Field10492.keySet()).iterator();
    }

    @Override
    public String Method180(String string) {
        String string2 = (String)this.Field10492.get(string);
        if (string2 != null) return string2;
        return "";
    }

    @Override
    public byte[] Method182() {
        return this.Field10491;
    }

    @Override
    public void Method183(byte[] byArray) {
        this.Field10491 = byArray;
    }

    @Override
    public void Method184(String string, String string2) {
        this.Field10492.put(string, string2);
    }

    @Override
    public boolean Method181(String string) {
        return this.Field10492.containsKey(string);
    }

    private static String Method185(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)695260074 ^ (long)695260074);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-439619038 ^ (long)-439618851);
            int n2 = (int)617654953L ^ 0x24D0AA1A;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-50236463 ^ (long)-50258400) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

