/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.functions.Function1
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.jvm.internal.Lambda
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import lavahack.client.MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\b\u0004"}, d2={"processPattern", "", "pattern", "Lcom/kisman/cc/settings/util/RenderingRewritePattern;", "invoke"})
final class MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$1
extends Lambda
implements Function1 {
    public static final MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$1 Field8286 = new MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$1();
    private int Field8287;

    public Object invoke(Object object) {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi((MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK)object);
    }

    public final boolean leqS0IyKEB621E1SrHdAcHHAUjScjmKi(@NotNull @NotNull MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK) {
        int n;
        Intrinsics.checkParameterIsNotNull((Object)mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK, (String)"pattern");
        if (mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK.Method3790() && !mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK.Method3791()) {
            n = (int)((long)-1831904779 ^ (long)-1831904780);
            return n != 0;
        }
        n = (int)((long)-162747413 ^ (long)-162747413);
        return n != 0;
    }

    MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$1() {
        super((int)-21560906L ^ 0xFEB701B7);
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-373128494 ^ (long)-373128494);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1754727976L ^ 0x9768F927);
            int n2 = ((int)1063833415L ^ 0x3F68CF5A) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-744327693 ^ (long)-744340128) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

