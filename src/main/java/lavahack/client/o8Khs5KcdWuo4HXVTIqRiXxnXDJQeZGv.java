/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import java.util.concurrent.ThreadFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.o8Khs5KcdWuo4HXVTIqRiXxnXDJQeZGv$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2={"Lcom/kisman/cc/util/thread/kisman/ThreadFactoryBuilder;", "", "()V", "daemon", "", "Ljava/lang/Boolean;", "nameFormat", "", "build", "Ljava/util/concurrent/ThreadFactory;", "setDaemon", "setNameFormat", "kisman.cc"})
public final class o8Khs5KcdWuo4HXVTIqRiXxnXDJQeZGv {
    private Boolean Field9502;
    private String Field9503;
    private String Field9504 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final o8Khs5KcdWuo4HXVTIqRiXxnXDJQeZGv Method1797(boolean bl) {
        this.Field9502 = bl;
        return this;
    }

    @NotNull
    @NotNull
    public final o8Khs5KcdWuo4HXVTIqRiXxnXDJQeZGv Method1798(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"nameFormat");
        this.Field9503 = string;
        return this;
    }

    @NotNull
    @NotNull
    public final ThreadFactory Method1799() {
        return new o8Khs5KcdWuo4HXVTIqRiXxnXDJQeZGv$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(this);
    }

    public static final Boolean Method1800(o8Khs5KcdWuo4HXVTIqRiXxnXDJQeZGv o8Khs5KcdWuo4HXVTIqRiXxnXDJQeZGv2) {
        return o8Khs5KcdWuo4HXVTIqRiXxnXDJQeZGv2.Field9502;
    }

    public static final void Method1801(o8Khs5KcdWuo4HXVTIqRiXxnXDJQeZGv o8Khs5KcdWuo4HXVTIqRiXxnXDJQeZGv2, Boolean bl) {
        o8Khs5KcdWuo4HXVTIqRiXxnXDJQeZGv2.Field9502 = bl;
    }

    public static final String Method1802(o8Khs5KcdWuo4HXVTIqRiXxnXDJQeZGv o8Khs5KcdWuo4HXVTIqRiXxnXDJQeZGv2) {
        return o8Khs5KcdWuo4HXVTIqRiXxnXDJQeZGv2.Field9503;
    }

    public static final void Method1803(o8Khs5KcdWuo4HXVTIqRiXxnXDJQeZGv o8Khs5KcdWuo4HXVTIqRiXxnXDJQeZGv2, String string) {
        o8Khs5KcdWuo4HXVTIqRiXxnXDJQeZGv2.Field9503 = string;
    }

    private static String Method1804(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)469574746 ^ (long)469574746);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1209931161 ^ (long)-1209931112);
            int n2 = (int)((long)-508457144 ^ (long)-508457169);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-2122017720 ^ (long)-2121993565) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

