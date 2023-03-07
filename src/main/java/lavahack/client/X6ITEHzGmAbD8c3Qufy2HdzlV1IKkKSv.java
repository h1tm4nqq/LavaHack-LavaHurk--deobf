/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/util/enums/PvpResourcesStyles;", "", "(Ljava/lang/String;I)V", "Vertical", "Square", "kisman.cc"})
public final class X6ITEHzGmAbD8c3Qufy2HdzlV1IKkKSv
extends Enum {
    public static final /* enum */ X6ITEHzGmAbD8c3Qufy2HdzlV1IKkKSv Field10794;
    public static final /* enum */ X6ITEHzGmAbD8c3Qufy2HdzlV1IKkKSv Field10795;
    private static final X6ITEHzGmAbD8c3Qufy2HdzlV1IKkKSv[] Field10796;
    private String Field10797 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        X6ITEHzGmAbD8c3Qufy2HdzlV1IKkKSv[] x6ITEHzGmAbD8c3Qufy2HdzlV1IKkKSvArray = new X6ITEHzGmAbD8c3Qufy2HdzlV1IKkKSv[(int)((long)-1465081454 ^ (long)-1465081453) << 1];
        X6ITEHzGmAbD8c3Qufy2HdzlV1IKkKSv[] x6ITEHzGmAbD8c3Qufy2HdzlV1IKkKSvArray2 = x6ITEHzGmAbD8c3Qufy2HdzlV1IKkKSvArray;
        x6ITEHzGmAbD8c3Qufy2HdzlV1IKkKSvArray[(int)-54354396L ^ 0xFCC29E24] = Field10794 = new X6ITEHzGmAbD8c3Qufy2HdzlV1IKkKSv("Vertical", (int)-1259097548L ^ 0xB4F3B234);
        x6ITEHzGmAbD8c3Qufy2HdzlV1IKkKSvArray[(int)-460948183L ^ 0xE4867D28] = Field10795 = new X6ITEHzGmAbD8c3Qufy2HdzlV1IKkKSv("Square", (int)1539174147L ^ 0x5BBDEF02);
        Field10796 = x6ITEHzGmAbD8c3Qufy2HdzlV1IKkKSvArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private X6ITEHzGmAbD8c3Qufy2HdzlV1IKkKSv() {
        void var2_-1;
        void var1_-1;
    }

    public static X6ITEHzGmAbD8c3Qufy2HdzlV1IKkKSv[] values() {
        return (X6ITEHzGmAbD8c3Qufy2HdzlV1IKkKSv[])Field10796.clone();
    }

    public static X6ITEHzGmAbD8c3Qufy2HdzlV1IKkKSv valueOf(String string) {
        return Enum.valueOf(X6ITEHzGmAbD8c3Qufy2HdzlV1IKkKSv.class, string);
    }

    private static String Method2821(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1865433639L ^ 0x90CFBDD9;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-418264072 ^ (long)-418264313);
            int n2 = (int)((long)234772191 ^ (long)234772134);
            cArray2[n] = (char)(cArray[n] ^ (((int)-585385963L ^ 0xDD1BBD1E) << 4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

