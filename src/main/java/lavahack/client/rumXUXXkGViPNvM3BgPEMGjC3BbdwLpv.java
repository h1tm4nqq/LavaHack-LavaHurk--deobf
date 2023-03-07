/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Tvtz1mTq1XMrpGiDAR1Pl9lp9ebmIW8v;
import lavahack.client.klPBJiYIPRrdqJN2sk9YixrCzUuop5PC;

public class rumXUXXkGViPNvM3BgPEMGjC3BbdwLpv
extends Tvtz1mTq1XMrpGiDAR1Pl9lp9ebmIW8v
implements klPBJiYIPRrdqJN2sk9YixrCzUuop5PC {
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
        int n = (int)-1413961551L ^ 0xABB8A8B1;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-760739011L ^ 0xD2A80BC2);
            int n2 = (int)((long)1839128582 ^ (long)1839128743);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1903493655 ^ (long)-1903494046) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

