/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$IBONRcQCNUBg2NBpVpVQf61ykmVfU03E
extends Enum {
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field12207 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$IBONRcQCNUBg2NBpVpVQf61ykmVfU03E("ManualTick", (int)719999531L ^ 0x2AEA522B);
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field12208 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$IBONRcQCNUBg2NBpVpVQf61ykmVfU03E("ManualRender", (int)((long)271339264 ^ (long)271339265));
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field12209 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$IBONRcQCNUBg2NBpVpVQf61ykmVfU03E("FastTick", ((int)99725005L ^ 0x5F1AECC) << 1);
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field12210 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$IBONRcQCNUBg2NBpVpVQf61ykmVfU03E("FastRender", (int)-984831673L ^ 0xC54CA944);
    private static final b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$IBONRcQCNUBg2NBpVpVQf61ykmVfU03E[] Field12211;
    private int Field12212;

    public static b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$IBONRcQCNUBg2NBpVpVQf61ykmVfU03E[] values() {
        return (b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$IBONRcQCNUBg2NBpVpVQf61ykmVfU03E[])Field12211.clone();
    }

    public static b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$IBONRcQCNUBg2NBpVpVQf61ykmVfU03E valueOf(String string) {
        return Enum.valueOf(b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$IBONRcQCNUBg2NBpVpVQf61ykmVfU03E.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$IBONRcQCNUBg2NBpVpVQf61ykmVfU03E() {
        void var2_-1;
        void var1_-1;
    }

    static {
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$IBONRcQCNUBg2NBpVpVQf61ykmVfU03E[] b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$IBONRcQCNUBg2NBpVpVQf61ykmVfU03EArray = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$IBONRcQCNUBg2NBpVpVQf61ykmVfU03E[(int)((long)-1745924215 ^ (long)-1745924216) << 2];
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$IBONRcQCNUBg2NBpVpVQf61ykmVfU03EArray[(int)((long)1901574616 ^ (long)1901574616)] = Field12207;
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$IBONRcQCNUBg2NBpVpVQf61ykmVfU03EArray[(int)775688931L ^ 0x2E3C12E2] = Field12208;
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$IBONRcQCNUBg2NBpVpVQf61ykmVfU03EArray[((int)1644699344L ^ 0x62081ED1) << 1] = Field12209;
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$IBONRcQCNUBg2NBpVpVQf61ykmVfU03EArray[(int)-2069884397L ^ 0x84A01210] = Field12210;
        Field12211 = b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$IBONRcQCNUBg2NBpVpVQf61ykmVfU03EArray;
    }

    private static String Method3996(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1135972049L ^ 0xBC4A712F;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)124270255L ^ 0x7683650);
            int n2 = (int)((long)-1689688766 ^ (long)-1689688815);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-294413847 ^ (long)-294408454) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

