/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$eZjgvzONpduAwYxUJP1g1vLc32WdbH9H
extends Enum {
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$eZjgvzONpduAwYxUJP1g1vLc32WdbH9H Field9816 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$eZjgvzONpduAwYxUJP1g1vLc32WdbH9H("Normal", (int)((long)-1526537717 ^ (long)-1526537717));
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$eZjgvzONpduAwYxUJP1g1vLc32WdbH9H Field9817 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$eZjgvzONpduAwYxUJP1g1vLc32WdbH9H("Silent", (int)-698977037L ^ 0xD65674F2);
    private static final b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$eZjgvzONpduAwYxUJP1g1vLc32WdbH9H[] Field9818;
    private String Field9819 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$eZjgvzONpduAwYxUJP1g1vLc32WdbH9H[] values() {
        return (b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$eZjgvzONpduAwYxUJP1g1vLc32WdbH9H[])Field9818.clone();
    }

    public static b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$eZjgvzONpduAwYxUJP1g1vLc32WdbH9H valueOf(String string) {
        return Enum.valueOf(b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$eZjgvzONpduAwYxUJP1g1vLc32WdbH9H.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$eZjgvzONpduAwYxUJP1g1vLc32WdbH9H() {
        void var2_-1;
        void var1_-1;
    }

    static {
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$eZjgvzONpduAwYxUJP1g1vLc32WdbH9H[] b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$eZjgvzONpduAwYxUJP1g1vLc32WdbH9HArray = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$eZjgvzONpduAwYxUJP1g1vLc32WdbH9H[((int)-1050944880L ^ 0xC15BDA91) << 1];
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$eZjgvzONpduAwYxUJP1g1vLc32WdbH9HArray[(int)((long)1308969430 ^ (long)1308969430)] = Field9816;
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$eZjgvzONpduAwYxUJP1g1vLc32WdbH9HArray[(int)((long)-1716905640 ^ (long)-1716905639)] = Field9817;
        Field9818 = b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$eZjgvzONpduAwYxUJP1g1vLc32WdbH9HArray;
    }

    private static String Method2075(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)387442808L ^ 0x1717E878;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1856861379 ^ (long)1856861244);
            int n2 = (int)((long)651311960 ^ (long)651311997) << 2;
            cArray2[n] = (char)(cArray[n] ^ (((int)-755390224L ^ 0xD2F9AD21) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

