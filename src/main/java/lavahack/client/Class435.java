/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.Display
 */
package lavahack.client;

import org.lwjgl.opengl.Display;

public class Class435 {
    private final int Field9820;
    private final int Field9821;
    private final int Field9822;
    private final int Field9823;
    private String Field9824 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private Class435(int n, int n2, int n3, int n4) {
        this.Field9820 = n;
        this.Field9821 = n2;
        this.Field9822 = n3;
        this.Field9823 = n4;
    }

    public int Method2076() {
        return this.Field9820;
    }

    public int Method2077() {
        return this.Field9821;
    }

    public int Method2078() {
        return this.Field9822;
    }

    public int Method2079() {
        return this.Field9823;
    }

    public static Class435 Method2080(int n, int n2, int n3, int n4) {
        return new Class435(Math.min(n, n3), Math.min(n2, n4), Math.max(n, n3), Math.max(n2, n4));
    }

    public static Class435 Method2081(double d, double d2, double d3, double d4) {
        return Class435.Method2080((int)(d * (double)Display.getWidth()), (int)d2 * Display.getHeight(), (int)(d3 * (double)Display.getWidth()), (int)(d4 * (double)Display.getHeight()));
    }

    public static Class435 Method2082(double d, double d2, double d3, double d4) {
        return Class435.Method2081((d + 1.0) / Double.longBitsToDouble(0x4000000000000000L), (d2 + 1.0) / Double.longBitsToDouble((long)345905557 ^ 0x40000000149E1995L), (d3 + 1.0) / Double.longBitsToDouble(0x4000000000000000L), (d4 + 1.0) / Double.longBitsToDouble(0x4000000000000000L));
    }
}

