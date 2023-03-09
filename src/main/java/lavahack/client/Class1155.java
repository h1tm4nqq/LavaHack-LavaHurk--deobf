/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public class Class1155 {
    private static final int Field13210;
    private static final int Field13211;
    private static final int Field13212;
    private static final int Field13213;
    private static final int Field13214;
    private static final float Field13215;
    private static final float[] Field13216;
    private String Field13217 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static void Method4678() {
        int n = 0;
        while (n < Field13214) {
            for (int i = 0; i < Field13214; ++i) {
                float f = (float)n / (float)Field13214;
                float f2 = (float)i / (float)Field13214;
                Class1155.Field13216[i * Class1155.Field13214 + n] = (float)Math.atan2(f2, f);
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
                f2 = Float.intBitsToFloat(-1082130432);
            }
            f = Float.intBitsToFloat(-1068953637);
        } else {
            if (d < 0.0) {
                d = -d;
                f2 = Float.intBitsToFloat(-1082130432);
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
        Field13213 = 65536;
        Field13212 = 65535;
        Field13211 = 16;
        Field13210 = 8;
        Field13214 = (int)Math.sqrt(Double.longBitsToDouble((long)1054530205 ^ 0x40F000003EDADA9DL));
        Field13215 = 1.0f / (float)(Field13214 - 1);
        Field13216 = new float[65536];
    }
}

