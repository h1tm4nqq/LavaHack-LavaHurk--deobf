/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class1260;
import lavahack.client.Class1357;
import lavahack.client.Class1446;
import lavahack.client.Class23;
import lavahack.client.Class475;
import lavahack.client.Class929;

public abstract class Class681
extends Class1357 {
    private int Field10888;

    @Override
    public void Method2870(Class1260 class1260) throws Class23 {
        if (class1260 instanceof Class1446) {
            if (class1260.Method1614()) throw new Class475("bad rsv RSV1: " + class1260.Method1613() + " RSV2: " + class1260.Method1614() + " RSV3: " + class1260.Method1615());
            if (class1260.Method1615()) {
                throw new Class475("bad rsv RSV1: " + class1260.Method1613() + " RSV2: " + class1260.Method1614() + " RSV3: " + class1260.Method1615());
            }
        }
        if (!(class1260 instanceof Class929)) return;
        if (class1260.Method1613()) throw new Class475("bad rsv RSV1: " + class1260.Method1613() + " RSV2: " + class1260.Method1614() + " RSV3: " + class1260.Method1615());
        if (class1260.Method1614()) throw new Class475("bad rsv RSV1: " + class1260.Method1613() + " RSV2: " + class1260.Method1614() + " RSV3: " + class1260.Method1615());
        if (!class1260.Method1615()) return;
        throw new Class475("bad rsv RSV1: " + class1260.Method1613() + " RSV2: " + class1260.Method1614() + " RSV3: " + class1260.Method1615());
    }

    private static String Method2875(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 218;
            cArray2[n] = (char)(cArray[n] ^ (0x6FBA ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

