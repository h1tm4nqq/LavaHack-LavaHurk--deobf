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

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import lavahack.client.GtuIb5l0zIz019jVBBS0wnsuMmUh61R5;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n\u00a2\u0006\u0002\b\u0003"}, d2={"<anonymous>", "Lcom/kisman/cc/pingbypass/server/gui/PingBypassGui;", "kotlin.jvm.PlatformType", "invoke"})
final class SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$3
extends Lambda
implements Function0 {
    public static final SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$3 Field13157 = new SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$3();
    private int Field13158;

    public Object invoke() {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi();
    }

    public final GtuIb5l0zIz019jVBBS0wnsuMmUh61R5 leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        GtuIb5l0zIz019jVBBS0wnsuMmUh61R5 gtuIb5l0zIz019jVBBS0wnsuMmUh61R5 = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16264;
        Intrinsics.checkExpressionValueIsNotNull((Object)((Object)gtuIb5l0zIz019jVBBS0wnsuMmUh61R5), (String)"Kisman.instance.pingBypassGui");
        return gtuIb5l0zIz019jVBBS0wnsuMmUh61R5;
    }

    SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$3() {
        super((int)((long)-1521234116 ^ (long)-1521234116));
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)2064110052 ^ (long)2064110052);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-627785785 ^ (long)-627785928);
            int n2 = (int)((long)338028842 ^ (long)338028839) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)211787012 ^ (long)211783379) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

