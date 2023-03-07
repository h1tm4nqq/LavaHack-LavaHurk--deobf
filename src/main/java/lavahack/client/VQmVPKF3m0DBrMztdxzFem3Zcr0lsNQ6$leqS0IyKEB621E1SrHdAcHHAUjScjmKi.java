/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.La0nJBqjHydXjyrgFJ7ctVy7DtRfmEAh;
import lavahack.client.VQmVPKF3m0DBrMztdxzFem3Zcr0lsNQ6;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2={"Lcom/kisman/cc/gui/other/search/SearchGui$Companion;", "", "()V", "nameMode", "Lcom/kisman/cc/util/enums/SearchGuiItemsNameModes;", "getNameMode", "()Lcom/kisman/cc/util/enums/SearchGuiItemsNameModes;", "setNameMode", "(Lcom/kisman/cc/util/enums/SearchGuiItemsNameModes;)V", "resolutionX", "", "getResolutionX", "()I", "setResolutionX", "(I)V", "kisman.cc"})
public final class VQmVPKF3m0DBrMztdxzFem3Zcr0lsNQ6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi {
    private int Field8880;

    @NotNull
    @NotNull
    public final La0nJBqjHydXjyrgFJ7ctVy7DtRfmEAh Method1192() {
        return VQmVPKF3m0DBrMztdxzFem3Zcr0lsNQ6.access$getNameMode$cp();
    }

    public final void Method1193(@NotNull @NotNull La0nJBqjHydXjyrgFJ7ctVy7DtRfmEAh la0nJBqjHydXjyrgFJ7ctVy7DtRfmEAh) {
        Intrinsics.checkParameterIsNotNull((Object)((Object)la0nJBqjHydXjyrgFJ7ctVy7DtRfmEAh), (String)"<set-?>");
        VQmVPKF3m0DBrMztdxzFem3Zcr0lsNQ6.access$setNameMode$cp(la0nJBqjHydXjyrgFJ7ctVy7DtRfmEAh);
    }

    public final int Method1194() {
        return VQmVPKF3m0DBrMztdxzFem3Zcr0lsNQ6.access$getResolutionX$cp();
    }

    public final void Method1195(int n) {
        VQmVPKF3m0DBrMztdxzFem3Zcr0lsNQ6.access$setResolutionX$cp(n);
    }

    private VQmVPKF3m0DBrMztdxzFem3Zcr0lsNQ6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
    }

    public VQmVPKF3m0DBrMztdxzFem3Zcr0lsNQ6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private static String Method1196(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1800842012L ^ 0x94A954E4;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1222899555 ^ (long)-1222899614);
            int n2 = (int)-1021989292L ^ 0xC315AE63;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-505330629 ^ (long)-505341854) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

