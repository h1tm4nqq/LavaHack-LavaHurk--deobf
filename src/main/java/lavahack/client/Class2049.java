/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class1;
import lavahack.client.Class1892;

public class Class2049
extends Class1
implements Class1892 {
    private String Field17397 = "*";
    private int Field17398;

    @Override
    public void Method7008(String string) {
        if (string == null) {
            throw new IllegalArgumentException("http resource descriptor must not be null");
        }
        this.Field17397 = string;
    }

    @Override
    public String Method2233() {
        return this.Field17397;
    }

    private static String Method7(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 161;
            cArray2[n] = (char)(cArray[n] ^ (0x62C ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

