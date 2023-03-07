/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.ZsqKASV8G7yUg4Domk5av9lNh2eJ8jx0;
import lavahack.client.o8Khs5KcdWuo4HXVTIqRiXxnXDJQeZGv;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3)
public final class ZsqKASV8G7yUg4Domk5av9lNh2eJ8jx0$leqS0IyKEB621E1SrHdAcHHAUjScjmKi {
    private String Field12819 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public static ThreadFactory Method4357(ZsqKASV8G7yUg4Domk5av9lNh2eJ8jx0 zsqKASV8G7yUg4Domk5av9lNh2eJ8jx0) {
        return new o8Khs5KcdWuo4HXVTIqRiXxnXDJQeZGv().Method1797((boolean)((long)1915863185 ^ (long)1915863184)).Method1798("LavaHack-Thread-%d").Method1799();
    }

    @NotNull
    @NotNull
    public static ExecutorService Method4358(ZsqKASV8G7yUg4Domk5av9lNh2eJ8jx0 zsqKASV8G7yUg4Domk5av9lNh2eJ8jx0) {
        ExecutorService executorService = Executors.newCachedThreadPool(zsqKASV8G7yUg4Domk5av9lNh2eJ8jx0.Method2358());
        Intrinsics.checkExpressionValueIsNotNull((Object)executorService, (String)"Executors.newCachedThreadPool(factory)");
        return executorService;
    }

    private static String Method4359(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1983207138 ^ (long)1983207138);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-571836982 ^ (long)-571837131);
            int n2 = (int)((long)1604404055 ^ (long)1604404154);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1004007201 ^ (long)1003991508) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

