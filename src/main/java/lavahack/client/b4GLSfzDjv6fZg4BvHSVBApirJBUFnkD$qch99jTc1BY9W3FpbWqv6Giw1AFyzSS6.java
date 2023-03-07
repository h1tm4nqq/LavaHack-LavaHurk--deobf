/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6
extends Enum {
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6 Field9926 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6("Off", (int)((long)433757273 ^ (long)433757273));
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6 Field9927 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6("Place", (int)((long)-112805296 ^ (long)-112805295));
    private static final b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6[] Field9928;
    private String Field9929 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6[] values() {
        return (b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6[])Field9928.clone();
    }

    public static b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6 valueOf(String string) {
        return Enum.valueOf(b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6() {
        void var2_-1;
        void var1_-1;
    }

    static {
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6[] b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6Array = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6[(int)((long)1494816993 ^ (long)1494816992) << 1];
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6Array[(int)((long)1751872608 ^ (long)1751872608)] = Field9926;
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6Array[(int)((long)-2141078430 ^ (long)-2141078429)] = Field9927;
        Field9928 = b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6Array;
    }

    private static String Method2177(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-617468367 ^ (long)-617468367);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)528594193L ^ 0x1F81B5EE);
            int n2 = (int)630758132L ^ 0x25989A03;
            cArray2[n] = (char)(cArray[n] ^ ((int)-1289713503L ^ 0xB320FE1C ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

