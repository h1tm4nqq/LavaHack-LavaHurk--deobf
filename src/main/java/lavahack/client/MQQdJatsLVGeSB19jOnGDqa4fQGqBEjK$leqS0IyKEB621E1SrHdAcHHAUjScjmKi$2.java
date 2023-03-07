/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.functions.Function0
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.jvm.internal.Lambda
 */
package lavahack.client;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import lavahack.client.MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK;
import lavahack.client.MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$1;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"processPatterns", "", "invoke"})
final class MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$2
extends Lambda
implements Function0 {
    final MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field8284;
    private String Field8285 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object invoke() {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi();
    }

    public final boolean leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        int n = (int)((long)-1802480825 ^ (long)-1802480825);
        Iterator iterator = this.Field8284.Field13971.Method780().Field8070.iterator();
        while (iterator.hasNext()) {
            MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK;
            MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK2 = mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK = (MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK)iterator.next();
            Intrinsics.checkExpressionValueIsNotNull((Object)mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK2, (String)"pattern");
            if (!MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$1.Field8286.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK2)) continue;
            n = (int)-1162249100L ^ 0xBAB97C75;
        }
        return n != 0;
    }

    MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$2(MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK$leqS0IyKEB621E1SrHdAcHHAUjScjmKi mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
        this.Field8284 = mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
        super((int)((long)-327259019 ^ (long)-327259019));
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1006130329L ^ 0x3BF85499;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)765522694 ^ (long)765522937);
            int n2 = ((int)-1387111117L ^ 0xAD525D3A) << 4;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)2032907908 ^ (long)2032909717) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

