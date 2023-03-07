/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class HM0EXaADYNMax37QakJtJf61jpa9VoRu
implements ThreadFactory {
    private final ThreadFactory Field10341 = Executors.defaultThreadFactory();
    private final AtomicInteger Field10342 = new AtomicInteger((int)((long)398986352 ^ (long)398986353));
    private final String Field10343;
    private String Field10344 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public HM0EXaADYNMax37QakJtJf61jpa9VoRu(String string) {
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
        int n = (int)((long)2087102018 ^ (long)2087102018);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1031472558 ^ (long)1031472465);
            int n2 = (int)148286279L ^ 0x8D6AB32;
            cArray2[n] = (char)(cArray[n] ^ (((int)1771273859L ^ 0x69936828) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

