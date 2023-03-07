/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy
extends Enum {
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy Field15184 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy("Sequential", (int)((long)1184701582 ^ (long)1184701582));
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy Field15185 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy("Adaptive", (int)-710367576L ^ 0xD5A8A6A9);
    private static final b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy[] Field15186;
    private String Field15187 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy[] values() {
        return (b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy[])Field15186.clone();
    }

    public static b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy valueOf(String string) {
        return Enum.valueOf(b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy() {
        void var2_-1;
        void var1_-1;
    }

    static {
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy[] b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$ARQmBQvY5BCKjQHAEtWILloZwAOUZwhyArray = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy[((int)866303683L ^ 0x33A2BEC2) << 1];
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$ARQmBQvY5BCKjQHAEtWILloZwAOUZwhyArray[(int)((long)-597440437 ^ (long)-597440437)] = Field15184;
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$ARQmBQvY5BCKjQHAEtWILloZwAOUZwhyArray[(int)775520529L ^ 0x2E398110] = Field15185;
        Field15186 = b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$ARQmBQvY5BCKjQHAEtWILloZwAOUZwhyArray;
    }

    private static String Method6086(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-600316031L ^ 0xDC37E781;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1499897755L ^ 0xA699609A);
            int n2 = (int)((long)-1947028461 ^ (long)-1947028320);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-778790178 ^ (long)-778774009) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

