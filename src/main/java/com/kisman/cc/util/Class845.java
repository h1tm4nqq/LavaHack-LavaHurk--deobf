//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.util;

import java.awt.*;

public class Class845
{
    private String Field11578 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static Color Method3578(final long n, final int n2, final int n3, final int n4, final double n5) {
        int n6 = (int)((System.currentTimeMillis() + n) % (Double.longBitsToDouble((long)1302184133 ^ 0x40C680004D9DC0C5L) / n5)) / 32;
        if (n6 > 360) {
            n6 = 360;
        }
        return new Color((n4 & 0xFF) << 24 | Method3581(n6, n2, n3), true);
    }
    
    public static Class2027 Method3579(final int n, final int n2, final int n3, final int n4, final double n5) {
        final double n6 = Double.longBitsToDouble((long)1592662643 ^ 0x40C680005EEE1A73L) / n5;
        int n7 = (int)(System.currentTimeMillis() % n6 / (n6 / Double.longBitsToDouble(4645040803167600640L))) + n;
        if (n7 > 360) {
            n7 -= 360;
        }
        return new Class2027(Method3581(n7, n2, n3)).Method3633(n4);
    }
    
    public static Class2027 Method3580(final long n, final int n2, final int n3, final int n4, final int n5, final double n6) {
        final double n7 = Double.longBitsToDouble(4667563749106778112L) / n6;
        int n8 = (int)(n % n7 / (n7 / Double.longBitsToDouble(4645040803167600640L))) + n2;
        if (n8 > 360) {
            n8 -= 360;
        }
        return new Class2027(Method3581(n8, n3, n4)).Method3633(n5);
    }
    
    private static int Method3581(final int n, final int n2, final int n3) {
        Float.intBitsToFloat(1082654720);
        float n4 = 0.0f;
        float n5 = 0.0f;
        float n6 = 0.0f;
        switch (n / 60) {
            case 0: {
                n4 = Float.intBitsToFloat(1132396544);
                n5 = n * Float.intBitsToFloat(1082654720);
                n6 = 0.0f;
                break;
            }
            case 1: {
                n4 = Float.intBitsToFloat(1132396544) - (n - 60) * Float.intBitsToFloat(1082654720);
                n5 = Float.intBitsToFloat(1132396544);
                n6 = 0.0f;
                break;
            }
            case 2: {
                n4 = 0.0f;
                n5 = Float.intBitsToFloat(1132396544);
                n6 = (n - 120) * Float.intBitsToFloat(1082654720);
                break;
            }
            case 3: {
                n4 = 0.0f;
                n5 = Float.intBitsToFloat(1132396544) - (n - 180) * Float.intBitsToFloat(1082654720);
                n6 = Float.intBitsToFloat(1132396544);
                break;
            }
            case 4: {
                n4 = (n - 240) * Float.intBitsToFloat(1082654720);
                n5 = 0.0f;
                n6 = Float.intBitsToFloat(1132396544);
                break;
            }
            case 5:
            case 6: {
                n4 = Float.intBitsToFloat(1132396544);
                n5 = 0.0f;
                n6 = Float.intBitsToFloat(1132396544) - (n - 300) * Float.intBitsToFloat(1082654720);
                break;
            }
        }
        float n8;
        float n9;
        float n10;
        if (n3 > 50) {
            final float n7 = Float.intBitsToFloat(1017370378) * (n3 - 50);
            n8 = n4 + (Float.intBitsToFloat(1132396544) - n4) * n7;
            n9 = n5 + (Float.intBitsToFloat(1132396544) - n5) * n7;
            n10 = n6 + (Float.intBitsToFloat(1132396544) - n6) * n7;
        }
        else {
            final float n11 = Float.intBitsToFloat(1017370378) * n3;
            n8 = n4 * n11;
            n9 = n5 * n11;
            n10 = n6 * n11;
        }
        final float n12 = n3 * Float.intBitsToFloat(1076048691);
        final float n13 = Float.intBitsToFloat(1008981770) * (100 - n2);
        return 0xFF000000 | (Math.round(n8 + (n12 - n8) * n13) & 0xFF) << 16 | (Math.round(n9 + (n12 - n9) * n13) & 0xFF) << 8 | (Math.round(n10 + (n12 - n10) * n13) & 0xFF);
    }
}
