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
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n\u00a2\u0006\u0002\b\u0003"}, d2={"<anonymous>", "Lcom/kisman/cc/gui/halq/HalqGui;", "kotlin.jvm.PlatformType", "invoke"})
final class SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$14
extends Lambda
implements Function0 {
    public static final SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$14 Field17395 = new SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$14();
    private String Field17396 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object invoke() {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi();
    }

    public final zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4 leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4 zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT42 = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16262;
        Intrinsics.checkExpressionValueIsNotNull((Object)((Object)zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT42), (String)"Kisman.instance.halqGui");
        return zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT42;
    }

    SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$14() {
        super((int)769897031L ^ 0x2DE3B247);
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1709734666L ^ 0x9A1784F6;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)273143031 ^ (long)273142792);
            int n2 = ((int)614634782L ^ 0x24A2951D) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1127381541 ^ (long)-1127378946) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

