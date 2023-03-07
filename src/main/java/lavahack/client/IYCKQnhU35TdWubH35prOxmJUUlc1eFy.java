/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 */
package lavahack.client;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import lavahack.client.xsjgW5Cq2fvtzUbTEsvr5lIr0M7naGKG;
import org.lwjgl.input.Mouse;

public class IYCKQnhU35TdWubH35prOxmJUUlc1eFy {
    private static final Map Field15507 = new ConcurrentHashMap();
    private String Field15508 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static boolean Method6270(int n) {
        if (!xsjgW5Cq2fvtzUbTEsvr5lIr0M7naGKG.Field8954.Method1264()) return Mouse.isButtonDown((int)n);
        return Field15507.getOrDefault(n, (boolean)((long)-961201078 ^ (long)-961201078));
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

