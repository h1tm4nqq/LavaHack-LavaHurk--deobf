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
import lavahack.client.Class890;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\b"}, d2={"Lcom/kisman/cc/event/events/EventUpdateLightmap$Post;", "Lcom/kisman/cc/event/events/EventUpdateLightmap;", "lightmapColors", "", "([I)V", "getLightmapColors", "()[I", "setLightmapColors", "kisman.cc"})
public final class Class180
extends Class890 {
    @NotNull
    private int[] Field8789;
    private int Field8790;

    @NotNull
    @NotNull
    public final int[] Method1107() {
        return this.Field8789;
    }

    public final void Method1108(@NotNull @NotNull int[] nArray) {
        Intrinsics.checkParameterIsNotNull((Object)nArray, (String)"<set-?>");
        this.Field8789 = nArray;
    }

    public Class180(@NotNull @NotNull int[] nArray) {
        Intrinsics.checkParameterIsNotNull((Object)nArray, (String)"lightmapColors");
        this.Field8789 = nArray;
    }

    private static String Method170(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 196;
            cArray2[n] = (char)(cArray[n] ^ (0x1F6B ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

