/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$agYEaptPUW8OPC6jB7DK1WZuIoCKRIex
extends Enum {
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$agYEaptPUW8OPC6jB7DK1WZuIoCKRIex Field16121 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$agYEaptPUW8OPC6jB7DK1WZuIoCKRIex("None", (int)1500982858L ^ 0x59772E4A);
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$agYEaptPUW8OPC6jB7DK1WZuIoCKRIex Field16122 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$agYEaptPUW8OPC6jB7DK1WZuIoCKRIex("Stupid", (int)-215662249L ^ 0xF3254156);
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$agYEaptPUW8OPC6jB7DK1WZuIoCKRIex Field16123 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$agYEaptPUW8OPC6jB7DK1WZuIoCKRIex("Smart", ((int)-2011699909L ^ 0x8817E53A) << 1);
    private static final b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$agYEaptPUW8OPC6jB7DK1WZuIoCKRIex[] Field16124;
    private String Field16125 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$agYEaptPUW8OPC6jB7DK1WZuIoCKRIex[] values() {
        return (b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$agYEaptPUW8OPC6jB7DK1WZuIoCKRIex[])Field16124.clone();
    }

    public static b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$agYEaptPUW8OPC6jB7DK1WZuIoCKRIex valueOf(String string) {
        return Enum.valueOf(b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$agYEaptPUW8OPC6jB7DK1WZuIoCKRIex.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$agYEaptPUW8OPC6jB7DK1WZuIoCKRIex() {
        void var2_-1;
        void var1_-1;
    }

    static {
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$agYEaptPUW8OPC6jB7DK1WZuIoCKRIex[] b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$agYEaptPUW8OPC6jB7DK1WZuIoCKRIexArray = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$agYEaptPUW8OPC6jB7DK1WZuIoCKRIex[(int)((long)704215728 ^ (long)704215731)];
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$agYEaptPUW8OPC6jB7DK1WZuIoCKRIexArray[(int)127066341L ^ 0x792E0E5] = Field16121;
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$agYEaptPUW8OPC6jB7DK1WZuIoCKRIexArray[(int)-1646394261L ^ 0x9DDE046A] = Field16122;
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$agYEaptPUW8OPC6jB7DK1WZuIoCKRIexArray[((int)-848833343L ^ 0xCD67D4C0) << 1] = Field16123;
        Field16124 = b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$agYEaptPUW8OPC6jB7DK1WZuIoCKRIexArray;
    }

    private static String Method6717(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1882945778L ^ 0x8FC4870E;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1040347921L ^ 0xC1FD8C10);
            int n2 = ((int)1508000291L ^ 0x59E2423E) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1845254938 ^ (long)1845241631) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

