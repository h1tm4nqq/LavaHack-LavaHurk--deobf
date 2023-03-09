/*
 * Decompiled with CFR 0.152.
 */
package com.kisman.cc.util;

import com.kisman.cc.util.Class2027;
import java.awt.Color;

public class Class845 {
    private String Field11578 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static Color Method3578(long l, int n, int n2, int n3, double d) {
        int n4 = (int)((double)(System.currentTimeMillis() + l) % (Double.longBitsToDouble((long)1302184133 ^ 0x40C680004D9DC0C5L) / d)) / 32;
        if (n4 > 360) {
            n4 = 360;
        }
        int n5 = Class845.Method3581(n4, n, n2);
        int n6 = (n3 & 0xFF) << 24 | n5;
        return new Color(n6, true);
    }

    public static Class2027 Method3579(int n, int n2, int n3, int n4, double d) {
        double d2 = Double.longBitsToDouble((long)1592662643 ^ 0x40C680005EEE1A73L) / d;
        double d3 = d2 / Double.longBitsToDouble(4645040803167600640L);
        int n5 = (int)((double)System.currentTimeMillis() % d2 / d3) + n;
        if (n5 > 360) {
            n5 -= 360;
        }
        int n6 = Class845.Method3581(n5, n2, n3);
        return new Class2027(n6).Method3633(n4);
    }

    public static Class2027 Method3580(long l, int n, int n2, int n3, int n4, double d) {
        double d2;
        double d3 = Double.longBitsToDouble(4667563749106778112L) / d;
        int n5 = (int)((double)l % d3 / (d2 = d3 / Double.longBitsToDouble(4645040803167600640L))) + n;
        if (n5 > 360) {
            n5 -= 360;
        }
        int n6 = Class845.Method3581(n5, n2, n3);
        return new Class2027(n6).Method3633(n4);
    }

    private static int Method3581(int n, int n2, int n3) {
        float f;
        float f2 = Float.intBitsToFloat(0x40880000);
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        int n4 = n / 60;
        switch (n4) {
            case 0: {
                f3 = Float.intBitsToFloat(1132396544);
                f4 = (float)n * Float.intBitsToFloat(0x40880000);
                f5 = 0.0f;
                break;
            }
            case 1: {
                f3 = Float.intBitsToFloat(1132396544) - (float)(n - 60) * Float.intBitsToFloat(0x40880000);
                f4 = Float.intBitsToFloat(1132396544);
                f5 = 0.0f;
                break;
            }
            case 2: {
                f3 = 0.0f;
                f4 = Float.intBitsToFloat(1132396544);
                f5 = (float)(n - 120) * Float.intBitsToFloat(0x40880000);
                break;
            }
            case 3: {
                f3 = 0.0f;
                f4 = Float.intBitsToFloat(1132396544) - (float)(n - 180) * Float.intBitsToFloat(0x40880000);
                f5 = Float.intBitsToFloat(1132396544);
                break;
            }
            case 4: {
                f3 = (float)(n - 240) * Float.intBitsToFloat(0x40880000);
                f4 = 0.0f;
                f5 = Float.intBitsToFloat(1132396544);
                break;
            }
            case 5: 
            case 6: {
                f3 = Float.intBitsToFloat(1132396544);
                f4 = 0.0f;
                f5 = Float.intBitsToFloat(1132396544) - (float)(n - 300) * Float.intBitsToFloat(0x40880000);
                break;
            }
        }
        if (n3 > 50) {
            f = Float.intBitsToFloat(1017370378) * (float)(n3 - 50);
            f3 += (Float.intBitsToFloat(1132396544) - f3) * f;
            f4 += (Float.intBitsToFloat(1132396544) - f4) * f;
            f5 += (Float.intBitsToFloat(1132396544) - f5) * f;
        } else {
            f = Float.intBitsToFloat(1017370378) * (float)n3;
            f3 *= f;
            f4 *= f;
            f5 *= f;
        }
        f = (float)n3 * Float.intBitsToFloat(1076048691);
        float f6 = Float.intBitsToFloat(1008981770) * (float)(100 - n2);
        f3 += (f - f3) * f6;
        f4 += (f - f4) * f6;
        f5 += (f - f5) * f6;
        int n5 = Math.round(f3);
        int n6 = Math.round(f4);
        int n7 = Math.round(f5);
        return 0xFF000000 | (n5 & 0xFF) << 16 | (n6 & 0xFF) << 8 | n7 & 0xFF;
    }
}

