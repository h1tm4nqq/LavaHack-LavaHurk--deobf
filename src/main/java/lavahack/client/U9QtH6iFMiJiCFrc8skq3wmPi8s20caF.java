/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class U9QtH6iFMiJiCFrc8skq3wmPi8s20caF
extends Enum {
    public static final /* enum */ U9QtH6iFMiJiCFrc8skq3wmPi8s20caF Field12820 = new U9QtH6iFMiJiCFrc8skq3wmPi8s20caF("NAME_ASC", (int)((long)-124111868 ^ (long)-124111868), "name", "\u2191", (vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi, vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi2) -> {
        String string = vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method7229();
        String string2 = vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi2.Method7229();
        return string.compareTo(string2);
    });
    public static final /* enum */ U9QtH6iFMiJiCFrc8skq3wmPi8s20caF Field12821 = new U9QtH6iFMiJiCFrc8skq3wmPi8s20caF("NAME_DESC", (int)((long)-76212484 ^ (long)-76212483), "name", "\u2193", (vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi, vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi2) -> {
        String string = vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method7229();
        String string2 = vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi2.Method7229();
        return string2.compareTo(string);
    });
    public static final /* enum */ U9QtH6iFMiJiCFrc8skq3wmPi8s20caF Field12822 = new U9QtH6iFMiJiCFrc8skq3wmPi8s20caF("SIZE_ASC", ((int)-904026100L ^ 0xCA1DA80D) << 1, "amount", "\u2191", (vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi, vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi2) -> vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16999 - vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi2.Field16999);
    public static final /* enum */ U9QtH6iFMiJiCFrc8skq3wmPi8s20caF Field12823 = new U9QtH6iFMiJiCFrc8skq3wmPi8s20caF("SIZE_DESC", (int)((long)724107540 ^ (long)724107543), "amount", "\u2193", (vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi, vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi2) -> vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi2.Field16999 - vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16999);
    private final Comparator Field12824;
    public final String Field12825;
    public final String Field12826;
    private static final U9QtH6iFMiJiCFrc8skq3wmPi8s20caF[] Field12827;
    private int Field12828;

    public static U9QtH6iFMiJiCFrc8skq3wmPi8s20caF[] values() {
        return (U9QtH6iFMiJiCFrc8skq3wmPi8s20caF[])Field12827.clone();
    }

    public static U9QtH6iFMiJiCFrc8skq3wmPi8s20caF valueOf(String string) {
        return Enum.valueOf(U9QtH6iFMiJiCFrc8skq3wmPi8s20caF.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private U9QtH6iFMiJiCFrc8skq3wmPi8s20caF(Comparator comparator) {
        void var5_3;
        void var4_2;
        void var2_-1;
        void var1_-1;
        this.Field12825 = comparator;
        this.Field12826 = var4_2;
        this.Field12824 = var5_3;
    }

    public void Method4360(List list) {
        Collections.sort(list, this.Field12824);
    }

    public U9QtH6iFMiJiCFrc8skq3wmPi8s20caF Method4361() {
        U9QtH6iFMiJiCFrc8skq3wmPi8s20caF[] u9QtH6iFMiJiCFrc8skq3wmPi8s20caFArray = U9QtH6iFMiJiCFrc8skq3wmPi8s20caF.values();
        return u9QtH6iFMiJiCFrc8skq3wmPi8s20caFArray[(this.ordinal() + ((int)1807695295L ^ 0x6BBF3DBE)) % u9QtH6iFMiJiCFrc8skq3wmPi8s20caFArray.length];
    }

    public static U9QtH6iFMiJiCFrc8skq3wmPi8s20caF Method4362(String string) {
        return U9QtH6iFMiJiCFrc8skq3wmPi8s20caF.valueOf(string);
    }

    static {
        U9QtH6iFMiJiCFrc8skq3wmPi8s20caF[] u9QtH6iFMiJiCFrc8skq3wmPi8s20caFArray = new U9QtH6iFMiJiCFrc8skq3wmPi8s20caF[(int)((long)1171095382 ^ (long)1171095383) << 2];
        u9QtH6iFMiJiCFrc8skq3wmPi8s20caFArray[(int)-538010779L ^ 0xDFEE9B65] = Field12820;
        u9QtH6iFMiJiCFrc8skq3wmPi8s20caFArray[(int)1431486734L ^ 0x5552C10F] = Field12821;
        u9QtH6iFMiJiCFrc8skq3wmPi8s20caFArray[((int)804581273L ^ 0x2FF4EF98) << 1] = Field12822;
        u9QtH6iFMiJiCFrc8skq3wmPi8s20caFArray[(int)104019304L ^ 0x633356B] = Field12823;
        Field12827 = u9QtH6iFMiJiCFrc8skq3wmPi8s20caFArray;
    }

    private static String Method4367(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1521821955 ^ (long)-1521821955);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-2084121373L ^ 0x83C6D41C);
            int n2 = (int)((long)1613252248 ^ (long)1613252199);
            cArray2[n] = (char)(cArray[n] ^ ((int)-1809536538L ^ 0x94249FE7 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

