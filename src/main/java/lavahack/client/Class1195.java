/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.net.URL;

public class Class1195 {
    public static final String Field13415;
    public static final Class1195 Field13416;
    public static final String Field13417;
    public static final Class1195 Field13418;
    public static final String Field13419;
    public static final Class1195 Field13420;
    private final String Field13421;
    private String Field13422 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1195(String string) {
        this.Field13421 = string;
    }

    public String Method4812() {
        return this.Field13421;
    }

    public boolean Method4813() {
        return this.Field13421.equals("jar");
    }

    public boolean Method4814() {
        return this.Field13421.equals("class");
    }

    public boolean Method4815() {
        return this.Field13421.equals("intellij");
    }

    public static Class1195 Method4816() {
        URL uRL = Thread.currentThread().getContextClassLoader().getResource("com/kisman/cc");
        if (uRL == null) {
            throw new Error("Impossible state reached");
        }
        if (uRL.getProtocol().equals("file")) {
            return Field13418;
        }
        if (uRL.getProtocol().equals("jar")) {
            return Field13416;
        }
        if (!System.getProperty("java.class.path").contains("idea_rt.jar")) throw new RuntimeException("Could not resolve the current environment");
        return Field13420;
    }

    static {
        Field13419 = "intellij";
        Field13417 = "class";
        Field13415 = "jar";
        Field13416 = new Class1195("jar");
        Field13418 = new Class1195("class");
        Field13420 = new Class1195("intellij");
    }

    private static String Method4817(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 122;
            cArray2[n] = (char)(cArray[n] ^ (0xE4B ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

