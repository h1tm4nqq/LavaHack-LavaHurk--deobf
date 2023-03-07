/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2={"Lcom/kisman/cc/util/enums/CharmsRewriteTypeModes;", "", "(Ljava/lang/String;I)V", "Global", "Wire", "Model", "kisman.cc"})
public final class Odxkrip4zUej3nYA3AyBMPPGaVbfhZp0
extends Enum {
    public static final /* enum */ Odxkrip4zUej3nYA3AyBMPPGaVbfhZp0 Field9166;
    public static final /* enum */ Odxkrip4zUej3nYA3AyBMPPGaVbfhZp0 Field9167;
    public static final /* enum */ Odxkrip4zUej3nYA3AyBMPPGaVbfhZp0 Field9168;
    private static final Odxkrip4zUej3nYA3AyBMPPGaVbfhZp0[] Field9169;
    private String Field9170 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Odxkrip4zUej3nYA3AyBMPPGaVbfhZp0[] odxkrip4zUej3nYA3AyBMPPGaVbfhZp0Array = new Odxkrip4zUej3nYA3AyBMPPGaVbfhZp0[(int)((long)-154746820 ^ (long)-154746817)];
        Odxkrip4zUej3nYA3AyBMPPGaVbfhZp0[] odxkrip4zUej3nYA3AyBMPPGaVbfhZp0Array2 = odxkrip4zUej3nYA3AyBMPPGaVbfhZp0Array;
        odxkrip4zUej3nYA3AyBMPPGaVbfhZp0Array[(int)-493229429L ^ 0xE299EA8B] = Field9166 = new Odxkrip4zUej3nYA3AyBMPPGaVbfhZp0("Global", (int)-254855549L ^ 0xF0CF3683);
        odxkrip4zUej3nYA3AyBMPPGaVbfhZp0Array[(int)-690452121L ^ 0xD6D88966] = Field9167 = new Odxkrip4zUej3nYA3AyBMPPGaVbfhZp0("Wire", (int)((long)1532635092 ^ (long)1532635093));
        odxkrip4zUej3nYA3AyBMPPGaVbfhZp0Array[((int)-1261957253L ^ 0xB4C80F7A) << 1] = Field9168 = new Odxkrip4zUej3nYA3AyBMPPGaVbfhZp0("Model", ((int)1363384566L ^ 0x514398F7) << 1);
        Field9169 = odxkrip4zUej3nYA3AyBMPPGaVbfhZp0Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Odxkrip4zUej3nYA3AyBMPPGaVbfhZp0() {
        void var2_-1;
        void var1_-1;
    }

    public static Odxkrip4zUej3nYA3AyBMPPGaVbfhZp0[] values() {
        return (Odxkrip4zUej3nYA3AyBMPPGaVbfhZp0[])Field9169.clone();
    }

    public static Odxkrip4zUej3nYA3AyBMPPGaVbfhZp0 valueOf(String string) {
        return Enum.valueOf(Odxkrip4zUej3nYA3AyBMPPGaVbfhZp0.class, string);
    }

    private static String Method1428(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-810774063L ^ 0xCFAC91D1;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1740153698L ^ 0x67B8A39D);
            int n2 = ((int)-314635096L ^ 0xED3F0C87) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-473996447 ^ (long)-474006288) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

