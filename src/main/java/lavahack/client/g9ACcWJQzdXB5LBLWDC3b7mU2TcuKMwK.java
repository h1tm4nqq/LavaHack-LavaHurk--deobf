/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import lavahack.client.MUU5rY7bYKphpPNPTaXWkJXha4Qjva9q;

public final class g9ACcWJQzdXB5LBLWDC3b7mU2TcuKMwK {
    private static final Map Field8278 = new ConcurrentHashMap();
    private String Field8279 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static boolean Method729(MUU5rY7bYKphpPNPTaXWkJXha4Qjva9q mUU5rY7bYKphpPNPTaXWkJXha4Qjva9q) {
        if (Field8278.containsKey(mUU5rY7bYKphpPNPTaXWkJXha4Qjva9q.Method5062())) {
            return (int)((long)971527760 ^ (long)971527760) != 0;
        }
        Field8278.put(mUU5rY7bYKphpPNPTaXWkJXha4Qjva9q.Method5062(), mUU5rY7bYKphpPNPTaXWkJXha4Qjva9q);
        return (int)((long)-104382683 ^ (long)-104382684) != 0;
    }

    public static boolean Method730(MUU5rY7bYKphpPNPTaXWkJXha4Qjva9q mUU5rY7bYKphpPNPTaXWkJXha4Qjva9q) {
        return Field8278.remove(mUU5rY7bYKphpPNPTaXWkJXha4Qjva9q.Method5062(), mUU5rY7bYKphpPNPTaXWkJXha4Qjva9q);
    }

    public static MUU5rY7bYKphpPNPTaXWkJXha4Qjva9q Method731(String string) {
        return (MUU5rY7bYKphpPNPTaXWkJXha4Qjva9q)Field8278.remove(string);
    }

    public MUU5rY7bYKphpPNPTaXWkJXha4Qjva9q Method732(String string) {
        return (MUU5rY7bYKphpPNPTaXWkJXha4Qjva9q)Field8278.get(string);
    }

    public static Map Method733() {
        return Field8278;
    }
}

