/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2={"Lcom/kisman/cc/features/module/movement/speed/util/Motion;", "", "(Ljava/lang/String;I)V", "X", "Z", "mX", "mZ", "kisman.cc"})
public final class sXb0ExYF6wpsEvB6M7hzPybqAKy95yMt
extends Enum {
    public static final /* enum */ sXb0ExYF6wpsEvB6M7hzPybqAKy95yMt Field10392;
    public static final /* enum */ sXb0ExYF6wpsEvB6M7hzPybqAKy95yMt Field10393;
    public static final /* enum */ sXb0ExYF6wpsEvB6M7hzPybqAKy95yMt Field10394;
    public static final /* enum */ sXb0ExYF6wpsEvB6M7hzPybqAKy95yMt Field10395;
    private static final sXb0ExYF6wpsEvB6M7hzPybqAKy95yMt[] Field10396;
    private String Field10397 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        sXb0ExYF6wpsEvB6M7hzPybqAKy95yMt[] sXb0ExYF6wpsEvB6M7hzPybqAKy95yMtArray = new sXb0ExYF6wpsEvB6M7hzPybqAKy95yMt[((int)526203528L ^ 0x1F5D3A89) << 2];
        sXb0ExYF6wpsEvB6M7hzPybqAKy95yMt[] sXb0ExYF6wpsEvB6M7hzPybqAKy95yMtArray2 = sXb0ExYF6wpsEvB6M7hzPybqAKy95yMtArray;
        sXb0ExYF6wpsEvB6M7hzPybqAKy95yMtArray[(int)-447849178L ^ 0xE54E5D26] = Field10392 = new sXb0ExYF6wpsEvB6M7hzPybqAKy95yMt("X", (int)((long)-256528435 ^ (long)-256528435));
        sXb0ExYF6wpsEvB6M7hzPybqAKy95yMtArray[(int)274112925L ^ 0x1056A19C] = Field10393 = new sXb0ExYF6wpsEvB6M7hzPybqAKy95yMt("Z", (int)1606416321L ^ 0x5FBFF7C0);
        sXb0ExYF6wpsEvB6M7hzPybqAKy95yMtArray[((int)-706095541L ^ 0xD5E9D64A) << 1] = Field10394 = new sXb0ExYF6wpsEvB6M7hzPybqAKy95yMt("mX", ((int)204093408L ^ 0xC2A37E1) << 1);
        sXb0ExYF6wpsEvB6M7hzPybqAKy95yMtArray[(int)((long)1694406648 ^ (long)1694406651)] = Field10395 = new sXb0ExYF6wpsEvB6M7hzPybqAKy95yMt("mZ", (int)((long)1766962683 ^ (long)1766962680));
        Field10396 = sXb0ExYF6wpsEvB6M7hzPybqAKy95yMtArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private sXb0ExYF6wpsEvB6M7hzPybqAKy95yMt() {
        void var2_-1;
        void var1_-1;
    }

    public static sXb0ExYF6wpsEvB6M7hzPybqAKy95yMt[] values() {
        return (sXb0ExYF6wpsEvB6M7hzPybqAKy95yMt[])Field10396.clone();
    }

    public static sXb0ExYF6wpsEvB6M7hzPybqAKy95yMt valueOf(String string) {
        return Enum.valueOf(sXb0ExYF6wpsEvB6M7hzPybqAKy95yMt.class, string);
    }

    private static String Method2479(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)711921727L ^ 0x2A6F103F;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-835980629L ^ 0xCE2BF254);
            int n2 = (int)((long)-1010600139 ^ (long)-1010600156) << 2;
            cArray2[n] = (char)(cArray[n] ^ (((int)841606264L ^ 0x3229D979) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

