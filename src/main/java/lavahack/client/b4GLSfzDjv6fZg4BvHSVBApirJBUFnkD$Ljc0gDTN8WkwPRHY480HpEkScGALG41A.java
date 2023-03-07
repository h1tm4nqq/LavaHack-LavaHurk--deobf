/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$Ljc0gDTN8WkwPRHY480HpEkScGALG41A
extends Enum {
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$Ljc0gDTN8WkwPRHY480HpEkScGALG41A Field10076 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$Ljc0gDTN8WkwPRHY480HpEkScGALG41A("None", (int)((long)189510618 ^ (long)189510618));
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$Ljc0gDTN8WkwPRHY480HpEkScGALG41A Field10077 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$Ljc0gDTN8WkwPRHY480HpEkScGALG41A("Stupid", (int)((long)84862639 ^ (long)84862638));
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$Ljc0gDTN8WkwPRHY480HpEkScGALG41A Field10078 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$Ljc0gDTN8WkwPRHY480HpEkScGALG41A("Smart", ((int)34510339L ^ 0x20E9602) << 1);
    private static final b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$Ljc0gDTN8WkwPRHY480HpEkScGALG41A[] Field10079;
    private String Field10080 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$Ljc0gDTN8WkwPRHY480HpEkScGALG41A[] values() {
        return (b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$Ljc0gDTN8WkwPRHY480HpEkScGALG41A[])Field10079.clone();
    }

    public static b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$Ljc0gDTN8WkwPRHY480HpEkScGALG41A valueOf(String string) {
        return Enum.valueOf(b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$Ljc0gDTN8WkwPRHY480HpEkScGALG41A.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$Ljc0gDTN8WkwPRHY480HpEkScGALG41A() {
        void var2_-1;
        void var1_-1;
    }

    static {
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$Ljc0gDTN8WkwPRHY480HpEkScGALG41A[] b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$Ljc0gDTN8WkwPRHY480HpEkScGALG41AArray = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$Ljc0gDTN8WkwPRHY480HpEkScGALG41A[(int)((long)-2134377166 ^ (long)-2134377167)];
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$Ljc0gDTN8WkwPRHY480HpEkScGALG41AArray[(int)((long)222036677 ^ (long)222036677)] = Field10076;
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$Ljc0gDTN8WkwPRHY480HpEkScGALG41AArray[(int)2130568079L ^ 0x7EFDE38E] = Field10077;
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$Ljc0gDTN8WkwPRHY480HpEkScGALG41AArray[(int)((long)855026754 ^ (long)855026755) << 1] = Field10078;
        Field10079 = b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$Ljc0gDTN8WkwPRHY480HpEkScGALG41AArray;
    }

    private static String Method2298(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)334866255 ^ (long)334866255);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1660571356 ^ (long)1660571171);
            int n2 = ((int)-1085004009L ^ 0xBF542766) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)160074773 ^ (long)160086312) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

