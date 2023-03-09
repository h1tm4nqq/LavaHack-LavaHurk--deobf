/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class42;
import lavahack.client.Class97;

public class Class1167
extends Class42 {
    private int Field13265;

    public Class1167() {
        super("NoMove", Class97.Field8345);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 152;
            cArray2[n] = (char)(cArray[n] ^ (0x5C0E ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

