/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.loader;

import com.kisman.cc.loader.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import com.kisman.cc.loader.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "run"})
final class Ljc0gDTN8WkwPRHY480HpEkScGALG41A$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
implements Runnable {
    final String Field15159;
    final String Field15160;
    private String Field15161 = "TheKisDevs & LavaHack Development owns you";

    @Override
    public final void run() {
        String string = UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method4892(this.Field15159);
        Intrinsics.checkExpressionValueIsNotNull((Object)string, (String)"Utility.cleaner(key)");
        String string2 = UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method4887();
        Intrinsics.checkExpressionValueIsNotNull((Object)string2, (String)"Utility.properties()");
        String string3 = String.valueOf(Runtime.getRuntime().availableProcessors());
        String string4 = UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method4889(this.Field15160);
        Intrinsics.checkExpressionValueIsNotNull((Object)string4, (String)"Utility.stringFixer(version)");
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method4855(string, "2.0", string2, string3, string4);
    }

    Ljc0gDTN8WkwPRHY480HpEkScGALG41A$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(String string, String string2) {
        this.Field15159 = string;
        this.Field15160 = string2;
    }

    private static String Method6074(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1965185578 ^ (long)1965185578);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)728039773 ^ (long)728039842);
            int n2 = (int)((long)162515691 ^ (long)162515676);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1043679089 ^ (long)1043681984) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

