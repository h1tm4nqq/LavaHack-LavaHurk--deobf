/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public class Wk0rB5tCxaols7h6NITzxtpKMj2yHNue {
    private static final int Field13210;
    private static final int Field13211;
    private static final int Field13212;
    private static final int Field13213;
    private static final int Field13214;
    private static final float Field13215;
    private static final float[] Field13216;
    private String Field13217 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static void Method4678() {
        int n = (int)((long)2140591584 ^ (long)2140591584);
        while (n < Field13214) {
            for (int i = (int)707951779L ^ 0x2A327CA3; i < Field13214; ++i) {
                float f = (float)n / (float)Field13214;
                float f2 = (float)i / (float)Field13214;
                Wk0rB5tCxaols7h6NITzxtpKMj2yHNue.Field13216[i * Wk0rB5tCxaols7h6NITzxtpKMj2yHNue.Field13214 + n] = (float)Math.atan2(f2, f);
            }
            ++n;
        }
    }

    public static float Method4679(double d, double d2) {
        float f;
        float f2;
        if (d2 < 0.0) {
            if (d < 0.0) {
                d2 = -d2;
                d = -d;
                f2 = 1.0f;
            } else {
                d2 = -d2;
                f2 = Float.intBitsToFloat((int)1162681405L ^ 0xFACD1C3D);
            }
            f = Float.intBitsToFloat(0x5A6851F4 ^ 0x9A215E2F);
        } else {
            if (d < 0.0) {
                d = -d;
                f2 = Float.intBitsToFloat(0x7B276120 ^ 0xC4A76120);
            } else {
                f2 = 1.0f;
            }
            f = 0.0f;
        }
        double d3 = 1.0 / (Math.max(d2, d) * (double)Field13215);
        int n = (int)(d2 * d3);
        int n2 = (int)(d * d3);
        return (Field13216[n2 * Field13214 + n] + f) * f2;
    }

    static {
        Field13213 = (int)((long)191128805 ^ (long)191128804) << 16;
        Field13212 = (int)((long)-735987111 ^ (long)-736016986);
        Field13211 = (int)((long)-1413394172 ^ (long)-1413394171) << 4;
        Field13210 = ((int)-1031385512L ^ 0xC2864E59) << 3;
        Field13214 = (int)Math.sqrt(Double.longBitsToDouble((long)1054530205 ^ 0x40F000003EDADA9DL));
        Field13215 = 1.0f / (float)(Field13214 - (int)((long)-478248060 ^ (long)-478248059));
        Field13216 = new float[((int)-1901759321L ^ 0x8EA574A6) << 16];
    }
}

