/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class447;

public class Class567 {
    public static final float Field10418 = 0.0f;
    private String Field10419 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static boolean Method2506(float f, float f2) {
        if (!(Math.abs(f) <= f2)) return false;
        return true;
    }

    public static boolean Method2507(double d, double d2) {
        if (!(Math.abs(d) <= d2)) return false;
        return true;
    }

    public static float Method2508(float f, float f2, float f3, float f4) {
        if (f4 <= 0.0f) {
            return f2;
        }
        float f5 = f2 - f;
        if (Class567.Method2506(f5 * f5, Float.intBitsToFloat(953267991))) {
            return f2;
        }
        float f6 = f5 * Class447.Method2117(f3 * f4, 0.0f, 1.0f);
        return f + f6;
    }
}

