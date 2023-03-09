/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class97;

public class Class1536
extends Class42 {
    private final Class44 Field15171 = this.Method23(new Class44("DelayMS", (Class42)this, Double.longBitsToDouble(0x4049000000000000L), 0.0, Double.longBitsToDouble(4652007308841189376L), true));
    private final Class44 Field15172 = this.Method23(new Class44("CorePoolSize", (Class42)this, 1.0, 1.0, Double.longBitsToDouble(0x4030000000000000L), true));
    private String Field15173 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1536() {
        super("CustomDelay", Class97.Field8345);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 8;
            cArray2[n] = (char)(cArray[n] ^ (0x697F ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

