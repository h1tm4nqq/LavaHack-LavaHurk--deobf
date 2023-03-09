/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.LinkedHashMap;
import java.util.Map;

public class Class799 {
    public static final String Field11391 = "";
    private Map Field11392 = new LinkedHashMap();
    private String Field11393;
    private String Field11394 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private Class799() {
    }

    public static Class799 Method3314(String string) {
        Class799 class799 = new Class799();
        String[] stringArray = string.split(";");
        class799.Field11393 = stringArray[0].trim();
        int n = 1;
        while (n < stringArray.length) {
            String[] stringArray2 = stringArray[n].split("=");
            String string2 = "";
            if (stringArray2.length > 1) {
                String string3 = stringArray2[1].trim();
                if (string3.startsWith("\"") && string3.endsWith("\"") || string3.startsWith("'") && string3.endsWith("'") && string3.length() > 2) {
                    string3 = string3.substring(1, string3.length() - 1);
                }
                string2 = string3;
            }
            class799.Field11392.put(stringArray2[0].trim(), string2);
            ++n;
        }
        return class799;
    }

    public String Method3315() {
        return this.Field11393;
    }

    public Map Method3316() {
        return this.Field11392;
    }

    private static String Method3317(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 134;
            cArray2[n] = (char)(cArray[n] ^ (0x7D18 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

