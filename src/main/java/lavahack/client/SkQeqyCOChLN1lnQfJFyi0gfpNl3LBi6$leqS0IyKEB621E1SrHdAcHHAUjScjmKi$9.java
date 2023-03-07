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
import lavahack.client.ABhseIFL1PQVX4WAovmpeO8P6T0dQPpk;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n\u00a2\u0006\u0002\b\u0003"}, d2={"<anonymous>", "Lcom/kisman/cc/gui/console/ConsoleGui;", "kotlin.jvm.PlatformType", "invoke"})
final class SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$9
extends Lambda
implements Function0 {
    public static final SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$9 Field13191 = new SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$9();
    private String Field13192 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object invoke() {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi();
    }

    public final ABhseIFL1PQVX4WAovmpeO8P6T0dQPpk leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        ABhseIFL1PQVX4WAovmpeO8P6T0dQPpk aBhseIFL1PQVX4WAovmpeO8P6T0dQPpk = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16261;
        Intrinsics.checkExpressionValueIsNotNull((Object)aBhseIFL1PQVX4WAovmpeO8P6T0dQPpk, (String)"Kisman.instance.consoleGui");
        return aBhseIFL1PQVX4WAovmpeO8P6T0dQPpk;
    }

    SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$9() {
        super((int)((long)-520347685 ^ (long)-520347685));
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1074011957L ^ 0x40041F35;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1590081603 ^ (long)1590081724);
            int n2 = ((int)-1153616433L ^ 0xBB3D35FA) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)-2048424733L ^ 0x85E7F7E4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

