/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.dHW1jZK49fXgBu9AY91BXDMHsTGGza8u;

public class mZKglU52NJKeleKf9WRZyyfpIeAgybGE {
    public static final float Field10418 = 0.0f;
    private String Field10419 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static boolean Method2506(float f, float f2) {
        boolean bl;
        if (Math.abs(f) <= f2) {
            bl = (int)305331525L ^ 0x1232FD44;
            return bl;
        }
        bl = (int)-1135081861L ^ 0xBC58067B;
        return bl;
    }

    public static boolean Method2507(double d, double d2) {
        int n;
        if (Math.abs(d) <= d2) {
            n = (int)((long)1487528636 ^ (long)1487528637);
            return n != 0;
        }
        n = (int)((long)2062191022 ^ (long)2062191022);
        return n != 0;
    }

    public static float Method2508(float f, float f2, float f3, float f4) {
        if (f4 <= 0.0f) {
            return f2;
        }
        float f5 = f2 - f;
        if (mZKglU52NJKeleKf9WRZyyfpIeAgybGE.Method2506(f5 * f5, Float.intBitsToFloat((int)128497114L ^ 0x3F7902CD))) {
            return f2;
        }
        float f6 = f5 * dHW1jZK49fXgBu9AY91BXDMHsTGGza8u.Method2117(f3 * f4, 0.0f, 1.0f);
        return f + f6;
    }
}

