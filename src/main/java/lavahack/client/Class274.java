/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1734;
import lavahack.client.Class221;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2={"Lcom/kisman/cc/util/thread/kisman/ThreadManager;", "", "()V", "service", "Lcom/kisman/cc/util/thread/kisman/Service;", "getService", "()Lcom/kisman/cc/util/thread/kisman/Service;", "submit", "", "runnable", "Ljava/lang/Runnable;", "kisman.cc"})
public final class Class274 {
    @NotNull
    private final Class1734 Field9206;
    private String Field9207 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final Class1734 Method1458() {
        return this.Field9206;
    }

    public final void Method1459(@NotNull @NotNull Runnable runnable) {
        Intrinsics.checkParameterIsNotNull((Object)runnable, (String)"runnable");
        Class221.Method1271().add(runnable);
    }

    public Class274() {
        Class1734 class1734;
        Class1734 class17342 = new Class1734();
        Class274 class274 = this;
        boolean bl = false;
        boolean bl2 = false;
        Class1734 class17343 = class17342;
        boolean bl3 = false;
        class17343.setName("LavaHack-Thread-Manager");
        class17343.setDaemon(true);
        class17343.start();
        class274.Field9206 = class1734 = class17342;
    }

    private static String Method1460(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 81;
            cArray2[n] = (char)(cArray[n] ^ (0x4B54 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

