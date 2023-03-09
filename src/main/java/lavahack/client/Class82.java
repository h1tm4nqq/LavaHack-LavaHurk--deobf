/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import lavahack.client.Class1255;

public final class Class82 {
    private static final Map Field8278 = new ConcurrentHashMap();
    private String Field8279 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static boolean Method729(Class1255 class1255) {
        if (Field8278.containsKey(class1255.Method5062())) {
            return false;
        }
        Field8278.put(class1255.Method5062(), class1255);
        return true;
    }

    public static boolean Method730(Class1255 class1255) {
        return Field8278.remove(class1255.Method5062(), class1255);
    }

    public static Class1255 Method731(String string) {
        return (Class1255)Field8278.remove(string);
    }

    public Class1255 Method732(String string) {
        return (Class1255)Field8278.get(string);
    }

    public static Map Method733() {
        return Field8278;
    }
}

