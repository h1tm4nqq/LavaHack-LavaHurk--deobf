/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.jvm.internal.StringCompanionObject
 */
package lavahack.client;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import lavahack.client.o8Khs5KcdWuo4HXVTIqRiXxnXDJQeZGv;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "Ljava/lang/Thread;", "it", "Ljava/lang/Runnable;", "kotlin.jvm.PlatformType", "newThread"})
final class o8Khs5KcdWuo4HXVTIqRiXxnXDJQeZGv$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
implements ThreadFactory {
    final o8Khs5KcdWuo4HXVTIqRiXxnXDJQeZGv Field16078;
    private String Field16079 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    @NotNull
    @NotNull
    public final Thread newThread(Runnable runnable) {
        Thread thread = Executors.defaultThreadFactory().newThread(runnable);
        Intrinsics.checkExpressionValueIsNotNull((Object)thread, (String)"Executors.defaultThreadFactory().newThread(it)");
        Thread thread2 = thread;
        if (o8Khs5KcdWuo4HXVTIqRiXxnXDJQeZGv.Method1800(this.Field16078) != null) {
            Boolean bl = o8Khs5KcdWuo4HXVTIqRiXxnXDJQeZGv.Method1800(this.Field16078);
            if (bl == null) {
                Intrinsics.throwNpe();
            }
            thread2.setDaemon(bl);
        }
        if (o8Khs5KcdWuo4HXVTIqRiXxnXDJQeZGv.Method1802(this.Field16078) == null) return thread2;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.ROOT;
        Intrinsics.checkExpressionValueIsNotNull((Object)locale, (String)"Locale.ROOT");
        Locale locale2 = locale;
        String string = o8Khs5KcdWuo4HXVTIqRiXxnXDJQeZGv.Method1802(this.Field16078);
        if (string == null) {
            Intrinsics.throwNpe();
        }
        String string2 = string;
        Object[] objectArray = new Object[(int)((long)-1673098350 ^ (long)-1673098349)];
        objectArray[(int)770929751L ^ 0x2DF37457] = new AtomicLong(0L).getAndIncrement();
        Object[] objectArray2 = objectArray;
        Thread thread3 = thread2;
        int n = (int)-804695371L ^ 0xD00952B5;
        String string3 = String.format(locale2, string2, Arrays.copyOf(objectArray2, objectArray2.length));
        Intrinsics.checkExpressionValueIsNotNull((Object)string3, (String)"java.lang.String.format(locale, format, *args)");
        String string4 = string3;
        thread3.setName(string4);
        return thread2;
    }

    o8Khs5KcdWuo4HXVTIqRiXxnXDJQeZGv$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(o8Khs5KcdWuo4HXVTIqRiXxnXDJQeZGv o8Khs5KcdWuo4HXVTIqRiXxnXDJQeZGv2) {
        this.Field16078 = o8Khs5KcdWuo4HXVTIqRiXxnXDJQeZGv2;
    }

    private static String Method6714(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1624206365L ^ 0x60CF6C1D;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-438174941L ^ 0xE5E1FBDC);
            int n2 = (int)((long)-304121525 ^ (long)-304121470);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-844610409 ^ (long)-844613380) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

