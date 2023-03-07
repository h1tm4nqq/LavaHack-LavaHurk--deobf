/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G;
import lavahack.client.igCSMUHYGvjvsH9HAWyPsuyOKVVnilJK;

public class fDlfsOBGafTXq7BTM3GLq7xDwN5OZ2lN {
    private String Field14237 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G Method5471(String string) {
        ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G[] zL4q1jpYVsiO81b3lM3zViSKEVLCki7GArray = ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.values();
        int n = zL4q1jpYVsiO81b3lM3zViSKEVLCki7GArray.length;
        int n2 = (int)((long)-1761628751 ^ (long)-1761628751);
        while (n2 < n) {
            ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G zL4q1jpYVsiO81b3lM3zViSKEVLCki7G = zL4q1jpYVsiO81b3lM3zViSKEVLCki7GArray[n2];
            if (zL4q1jpYVsiO81b3lM3zViSKEVLCki7G.name().equals(string)) {
                return zL4q1jpYVsiO81b3lM3zViSKEVLCki7G;
            }
            ++n2;
        }
        throw new igCSMUHYGvjvsH9HAWyPsuyOKVVnilJK("Lua: cant resolve number type " + string);
    }

    private static String Method5472(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)139553324L ^ 0x8516A2C;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1428446836L ^ 0x55245E8B);
            int n2 = (int)((long)1821189349 ^ (long)1821189218);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1822482964 ^ (long)-1822468791) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

