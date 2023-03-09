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
import lavahack.client.Class976;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u0000 \n2\u00060\u0001j\u0002`\u0002:\u0001\nB\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005B\u000f\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bB\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\t\u00a8\u0006\u000b"}, d2={"Lcom/kisman/cc/websockets/api/exceptions/NotSendableException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "s", "", "(Ljava/lang/String;)V", "t", "", "(Ljava/lang/Throwable;)V", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "Companion", "kisman.cc"})
public final class Class249
extends RuntimeException {
    private static final long Field9087 = -6468967874576651628L;
    public static final Class976 Field9088 = new Class976(null);
    private int Field9089;

    public Class249(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"s");
        super(string);
    }

    public Class249(@NotNull @NotNull Throwable throwable) {
        Intrinsics.checkParameterIsNotNull((Object)throwable, (String)"t");
        super(throwable);
    }

    public Class249(@NotNull @NotNull String string, @NotNull @NotNull Throwable throwable) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"s");
        Intrinsics.checkParameterIsNotNull((Object)throwable, (String)"t");
        super(string, throwable);
    }

    private static String Method1334(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 131;
            cArray2[n] = (char)(cArray[n] ^ (0x74C4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

