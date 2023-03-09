/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public enum Class1081 {
    Field12820("name", "\u2191", (class1947, class19472) -> {
        String string = class1947.Method7229();
        String string2 = class19472.Method7229();
        return string.compareTo(string2);
    }),
    Field12821("name", "\u2193", (class1947, class19472) -> {
        String string = class1947.Method7229();
        String string2 = class19472.Method7229();
        return string2.compareTo(string);
    }),
    Field12822("amount", "\u2191", (class1947, class19472) -> class1947.Field16999 - class19472.Field16999),
    Field12823("amount", "\u2193", (class1947, class19472) -> class19472.Field16999 - class1947.Field16999);

    private final Comparator Field12824;
    public final String Field12825;
    public final String Field12826;
    private int Field12828;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1081(Comparator comparator) {
        void var5_3;
        void var4_2;
        this.Field12825 = comparator;
        this.Field12826 = var4_2;
        this.Field12824 = var5_3;
    }

    public void Method4360(List list) {
        Collections.sort(list, this.Field12824);
    }

    public Class1081 Method4361() {
        Class1081[] class1081Array = Class1081.values();
        return class1081Array[(this.ordinal() + 1) % class1081Array.length];
    }

    public static Class1081 Method4362(String string) {
        return Class1081.valueOf(string);
    }

    private static String Method4367(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 255;
            cArray2[n] = (char)(cArray[n] ^ (0x3601 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

