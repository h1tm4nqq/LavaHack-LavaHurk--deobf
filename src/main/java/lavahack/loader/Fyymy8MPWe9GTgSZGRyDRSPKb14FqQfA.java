/*
 * Decompiled with CFR 0.152.
 */
package lavahack.loader;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class Fyymy8MPWe9GTgSZGRyDRSPKb14FqQfA
implements ThreadFactory {
    private final ThreadFactory Field17693 = Executors.defaultThreadFactory();
    private final AtomicInteger Field17694 = new AtomicInteger((int)260081210L ^ 0xF80863B);
    private final String Field17695;
    private String Field17696 = "TheKisDevs & LavaHack Development owns you";

    public Fyymy8MPWe9GTgSZGRyDRSPKb14FqQfA(String string) {
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
        int n = (int)-1942278676L ^ 0x8C3B2DEC;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1882060583 ^ (long)-1882060762);
            int n2 = (int)((long)-1742553974 ^ (long)-1742553971) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1143882075 ^ (long)1143868554) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

