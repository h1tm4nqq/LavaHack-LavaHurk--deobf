/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV
extends Enum {
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Field14258 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV("None", (int)-371948377L ^ 0xE9D484A7);
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Field14259 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV("RemoveEntity", (int)((long)-1219738638 ^ (long)-1219738637));
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Field14260 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV("SetDead", (int)((long)1152635751 ^ (long)1152635750) << 1);
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Field14261 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV("Both", (int)-1668289032L ^ 0x9C8FEDFB);
    private static final b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV[] Field14262;
    private int Field14263;

    public static b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV[] values() {
        return (b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV[])Field14262.clone();
    }

    public static b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV valueOf(String string) {
        return Enum.valueOf(b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV() {
        void var2_-1;
        void var1_-1;
    }

    static {
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV[] b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV[((int)-1126418393L ^ 0xBCDC3826) << 2];
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray[(int)-1260755363L ^ 0xB4DA665D] = Field14258;
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray[(int)307427003L ^ 0x1252F6BA] = Field14259;
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray[(int)((long)-406262963 ^ (long)-406262964) << 1] = Field14260;
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray[(int)((long)1381156339 ^ (long)1381156336)] = Field14261;
        Field14262 = b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray;
    }

    private static String Method5484(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-2055334511L ^ 0x857E1591;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1164202726 ^ (long)-1164202523);
            int n2 = ((int)1459227339L ^ 0x56FA0ACC) << 4;
            cArray2[n] = (char)(cArray[n] ^ (((int)1599196324L ^ 0x5F51D653) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

