/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi
extends Enum {
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi Field14066 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi("Default", (int)((long)-305219382 ^ (long)-305219382));
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi Field14067 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi("FromTo", (int)((long)1935670121 ^ (long)1935670120));
    private static final b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi[] Field14068;
    private int Field14069;

    public static b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi[] values() {
        return (b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi[])Field14068.clone();
    }

    public static b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi valueOf(String string) {
        return Enum.valueOf(b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi() {
        void var2_-1;
        void var1_-1;
    }

    static {
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi[] b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yiArray = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi[(int)((long)356946034 ^ (long)356946035) << 1];
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yiArray[(int)((long)-1031921912 ^ (long)-1031921912)] = Field14066;
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yiArray[(int)((long)-2013035481 ^ (long)-2013035482)] = Field14067;
        Field14068 = b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yiArray;
    }

    private static String Method5362(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)704018556L ^ 0x29F6787C;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)520454328 ^ (long)520454215);
            int n2 = (int)-1083316433L ^ 0xBF6DE796;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1384557742 ^ (long)-1384567421) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

