/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package lavahack.client;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import lavahack.client.Class218;
import org.lwjgl.input.Keyboard;

public class Class946 {
    private static final Map Field12040 = new ConcurrentHashMap();
    private String Field12041 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static String Method3904(int n) {
        return Keyboard.getKeyName((int)n);
    }

    public static void Method3905(boolean bl) {
        Keyboard.enableRepeatEvents((boolean)bl);
    }

    public static boolean Method3906() {
        return Keyboard.getEventKeyState();
    }

    public static int Method3907() {
        return Keyboard.getEventKey();
    }

    public static char Method3908() {
        return Keyboard.getEventCharacter();
    }

    public static int Method3909(String string) {
        return Keyboard.getKeyIndex((String)string);
    }

    public static boolean Method3910(int n) {
        if (!Class218.Field8954.Method1264()) return Keyboard.isKeyDown((int)n);
        return Field12040.getOrDefault(n, false);
    }
}

