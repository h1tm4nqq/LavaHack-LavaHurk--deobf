/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import lavahack.client.Class906;

public class Class757 {
    private static final Map Field11210 = new ConcurrentHashMap();
    private String Field11211 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static void Method3137(Class906 class906, String string) {
        Field11210.put(class906, string);
    }

    public static String Method3138(Class906 class906) {
        return (String)Field11210.get(class906);
    }
}

