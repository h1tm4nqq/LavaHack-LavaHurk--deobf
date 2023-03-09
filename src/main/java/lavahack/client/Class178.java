/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2={"Lcom/kisman/cc/gui/csgo/Utils$Companion;", "", "()V", "formatTime", "", "l", "", "kisman.cc"})
public final class Class178 {
    private int Field8787;

    @Nullable
    @Nullable
    public final String Method1102(long l) {
        long l2 = l;
        long l3 = l2 / (long)1000 / (long)60;
        long l4 = (l2 -= l3 * (long)1000 * (long)60) / (long)1000;
        l2 -= l4 * (long)1000;
        StringBuilder stringBuilder = new StringBuilder();
        if (l3 != 0L) {
            stringBuilder.append(l3).append("min ");
        }
        if (l4 != 0L) {
            stringBuilder.append(l4).append("s ");
        }
        if (l2 == 0L) {
            if (l3 != 0L) return stringBuilder.substring(0, stringBuilder.length() - 1);
            if (l4 != 0L) return stringBuilder.substring(0, stringBuilder.length() - 1);
        }
        stringBuilder.append(l2).append("ms ");
        return stringBuilder.substring(0, stringBuilder.length() - 1);
    }

    private Class178() {
    }

    public Class178(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private static String Method1103(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 230;
            cArray2[n] = (char)(cArray[n] ^ (0x1BA3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

