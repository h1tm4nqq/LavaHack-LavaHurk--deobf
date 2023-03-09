/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class1446;
import lavahack.client.Class176;
import lavahack.client.Class23;
import lavahack.client.Class927;

public class Class370
extends Class1446 {
    private String Field9557 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class370() {
        super(Class927.Field11927);
    }

    @Override
    public void Method1620() throws Class23 {
        super.Method1620();
        if (Class176.Method1101(this.Method1618())) return;
        throw new Class23(1007, "Received text is no valid utf8 string!");
    }

    private static String Method1628(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 166;
            cArray2[n] = (char)(cArray[n] ^ (0x7824 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

