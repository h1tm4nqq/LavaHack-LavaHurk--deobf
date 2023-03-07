/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.c5C8Nidhqo0zCg0ZubFUIxZ7PBIbYfMx;
import lavahack.client.eOzfLK9AJmts1SDoM2MkHzTMR3OjWXRL;
import lavahack.client.k6qfAI2dl0YQZ6l1TQGutG7w1UXZhj58;
import lavahack.client.mPNKUHesROKSVtFpAZyhLqRAupt8dodO;

public class RSFg6dFLUSIvw4Aij2xt8JT5ga7mM6T6
extends c5C8Nidhqo0zCg0ZubFUIxZ7PBIbYfMx {
    private String Field9557 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public RSFg6dFLUSIvw4Aij2xt8JT5ga7mM6T6() {
        super(mPNKUHesROKSVtFpAZyhLqRAupt8dodO.Field11927);
    }

    @Override
    public void Method1620() throws eOzfLK9AJmts1SDoM2MkHzTMR3OjWXRL {
        super.Method1620();
        if (k6qfAI2dl0YQZ6l1TQGutG7w1UXZhj58.Method1101(this.Method1618())) return;
        throw new eOzfLK9AJmts1SDoM2MkHzTMR3OjWXRL((int)((long)1693871455 ^ (long)1693871792), "Received text is no valid utf8 string!");
    }

    private static String Method1628(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1044883882 ^ (long)1044883882);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1696001126 ^ (long)-1696001179);
            int n2 = ((int)2054878834L ^ 0x7A7AF621) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1924879282 ^ (long)-1924877753) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

