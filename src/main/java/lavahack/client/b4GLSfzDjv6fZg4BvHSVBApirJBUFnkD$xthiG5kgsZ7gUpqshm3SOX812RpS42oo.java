/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$xthiG5kgsZ7gUpqshm3SOX812RpS42oo
extends Enum {
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$xthiG5kgsZ7gUpqshm3SOX812RpS42oo Field17673 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$xthiG5kgsZ7gUpqshm3SOX812RpS42oo("None", (int)1092164870L ^ 0x41191D06);
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$xthiG5kgsZ7gUpqshm3SOX812RpS42oo Field17674 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$xthiG5kgsZ7gUpqshm3SOX812RpS42oo("Default", (int)((long)-1708312490 ^ (long)-1708312489));
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$xthiG5kgsZ7gUpqshm3SOX812RpS42oo Field17675 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$xthiG5kgsZ7gUpqshm3SOX812RpS42oo("Advanced", ((int)-623390749L ^ 0xDAD7CFE2) << 1);
    private static final b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$xthiG5kgsZ7gUpqshm3SOX812RpS42oo[] Field17676;
    private int Field17677;

    public static b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$xthiG5kgsZ7gUpqshm3SOX812RpS42oo[] values() {
        return (b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$xthiG5kgsZ7gUpqshm3SOX812RpS42oo[])Field17676.clone();
    }

    public static b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$xthiG5kgsZ7gUpqshm3SOX812RpS42oo valueOf(String string) {
        return Enum.valueOf(b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$xthiG5kgsZ7gUpqshm3SOX812RpS42oo.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$xthiG5kgsZ7gUpqshm3SOX812RpS42oo() {
        void var2_-1;
        void var1_-1;
    }

    static {
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$xthiG5kgsZ7gUpqshm3SOX812RpS42oo[] b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$xthiG5kgsZ7gUpqshm3SOX812RpS42ooArray = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$xthiG5kgsZ7gUpqshm3SOX812RpS42oo[(int)((long)1477039159 ^ (long)1477039156)];
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$xthiG5kgsZ7gUpqshm3SOX812RpS42ooArray[(int)1149121432L ^ 0x447E3398] = Field17673;
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$xthiG5kgsZ7gUpqshm3SOX812RpS42ooArray[(int)-149549699L ^ 0xF7160D7C] = Field17674;
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$xthiG5kgsZ7gUpqshm3SOX812RpS42ooArray[((int)1077101346L ^ 0x40334323) << 1] = Field17675;
        Field17676 = b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$xthiG5kgsZ7gUpqshm3SOX812RpS42ooArray;
    }

    private static String Method7664(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-230211227 ^ (long)-230211227);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-832071689L ^ 0xCE679708);
            int n2 = (int)((long)-681364605 ^ (long)-681364546) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-241081798 ^ (long)-241087017) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

