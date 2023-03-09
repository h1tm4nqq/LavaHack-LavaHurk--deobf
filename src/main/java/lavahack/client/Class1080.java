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
import lavahack.client.Class358;
import lavahack.client.Class651;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3)
public final class Class1080 {
    private String Field12819 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public static ThreadFactory Method4357(Class651 class651) {
        return new Class358().Method1797(true).Method1798("LavaHack-Thread-%d").Method1799();
    }

    @NotNull
    @NotNull
    public static ExecutorService Method4358(Class651 class651) {
        ExecutorService executorService = Executors.newCachedThreadPool(class651.Method2358());
        Intrinsics.checkExpressionValueIsNotNull((Object)executorService, (String)"Executors.newCachedThreadPool(factory)");
        return executorService;
    }

    private static String Method4359(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 237;
            cArray2[n] = (char)(cArray[n] ^ (0x5EF5 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

