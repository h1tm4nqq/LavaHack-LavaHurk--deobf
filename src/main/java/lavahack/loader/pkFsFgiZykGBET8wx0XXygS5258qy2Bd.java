/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.loader;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2={"Lcom/kisman/cc/loader/websockets/api/enums/CloseHandshakeType;", "", "(Ljava/lang/String;I)V", "NONE", "ONEWAY", "TWOWAY", "kisman.cc"})
public final class pkFsFgiZykGBET8wx0XXygS5258qy2Bd
extends Enum {
    public static final /* enum */ pkFsFgiZykGBET8wx0XXygS5258qy2Bd Field13228;
    public static final /* enum */ pkFsFgiZykGBET8wx0XXygS5258qy2Bd Field13229;
    public static final /* enum */ pkFsFgiZykGBET8wx0XXygS5258qy2Bd Field13230;
    private static final pkFsFgiZykGBET8wx0XXygS5258qy2Bd[] Field13231;
    private String Field13232 = "TheKisDevs & LavaHack Development owns you";

    static {
        pkFsFgiZykGBET8wx0XXygS5258qy2Bd[] pkFsFgiZykGBET8wx0XXygS5258qy2BdArray = new pkFsFgiZykGBET8wx0XXygS5258qy2Bd[(int)((long)1357282543 ^ (long)1357282540)];
        pkFsFgiZykGBET8wx0XXygS5258qy2Bd[] pkFsFgiZykGBET8wx0XXygS5258qy2BdArray2 = pkFsFgiZykGBET8wx0XXygS5258qy2BdArray;
        pkFsFgiZykGBET8wx0XXygS5258qy2BdArray[(int)1019160994L ^ 0x3CBF29A2] = Field13228 = new pkFsFgiZykGBET8wx0XXygS5258qy2Bd("NONE", (int)((long)-510247448 ^ (long)-510247448));
        pkFsFgiZykGBET8wx0XXygS5258qy2BdArray[(int)((long)345587807 ^ (long)345587806)] = Field13229 = new pkFsFgiZykGBET8wx0XXygS5258qy2Bd("ONEWAY", (int)1323975301L ^ 0x4EEA4284);
        pkFsFgiZykGBET8wx0XXygS5258qy2BdArray[((int)326017557L ^ 0x136EA214) << 1] = Field13230 = new pkFsFgiZykGBET8wx0XXygS5258qy2Bd("TWOWAY", ((int)1574222338L ^ 0x5DD4BA03) << 1);
        Field13231 = pkFsFgiZykGBET8wx0XXygS5258qy2BdArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private pkFsFgiZykGBET8wx0XXygS5258qy2Bd() {
        void var2_-1;
        void var1_-1;
    }

    public static pkFsFgiZykGBET8wx0XXygS5258qy2Bd[] values() {
        return (pkFsFgiZykGBET8wx0XXygS5258qy2Bd[])Field13231.clone();
    }

    public static pkFsFgiZykGBET8wx0XXygS5258qy2Bd valueOf(String string) {
        return Enum.valueOf(pkFsFgiZykGBET8wx0XXygS5258qy2Bd.class, string);
    }

    private static String Method4680(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)2047408601 ^ (long)2047408601);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)322667044 ^ (long)322667227);
            int n2 = (int)((long)-868889806 ^ (long)-868889835) << 2;
            cArray2[n] = (char)(cArray[n] ^ (((int)1281490591L ^ 0x4C61C518) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

