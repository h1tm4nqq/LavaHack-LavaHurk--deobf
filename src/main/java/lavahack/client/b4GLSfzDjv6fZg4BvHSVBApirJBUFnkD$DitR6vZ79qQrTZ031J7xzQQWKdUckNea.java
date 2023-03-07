/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$DitR6vZ79qQrTZ031J7xzQQWKdUckNea
extends Enum {
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$DitR6vZ79qQrTZ031J7xzQQWKdUckNea Field17518 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$DitR6vZ79qQrTZ031J7xzQQWKdUckNea("Pre", (int)((long)1324136421 ^ (long)1324136421));
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$DitR6vZ79qQrTZ031J7xzQQWKdUckNea Field17519 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$DitR6vZ79qQrTZ031J7xzQQWKdUckNea("Post", (int)((long)-380704125 ^ (long)-380704126));
    private static final b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$DitR6vZ79qQrTZ031J7xzQQWKdUckNea[] Field17520;
    private String Field17521 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$DitR6vZ79qQrTZ031J7xzQQWKdUckNea[] values() {
        return (b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$DitR6vZ79qQrTZ031J7xzQQWKdUckNea[])Field17520.clone();
    }

    public static b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$DitR6vZ79qQrTZ031J7xzQQWKdUckNea valueOf(String string) {
        return Enum.valueOf(b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$DitR6vZ79qQrTZ031J7xzQQWKdUckNea.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$DitR6vZ79qQrTZ031J7xzQQWKdUckNea() {
        void var2_-1;
        void var1_-1;
    }

    static {
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$DitR6vZ79qQrTZ031J7xzQQWKdUckNea[] b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$DitR6vZ79qQrTZ031J7xzQQWKdUckNeaArray = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$DitR6vZ79qQrTZ031J7xzQQWKdUckNea[(int)((long)726421308 ^ (long)726421309) << 1];
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$DitR6vZ79qQrTZ031J7xzQQWKdUckNeaArray[(int)((long)-1899247224 ^ (long)-1899247224)] = Field17518;
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$DitR6vZ79qQrTZ031J7xzQQWKdUckNeaArray[(int)((long)2038016189 ^ (long)2038016188)] = Field17519;
        Field17520 = b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$DitR6vZ79qQrTZ031J7xzQQWKdUckNeaArray;
    }

    private static String Method7621(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-676553267 ^ (long)-676553267);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1500989939L ^ 0x5977490C);
            int n2 = (int)1333060148L ^ 0x4F74E251;
            cArray2[n] = (char)(cArray[n] ^ (((int)1316895471L ^ 0x4E7E1666) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

