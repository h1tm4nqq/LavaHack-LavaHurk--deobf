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
import lavahack.client.qAMntBvpawO7voz5KoEzPRpFPYIb4WHt;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n\u00a2\u0006\u0002\b\u0003"}, d2={"<anonymous>", "Lcom/kisman/cc/gui/csgo/ClickGuiNew;", "kotlin.jvm.PlatformType", "invoke"})
final class SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$5
extends Lambda
implements Function0 {
    public static final SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$5 Field13174 = new SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$5();
    private String Field13175 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object invoke() {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi();
    }

    public final qAMntBvpawO7voz5KoEzPRpFPYIb4WHt leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        qAMntBvpawO7voz5KoEzPRpFPYIb4WHt qAMntBvpawO7voz5KoEzPRpFPYIb4WHt2 = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16260;
        Intrinsics.checkExpressionValueIsNotNull((Object)((Object)qAMntBvpawO7voz5KoEzPRpFPYIb4WHt2), (String)"Kisman.instance.clickGuiNew");
        return qAMntBvpawO7voz5KoEzPRpFPYIb4WHt2;
    }

    SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$5() {
        super((int)186044335L ^ 0xB16CFAF);
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1964905279 ^ (long)1964905279);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1780756679 ^ (long)1780756536);
            int n2 = (int)((long)1474787931 ^ (long)1474788092);
            cArray2[n] = (char)(cArray[n] ^ ((int)-162474241L ^ 0xF6508AF2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

