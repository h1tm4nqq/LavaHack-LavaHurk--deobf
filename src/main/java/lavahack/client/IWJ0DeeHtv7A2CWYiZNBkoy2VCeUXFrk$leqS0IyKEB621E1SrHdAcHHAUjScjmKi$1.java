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
import lavahack.client.IWJ0DeeHtv7A2CWYiZNBkoy2VCeUXFrk;
import lavahack.client.IWJ0DeeHtv7A2CWYiZNBkoy2VCeUXFrk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "run"})
final class IWJ0DeeHtv7A2CWYiZNBkoy2VCeUXFrk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$1
implements Runnable {
    final IWJ0DeeHtv7A2CWYiZNBkoy2VCeUXFrk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field17002;
    private String Field17003 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public final void run() {
        IWJ0DeeHtv7A2CWYiZNBkoy2VCeUXFrk iWJ0DeeHtv7A2CWYiZNBkoy2VCeUXFrk = this.Field17002.Field13148;
        IWJ0DeeHtv7A2CWYiZNBkoy2VCeUXFrk iWJ0DeeHtv7A2CWYiZNBkoy2VCeUXFrk2 = this.Field17002.Field13148;
        double d = ((Number)IWJ0DeeHtv7A2CWYiZNBkoy2VCeUXFrk.Method503(this.Field17002.Field13148).get()).doubleValue();
        Object t = IWJ0DeeHtv7A2CWYiZNBkoy2VCeUXFrk.Method503(this.Field17002.Field13148).get();
        Intrinsics.checkExpressionValueIsNotNull(t, (String)"range.get()");
        iWJ0DeeHtv7A2CWYiZNBkoy2VCeUXFrk.Method497(iWJ0DeeHtv7A2CWYiZNBkoy2VCeUXFrk2.Method500((float)(d * ((Number)t).doubleValue())));
    }

    IWJ0DeeHtv7A2CWYiZNBkoy2VCeUXFrk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$1(IWJ0DeeHtv7A2CWYiZNBkoy2VCeUXFrk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi iWJ0DeeHtv7A2CWYiZNBkoy2VCeUXFrk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
        this.Field17002 = iWJ0DeeHtv7A2CWYiZNBkoy2VCeUXFrk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
    }

    private static String Method7234(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1280783574 ^ (long)1280783574);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1241445377L ^ 0xB6010B00);
            int n2 = ((int)-376514528L ^ 0xE98ED83D) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-842168063 ^ (long)-842161950) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

