/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class23;
import lavahack.client.Class475;
import lavahack.client.Class494;
import lavahack.client.Class927;

public abstract class Class929
extends Class494 {
    private int Field11935;

    public Class929(Class927 class927) {
        super(class927);
    }

    @Override
    public void Method1620() throws Class23 {
        if (!this.Method1612()) {
            throw new Class475("Control frame can't have fin==false set");
        }
        if (this.Method1613()) {
            throw new Class475("Control frame can't have rsv1==true set");
        }
        if (this.Method1614()) {
            throw new Class475("Control frame can't have rsv2==true set");
        }
        if (!this.Method1615()) return;
        throw new Class475("Control frame can't have rsv3==true set");
    }

    private static String Method1628(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 242;
            cArray2[n] = (char)(cArray[n] ^ (0x294F ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

