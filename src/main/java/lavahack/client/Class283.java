/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.function.Predicate;
import lavahack.client.Class422;

enum Class283 {
    Field9224(class422 -> {
        if (class422 != Class422.Field9768) return false;
        return true;
    }),
    Field9225(class422 -> {
        if (class422 != Class422.Field9769) return false;
        return true;
    }),
    Field9226(class422 -> {
        if (class422 == Class422.Field9768) return true;
        if (class422 == Class422.Field9769) return true;
        return false;
    });

    private final Predicate Field9227;
    private String Field9229 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class283() {
        void var3_1;
        this.Field9227 = var3_1;
    }

    public boolean Method1495(Class422 class422) {
        return this.Field9227.test(class422);
    }

    private static String Method1499(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 17;
            cArray2[n] = (char)(cArray[n] ^ (0x624C ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

