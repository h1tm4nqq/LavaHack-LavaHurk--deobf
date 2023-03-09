/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class Class551
implements ThreadFactory {
    private final ThreadFactory Field10341 = Executors.defaultThreadFactory();
    private final AtomicInteger Field10342 = new AtomicInteger(1);
    private final String Field10343;
    private String Field10344 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class551(String string) {
        this.Field10343 = string;
    }

    @Override
    public Thread newThread(Runnable runnable) {
        Thread thread = this.Field10341.newThread(runnable);
        thread.setName(this.Field10343 + "-" + this.Field10342);
        return thread;
    }

    private static String Method2461(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 117;
            cArray2[n] = (char)(cArray[n] ^ (0x5AAC ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

