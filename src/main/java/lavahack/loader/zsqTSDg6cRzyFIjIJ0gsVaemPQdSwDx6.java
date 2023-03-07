/*
 * Decompiled with CFR 0.152.
 */
package lavahack.loader;

import lavahack.loader.ASuMcgM5AEARMUacGCCzRjLlcqrqV9ji;
import lavahack.loader.lDgX8dul2aWNBQmCTcuuerubKmsg9XQq;

public class zsqTSDg6cRzyFIjIJ0gsVaemPQdSwDx6
extends ASuMcgM5AEARMUacGCCzRjLlcqrqV9ji
implements lDgX8dul2aWNBQmCTcuuerubKmsg9XQq {
    private String Field7903 = "*";
    private String Field7904 = "TheKisDevs & LavaHack Development owns you";

    @Override
    public void Method187(String string) {
        if (string == null) {
            throw new IllegalArgumentException("http resource descriptor must not be null");
        }
        this.Field7903 = string;
    }

    @Override
    public String Method186() {
        return this.Field7903;
    }

    private static String Method185(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1722132551 ^ (long)1722132551);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1365504337 ^ (long)1365504430);
            int n2 = (int)((long)-1387755347 ^ (long)-1387755464);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1028518915 ^ (long)1028518574) << 4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

