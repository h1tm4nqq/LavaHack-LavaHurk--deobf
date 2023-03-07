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
import lavahack.client.qc9FwVpWiqRQho5VXPrDfJ5nrkFdG0Ld;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n\u00a2\u0006\u0002\b\u0003"}, d2={"<anonymous>", "Lcom/kisman/cc/gui/other/music/MusicGui;", "kotlin.jvm.PlatformType", "invoke"})
final class SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$8
extends Lambda
implements Function0 {
    public static final SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$8 Field13189 = new SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$8();
    private int Field13190;

    public Object invoke() {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi();
    }

    public final qc9FwVpWiqRQho5VXPrDfJ5nrkFdG0Ld leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        qc9FwVpWiqRQho5VXPrDfJ5nrkFdG0Ld qc9FwVpWiqRQho5VXPrDfJ5nrkFdG0Ld2 = leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16270;
        Intrinsics.checkExpressionValueIsNotNull((Object)((Object)qc9FwVpWiqRQho5VXPrDfJ5nrkFdG0Ld2), (String)"Kisman.instance.musicGui");
        return qc9FwVpWiqRQho5VXPrDfJ5nrkFdG0Ld2;
    }

    SkQeqyCOChLN1lnQfJFyi0gfpNl3LBi6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$8() {
        super((int)((long)2004233247 ^ (long)2004233247));
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1172932033L ^ 0x45E985C1;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)375471861L ^ 0x16613E0A);
            int n2 = ((int)-1072998725L ^ 0xC00B56A0) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)343074673 ^ (long)343075132) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

