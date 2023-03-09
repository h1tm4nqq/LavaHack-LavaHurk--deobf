/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class1077;
import lavahack.client.Class251;

public class Class93 {
    private final Thread Field8319;
    private final Class1077 Field8320;
    private final Class251 Field8321;
    private final long Field8322;
    private final long Field8323;
    private String Field8324 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class93(Class251 class251, Class1077 class1077, long l, long l2, Runnable runnable) {
        this.Field8321 = class251;
        this.Field8320 = class1077;
        this.Field8322 = l;
        this.Field8323 = l2;
        this.Field8319 = new Thread(() -> Class93.Method799(l2, class1077, l, class251, runnable));
    }

    public Thread Method793() {
        return this.Field8319;
    }

    public Class1077 Method794() {
        return this.Field8320;
    }

    public Class251 Method795() {
        return this.Field8321;
    }

    public long Method796() {
        return this.Field8322;
    }

    public long Method797() {
        return this.Field8323;
    }

    private static void Method798(long l) {
        Thread.sleep(l);
    }

    private static void Method799(long l, Class1077 class1077, long l2, Class251 class251, Runnable runnable) {
        if (l < 0L) {
            while (true) {
                if (class1077 == Class1077.Field12792 || class1077 == Class1077.Field12794) {
                    Class93.Method798(l2);
                }
                if (class251 == Class251.Field9120) {
                    runnable.run();
                } else {
                    new Thread(runnable).start();
                }
                if (class1077 != Class1077.Field12793 && class1077 != Class1077.Field12794) continue;
                Class93.Method798(l2);
            }
        }
        long l3 = 0L;
        while (l3 < l) {
            if (class1077 == Class1077.Field12792 || class1077 == Class1077.Field12794) {
                Class93.Method798(l2);
            }
            if (class251 == Class251.Field9120) {
                runnable.run();
            } else {
                new Thread(runnable).start();
            }
            if (class1077 == Class1077.Field12793 || class1077 == Class1077.Field12794) {
                Class93.Method798(l2);
            }
            ++l3;
        }
    }

    private static String Method800(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 97;
            cArray2[n] = (char)(cArray[n] ^ (0x1D5A ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

