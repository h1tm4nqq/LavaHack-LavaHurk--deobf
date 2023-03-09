/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class97;

public class Class436
extends Class42 {
    public final Class44 Field9825 = this.Method23(new Class44("Level", (Class42)this, Double.longBitsToDouble((long)483546967 ^ 0x400000001CD25757L), 1.0, Double.longBitsToDouble((long)1494161279 ^ 0x40590000590F177FL), true));
    public static Class436 Field9826;
    private String Field9827 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class436() {
        super("FrostWalk", Class97.Field8345);
        Field9826 = this;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 104;
            cArray2[n] = (char)(cArray[n] ^ (0x6D1D ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

