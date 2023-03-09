/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class97;

public class Class1810
extends Class42 {
    public final Class44 Field16333 = this.Method23(new Class44("Progress", (Class42)this, 0.0, 0.0, Double.longBitsToDouble((long)760617357 ^ 0x401800002D56198DL), true));
    public static Class1810 Field16334;
    private String Field16335 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1810() {
        super("SwingProgress", Class97.Field8342);
        Field16334 = this;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 121;
            cArray2[n] = (char)(cArray[n] ^ (0x53E3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

