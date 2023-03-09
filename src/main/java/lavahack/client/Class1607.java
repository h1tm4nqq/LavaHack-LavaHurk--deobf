/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 */
package lavahack.client;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import lavahack.client.Class218;
import org.lwjgl.input.Mouse;

public class Class1607 {
    private static final Map Field15507 = new ConcurrentHashMap();
    private String Field15508 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static boolean Method6270(int n) {
        if (!Class218.Field8954.Method1264()) return Mouse.isButtonDown((int)n);
        return Field15507.getOrDefault(n, false);
    }

    public static void Method6271(int n, boolean bl) {
        Field15507.put(n, bl);
    }

    public static int Method6272() {
        return Mouse.getX();
    }

    public static int Method6273() {
        return Mouse.getY();
    }

    public static int Method6274() {
        return Mouse.getDWheel();
    }

    public static void Method6275(boolean bl) {
        Mouse.setGrabbed((boolean)bl);
    }

    public static void Method6276() {
        Field15507.clear();
    }
}

