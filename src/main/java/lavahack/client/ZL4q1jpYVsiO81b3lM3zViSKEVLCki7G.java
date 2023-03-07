/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.Locale;
import java.util.function.Function;
import lavahack.client.UetbQPfRpTQl6tDXtJtebPKCeLavB0Io;

public final class ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G
extends Enum {
    public static final /* enum */ ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G Field9942 = new ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G("PERCENT", (int)((long)942549767 ^ (long)942549767), number -> {
        Object[] objectArray = new Object[(int)((long)257228662 ^ (long)257228663)];
        objectArray[(int)((long)-407638689 ^ (long)-407638689)] = Float.valueOf(number.floatValue());
        return String.format(Locale.ENGLISH, "%.1f%%", objectArray);
    });
    public static final /* enum */ ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G Field9943 = new ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G("TIME", (int)((long)-1123322021 ^ (long)-1123322022), number -> UetbQPfRpTQl6tDXtJtebPKCeLavB0Io.Field8796.Method1102(number.longValue()));
    public static final /* enum */ ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G Field9944 = new ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G("DECIMAL", (int)((long)2104561754 ^ (long)2104561755) << 1, number -> {
        Object[] objectArray = new Object[(int)-817860377L ^ 0xCF4070E6];
        objectArray[(int)((long)-1463483188 ^ (long)-1463483188)] = Float.valueOf(number.floatValue());
        return String.format(Locale.ENGLISH, "%.4f", objectArray);
    });
    public static final /* enum */ ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G Field9945 = new ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G("INTEGER", (int)2077919317L ^ 0x7BDA8856, number -> Long.toString(number.longValue()));
    private Function Field9946;
    private static final ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G[] Field9947;
    private int Field9948;

    public static ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G[] values() {
        return (ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G[])Field9947.clone();
    }

    public static ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G valueOf(String string) {
        return Enum.valueOf(ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.Field9946 = var3_1;
    }

    public Function Method2190() {
        return this.Field9946;
    }

    static {
        ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G[] zL4q1jpYVsiO81b3lM3zViSKEVLCki7GArray = new ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G[(int)((long)713339294 ^ (long)713339295) << 2];
        zL4q1jpYVsiO81b3lM3zViSKEVLCki7GArray[(int)((long)124807058 ^ (long)124807058)] = Field9942;
        zL4q1jpYVsiO81b3lM3zViSKEVLCki7GArray[(int)((long)-1578330095 ^ (long)-1578330096)] = Field9943;
        zL4q1jpYVsiO81b3lM3zViSKEVLCki7GArray[((int)-2059609594L ^ 0x853CDA07) << 1] = Field9944;
        zL4q1jpYVsiO81b3lM3zViSKEVLCki7GArray[(int)1452644380L ^ 0x5695981F] = Field9945;
        Field9947 = zL4q1jpYVsiO81b3lM3zViSKEVLCki7GArray;
    }

    private static String Method2195(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-2029438680 ^ (long)-2029438680);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1960173503 ^ (long)-1960173378);
            int n2 = (int)((long)1844388155 ^ (long)1844388318);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-420993399 ^ (long)-421002414) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

