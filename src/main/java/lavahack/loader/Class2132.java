/*
 * Decompiled with CFR 0.152.
 */
package lavahack.loader;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class Class2132
implements ThreadFactory {
    private final ThreadFactory Field17693 = Executors.defaultThreadFactory();
    private final AtomicInteger Field17694 = new AtomicInteger(1);
    private final String Field17695;
    private String Field17696 = "TheKisDevs & LavaHack Development owns you";

    public Class2132(String string) {
        this.Field17695 = string;
    }

    @Override
    public Thread newThread(Runnable runnable) {
        Thread thread = this.Field17693.newThread(runnable);
        thread.setName(this.Field17695 + "-" + this.Field17694);
        return thread;
    }

    private static String Method7670(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 28;
            cArray2[n] = (char)(cArray[n] ^ (0x4DD1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

