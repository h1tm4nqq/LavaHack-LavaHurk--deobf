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
import lavahack.client.mfe29dvrO1eRKfc00rHkATZbUPevvStf;
import lavahack.client.qjHQHUR6cDqJfxr2NHumjHRmiw9YFUmu;
import lavahack.client.vgnqQU2rNWykQSfirGoZNZFudeuwvXWu$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\n"}, d2={"Lcom/kisman/cc/features/catlua/lua/utils/LuaNet;", "", "()V", "getPasteBinAPI", "Lcom/kisman/cc/util/net/URLReader;", "url", "", "ping", "", "Companion", "kisman.cc"})
public final class vgnqQU2rNWykQSfirGoZNZFudeuwvXWu {
    @NotNull
    private static vgnqQU2rNWykQSfirGoZNZFudeuwvXWu Field12182;
    public static final vgnqQU2rNWykQSfirGoZNZFudeuwvXWu$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field12183;
    private int Field12184;

    @NotNull
    @NotNull
    public final mfe29dvrO1eRKfc00rHkATZbUPevvStf Method3979(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"url");
        return new mfe29dvrO1eRKfc00rHkATZbUPevvStf(string);
    }

    public final boolean Method3980(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"url");
        return qjHQHUR6cDqJfxr2NHumjHRmiw9YFUmu.Method7582(string);
    }

    static {
        Field12183 = new vgnqQU2rNWykQSfirGoZNZFudeuwvXWu$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(null);
        Field12182 = new vgnqQU2rNWykQSfirGoZNZFudeuwvXWu();
    }

    public static final vgnqQU2rNWykQSfirGoZNZFudeuwvXWu Method3981() {
        return Field12182;
    }

    public static final void Method3982(vgnqQU2rNWykQSfirGoZNZFudeuwvXWu vgnqQU2rNWykQSfirGoZNZFudeuwvXWu2) {
        Field12182 = vgnqQU2rNWykQSfirGoZNZFudeuwvXWu2;
    }

    private static String Method3983(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-526645177 ^ (long)-526645177);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-733847992L ^ 0xD4425EB7);
            int n2 = ((int)762929405L ^ 0x2D7960F8) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-391247235 ^ (long)-391245430) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

