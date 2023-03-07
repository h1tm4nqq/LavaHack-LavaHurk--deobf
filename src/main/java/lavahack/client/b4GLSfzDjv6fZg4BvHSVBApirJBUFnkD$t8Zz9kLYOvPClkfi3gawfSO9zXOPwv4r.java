/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r
extends Enum {
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r Field15749 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r("Damage", (int)((long)974418516 ^ (long)974418516));
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r Field15750 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r("MinMax", (int)1558018086L ^ 0x5CDD7827);
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r Field15751 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r("Safety", (int)((long)-873460221 ^ (long)-873460222) << 1);
    private static final b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r[] Field15752;
    private String Field15753 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r[] values() {
        return (b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r[])Field15752.clone();
    }

    public static b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r valueOf(String string) {
        return Enum.valueOf(b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r() {
        void var2_-1;
        void var1_-1;
    }

    static {
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r[] b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4rArray = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r[(int)-2048379783L ^ 0x85E8347A];
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4rArray[(int)-1334004675L ^ 0xB07CB43D] = Field15749;
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4rArray[(int)173608885L ^ 0xA590FB4] = Field15750;
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4rArray[(int)((long)-1162783022 ^ (long)-1162783021) << 1] = Field15751;
        Field15752 = b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4rArray;
    }

    private static String Method6435(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)770039778 ^ (long)770039778);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)2071029551L ^ 0x7B7167D0);
            int n2 = (int)-1341582143L ^ 0xB009140A;
            cArray2[n] = (char)(cArray[n] ^ ((int)-1111826152L ^ 0xBDBADECB ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

