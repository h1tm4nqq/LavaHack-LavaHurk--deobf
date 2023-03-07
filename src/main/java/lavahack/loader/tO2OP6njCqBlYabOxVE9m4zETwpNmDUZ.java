/*
 * Decompiled with CFR 0.152.
 */
package lavahack.loader;

import lavahack.loader.D2A33i4puy3VG87sLGopuKBa7759W0RD;
import lavahack.loader.ERDZZaC7E7qEsEwC2UFlE3xI88227PAM;
import lavahack.loader.eVUYg1GWgiUOrS8NdVHqZkr5dmjNAgoA;
import lavahack.loader.rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC;

public class tO2OP6njCqBlYabOxVE9m4zETwpNmDUZ
extends ERDZZaC7E7qEsEwC2UFlE3xI88227PAM {
    private String Field8912 = "TheKisDevs & LavaHack Development owns you";

    public tO2OP6njCqBlYabOxVE9m4zETwpNmDUZ() {
        super(D2A33i4puy3VG87sLGopuKBa7759W0RD.Field16034);
    }

    @Override
    public void Method84() throws rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC {
        super.Method84();
        if (eVUYg1GWgiUOrS8NdVHqZkr5dmjNAgoA.Method4532(this.Method82())) return;
        throw new rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC((int)((long)-1216056301 ^ (long)-1216055300), "Received text is no valid utf8 string!");
    }

    private static String Method92(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)217190572L ^ 0xCF210AC;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1098989967 ^ (long)1098989936);
            int n2 = (int)((long)78292324 ^ (long)78292405);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1726626589 ^ (long)-1726634148) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

