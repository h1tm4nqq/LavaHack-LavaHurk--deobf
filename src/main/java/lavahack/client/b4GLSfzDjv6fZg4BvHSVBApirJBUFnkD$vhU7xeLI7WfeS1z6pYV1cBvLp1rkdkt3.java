/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3
extends Enum {
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3 Field14027 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3("Update", (int)((long)485670090 ^ (long)485670090));
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3 Field14028 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3("Tick", (int)-1287907860L ^ 0xB33C15ED);
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3 Field14029 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3("Render3D", (int)((long)-33873250 ^ (long)-33873249) << 1);
    private static final b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3[] Field14030;
    private int Field14031;

    public static b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3[] values() {
        return (b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3[])Field14030.clone();
    }

    public static b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3 valueOf(String string) {
        return Enum.valueOf(b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3() {
        void var2_-1;
        void var1_-1;
    }

    static {
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3[] b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3Array = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3[(int)((long)1903592196 ^ (long)1903592199)];
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3Array[(int)-271652829L ^ 0xEFCEE823] = Field14027;
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3Array[(int)-1607287149L ^ 0xA032BE92] = Field14028;
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3Array[((int)618527662L ^ 0x24DDFBAF) << 1] = Field14029;
        Field14030 = b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3Array;
    }

    private static String Method5341(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1267321115L ^ 0xB47636E5;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1018563473L ^ 0x3CB60B6E);
            int n2 = (int)((long)2124835824 ^ (long)2124835723) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)-23027193L ^ 0xFEA09004) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

