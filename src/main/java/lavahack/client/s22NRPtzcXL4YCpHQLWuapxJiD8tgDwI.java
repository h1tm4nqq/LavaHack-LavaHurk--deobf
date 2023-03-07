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
import lavahack.client.s22NRPtzcXL4YCpHQLWuapxJiD8tgDwI$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u0000 \n2\u00060\u0001j\u0002`\u0002:\u0001\nB\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005B\u000f\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bB\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\t\u00a8\u0006\u000b"}, d2={"Lcom/kisman/cc/websockets/api/exceptions/NotSendableException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "s", "", "(Ljava/lang/String;)V", "t", "", "(Ljava/lang/Throwable;)V", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "Companion", "kisman.cc"})
public final class s22NRPtzcXL4YCpHQLWuapxJiD8tgDwI
extends RuntimeException {
    private static final long Field9087 = 0xA6399BFDFC7FFE96L & 0xA6399BFDFCF1EAD4L;
    public static final s22NRPtzcXL4YCpHQLWuapxJiD8tgDwI$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field9088 = new s22NRPtzcXL4YCpHQLWuapxJiD8tgDwI$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(null);
    private int Field9089;

    public s22NRPtzcXL4YCpHQLWuapxJiD8tgDwI(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"s");
        super(string);
    }

    public s22NRPtzcXL4YCpHQLWuapxJiD8tgDwI(@NotNull @NotNull Throwable throwable) {
        Intrinsics.checkParameterIsNotNull((Object)throwable, (String)"t");
        super(throwable);
    }

    public s22NRPtzcXL4YCpHQLWuapxJiD8tgDwI(@NotNull @NotNull String string, @NotNull @NotNull Throwable throwable) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"s");
        Intrinsics.checkParameterIsNotNull((Object)throwable, (String)"t");
        super(string, throwable);
    }

    private static String Method1334(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-682338250L ^ 0xD7545836;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-246107457 ^ (long)-246107584);
            int n2 = (int)((long)1336077055 ^ (long)1336076924);
            cArray2[n] = (char)(cArray[n] ^ (((int)1182139144L ^ 0x46761E39) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

